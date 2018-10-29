package JavaPaket;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HtmlController {

    @RequestMapping("/index/")
    public String zeigeStartseite(Model model) {
        // Template index.html aufrufen
        return "index";
    }

    @RequestMapping("/fehlerservice/")
    public String zeigeFehlerservice(Model model) {
      //Fehlermed.read.... bei der Startseite
      //Werte daraus in model rein
      FehlermeldungTextPersistence.read();
      

       // Template fehlerservice.html aufrufen
       return "fehlerservice";
    }

}
