import java.util.HashMap;

public class EvaluateurExpression implements VisiteurExpression<Integer> {

    public EvaluateurExpression(HashMap<String, Integer> env) {
        env = this.env;
    }


    public Integer visiterAccesVariable(AccesVariable v) {
        if (env.containsKey(v.getNom())) {
            return env.get(v.getNom());
        } else {
            throw new RuntimeException("pas var dans env");
        }
    }

    /** Visiter une constante.
	  * @param c la constante � visiter
	  */
    public Integer visiterConstante(Constante c) {
        return c.getValeur();
    }

	/** Visiter une expression binaire.
	  * @param e l'expression binaire � visiter
	  */
    public Integer visiterExpressionBinaire(ExpressionBinaire e) {
        switch (e.getOperateur().accepter(this)) {
            case 0:
                return e.getOperandeGauche().accepter(this) + e.getOperandeDroite().accepter(this);
            case 1:
                return e.getOperandeGauche().accepter(this) * e.getOperandeDroite().accepter(this);
            case 2:
                return e.getOperandeGauche().accepter(this) - e.getOperandeDroite().accepter(this);
            default:
                throw new RuntimeException("Expression Binaire");
        }
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
        return 1;
    }

    /** Visiter l'op�rateur binaire soustraction.
	  * @param m l'op�rateur � visiter
	  */
    public Integer visiterSoustraction(Soustraction m) {
        return 2;
    }

	/** Visiter une expression unaire.
	  * @param v l'expression unaire � visiter
	  */
    public Integer visiterExpressionUnaire(ExpressionUnaire e) {
        switch (e.getOperateur().accepter(this)) {
            case 0:
                return - e.getOperande().accepter(this);
            default:
                throw new RuntimeException("Expression Unaire");
        }
    }

	/** Visiter un op�rateur unaire n�gation.
	  * @param n l'op�rateur unaire � visiter
	  */
    public Integer visiterNegation(Negation n) {
        return 0;
    }
}
