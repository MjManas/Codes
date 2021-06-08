public class optimisequeue
{
    private int data[];
    private int DEFAULT_SIZE=10;
    private int front=0;
    private int end=0;
    public optimisequeue()
    {
       data=new int[DEFAULT_SIZE];
    }
    public optimisequeue(int size)
    {
        data=new int[size];
    }
    public boolean isFull()
    {
        return end==data.length;
    }
    public boolean isEmpty()
    {
        return front == end;
    }
    public boolean push(int item)
    {
        if(isFull())
        {
            return false;
        }
        data[end++]=item;
        return true;
    }
    public int pop() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("The Array Is Empty");
        }
        return data[front++];

    }
    public int Front()
    {
        return data[end];
    }
    public void display()
    {
        for (int i = front; i <end ; i++)
        {
            System.out.print(data[i] + ",");
        }
        System.out.println();
    }
}
