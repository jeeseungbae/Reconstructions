package ListInterface.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedGet {

    private List<Object> test = new LinkedList<>();

    public LinkedGet(int a){
        for(int i=0; i<10000; i++){
            test.add(a);
        }
    }

    public LinkedGet(int[] a){
        for(int i=0; i<10000; i++){
            test.add(a);
        }
    }

    public LinkedGet(String a){
        for(int i=0; i<10000; i++){
            test.add(a);
        }
    }

    public LinkedGet(String[] a){
        for(int i=0; i<10000; i++){
            test.add(a);
        }
    }

    public void getTest(){

        long getBeforeTest = System.currentTimeMillis();
        for(int i=0; i<10000; i++){
            test.get(i);
        }
        long getAfterTest = System.currentTimeMillis();
        long diff = (getAfterTest-getBeforeTest);

        System.out.println("시간(ms) 비교 : "+diff);
    }
}
