package SpringBoot;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Service
public class Counter {

    @GetMapping("api/v1/counter")
    public int intCount() {
        int count = 0;
        return count;
    }

    @PostMapping("/api/v1/counter")

    public void getCount() {
        int x = intCount();
        x++;
    }
}


