package ListInterface.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayInsert {


    private List<Object> test = new ArrayList<>();
    long diff;

    public ArrayInsert(int a){
        long getBeforeTest = System.currentTimeMillis();
        test.add(a);
        for(int i=0; i<10000; i++){
            test.add(i/2,a);
        }
        long getAfterTest = System.currentTimeMillis();
        diff = (getAfterTest-getBeforeTest);
    }

    public ArrayInsert(int[] a){
        long getBeforeTest = System.currentTimeMillis();
        test.add(a);
        for(int i=0; i<10000; i++){
            test.add(i/2,a);
        }
        long getAfterTest = System.currentTimeMillis();
        diff = (getAfterTest-getBeforeTest);
    }

    public ArrayInsert(String a){
        long getBeforeTest = System.currentTimeMillis();
        test.add(a);
        for(int i=0; i<10000; i++){
            test.add(i/2,a);
        }
        long getAfterTest = System.currentTimeMillis();
        diff = (getAfterTest-getBeforeTest);
    }

    public ArrayInsert(String[] a){
        long getBeforeTest = System.currentTimeMillis();
        test.add(a);
        for(int i=0; i<10000; i++){
            test.add(i/2,a);
        }
        long getAfterTest = System.currentTimeMillis();
        diff = (getAfterTest-getBeforeTest);
    }

    public void getTest(){
        System.out.println(diff);

    }

}
