public class tryCatch {

    public static void main(String args[])
    {
        int num=10;
        int deno=0;
        try{
        int result=num/deno;
        System.out.println(result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("not divide"+e);
        }
    }
}