package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Operations o1 = new Operations(20, 5, '-');
		
		System.out.println(o1.operation());
		System.out.println(o1.getA());
		System.out.println(new Operations(30,10,'/').operation());
		o1.setOperateur('$');
		System.out.println(o1.operation());
		o1.setOperateur('*');
		System.out.println(o1.operation());
	}

}
