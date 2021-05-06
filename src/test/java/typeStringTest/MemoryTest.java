package typeStringTest;

import org.junit.jupiter.api.Test;
import typeString.Memory;

public class MemoryTest {

    @Test
    public void memoryString(){
        Memory test = new Memory();
        test.testString();
    }

    @Test
    public void speed(){
        Memory test = new Memory();
        test.speed();
    }
}
