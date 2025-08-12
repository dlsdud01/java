package chap07;

class Pet {
    String kind;
    String color;
    String feature;

    Pet(String kind, String color, String feature) {
        this.kind = kind;
        this.color = color;
        this.feature = feature;
    }

    void sound() {
        System.out.println("동물이 소리를 냅니다.");
    }

    String getKind() {
        return kind;
    }

    String getColor() {
        return color;
    }

    String getFeature() {
        return feature;
    }

    void info() {
        System.out.println("종류 : " + kind);
        System.out.println("색상 : " + color);
        System.out.println("특징 : " + feature);
    }

    @Override
    public String toString() {
        return "종류 : " + kind + ", 색상 : " + color + ", 특징 : " + feature;
    }
}

class Cat extends Pet {
    Cat() {
        this("고양이", "삼색", "개냥이");
    }

    Cat(String kind, String color, String feature) {
        super(kind, color, feature);
    }

    @Override
    void sound() {
        System.out.println("야옹~");
    }
}

class Dog extends Pet {
    Dog() {
        this("비글", "흰색", "지랄견");
    }

    Dog(String kind, String color, String feature) {
        super(kind, color, feature);
    }

    @Override
    void sound() {
        System.out.println("멍멍~");
    }
}

class Frog extends Pet {
    Frog() {
        this("청개구리", "초록색", "점프");
    }

    Frog(String kind, String color, String feature) {
        super(kind, color, feature);
    }

    @Override
    void sound() {
        System.out.println("개굴~");
    }
}

public class Q2 {
    public static void main(String[] args) {
        Pet pet1 = new Cat();
        Pet pet2 = new Dog();
        Pet pet3 = new Frog();

        pet1.sound();
        pet2.sound();
        pet3.sound();

        System.out.println(pet1);
        System.out.println(pet2);
        System.out.println(pet3);
    }
}
