import java.util.Scanner;

public class LinearSearch
        {
            public static void main(String[] args)
            {

        int ar[]=new int[5];
        Scanner s= new Scanner(System.in);
        System.out.println("ENter element to be searched");
        int m=s.nextInt();
                System.out.println("use method");
                int d=s.nextInt();
                int n=s.nextInt();
        System.out.println("Enter the array");
        for (int i = 0; i <n ; i++)
        {
         ar[i]=s.nextInt();
        }
        if(d==1)
        {
            linearsearch(ar,m);
        }
        else if(d==2)
        {
            binarysearch(ar,m,n);
        }
    }

            private static void binarysearch(int[] ar, int m,int n)
            {
                int k=((n)/2);
                if(k==m)
                {
                    System.out.println("middle element");
                }
                else if(m>k)
                {
                    for (int i = 0; i < k ; i++)
                    {
                     if(ar[i]==m);
                        System.out.println(i);

                    }
                }
                else if(m<k)
                {
                    for (int i = k+1; i < n ; i++)
                    {
                        if(ar[i]==m)
                        System.out.println(i);

                    }
                }

            }

            private static void linearsearch(int[] ar, int m)
    {
        int r=0;

        for (int i = 0; i <ar.length ; i++)
        {
         if(ar[i]==m)
         {
             r++;
         }
        }
       if(r>0)
       {
           System.out.println("Element is present!");
       }
       else
       {
           System.out.println("Not Present!");
       }
    }
}
