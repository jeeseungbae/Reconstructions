## String

### String 메모리 저장방식
모두 heap메모리에 저장된다.

String = "a"
- heap 영역에 존재하는 리터럴을 이용하는 경우
String constant pool이라는 영역에 존재
  하게된다.

String = new string("a");
- heap 메모리 안에 새로운 객체로 저장된다.

Stringpool을 이용하려면 intern()함수를 사용한다.
intern이란 Stringpool 영역에 리터럴값을 저장하거나 참조하는 것이다.
객체가 생성되면 String객체를 확인하고 Stringpool에 기존값이
존재한다면 참조값을 반환하고 없다면 Stringpool에
새로운 객체를 생성하여 참조값을 리턴한다.

### String 스피드 비교
- Stringpool에서 생성된 정보가 있는지 찾고 없으면 생성하기 때문에 상황에 따라 다르지만
새로운 객체의 생성이 주 목적이면 new String을 쓰는것이 더 빠르다. => 정보를 찾아야 하기 때문에
- 자주 정보를 사용하고 쓰는 코딩을 해야할 경우에는 String pool을 이용하기

[블로그 주소](https://jsb-diary0011.tistory.com/62)



### 더알아봐야할 것
- String 변수선언 없이 주소값 반환 (어디에 저장된건가??? / JVM에서 삭제??? )


