package JavaPaket;

public class Fehlermeldung {

	private final String name;
	private final long id;
	private final String kurztext;
	private final String langtext;
	private final String eingangsdatum;

	public Fehlermeldung(String name, long id, String eingangsdatum, String kurztext, String langtext) {
		this.name = name;
		this.id = id;
		this.eingangsdatum = eingangsdatum;
		this.kurztext = kurztext;
		this.langtext = langtext;
	}

	public String getName() {
		return name;
	}

	public long getId() {
		return id;
	}

	public String getLangtext() {
		return langtext;
	}

	public String getKurztext() {
		return kurztext;
	}

	public String getEingangsdatum() {
		return eingangsdatum;
	}

}
