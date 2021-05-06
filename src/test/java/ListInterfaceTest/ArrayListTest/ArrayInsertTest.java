package ListInterfaceTest.ArrayListTest;

import ListInterface.ArrayList.ArrayGet;
import ListInterface.ArrayList.ArrayInsert;
import org.junit.jupiter.api.Test;

public class ArrayInsertTest {

    @Test
    public void insertInt(){
        ArrayInsert test = new ArrayInsert(3);
        test.getTest();
    }
    @Test
    public void insertString(){
        ArrayInsert test = new ArrayInsert(new int[]{0,0});
        test.getTest();
    }
    @Test
    public void insertIntArr(){
        ArrayInsert test = new ArrayInsert("0");
        test.getTest();
    }
    @Test
    public void insertStringArr(){
        ArrayInsert test = new ArrayInsert(new String[]{"0","0"});
        test.getTest();
    }

}
