package oop; // php namespace 랑 같음

import oop.pet.Whale;

// java 에서는 class 두 접근제어지시자가 붙여져야한다.
public class Pet {
    public static void main(String[] args) {
        Whale whale = new Whale(); // 인스턴스화
        Whale whale2= new Whale(20);
        Whale whale3= new Whale(30, "meerkat");

//        whale.swimming(); // whale 객체에 접근할려면 .으로 접근

        int sum = whale.mySum(1, 2);
        System.out.println(sum); // 대표적인 오버로딩 System.out.println()

        long long1 = 1;
        long long2 =2;
        long sum2 = whale.mySum(long1, long2);
    }
}

