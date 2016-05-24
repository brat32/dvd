package anwendung;

import java.util.ArrayList;
import java.util.List;

public class Film {
	private String filname;
	private String beschreibung;
	private List<Darsteller> darsteller;
	private Format format;

	public Film(String filname, String beschreibung) {
		super();
		this.filname = filname;
		this.beschreibung = beschreibung;
		darsteller=new ArrayList<Darsteller>();
	}
	public String getFilname() {
		return filname;
	}
	public void setFilname(String filname) {
		this.filname = filname;
	}
	public String getBeschreibung() {
		return beschreibung;
	}
	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}
	public int size() {
		return darsteller.size();
	}
	public boolean add(Darsteller e) {
		return darsteller.add(e);
	}
	
	public Format getFormat() {
		return format;
	}
	public void setFormat(Format format) {
		this.format = format;
	}
	@Override
	public String toString() {
		return "Film [filname=" + filname + ", beschreibung=" + beschreibung + ", darsteller=" + darsteller
				+ ", format=" + format + "]";
	}

	

	
	
}
