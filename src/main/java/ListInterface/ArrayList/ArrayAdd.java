package ListInterface.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayAdd {

    long addBeforeTime;
    long addAfterTime;
    long secDiffTime;

    public void addTest(){

        //================int 비교=====================

        List<Integer> exArrayList = new ArrayList<>();

        addBeforeTime = System.currentTimeMillis();
        for(int i=0; i<10000; i++){
            exArrayList.add(i);
        }
        addAfterTime = System.currentTimeMillis();

        secDiffTime = (addAfterTime-addBeforeTime);

        System.out.println(secDiffTime);



        //================int[] 비교=====================

        List<int[]> exArrayList2 = new ArrayList<>();
        addBeforeTime = System.currentTimeMillis();
        for(int i=0; i<10000; i++){
            int[] a = new int[]{i,i};
            // a는 스택에 저장, new int[]의 데이터는 heap에 저장된다.
            exArrayList2.add(a);
        }
        addAfterTime = System.currentTimeMillis();

        secDiffTime = (addAfterTime-addBeforeTime);

        System.out.println(secDiffTime);



        //================String 비교=====================

        String a = "0";
        // a는 스택에 저장, new String[]의 데이터는 heap에 저장된다.
        List<String> exArrayList3 = new ArrayList<>();
        addBeforeTime = System.currentTimeMillis();
        for(int i=0; i<10000; i++){
            exArrayList3.add(a);
            // String이 삽입된다.
        }
        addAfterTime = System.currentTimeMillis();

        secDiffTime = (addAfterTime-addBeforeTime);

        System.out.println(secDiffTime);



        //================String[] 비교=====================

        String a1 = "0";
        List<String[]> exArrayList4 = new ArrayList<>();
        addBeforeTime = System.currentTimeMillis();
        for(int i=0; i<10000; i++){
            String[] b = new String[]{a1,a1};
            // b는 스택에 저장, new String[]의 데이터는 heap에 저장된다.
            exArrayList4.add(b);
            //String[] 배열이 저장되어 있는 주소값이 삽입된다. => 더 빠른이유
        }
        addAfterTime = System.currentTimeMillis();

        secDiffTime = (addAfterTime-addBeforeTime);

        System.out.println(secDiffTime);

    }
}
