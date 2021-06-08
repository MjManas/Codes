import java.util.Stack;

public class deleteeffqueue
{
    Stack<Integer> first;
    Stack<Integer> second;
    public deleteeffqueue()
    {
        first= new Stack<>();
        second= new Stack<>();
    }
    public void insert(int item)
    {
        while(!first.isEmpty())
        {
            second.push(first.pop());

        }
        first.push(item);
        while(!second.isEmpty())
        {
            first.push(second.pop());

        }
    }
    public int remove()
    {

        return(first.pop());

    }
    public int peek()
    {
        return first.peek();
    }
    public boolean isEmpty()
    {
        return first.isEmpty();
    }

    public static void main(String[] args)
    {
      deleteeffqueue q=new deleteeffqueue();
      q.insert(1);
      q.insert(2);
        System.out.println(q.remove());
    }
}
