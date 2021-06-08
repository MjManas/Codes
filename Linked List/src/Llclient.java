public class Llclient
{
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.insertatfirst(12);
        list.insertatfirst(13);
        list.insertatfirst(14);
        list.insertatlast(15);
        list.insertatlast(15);
        list.insertatlast(16);
        list.insertatlast(16);
        list.insertatlast(17);
        list.display();
        list.deleterep();
        list.display();
        list.reverse();
        list.search(15);
        list.display();
        list.insertatmiddle(3,19);
        list.display();;
        list.deleteatmid(3);
        list.deleteatfirst();
        list.deleteatfirst();
        list.deleteatfirst();
        list.display();
        list.deleteatlast();
        list.display();
        list.deleteatlast();
        list.deleteatlast();
        list.display();
    }
}
