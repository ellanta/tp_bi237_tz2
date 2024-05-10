import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class BasicTest {
    @Test
    public void test1(){
        ArrayList<Long> arr = new ArrayList<Long>();
        arr.add(1l);
        arr.add(2l);
        arr.add(3l);
        long result = Main._sum(arr);
        Assertions.assertEquals(6l, result);
    }
}
