public class Dynamicqueue extends circularqueue
{
    @Override
    public boolean push(int item) {if(isFull())
    {
        int temp[]=new int[data.length*2];
        for (int i = 0; i <data.length ; i++)
        {
            temp[i]=data[(front + i) % data.length];
        }
        front=0;
        end= data.length;
        data=temp;
    }

        return super.push(item);
    }
}
