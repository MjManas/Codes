import java.util.ArrayList;
import java.util.Scanner;
public class Generictree
{
   private Node root;
    public void populate(Scanner s)
   {
       System.out.println("Enter the value of root");
       int value= s.nextInt();
       this.root=new Node(value);
       populate(s,root);
   }

    private void populate(Scanner s, Node node)
    {
        while (true)
        {
            System.out.println("Do you want to add child of node" + node.value);
            boolean yes= s.nextBoolean();
            if(yes)
            {
                System.out.println("Enter value of child node");
                int value=s.nextInt();
                Node child=new Node(value);
                node.children.add(child);
                populate(s,child);
            }
            else
            {
                break;
            }
        }
    }
    public void display()
    {
        display(root,"");
    }
    private void display(Node node, String indent)
    {
        System.out.println(indent+node.value);
        for (int i = 0; i <node.children.size() ; i++)
        {
         display(node.children.get(i),indent + "\t");
        }
    }
    public void postdisplay()
    {
        postdisplay(root);
    }

    private void postdisplay(Node node)
    {
        for (int i = 0; i <node.children.size() ; i++)
        {
            postdisplay(node.children.get(i));
        }
        System.out.print(node.value);

    }
    public void leveldisplay()
    {
        leveldisplay(root,"");
    }
    private void leveldisplay(Node node, String indent)
    {
        for (int i = 0; i <node.children.size() ; i++)
        {
            display(node.children.get(i),indent + "\t");
            System.out.println(indent+node.value);
        }


    }

    public void count()
    {

        System.out.println(count(root));

    }

    private int count(Node node)
    {
        int cnt=1;
        for (int i = 0; i <node.children.size() ; i++)
        {
          cnt+=count(node.children.get(i));
        }
        return cnt;
    }

    private class Node
    {
        private int value;
        private ArrayList<Node> children;

        public Node(int value)
        {
            this.value = value;
            this.children= new ArrayList<>();
        }

    }
}
