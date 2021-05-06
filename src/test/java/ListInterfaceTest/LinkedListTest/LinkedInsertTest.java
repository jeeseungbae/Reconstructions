package ListInterfaceTest.LinkedListTest;

import ListInterface.LinkedList.LinkedInsert;
import org.junit.jupiter.api.Test;

public class LinkedInsertTest {

    @Test
    public void insertInt(){
        LinkedInsert test = new LinkedInsert(3);
        test.getTest();
    }

    @Test
    public void insertString(){
        LinkedInsert test = new LinkedInsert(new int[]{0,0});
        test.getTest();
    }

    @Test
    public void insertIntLinked(){
        LinkedInsert test = new LinkedInsert("0");
        test.getTest();
    }

    @Test
    public void insertStringLinked(){
        LinkedInsert test = new LinkedInsert(new String[]{"0","0"});
        test.getTest();
    }

}
