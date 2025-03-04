import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//          변수 (선언 : int a / 초기화 :int a = 9;)
//          String a = "9";
//            int age = 20;
//
//            age = 30;
//            char gender = 'M';  // char ''로 정의
//            String name = "John"; // "" =string
//            boolean married = false;
//            float avgAge = 52.1f; // float double 차이를 못 구별 해서 f를 붙여서 float 인지 구별
//            double avgAge2 = 52.1; // double 은 d를 붙여도되지만 생략가능
//
//            byte max = 127;
//            byte min = - 128;
//
//            byte sum = (byte) (max + 1); // Overflow : 최대 표현 범위보다 큰 수를 저장할 때 발생하는 현상.
//                                        // Underflow : 최소 표현 범위보다 작은 수를 저장할 때 발생하는 현상
//            System.out.println(sum);  // console 에 찍는 함수 계행이 들어감.
//
//            double a = 0.1;
//            double b = 0.2;
//            System.out.println(a+b);  // 실수를 계산하게 되면 소수점 오차가 생길수바게 없다 . 컴퓨터의 한계 최대한 수치가 가깝게 표시
//
//            BigDecimal bd = new BigDecimal("0.1");
//            BigDecimal bd2 = new BigDecimal("0.2");
//            BigDecimal bsum =bd.add(bd2);
//          System.out.println(bsum);
//            String a = "Hello World";
//            String b = "Hello World";
//
//            System.out.println(a.equals(b)); // 스트링 비교는 ?.equals(?)

//        for (int i=1; i<=5; i++) {
//                  if (i ==3) {
//                      continue;
//                  }
//                  System.out.println(i);
//        }
        //1~100 까지 숫자 중 3과 7의 배수를 출력
//         for (int i=1; i<=100; i++)  {
//            if(i % 3 ==0 || i % 7 ==0) {
//               System.out.println(i);
//             }
//           }
             // 배열
//            int[] arrInt = new int[10]; // 방이 10개인 배열
            int[] arrInt = {1, 2, 3, 4, 5};
            String[] arrString = {"a","b","c"};
//            arrInt[0] ="45"; // 데이터타입이 달라서 오류표시 숫자배열이면 뒤에두 숫자 문자두 마찬가지

//            int[] arrInt2 = arrInt; // 참조형은 대입연산식으로 해서 나타내면 안된다.  결과값 : [100, 2, 3, 4, 5]

            int[] arrInt2 =Arrays.copyOf(arrInt, arrInt.length); // deep copy

            arrInt2[0] = 100;

            System.out.println(Arrays.toString(arrInt)); // [1, 2, 3, 4, 5]
            System.out.println(Arrays.toString(arrInt2)); // [100, 2, 3, 4, 5]
    }
}

