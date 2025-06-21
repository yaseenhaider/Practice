//practice constructor and overload constructor
class Book{
  String name;
  String author;
   int price;

   Book(){
       this.name="unknown";
       this.author="unknown";
       this.price=0;

  }
   Book(String name,String author) {
       this.name = name;
       this.author = author;
       this.price = 0;
   }
   Book(String name,String author,int price){
      this.name=name;
      this.author=author;
      this.price=price;

  }
  void displayDetail(){
           System.out.println("book name:"+name);
           System.out.println("author :"+author);
           System.out.println("price:"+price);
       }
}
public class Code1{
    public static void main(String[] args) {
        Book b1=new Book();
        Book b2=new Book("ghalib","jani");
        Book b3=new Book("ghalib","jani",7890);

        b1.displayDetail();
        System.out.println();

        b2.displayDetail();
        System.out.println();

        b3.displayDetail();
        System.out.println();

    }
}