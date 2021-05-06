package ListInterface.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedRemove {
    private List<Object> test = new LinkedList<>();

    public LinkedRemove(int a){
        for(int i=0; i<10000; i++){
            test.add(a);
        }
    }

    public LinkedRemove(int[] a){
        for(int i=0; i<10000; i++){
            a[0]+=i;
            a[1]+=i;
            test.add(i);
        }
    }

    public LinkedRemove(String a){
        for(int i=0; i<10000; i++){
            test.add(a);
        }
    }

    public LinkedRemove(String[] a){
        for(int i=0; i<10000; i++){
            a[0] +=i;
            a[1]+=i;
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
