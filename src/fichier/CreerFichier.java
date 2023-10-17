package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class CreerFichier {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path pathOrigine = Paths.get("/Users/corentin/Desktop/recensement.csv");
		Path pathDestination = Paths.get("/Users/corentin/Documents/fichierCsv/recensement.csv");
		int ligneAEcrire = 100;
		
		Files.copy(pathOrigine, pathDestination, StandardCopyOption.REPLACE_EXISTING);
		List<String> line = Files.readAllLines(pathOrigine);
		List<String> premieresLignes = line.subList(1, ligneAEcrire);
		
		Files.write(pathDestination, premieresLignes);
		  
	}

}
