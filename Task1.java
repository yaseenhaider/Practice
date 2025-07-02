

}

public class Task1 {
    public static void main(String[] args) {

        Address address = new Address("Main St", "123", "Springfield", "12345");


        Person person = new Person("John Doe", address);


        person.display();


        address.setStreet("sahiwal");
        address.setHouseNumber("456");


        System.out.println("\nAfter updating the address:");
        person.display();
    }
}