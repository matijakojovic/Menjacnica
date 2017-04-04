package nekipaket;

import java.util.GregorianCalendar;
import menjacnica.kurs.Kurs;

public interface MenjacnicaInterfejs {

	public void dodajKursNaDan(String naziv, GregorianCalendar dan, double srednji, double kupovni, double prodajni);
	public void obrisiKursNaDan(String naziv, GregorianCalendar dan);
	public Kurs pronadjiKursNaDan(String naziv, GregorianCalendar dan);
	
}
