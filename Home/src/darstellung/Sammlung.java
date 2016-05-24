package darstellung;

import anwendung.Darsteller;
import anwendung.Film;
import anwendung.Format;

public class Sammlung {

	public static void main(String[] args) {
		
//		new Hauptfenster();
		
		Film f = new Film("Test", "asdasdasdad asdasdas adssagfs");
		Darsteller d1 = new Darsteller("Alex", "Maljakin");
		Darsteller d2 = new Darsteller("Alex", "Maljakin");
		f.setFormat(Format.BlueRay);
		f.add(d1);
		f.add(d2);
		System.out.println(f);
	}

}
