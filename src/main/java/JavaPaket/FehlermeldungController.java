package JavaPaket;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FehlermeldungController {

    @RequestMapping("/melden")
    public Fehlermeldung melden(@RequestParam(value="name", defaultValue="beispieltext") String name,
                                @RequestParam(value="id", defaultValue="42") Long id,
                                @RequestParam(value="kurztext", defaultValue="beispieltext") String kurztext,
                                @RequestParam(value="langtext", defaultValue="beispieltext") String langtext) {

        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss dd.MM.yyyy");
        String eingangsdatum = simpleDateFormat.format(date);
        System.out.println("EingangsDate:" +eingangsdatum);

        Fehlermeldung fehlermeldung = new Fehlermeldung(name, id, eingangsdatum, kurztext, langtext);

        new FehlermeldungTextPersistence().save(fehlermeldung);

        return fehlermeldung;
    }

}
