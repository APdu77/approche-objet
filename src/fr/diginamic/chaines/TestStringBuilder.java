package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long a = System.currentTimeMillis();
		
		StringBuilder builder = new StringBuilder();
		
		for (int i=1 ; i <100_001 ; i++) {
			builder.append(i);
		}
		
		long b = System.currentTimeMillis();
		System.out.println((b-a));
		
		//
		long c = System.currentTimeMillis();
		
		String ch = "";
		for (int i=1 ; i <100_001 ; i++) {
			ch+=i;;
		}
		long d = System.currentTimeMillis();
		System.out.println((d-c));
	}

}
