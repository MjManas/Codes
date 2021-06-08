public class circularqueue
{
    protected int data[];
    private int DEFAULT_SIZE=10;
    protected int front=0;
    protected int end=0;
    protected int size=0;
    public circularqueue()
    {
        data=new int[DEFAULT_SIZE];
    }
    public circularqueue(int size)
    {
        data=new int[size];
    }
    public boolean isFull()
    {
        return size==data.length;
    }
    public boolean isEmpty()
    {
        return size == 0;
    }
    public boolean push(int item)
    {
        if(isFull())
        {
            end=0;
            return false;
        }
        data[end++]=item;
        end=end%data.length;
        size++;
        return true;
    }
    public int pop() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("The Array Is Empty");
        }
        int temp=data[front++];
        front=front%data.length;
        size--;
        return temp;
    }
    public int Front()
    {
        return data[end];
    }
    public void display()
    {
        for (int i = 0; i <size ; i++)
        {
            System.out.println(data[(front + i)% data.length]+ " ");
        }
        System.out.println();
    }
}
