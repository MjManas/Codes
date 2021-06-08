import java.util.Scanner;
public class client
{
    public static void main(String[] args)
    {
        Scanner s =new Scanner(" 1 true 2 true 3 false true 4 false false true 5 false false");
        Generictree tree= new Generictree();

        tree.populate(s);
        tree.display();
        tree.count();
        tree.postdisplay();
        tree.leveldisplay();
    }
}
