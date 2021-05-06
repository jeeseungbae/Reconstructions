package ListInterfaceTest.ArrayListTest;

import ListInterface.ArrayList.ArrayInsert;
import ListInterface.ArrayList.ArrayRemove;
import org.junit.jupiter.api.Test;

public class ArrayRemoveTest {

    @Test
    public void insertInt(){
        ArrayRemove test = new ArrayRemove(3);
        test.removeTest();
    }
    @Test
    public void insertString(){
        ArrayRemove test = new ArrayRemove(new int[]{0,0});
        test.removeTest();
    }
    @Test
    public void insertIntArr(){
        ArrayRemove test = new ArrayRemove("0");
        test.removeTest();
    }
    @Test
    public void insertStringArr(){
        ArrayRemove test = new ArrayRemove(new String[]{"0","0"});
        test.removeTest();
    }
}
