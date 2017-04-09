package CercaParoleChiave.model;

import java.util.LinkedList;
import java.util.List;

public class Model {
	
	List<ParolaChiave> paroleChiave;
	
	public Model(){
		paroleChiave = new LinkedList<ParolaChiave>();
		paroleChiave.add(new ParolaChiave("fabbricazione",1));
		
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
