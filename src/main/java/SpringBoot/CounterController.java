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
        int count = 0;
        return count;

    }
    @PostMapping("/api/v1/counter")
    void getCount() {
        int count = intCount();
        count++;
    }
}
