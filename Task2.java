 class Person{
    String name;
    Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", address=" + address + '}';
    }
}


//address

 class Address {
    String street;
    String city;
    String code;

    public Address(String street, String city, String code) {
        this.street = street;
        this.city = city;
        this.code = code;
    }

    @Override
    public String toString() {
        return "Address{" + "street='" + street + '\'' + ", city='" + city + '\'' + ", code='" + code + '\'' + '}';
    }
}


 class Book {
    String bookName;
    Person author;
    String publisher;

    public Book(String bookName, Person author, String publisher) {
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" + "bookName='" + bookName + '\'' + ", author=" + author + ", publisher='" + publisher + '\'' + '}';
    }
}




public class Task2 {
    public static void main(String[] args) {
        Address address = new Address("Main Street", "islamabad", "10001");
        Person author = new Person("John Doe", address);
        Book book = new Book("Java Programming", author, "ABC Publishers");

        System.out.println(book);

        author.address.city = "Sahiwal";
        author.address.code = "57000";

        System.out.println(book);
    }
}
