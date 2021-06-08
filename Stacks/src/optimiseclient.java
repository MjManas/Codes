public class optimiseclient
{
    public static void main(String[] args)throws Exception
    {
        optimisequeue q= new optimisequeue(100);
        for (int i = 0; i <10 ; i++) {
            q.push(i);
            q.display();

        }
        q.display();
        System.out.println();
        q.display();
        for (int i = 0; i <10 ; i++)
        {
         q.pop();
         q.display();
        }
    }
}
