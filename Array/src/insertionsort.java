import java.util.Arrays;
import java.util.Scanner;

public class insertionsort
{
     public static void main(String[] args)
        {
            int ar[]= new int[5];
            Scanner s= new Scanner(System.in);
            int n= s.nextInt();
            for (int i = 0; i <n ; i++)
            {
                ar[i]=s.nextInt();
            }
            for (int i = 0; i <n-1 ; i++)
            {
                for(int j=i+1;j>0;j--)
                {
                    if(ar[j]<ar[j-1])
                    {
                        int k=ar[j];
                        ar[j]=ar[j-1];
                        ar[j-1]=k;
                    }
                }
            }
            for (int i = 0; i <n ; i++)
            {
                System.out.println(ar[i]);
            }
        }
}

