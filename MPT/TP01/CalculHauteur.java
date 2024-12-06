import java.lang.Math;

public class CalculHauteur implements VisiteurExpression<Integer> {

    public Integer visiterAccesVariable(AccesVariable v) {
        return 1;
    }

    /** Visiter une constante.
	  * @param c la constante � visiter
	  */
    public Integer visiterConstante(Constante c) {
        return 1;
    }

	/** Visiter une expression binaire.
	  * @param e l'expression binaire � visiter
	  */
    public Integer visiterExpressionBinaire(ExpressionBinaire e) {
        return 1 + Math.max(e.getOperandeDroite().accepter(this), e.getOperandeGauche().accepter(this));
    }

	/** Visiter l'op�rateur binaire addition.
	  * @param a l'op�rateur � visiter
	  */
    public Integer visiterAddition(Addition a) {
        return 0;
    }

	/** Visiter l'op�rateur binaire multiplication.
	  * @param m l'op�rateur � visiter
	  */
    public Integer visiterMultiplication(Multiplication m) {
        return 0;
    }

    /** Visiter l'op�rateur binaire soustraction.
	  * @param m l'op�rateur � visiter
	  */
    public Integer visiterSoustraction(Soustraction m) {
        return 0;
    }

	/** Visiter une expression unaire.
	  * @param v l'expression unaire � visiter
	  */
    public Integer visiterExpressionUnaire(ExpressionUnaire e) {
        return 1 + e.getOperande().accepter(this);
    }

	/** Visiter un op�rateur unaire n�gation.
	  * @param n l'op�rateur unaire � visiter
	  */
    public Integer visiterNegation(Negation n) {
        return 0;
    }
}