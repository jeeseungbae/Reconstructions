package ListInterfaceTest.LinkedListTest;

import ListInterface.LinkedList.LinkedInsert;
import ListInterface.LinkedList.LinkedRemove;
import org.junit.jupiter.api.Test;

public class LinkedRemoveTest {


    @Test
    public void removeInt(){
        LinkedRemove test = new LinkedRemove(3);
        test.removeTest();
    }

    @Test
    public void removeString(){
        LinkedRemove test = new LinkedRemove(new int[]{0,0});
        test.removeTest();
    }

    @Test
    public void removeIntLinked(){
        LinkedRemove test = new LinkedRemove("0");
        test.removeTest();
    }

    @Test
    public void removeStringLinked(){
        LinkedRemove test = new LinkedRemove(new String[]{"0","0"});
        test.removeTest();
    }

}
