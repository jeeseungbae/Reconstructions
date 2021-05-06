## ArrayList

---

단방향 포인터 구조로 순차적인 접근에 빠르다.

멤버 객체의 순차적인 삽입,삭제 시 가장 속도가 빠르다.

배열을 사용하여 멤버객체들을 처리하여 리스트 중간 삽입,삭제시에는 유용하지 않다.

중간에 삽입하려면 맨뒤에 메모리 공간을 추가하고 하나씩 옮겨야 하므로 약 N/2시간이 필요하다.

타입 매개변수를 가지는 제네릭 클래스로 제공된다.

비동기식이므로 여러 개의 스레드가 동시에 ArrayList로 동작할 수 있다.

<br><br><br>

#### ArrayList.add 비교 
기준 : 0 ~ 100000 (for문)
- int 삽입 = 1ms
- int[] 삽입 = 2ms
- String 삽입 = 1ms
- String[] 삽입 = 1ms

### ArrayList.get 비교
기준 : 0 ~ 10000 (for 문)
- int 삽입 = 0~1ms
- int[] 삽입 = 0~1ms
- String 삽입 = 0~1ms
- String[] 삽입 = 0~1ms

index의 영향을 크게 받지 않음

### ArrayList.Remove 비교
기준 : 0 ~ 10000 (for 문)
- int 삽입 = 4ms
- int[] 삽입 = 4ms
- String 삽입 = 4ms
- String[] 삽입 = 4ms

### ArrayList.insert 비교
기준 : 0 ~ 10000 (for 문, add(i/2,type))
- int 삽입 = 2~4ms
- int[] 삽입 = 2~4ms
- String 삽입 = 2~4ms
- String[] 삽입 = 2~4ms
