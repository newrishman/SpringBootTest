package SpringBoot;

import org.springframework.stereotype.Service;

    @Service
    public class Counter{
        private int count = 0;

        public void intCount(){
            count++;
        }

        public int getValue(){
            return count;
        }
    }



