package fichier;



import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

import attributFichier.Ville;


public class LectureFichier {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		ArrayList<Ville> villes = new ArrayList<>();
		
		Path path = Paths.get("/Users/corentin/Desktop/recensement.csv");
		Path pathDestination = Paths.get("/Users/corentin/Documents/fichierCsv/recensement35.csv");
		
		List<String> line = Files.readAllLines(path);
		String[] lineSplit = new String[0];
        
        for (int i = 1; i < line.size(); i++) {
            lineSplit= line.get(i).split(";");
            int pop = Integer.parseInt(lineSplit[9].trim().replaceAll(" ",""));
        	Ville ville = new Ville(lineSplit[6], lineSplit[2], lineSplit[1], pop);
        	villes.add(ville);
        }

        ArrayList<Ville> villesPlus25000 = new ArrayList<>();
        for (Ville ville : villes) {
            if (ville.getPopTotal() > 25000) {
                villesPlus25000.add(ville);
            }
        }
        
        String enTete = "Nom Ville;Code Département;Region; Population"+ System.getProperty("line.separator");;
        Files.write(pathDestination,enTete.getBytes());
        
        for(Ville ville : villesPlus25000) {
        	 String ligne = ville.getNom() + ";" + ville.getCodeDep() + ";" + ville.getNomRegion() + ";" + ville.getPopTotal() + System.getProperty("line.separator");
        	 Files.write(pathDestination, ligne.getBytes(), StandardOpenOption.APPEND);
        	 System.out.println(ville.getNom());
        }

	}

}
