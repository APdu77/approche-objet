package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Path path = Paths.get("C:\\Users\\apdu7\\Documents\\DIGINAMIC\\WorkSpaceST\\recensement.csv");
		Path pathCible = Paths.get("C:\\Users\\apdu7\\Documents\\DIGINAMIC\\WorkSpaceST\\recensementv2.csv");

		System.out.println(path.getRoot());
		System.out.println(path.getParent());
		System.out.println(path.getFileName());	
		
		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);	
		
		List<String> lines2 = new ArrayList<>();
		
		for  (int i=0; i<101 ;i++) {
			lines2.add(lines.get(i));
			System.out.println(lines.get(i));
			System.out.println(lines2.get(i));
		}
		
		
		//Files.write(pathCible,lines2);
		
		
	}

}
