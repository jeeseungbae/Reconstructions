package ListInterfaceTest.LinkedListTest;

import ListInterface.LinkedList.LinkedGet;
import org.junit.jupiter.api.Test;

public class LinkedGetTest {

    @Test
    public void getInt(){
        LinkedGet test = new LinkedGet(3);
        test.getTest();
    }

    @Test
    public void getString(){
        LinkedGet test = new LinkedGet(new int[]{0,0});
        test.getTest();
    }

    @Test
    public void getIntLinked(){
        LinkedGet test = new LinkedGet("0");
        test.getTest();
    }

    @Test
    public void getStringLinked(){
        LinkedGet test = new LinkedGet(new String[]{"0","0"});
        test.getTest();
    }

}
