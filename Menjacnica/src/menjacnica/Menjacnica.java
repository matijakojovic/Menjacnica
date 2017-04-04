package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.kurs.Kurs;
import menjacnica.valuta.Valuta;
import nekipaket.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	LinkedList<Valuta> valute = new LinkedList<Valuta>();
	
	@Override
	public void dodajKursNaDan(String naziv, GregorianCalendar dan, double srednji, double kupovni, double prodajni) {
	
		
		for (int i = 0; i < valute.size(); i++) {
			
		}

	}

	@Override
	public void obrisiKursNaDan(String naziv, GregorianCalendar dan) {
		// TODO Auto-generated method stub

	}

	@Override
	public Kurs pronadjiKursNaDan(String naziv, GregorianCalendar dan) {
		// TODO Auto-generated method stub
		return null;
	}

}
