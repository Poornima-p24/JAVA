class student
{
    String name;
    int age;
    student(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
}

 public class constructor {
    public static void main (String args[])
    {
        student s1=new student("poornima",18);
        student s2=new student("poornima",18);
        System.out.println(s1.name);
    }
}
