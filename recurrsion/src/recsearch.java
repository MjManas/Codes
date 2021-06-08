public class recsearch
{
    public static void main(String[] args)
    {
     int ar[]={1,2,3,4,5};
        System.out.println(find(ar,5,0));
    }

    private static boolean find(int[] ar, int element, int index)
    {
        if(index==ar.length)
        {
            return false;

        }
        if(ar[index]==element)
        {
           return true;
        }
        return find(ar,element,index+1);
    }
}
