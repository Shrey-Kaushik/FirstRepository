import java.util.*;

class Sample
{
    int sum=0;
    public int get(int a,int b)
    {
        sum = a+b;
        return sum;
    }
    public void print()
    {
        System.out.println("Sum : "+sum);
    }
}

public class FirstClass
{
    public static void main(String[] args)
    {
           Sample s=new Sample();
           s.get(4,5);
           s.print();
    }
}
