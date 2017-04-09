package CercaParoleChiave.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Model {
	
	List<ParolaChiave> paroleChiave;
	
	public Model() throws IOException{
		paroleChiave = new LinkedList<ParolaChiave>();
		/*
		paroleChiave.add(new ParolaChiave("fabbricazione","1"));
		paroleChiave.add(new ParolaChiave("cad","1,2"));
		paroleChiave.add(new ParolaChiave("cam","1,2"));
		*/
		FileReader fr = new FileReader ("parole.txt");
		BufferedReader br = new BufferedReader(fr);
		String riga = "";
		
		while((riga=br.readLine())!=null){
			String array[] = riga.split(";");
			paroleChiave.add(new ParolaChiave(array[0],array[1]));
		}
		
		br.close();
		fr.close();
		
	}
	
	public String cercaParoleChiave(String testoInserito){
		
		String ris = "";
		
		for(ParolaChiave p : paroleChiave)
			if(testoInserito.contains(p.getParola().toLowerCase()))
				ris += p.toString();
		
		if(ris.equals(""))
			return "Nessuna parola chiave trovata";
		
		return ris;
	}
	

}
