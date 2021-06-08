package lecture18;

public class BSTclient
{
    public static void main(String[] args) {
        SpecialBST tree = new SpecialBST<>();
        tree.add("mohit");
        tree.add("ram");
        tree.add("om");
        tree.add("punit");
        tree.succ("om");
        tree.display();
    }
}
