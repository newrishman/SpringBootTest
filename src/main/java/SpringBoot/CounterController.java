package SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CounterController {
    @Autowired
    public Counter counter;

    @GetMapping("/api/v1/counter")
    int intCount() {
        return counter.getValue();
    }

    @PostMapping("/api/v1/counter")
    void getCount() {
        counter.intCount();
    }
}
