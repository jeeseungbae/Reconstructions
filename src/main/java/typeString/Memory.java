package typeString;



public class Memory {

    private String testString1;
    private String testString2;

    private String[] testStringArr1;
    private String[] testStringArr2;

    public void testString(){

        //String pool 메모리에 저장된다.
        testString1 = "a";
        testString2 = "a";

        System.out.println("testString1 : "+testString1);
        System.out.println("testString2 : "+testString2);
        System.out.println("testString1 주소값 :"+System.identityHashCode(testString1));
        System.out.println("testString2 주소값 :"+System.identityHashCode(testString2));
        System.out.print("주소,값 동일한가? : ");
        System.out.println(testString1==testString2);
        System.out.println("값 동일한가? :"+testString1.equals(testString2));

        System.out.println("==================================");

        // 새로운 객체가 heap메모리에 저장된다. -> 메모리에 객체 하나 생성
        testString2 = new String("a");

        System.out.println("testString1 : "+testString1);
        System.out.println("testString2 : "+testString2);
        System.out.println("testString1 주소값 :"+System.identityHashCode(testString1));
        System.out.println("testString2 주소값 :"+System.identityHashCode(testString2));
        System.out.print("주소,값 동일한가? : ");
        System.out.println(testString1==testString2);
        System.out.println("값 동일한가? :"+testString1.equals(testString2));

        System.out.println("==================================");

        System.out.println("intern함수 사용");
        System.out.print("주소,값 동일한가? : ");
        System.out.println(testString1==testString2.intern());

        System.out.println("==================================");

        String a = "a";
        String b = new String("a");

        // a+1 저장되지 않는 변수이다. heap에는 저장이 되나???
        System.out.println("a 주소값 : "+System.identityHashCode(a));
        System.out.println("a+1 주소값 : "+System.identityHashCode(a+1));
        System.out.println("a+1 주소값 : "+System.identityHashCode(a+1));
        System.out.println("a+2 주소값 : "+System.identityHashCode(a+2));

        System.out.println("b 주소값 : "+System.identityHashCode(b));
        System.out.println("b+1 주소값 : "+System.identityHashCode(b+1));
        System.out.println("b+1 주소값 : "+System.identityHashCode(b+1));
        System.out.println("b+2 주소값 : "+System.identityHashCode(b+2));




        // =========================================================
//        char c = 'a';
//
//        System.out.println("a 주소값 : " + System.identityHashCode(c));
//        c = (char) (c+1);
//        System.out.println("a 주소값 : " + System.identityHashCode(c));
//        c += 1;
//        System.out.println("a 주소값 : " + System.identityHashCode(c));
//        c = (char) (c+1);
//        System.out.println("a 주소값 : " + System.identityHashCode(c));
//        c += 1;
//        System.out.println("a 주소값 : " + System.identityHashCode(c));
//        c -= 1;
//        System.out.println("a 주소값 : " + System.identityHashCode(c));
//        c -= 1;
//        System.out.println("a 주소값 : " + System.identityHashCode(c));
//        c -= 1;
//        System.out.println("a 주소값 : " + System.identityHashCode(c));
//        c -= 1;
//        System.out.println("a 주소값 : " + System.identityHashCode(c));



//        String c = "a";
//        System.out.println("a 주소값 : " + System.identityHashCode(c));
//        c +=1;
//        System.out.println("a 주소값 : " + System.identityHashCode(c));
//        c +=1;
//        System.out.println("a 주소값 : " + System.identityHashCode(c));
//        c +=1;
//        System.out.println("a 주소값 : " + System.identityHashCode(c));
//
//        String d = "a";
//        System.out.println("d 주소값 : " + System.identityHashCode(d));
//        d+=1;
//        System.out.println("d 주소값 : " + System.identityHashCode(d));
//        d+=1;
//        System.out.println("d 주소값 : " + System.identityHashCode(d));
//        d+=1;
//        System.out.println("d 주소값 : " + System.identityHashCode(d));




//        StringBuilder cw = new StringBuilder();
//        cw.append("a");
//        System.out.println("cw 주소값: "+ System.identityHashCode(cw));
//        cw.append("1");
//        System.out.println("cw 주소값: "+ System.identityHashCode(cw));
//        cw.append("1");
//        System.out.println("cw 주소값: "+ System.identityHashCode(cw));
//        cw.append("1");
//        System.out.println("cw 주소값: "+ System.identityHashCode(cw));
//        cw.delete(cw.length()-1,cw.length());
//        System.out.println("cw 주소값: "+ System.identityHashCode(cw));
//        cw.delete(cw.length()-1,cw.length());
//        System.out.println("cw 주소값: "+ System.identityHashCode(cw));
//        cw.delete(cw.length()-1,cw.length());
//        System.out.println("cw 주소값: "+ System.identityHashCode(cw));
//        cw.delete(cw.length()-1,cw.length());
//        System.out.println("cw 주소값: "+ System.identityHashCode(cw));


    }

    // 잘못된 비교를 하고있었네
    public void speed(){

        String a;
        long before,after;

        a = "a";
        before = System.nanoTime();
        for(int i=0; i<10; i++){
            a = a+1;
        }
        after = System.nanoTime();
        System.out.println("ms기준 시간 :" + String.valueOf(after-before));


        String b = new String("a");
        before = System.nanoTime();
        for(int i=0; i<10; i++){
            b = b+1;
        }
        after = System.nanoTime();
        System.out.println("ms기준 시간 :" + String.valueOf(after-before));


        before = System.nanoTime();
        for(int i=10; i<20; i++){
            String w = "a"+i;
        }
        after = System.nanoTime();
        System.out.println("ms기준 시간 :" + String.valueOf(after-before));


        before = System.nanoTime();
        for(int i=10; i<20; i++){
            String e = new String("a"+i);
        }
        after = System.nanoTime();
        System.out.println("ms기준 시간 :" + String.valueOf(after-before));

    }


}
