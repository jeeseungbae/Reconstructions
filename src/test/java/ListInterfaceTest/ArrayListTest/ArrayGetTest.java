package ListInterfaceTest.ArrayListTest;

import ListInterface.ArrayList.ArrayGet;
import org.junit.jupiter.api.Test;

public class ArrayGetTest {

    @Test
    public void getInt(){
        ArrayGet test = new ArrayGet(3);
        test.getTest();
    }
    @Test
    public void getString(){
        ArrayGet test = new ArrayGet(new int[]{0,0});
        test.getTest();
    }
    @Test
    public void getIntArr(){
        ArrayGet test = new ArrayGet("0");
        test.getTest();
    }
    @Test
    public void getStringArr(){
        ArrayGet test = new ArrayGet(new String[]{"0","0"});
        test.getTest();
    }
}
