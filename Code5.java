class Animal1{

    void sound()
    {
        System.out.println("animal make sound");
    }
    static class Dog extends Animal1{
        void sound()
        {
            System.out.println("dog bark");
        }
    }
}
public class Code5 {
    public static void main(String[] args) {
      Animal1 a1 =new Dog();
       a1.sound();
    }

    private static class Amimal extends Animal.Dog {
    }
}