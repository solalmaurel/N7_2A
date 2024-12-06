# Ecrire les tests de l'algorithme du pas de Cauchy
using Test
using LinearAlgebra

function tester_cauchy(cauchy::Function)

	# Tests unitaires
    @testset "Cauchy Step Tests" begin
        # Cas 1: Gradient nul (g = 0)
        @testset "Case 1: g = 0" begin
            g = [0.0, 0.0]
            H = [2.0 0.0; 0.0 2.0]
            Δ = 1.0
            s = cauchy(g, H, Δ)
            @test s == [0.0, 0.0]
        end

        # Cas 2: g^T H g <= 0 (Hessienne semi-définie négative ou g dans une direction descendante)
        @testset "Case 2: g^T H g <= 0" begin
            g = [1.0, 0.0]
            H = [-1.0 0.0; 0.0 -1.0]  # Hessienne définie négative
            Δ = 1.0
            s = cauchy(g, H, Δ)
            @test norm(s) ≈ Δ
            @test dot(g, s) < 0  # s est dans la direction opposée à g
        end

        # Cas 3: g^T H g > 0 et τ = 1
        @testset "Case 3: g^T H g > 0, τ = 1" begin
            g = [1.0, 0.0]
            H = [2.0 0.0; 0.0 2.0]  # Hessienne définie positive
            Δ = 1.0
            s = cauchy(g, H, Δ)
            @test norm(s) ≈ Δ  # s doit avoir la norme Δ
            @test dot(g, s) < 0  # s est dans la direction opposée à g
        end

        # Cas 4: g^T H g > 0 et τ < 1
        @testset "Case 4: g^T H g > 0, τ < 1" begin
            g = [1.0, 1.0]
            H = [2.0 0.0; 0.0 2.0]  # Hessienne définie positive
            Δ = 0.1  # Petit rayon de région de confiance
            s = cauchy(g, H, Δ)
            norm_g = norm(g)
            g_H_g = dot(g, H * g)
            τ_expected = min(1.0, (norm_g^3) / (Δ * g_H_g))
            @test norm(s) ≈ τ_expected * Δ
            @test dot(g, s) < 0  # s est dans la direction opposée à g
        end
    end

end