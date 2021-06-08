import java.util.Stack;

public class twostackonequeue
{
    Stack<Integer> first;
    Stack<Integer> second;
    public twostackonequeue()
    {
        first= new Stack<>();
        second= new Stack<>();
    }
    public void insert(int item)
    {
        first.push(item);
    }

    public void remove()
    {
     while(!first.isEmpty())
     {
         second.push(first.pop());
     }
     int temp=second.pop();
        while(!second.isEmpty())
        {
            first.push(second.pop());
        }

    }
    public void peek()
    {
        while(!first.isEmpty())
        {
            second.push(first.pop());
        }
        int temp=second.peek();
        while(!second.isEmpty())
        {
            first.push(second.pop());
        }
    }
}
