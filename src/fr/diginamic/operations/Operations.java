package fr.diginamic.operations;

public class Operations {

	private double a;
	private double b;
	private char operateur;
	
	
	
	 public Operations(double a, double b, char operateur) {
		super();
		this.a = a;
		this.b = b;
		this.operateur = operateur;
	}



	public double operation()	{
		if (operateur == '+')	{
			return a + b ;
		}
		else if (operateur == '-')	{ 
			return a - b ;
		}
		else if (operateur == '*')	{
			return a * b ;
		}
		else if (operateur == '/')	{ 
			return a / b ;
		}
		else	{
			return 999999999;
		}
		
	}	
		



	public double getA() {
		return a;
	}



	public void setA(double a) {
		this.a = a;
	}



	public double getB() {
		return b;
	}



	public void setB(double b) {
		this.b = b;
	}



	public char getOperateur() {
		return operateur;
	}



	public void setOperateur(char operateur) {
		this.operateur = operateur;
	}
	
	
	
	
}
