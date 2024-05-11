import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class BasicTest {
    @Test
    public void test_sum_1(){
        ArrayList<Long> arr = new ArrayList<Long>();
        arr.add(1l);
        arr.add(2l);
        arr.add(3l);
        long result = Main._sum(arr);
        Assertions.assertEquals(6l, result);
    }
    @Test
    public void test_sum_2(){
        ArrayList<Long> arr = new ArrayList<Long>();
        arr.add(4l);
        arr.add(5l);
        arr.add(6l);
        long result = Main._sum(arr);
        Assertions.assertEquals(15l, result);
    }
    @Test
    public void test_sum_3(){
        ArrayList<Long> arr = new ArrayList<Long>();
        arr.add(1000l);
        arr.add(2000l);
        arr.add(4000l);
        long result = Main._sum(arr);
        Assertions.assertEquals(7000l, result);
    }
    @Test
    public void test_mult_1(){
        ArrayList<Long> arr = new ArrayList<Long>();
        arr.add(1l);
        arr.add(2l);
        arr.add(3l);
        long result = Main._mult(arr);
        Assertions.assertEquals(6l, result);
    }
    @Test
    public void test_mult_2(){
        ArrayList<Long> arr = new ArrayList<Long>();
        arr.add(4l);
        arr.add(5l);
        arr.add(6l);
        long result = Main._mult(arr);
        Assertions.assertEquals(120l, result);
    }
    @Test
    public void test_mult_3(){
        ArrayList<Long> arr = new ArrayList<Long>();
        arr.add(100l);
        arr.add(200l);
        arr.add(400l);
        long result = Main._mult(arr);
        Assertions.assertEquals(8000000l, result);
    }
    @Test
    public void test_min_1(){
        ArrayList<Long> arr = new ArrayList<Long>();
        arr.add(1l);
        arr.add(2l);
        arr.add(3l);
        long result = Main._min(arr);
        Assertions.assertEquals(1l, result);
    }
    @Test
    public void test_min_2(){
        ArrayList<Long> arr = new ArrayList<Long>();
        arr.add(4l);
        arr.add(5l);
        arr.add(6l);
        long result = Main._min(arr);
        Assertions.assertEquals(4l, result);
    }
    @Test
    public void test_min_3(){
        ArrayList<Long> arr = new ArrayList<Long>();
        arr.add(100l);
        arr.add(200l);
        arr.add(400l);
        long result = Main._min(arr);
        Assertions.assertEquals(100l, result);
    }
    @Test
    public void test_max_1(){
        ArrayList<Long> arr = new ArrayList<Long>();
        arr.add(1l);
        arr.add(2l);
        arr.add(3l);
        long result = Main._max(arr);
        Assertions.assertEquals(3l, result);
    }
    @Test
    public void test_max_2(){
        ArrayList<Long> arr = new ArrayList<Long>();
        arr.add(4l);
        arr.add(5l);
        arr.add(6l);
        long result = Main._max(arr);
        Assertions.assertEquals(6l, result);
    }
    @Test
    public void test_max_3(){
        ArrayList<Long> arr = new ArrayList<Long>();
        arr.add(100l);
        arr.add(200l);
        arr.add(400l);
        long result = Main._max(arr);
        Assertions.assertEquals(300l, result);
    }
}
