package lecture_24;

public class LPallinSubSeq
{
    public static void main(String[] args)
    {
     String line = "nibba";
        System.out.println(longPallinSeq(line,0,line.length()-1));
    }
//    public static int longPallinSeqitr(String line, int start, int end)
//    {
//        for (int s = 0; s <line.length() ; s++)
//        {
//            for (int e = 0; e <line.length() ; e++)
//            {
//
//            }
//        }
//    }
    public static int longPallinSeq(String line, int start, int end)
    {
        if(start==end)
        {
            return 1;

        }
        if(start>end)
        {
            return 0;

        }
        int res=0;
        if(line.charAt(start) == line.charAt(end))
        {
         res = 2 + longPallinSeq(line, start+1, end-1);
        }
        else
        {
            int left = longPallinSeq(line, start+1, end);
            int right = longPallinSeq(line, start, end-1);
            res = Math.max(left,right);
        }
        return res;
    }
}
