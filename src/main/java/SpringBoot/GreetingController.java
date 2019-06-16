package SpringBoot;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/0")
    public int greeting(@RequestParam(name = "0", required = false) String name,
                           Model model
    ) {
        model.addAttribute("name", name);
        return 0;
    }

}