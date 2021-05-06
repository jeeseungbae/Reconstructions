package ListInterfaceTest.LinkedListTest;

import ListInterface.LinkedList.LinkedAdd;
import org.junit.jupiter.api.Test;

public class LinkedAddTest {

    @Test
    public void addInt(){
        LinkedAdd test = new LinkedAdd(0);
    }

    @Test
    public void addString(){
        LinkedAdd test = new LinkedAdd(new int[]{0,0});
    }

    @Test
    public void addintLinked(){
        LinkedAdd test = new LinkedAdd("0");
    }

    @Test
    public void addStringLinked(){
        LinkedAdd test = new LinkedAdd(new String[]{"0","0"});
    }
}
