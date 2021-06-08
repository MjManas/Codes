import java.util.Scanner;

public class power
{

        public static void main(String args[])
        {
            int a=0;
            int b=1;
            int n1=0;
            int n2=0;
            char ch=' ';
            Scanner s=new Scanner(System.in);
            calc(ch,n1,n2,a,b,s);
        }

        public static void calc(char ch,int n1,int n2,int a,int b,Scanner s)
        {

            ch=s.next().charAt(0);



                if(ch=='+')
                {
                    n1=s.nextInt();
                    n2=s.nextInt();
                    a=n1+n2;
                    System.out.println(a);
                    calc(ch,n1,n2,a,b,s);
                }
                else if(ch=='-')
                {
                    n1=s.nextInt();
                    n2=s.nextInt();
                   if(n1>n2)
                   {
                       a = n1 - n2;
                   }
                    else if(n2>n1)
                    {
                        a = n2 - n1;
                    }
                    System.out.println(a);
                    calc(ch,n1,n2,a,b,s);
                }
                else if(ch=='*')
                {
                    n1=s.nextInt();
                    n2=s.nextInt();
                    b=n1*n2;
                    System.out.println(b);
                    calc(ch,n1,n2,a,b,s);
                }
                else if(ch=='/')
                {
                    n1=s.nextInt();
                    n2=s.nextInt();
                    if(n1>n2)
                    {
                        b = n1 / n2;
                    }
                    else if(n2>n1)
                    {
                        b = n2 / n1;
                    }
                    System.out.println(b);
                    calc(ch,n1,n2,a,b,s);
                }
                else if(ch=='X'||ch=='x')
                {
                    return;
                }
                else
                {
                    System.out.println("Invalid operation. Try again");
                    calc(ch,n1,n2,a,b,s);
               }
            }



}
