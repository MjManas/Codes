import java.util.ArrayList;

public class Q1
{
    public static void main(String[] args)
   {
       int a=4;
       Integer i= new Integer(a);
       ArrayList ar=new ArrayList();
       ar.add(1);
       ar.add(2);
       ar.add("hello");
       ar.add(3);
       ar.add(4);
       ar.add(5);
       ar.remove(2);
       ar.set(0,99);
       for(int j=0;j<ar.size();j++)
       {
           System.out.println(ar.get(j));
       }
       System.out.println(ar.indexOf(99));


   }

}
