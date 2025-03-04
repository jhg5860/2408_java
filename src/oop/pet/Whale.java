package oop.pet; // php namespace 랑 같음

public class Whale {
//    int age;  // 같은 패키지에 소속된 클래스에서 접근 가능
//    public static String name; // 클래스 변수
    private int age; // 인스턴스 변수
    private String name; // 인스턴스 변수

    // 생성자: 클래스를 인스턴스화 할때 1번만 실행되는 메소드  //java 에서는 클래스명과 동일
    public Whale() {
        this(10);
    }
    public Whale(int age) {
        this(age, "John");
    }
    public Whale(int age, String name) {
        this.age = age;
        this.name =name;
    }


//    리턴값이 없으면 void 로 설정 리턴값이 필요하면 리턴타입을 기입
// 인수(Argument) :메소드를 호출할 때 전달 되는 값
// 매개변수(Parameter): 메소드의 정의에서 전달 받은 인수(Argument)를 저장하는 변수

    // ------------------- 메소드 ----------------
    public void swimming() {
        String test = "test"; // 지역변수 : 메소드 안에서만 접근가능
        System.out.println("Swimming");
    }
    public int mySum(int a) {
        return a+1;
    }
    public int mySum(int a, int b) {
        return a+b;
    }
    public long mySum(long a, long b) {
        return a+b;
    };
}
