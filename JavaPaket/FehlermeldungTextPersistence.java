package JavaPaket;

import java.io.*;

public class FehlermeldungTextPersistence implements FehlermeldungPersistence {

	public void save(Fehlermeldung meldung) {
		File myfile = new File("C:\Users\klein\Fehlermeldungen");
		try {
			FileWriter fileWriter = new FileWriter(myfile, true);
			PrintWriter printWriter = new PrintWriter(fileWriter);
			printWriter.println(new FehlermeldungDAO().getFehlermeldungString(meldung));
			printWriter.flush();
			printWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
