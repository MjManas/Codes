
public class LinkedList
{
    private Node head;
    private Node tail;
    private int size;
    public LinkedList()
    {
        size=0;
    }
    public void insertatfirst(int element)
    {
        Node node=new Node(element);
        node.next=head;
        head=node;
        if(tail==null)
        {
            tail=head;
        }
        size++;
    }
    public void insertatmiddle(int index, int element)
    {
        Node node=new Node(element);
        if(index==0)
        {
            insertatfirst(element);
            return;
        }
        else if(index==size)
        {
            insertatlast(element);
            return;
        }
        Node prev=get(index-1);
        node.next=prev.next;
        prev.next=node;
        size++;
    }

    public void insertatlast(int element)
    {
        if(size==0)
        {
            insertatfirst(element);
            return;
        }
        Node node=new Node(element);
        tail.next=node;
        tail=node;
        size++;
    }
    public void reverse()
    {
        reverse(head);
    }
    private void reverse(Node node)
    {
        if(node==tail)
        {
            head=tail;
            return;
        }
        reverse(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;
    }
    public int deleteatfirst()
    {

        int temp=head.value;
        head=head.next;
        if(head==null)
        {
            tail=null;
        }
        size--;
        return(temp);
    }
    public int deleteatmid(int index)
    {
        if(index==0)
        {
            return deleteatfirst();
        }
        else if(index==size-1)
        {
            deleteatlast();
        }
        Node prev=get(index-1);
        int temp=prev.next.value;
        prev.next=prev.next.next;
        size--;
        return(temp);
    }

    public int deleteatlast()
    {
        if(size<2)
        {
            return deleteatfirst();
        }
        Node temp=get(size-2);
//        Node node=head;
//        while(node.next!=tail)
//        {
//            node=node.next;
//        }
//        int temp=tail.value;
//        tail=node;
        int temp1=tail.value;
        tail=temp;
        tail.next=null;
        size--;
//        return temp;
        return temp1;
    }
    public Node search(int element)
    {
        Node node=head;
        while(node!=null)
        {
            if(node.value==element)
            {
                return node;


            }
            node=node.next;
        }
        return null;
    }
    public void deleterep()
    {
        Node node=head;
        while (node.next!=null)
        {
            if(node.value==node.next.value)
            {
                node.next=node.next.next;
                size--;
            }
            else
            {
                node=node.next;
            }
        }
    }
    public Node get(int index)
    {
        Node node=head;
        for (int i = 0; i <index ; i++)
        {
            node=node.next;
        }
        return node;
    }
    public void display()
    {
        Node node=head;
        while (node!=null)
        {
            System.out.print(node.value + " ->");
            node=node.next;
        }
        System.out.println("End");
    }
    private class Node
    {
        private int value;
        private Node next;

        public Node(int value)
        {
            this.value = value;
        }
        public Node(int value, Node next)
        {
            this.value = value;
            this.next = next;
        }
    }
    public LinkedList merge(LinkedList first, LinkedList second)
    {
        Node firstnode= first.head;
        Node secondnode = second.head;
        LinkedList linkedList = new LinkedList();
        while (firstnode!=null && secondnode!=null)
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
        while(firstnode!= null )
        {
            linkedList.insertatlast(firstnode.value);
            firstnode=firstnode.next;
        }
        while(secondnode!= null )
        {
            linkedList.insertatlast(secondnode.value);
            secondnode=secondnode.next;
        }
        return linkedList;
    }
}
