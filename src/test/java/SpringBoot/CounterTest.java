package SpringBoot;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CounterTest {

    @Test
    public void getValueTest() {
        Counter counter = new Counter();
        assertEquals("the countdown begins with zero", 0, counter.getValue());

    }

    @Test
    public void incCountTest() {
        Counter counter = new Counter();
        counter.incCount();
        assertEquals("incCount() add one to the previous count", 1, counter.getValue());
    }

}