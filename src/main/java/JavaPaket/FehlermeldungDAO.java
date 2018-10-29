package JavaPaket;




public class FehlermeldungDAO {

	/*Wir erhalten die Informationen einer Fehlermeldung als String*/

	public String getFehlermeldungString(Fehlermeldung meldung) {
		return "" + meldung.getName() + "|" + meldung.getId() + "|" + meldung.getEingangsdatum() + "|"
				+ meldung.getKurztext() + "|" + meldung.getLangtext();
	}

/*Konvertierung der String-Dateien in Objekte*/

	public Fehlermeldung getFehlermeldungObject(String meldungstext) {
		String[] splits = meldungstext.split("|");
		String name = splits[0];
		long id = Long.parseLong(splits[1]);
		String eingangsdatum = splits[2];
		String kurztext = splits[3];
		String langtext = splits[4];
		return new Fehlermeldung(name, id, eingangsdatum, kurztext, langtext);
	}
}
