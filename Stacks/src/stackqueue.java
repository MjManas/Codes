public class stackqueue
{
    public int data[];
        private int DEFAULT_SIZE=10;
        private int front=0;
    private int end=0;
    public stackqueue()
        {
            data=new int[DEFAULT_SIZE];
        }
    public boolean isFull()
    {
        return end==data.length-1;
    }
    public boolean isEmpty()
    {
        return end==0;
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
        int temp=data[0];
        for (int i = 1; i <end ; i++)
        {
         data[i-1]=data[i];
        }
        end--;
        return temp;
    }
    public int Front()
    {
        return data[end];
    }
 public void display()
 {
     for (int i = 0; i <end ; i++)
     {
         System.out.println(data[i]);
     }
 }
}
