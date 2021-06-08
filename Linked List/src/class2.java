/*
public class class2
{
    private LinkedList.Node head;
    private LinkedList.Node tail;
    private int size;
    public LinkedList merge (LinkedList first, LinkedList second)
    {
        Node firstnode = first.head;
        Node secondnode = second.head;
        LinkedList linkedList = new LinkedList();
        while(firstnode != null && secondnode!=null)
        {
            if(firstnode.value<secondnode.value)
            {
                linkedList.insertatlast(firstnode.value);
                firstnode=firstnode.next;

            }
            else
            {
                linkedList.insertatlast(secondnode.value);
                secondnode=secondnode.next;
            }
        }
        while(firstnode!=null)
        {
            linkedList.insertatlast(firstnode.value);
            firstnode=firstnode.next;
        }
        while(secondnode!=null)
        {
            linkedList.insertatlast(secondnode.value);
            secondnode=secondnode.next;
        }
        return linkedList;
    }
}
*/
