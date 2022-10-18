package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

import javax.swing.Popup;

import fr.diginamic.tri.Ville;

public class LectureFichier {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Path path = Paths.get("C:\\Users\\apdu7\\Documents\\DIGINAMIC\\WorkSpaceST\\recensement.csv");
		
		System.out.println(path.getRoot());
		System.out.println(path.getParent());
		System.out.println(path.getFileName());	
		
		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);

		for (String l: lines) {
			System.out.println(l);
		}
		
		//LireFichierAvecInstanciation
		List<Ville> villes = new ArrayList<>();
		
		for  (int i=1; i<lines.size() ;i++) {
			String[] tab = lines.get(i).split(";",0);
			String nom = tab[6];
			int pop = Integer.parseInt (tab[9].replaceAll(" ", ""));
			String region = tab[1];
			String dept = tab[2];
			villes.add(new Ville(nom, dept, region, pop));
			System.out.println(villes.get(i-1));
		}
		
		//GenererFichier
		Path pathCible = Paths.get("C:\\Users\\apdu7\\Documents\\DIGINAMIC\\WorkSpaceST\\recensementv3.csv");	
				
		List<String> lines2 = new ArrayList<>();
		
		lines2.add ("Nom de la commune;Code Departement;Nom de la Region;Population totale");
		
		for  (int i=0; i<villes.size() ;i++) {
			if (villes.get(i).getNbHab() >= 25000)	{
				lines2.add(villes.get(i).getNom()+";"+villes.get(i).getCodeDept()+";"+villes.get(i).getNomRegion()+";"+String.valueOf(villes.get(i).getNbHab()));
				System.out.println(villes.get(i));
			}
		}
		
		Iterator<String> ite = lines2.iterator();
		while (ite.hasNext())	{//une valeur suivante existe?
			String l = ite.next();//i++
			System.out.println(l);
		}
		
		
		//ou
//		for (String l: lines2) {
//			System.out.println(l);
//		}
		
		Files.write(pathCible,lines2);	
		
		
	}

}
