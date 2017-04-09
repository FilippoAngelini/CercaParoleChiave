package CercaParoleChiave.model;

public class ParolaChiave {
	
	private String parola;
	private int numeroArgomento;
	
	public ParolaChiave(String parola, int numeroArgomento) {
		this.parola = parola;
		this.numeroArgomento = numeroArgomento;
	}

	/**
	 * @return the parola
	 */
	public String getParola() {
		return parola;
	}

	/**
	 * @param parola the parola to set
	 */
	public void setParola(String parola) {
		this.parola = parola;
	}

	/**
	 * @return the numeroArgomento
	 */
	public int getNumeroArgomento() {
		return numeroArgomento;
	}

	/**
	 * @param numeroArgomento the numeroArgomento to set
	 */
	public void setNumeroArgomento(int numeroArgomento) {
		this.numeroArgomento = numeroArgomento;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((parola == null) ? 0 : parola.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ParolaChiave other = (ParolaChiave) obj;
		if (parola == null) {
			if (other.parola != null)
				return false;
		} else if (!parola.equals(other.parola))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Parola chiave: " + parola + ", Argomento= " + numeroArgomento + "\n";
	}
	
	

}
