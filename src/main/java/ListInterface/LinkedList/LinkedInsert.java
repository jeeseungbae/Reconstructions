package ListInterface.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedInsert {

    private List<Object> test = new LinkedList<>();
    long diff;

    public LinkedInsert(int a){
        long getBeforeTest = System.currentTimeMillis();
        test.add(a);
        for(int i=0; i<10000; i++){
            test.add(i/2,a);
        }
        long getAfterTest = System.currentTimeMillis();
        diff = (getAfterTest-getBeforeTest);
    }

    public LinkedInsert(int[] a){
        long getBeforeTest = System.currentTimeMillis();
        test.add(a);
        for(int i=0; i<10000; i++){
            test.add(i/2,a);
        }
        long getAfterTest = System.currentTimeMillis();
        diff = (getAfterTest-getBeforeTest);
    }

    public LinkedInsert(String a){
        long getBeforeTest = System.currentTimeMillis();
        test.add(a);
        for(int i=0; i<10000; i++){
            test.add(i/2,a);
        }
        long getAfterTest = System.currentTimeMillis();
        diff = (getAfterTest-getBeforeTest);
    }

    public LinkedInsert(String[] a){
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
