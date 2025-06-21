// Class representing the Grandparent
class Grandparent {
    void message() {
        System.out.println("I am your dada");
    }
}

// Class representing the Father, extending Grandparent
class Father extends Grandparent {
    void message() {
        System.out.println("I am your abu");
    }
}

// Class representing the Child, extending Father
class Child extends Father {
    void message() {
        System.out.println("Main abhi bacha ho");
    }
}

// Main class to test the hierarchy
public class Code6 {
    public static void main(String[] args) {
       Child c1 = new Child();
        c1.message(); // Output: Main abhi bacha ho
    }
}