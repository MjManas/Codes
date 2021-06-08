import java.util.Scanner;

public class diclexo
{
    public static void main(String[] args)
    {
        String s;
        Scanner l=new Scanner(System.in);
        s=l.nextLine();
        int freq[]= frequency(s);
//        System.out.println("",freq,s.length());
        diclexopermute("",freq,s.length(),s);
    }
    public static void diclexopermute( String processed, int[] freq , int length,String s)
    {
        if(length==0)
        {
            if(s.compareTo(processed)<0)
            {
                System.out.println(processed);
            }
            return;
        }
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]>0)
            {
                freq[i]--;
                diclexopermute(processed+(char) (i+'a'),freq,length-1,s);
                freq[i]++;
            }
        }
    }
    public static int[] frequency(String s)
    {
        int ar[]=new int[26];
        for (int i = 0; i <s.length() ; i++)
        {
            char ch= s.charAt(i);
            ar[ch- 'a']++;
        }
        return ar;
    }
}
