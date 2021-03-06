public class subsequence {
    public static void main(String[] args)
    {

        subsequence(" ", "abc");
    }

    private static void subsequence(String processed, String unprocessed)
    {
        while (unprocessed.isEmpty())
        {
            System.out.println(processed);
            return;
        }

            char ch= unprocessed.charAt(0);
            unprocessed = unprocessed.substring(1);
            subsequence(processed+ch, unprocessed);
            subsequence(processed, unprocessed);
    }
}