package lecture_24;

public class Edit
{
    public static void main(String[] args)
    {
        String first = "karan";
        String second = "kabir";
        Integer mem[][] = new Integer[first.length()+1][second.length()+1];
        System.out.println(edit(first,second,first.length(),second.length(),mem));
    }

    public static int edit(String first, String second, int f_len , int s_len)
    {
        if(Math.min(f_len,s_len)==0)
        {
            return Math.max(f_len,s_len);
        }
        int res=0;
        if(first.charAt(f_len-1)==second.charAt(s_len-1))
        {
            res = edit(first, second, f_len-1, s_len-1);

        }
        else
        {
            int rm_f = edit(first,second,f_len-1,s_len);
            int rm_s = edit(first,second,f_len,s_len-1);
            int rm_b = edit(first,second,f_len-1,s_len-1);
            res=1+ Math.min(rm_b,Math.min(rm_s,rm_f));

        }
    return res;
    }
    public static int edit(String first, String second, int f_len , int s_len, Integer[][] mem)
    {
        if(Math.min(f_len,s_len)==0)
        {
            return Math.max(f_len,s_len);
        }
        if(mem[f_len][s_len]!=null)
        {
            return mem[f_len][s_len];
        }
        int res=0;
        if(first.charAt(f_len-1)==second.charAt(s_len-1))
        {
            res = edit(first, second, f_len-1, s_len-1,mem);

        }
        else
        {
            int rm_f = edit(first,second,f_len-1,s_len,mem);
            int rm_s = edit(first,second,f_len,s_len-1,mem);
            int rm_b = edit(first,second,f_len-1,s_len-1,mem);
            res=1+ Math.min(rm_b,Math.min(rm_s,rm_f));

        }
        return res;
    }
    public static int edititr(String first, String second, int f_len , int s_len, Integer[][] mem)
    {
        for (int f = 0; f <= f_len; f++)
        {
            for (int s = 0; s <= s_len; s++)
            {
                if (Math.min(f,s)==0)
                {
                    mem[f][s] = Math.max(f,s);
                }
                else
                    {
                    int res = 0;
                    if (first.charAt(f - 1) == second.charAt(s - 1))
                    {
                      mem[f][s] = mem[f-1][s-1];
                    }
                    else
                    {
                        int rm_f= mem[f-1][s];
                        int rm_s= mem[f][s-1];
                        int rm_b= mem[f-1][s-1];
                        mem[f][s]= 1 + Math.min(rm_b,Math.min(rm_f,rm_s));

                    }
                }
            }
        }
    return mem[f_len][s_len];
    }
}