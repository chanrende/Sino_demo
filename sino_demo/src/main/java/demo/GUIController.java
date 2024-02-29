package demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GUIController {

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("message", "Hello from Frederic!");
        model.addAttribute("nachricht", "Klassische ansicht");
        return "home"; // Referenziert home.html in src/main/resources/templates
    }
    @GetMapping("/index")
    public String index(){
        return "index";
    }
        @PostMapping("/frage")
    public String frageSenden(@RequestParam("frage") String frage, Model model) {
        // Hier würdest du deine Logik einfügen, um die Frage an ChatGPT zu senden
        String antwort = "Hier sollte die Antwort von ChatGPT angezeigt werden. Frage war: " + frage;
        
        // Füge die Antwort dem Modell hinzu, um sie im Template anzuzeigen
        model.addAttribute("antwort", antwort);
        return "index";
    }
}
