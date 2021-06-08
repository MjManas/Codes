import java.util.Stack;
import java.util.Scanner;
public class stackques
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        Stack<Integer> stack= new Stack<>();
        int N=s.nextInt();
        for (int i = 0; i <N ; i++)
        {
            stack.push(s.nextInt());
        }
    }
    public static void reversestack(Stack<Integer> stack)
    {
        if(stack.isEmpty())
        {
            return;
        }
        int temp= stack.pop();
        System.out.println(temp);
        reversestack(stack);

    }
}
