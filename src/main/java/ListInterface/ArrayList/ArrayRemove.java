package ListInterface.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayRemove {
    private List<Object> test = new ArrayList<>();

    public ArrayRemove(int a){
        for(int i=0; i<10000; i++){
            test.add(a);
        }
    }

    public ArrayRemove(int[] a){
        for(int i=0; i<10000; i++){
            test.add(a);
        }
    }

    public ArrayRemove(String a){
        for(int i=0; i<10000; i++){
            test.add(a);
        }
    }

    public ArrayRemove(String[] a){
        for(int i=0; i<10000; i++){
            test.add(a);
        }
    }


    public void removeTest(){
        long getBeforeTest = System.currentTimeMillis();
        for(int i=0; i<10000; i++){
            test.remove(0);
        }
        long getAfterTest = System.currentTimeMillis();
        long diff = (getAfterTest-getBeforeTest);

        System.out.println(diff);
    }
}
