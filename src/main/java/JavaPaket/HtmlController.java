package JavaPaket;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Web-Controller für alle HTML-Seiten
 */
@Controller
public class HtmlController {

    @RequestMapping("/")
    public String zeigeStartseite(Model model) {
        // Template index.html aufrufen
        return "index";
    }

    @RequestMapping("/fehlerservice/")
    public String zeigeFehlerservice(Model model) {
       // TODO: Daten einlesen und in "model" ablegen, damit sie im Template zur Verfügung stehen

       // Template fehlerservice.html aufrufen
       return "fehlerservice";
    }

}
