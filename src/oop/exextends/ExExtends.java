package oop.exextends;

public class ExExtends {
    public static void main(String[] args) {

    }
}

class Mammal {
    protected String name;
    protected String residence;
    protected final int age;

    public Mammal() {
        this.age = 0;
    }

   public void breath(){
        System.out.println(this.name + "가 폐호흡합니다,");
    }
}
class Whale extends Mammal {
    public Whale(String name, String residence) {
        this.name = name;
        this.residence = residence;
    }
    @Override
    public void breath() {
        System.out.println("나는 나나나");
    }
}
