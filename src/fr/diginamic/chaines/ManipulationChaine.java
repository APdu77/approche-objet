package fr.diginamic.chaines;

import java.util.Arrays;
import java.util.Spliterator;

public class ManipulationChaine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String chaine = "Durand;Marcel;2 523.5";
	
	chaine.charAt(0);
	System.out.println(chaine.charAt(0));
	
	System.out.println(chaine.length());

	System.out.println(chaine.indexOf(';'));

	System.out.println(chaine.substring(chaine.indexOf('D'), chaine.indexOf(';')));
	
	System.out.println(chaine.substring(chaine.indexOf('D'), chaine.indexOf(';')).toUpperCase());
	
	System.out.println(chaine.substring(chaine.indexOf('D'), chaine.indexOf(';')).toLowerCase());

	String[] ch = chaine.split(";");
	
	System.out.println(Arrays.toString(ch));
	
	}

}
