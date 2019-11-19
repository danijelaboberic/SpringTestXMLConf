package dmi.ris.app;


public class Student {
	
	private String ime;
	private Adresa prebivaliste;
	private Adresa boraviste;
	
   
	public void setPrebivaliste(Adresa prebivaliste) {
		this.prebivaliste = prebivaliste;
	}
   
	public void setBoraviste(Adresa boraviste) {
		this.boraviste = boraviste;
	}
	
	public void setIme(String ime) {
		this.ime = ime;
	}

	public void predstaviSe(){
		System.out.println("Zovem se "+ime+ ".\n "+prebivaliste.ispisi()+"\n "+boraviste.ispisi()+"\n " );
	}
	
	
	

}
