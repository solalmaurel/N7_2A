/**
  * Expression unaire avec un op�rateur unaire appliqu� sur un op�rande.
  *
  * @author	Xavier Cr�gut
  * @version	$Revision$
  * @composed 1 "" "operateur" OperateurUnaire
  * @has 1 "" "operande" Expression
  */
public class ExpressionUnaire implements Expression {

	private Expression operande;
	private OperateurUnaire operateur;

	public ExpressionUnaire(OperateurUnaire operateur, Expression operande)
	{
		this.operande = operande;
		this.operateur = operateur;
	}

	public Expression getOperande() {
		return this.operande;
	}

	public OperateurUnaire getOperateur() {
		return this.operateur;
	}

	public <R> R accepter(VisiteurExpression<R> visiteur) {
		return visiteur.visiterExpressionUnaire(this);
	}

}
