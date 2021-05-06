package ListInterface.ArrayList;


import java.util.ArrayList;
import java.util.List;

public class ArrayGet {

    private List<Object> test = new ArrayList<>();

    public ArrayGet(int a){
        for(int i=0; i<10000; i++){
            test.add(i);
        }
    }

    public ArrayGet(int[] a){
        for(int i=0; i<10000; i++){
            test.add(a);
        }
    }

    public ArrayGet(String a){
        for(int i=0; i<10000; i++){
            test.add(a);
        }
    }

    public ArrayGet(String[] a){
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

        System.out.println(diff);
    }
}
