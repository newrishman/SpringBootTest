package SpringBoot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)

public class CounterControllerTest {

    @Mock
    public Counter counter;

    @InjectMocks
    CounterController sut;

    @Test
    public void getCount() {

        when(counter.getValue()).thenReturn(1);
        assertEquals("return one", 1, sut.getCount());
    }

    @Test
    public void incCount() {
        //test
        sut.incCount();
        //validate
        verify(counter).incCount();
    }
}