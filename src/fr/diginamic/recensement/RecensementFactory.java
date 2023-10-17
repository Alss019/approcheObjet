package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class RecensementFactory {

	   public static Recensement createRecenssement(Path path) throws IOException {
		   
			ArrayList<Ville> villes = new ArrayList<>();
			String[] ligneSplit = new String[0];
	        List<String> lines = Files.readAllLines(path);

	        for (int i = 1; i < lines.size(); i++) {
	        	ligneSplit = lines.get(i).split(";");
	                int population = Integer.parseInt(ligneSplit[9].trim().replaceAll(" ", ""));
	                villes.add(new Ville(ligneSplit[6], ligneSplit[5], ligneSplit[2], ligneSplit[0], ligneSplit[1], population));
	            } 
	        return new Recensement(villes);
    	}
}

