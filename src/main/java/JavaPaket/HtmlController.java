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
      String name = model.getName;
      Long id = model.getId;
      String kurztext = model.getKurztext;
      String langtext = model.getLangtext;
       // Template fehlerservice.html aufrufen
       return "fehlerservice";
    }

}
