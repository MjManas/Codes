public class circularclient
{
    public static void main(String[] args)throws Exception
    {
        circularqueue q= new circularqueue(100);
        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);
        q.display();
        try
        {
            System.out.println(q.pop());
            System.out.println(q.pop());
            System.out.println(q.pop());
            System.out.println(q.pop());
            System.out.println(q.pop());
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
