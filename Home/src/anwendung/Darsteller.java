package anwendung;

public class Darsteller {
	private String vorname;
	private String nachname;




	public Darsteller(String vorname, String nachname ) {
		this.vorname = vorname;
		this.nachname = nachname;

	}
	
	public String getVorname() {
		return vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	@Override
	public String toString() {
		return "Darsteller [vorname=" + vorname + ", nachname=" + nachname + "]";
	}
	
	
	
}
