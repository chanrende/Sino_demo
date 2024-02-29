package demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GUIController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Hello from Spring!");
        return "home"; // Referenziert home.html in src/main/resources/templates
    }
}
