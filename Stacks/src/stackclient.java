public class stackclient
{
    public static void main(String[] args)
    {
        stack1 stack = new stack1();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        try
        {
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
        }

        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }


    }
}
