package SpringBoot;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/0")
    public int greeting() {
        return 0;
    }

}

