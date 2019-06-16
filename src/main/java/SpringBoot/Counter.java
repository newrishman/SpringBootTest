package SpringBoot;

import org.springframework.stereotype.Service;

@Service
public class Counter {
    private int count = 0;

    public void incCount() {
        count++;
    }

    public int getValue() {
        return count;
    }
}



