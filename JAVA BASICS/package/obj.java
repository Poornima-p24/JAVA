
import java.lang.*;
class Myobject
{
    public String toString()
    {
        return "My Object";
    }
    public int hashCode()
    {
        return 100;
    }
    public boolean equals(Object o)
    {
        return this.hashCode()==o.hashCode();
    }
}
public class obj {
    public static void main(String args[])
    {
        Myobject o1=new Myobject();
        Myobject o2=new Myobject();
        System.out.println(o1.equals(o2));
    }
}
