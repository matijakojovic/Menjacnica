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
		
		Kurs k = new Kurs();
		k.setDatum(dan);
		k.setSrednji(srednji);
		k.setProdajni(prodajni);
		k.setKupovni(kupovni);
		
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i).getNaziv().equals(naziv)){
				valute.get(i).getKursevi().add(k);
				break;
			}
		}
	}

	@Override
	public void obrisiKursNaDan(String naziv, GregorianCalendar dan) {
		
		Valuta pom = new Valuta();
		
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i).getNaziv().equals(naziv)){
				pom = valute.get(i);
				break;
			}
		}
		for (int i = 0; i < pom.getKursevi().size(); i++) {
			if(pom.getKursevi().get(i).getDatum().equals(dan)){
				pom.getKursevi().remove(i);
				break;
			}
		}
		
	}

	@Override
	public Kurs pronadjiKursNaDan(String naziv, GregorianCalendar dan) {
		
		Valuta pom = new Valuta();
		
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i).getNaziv().equals(naziv)){
				pom = valute.get(i);
				break;
			}
		}
		for (int i = 0; i < pom.getKursevi().size(); i++) {
			if(pom.getKursevi().get(i).getDatum().equals(dan)){
				return pom.getKursevi().get(i);
			}
		}
		throw new RuntimeException("Nije pronadjen trazeni kurs");
	}
}
