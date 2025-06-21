class Student {
    private String name;
    private int age;

    //constructor
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    //getter
    public String getName(){
        return name;
    }
    //setter
    public void setName(String name){
        this.name=name;
    }
    //getter
    public int getAge(){
        return age;
    }

    //setter
    public void setAge(int age){
        if(age>0)
        {
            this.age=age;
        }
        else {
            System.out.println("age must be positive");
        }
    }

}
public class Code3{
    public static void main(String[] args) {
        Student s1=new Student("ali",24);

        System.out.println("name:"+s1.getName());
        System.out.println("age:"+s1.getAge());

        //update
        s1.setName("haider");
        s1.setAge(24);

        System.out.println("updated name:"+s1.getName());
        System.out.println("updated age:"+s1.getAge());
    }
}