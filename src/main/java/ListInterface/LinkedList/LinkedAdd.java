package ListInterface.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedAdd {

    private List<Object> test = new LinkedList<>();

    public LinkedAdd(int a){

        long BeforeTime = System.currentTimeMillis();
        for(int i=0; i<10000; i++){
            test.add(i);
        }
        long AfterTime = System.currentTimeMillis();
        System.out.println(AfterTime-BeforeTime);
    }

    public LinkedAdd(int[] a){
        long BeforeTime = System.currentTimeMillis();
        for(int i=0; i<10000; i++){
            test.add(i);
        }
        long AfterTime = System.currentTimeMillis();
        System.out.println(AfterTime-BeforeTime);
    }

    public LinkedAdd(String a){
        long BeforeTime = System.currentTimeMillis();
        for(int i=0; i<10000; i++){
            test.add(a);
        }
        long AfterTime = System.currentTimeMillis();
        System.out.println(AfterTime-BeforeTime);
    }

    public LinkedAdd(String[] a){
        long BeforeTime = System.currentTimeMillis();
        for(int i=0; i<10000; i++){
            test.add(a);
        }
        long AfterTime = System.currentTimeMillis();
        System.out.println(AfterTime-BeforeTime);
    }

}
