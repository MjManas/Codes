package lecture18.lecturenew;

public class BSTclient
{
    public static void main(String[] args)
    {
        BST<Integer> tree= new BST<>();
//         Integer[] nums=new Integer[1000000];
//        for(int i=0;i<10000;i++)
//        {
            // nums[i]=i*4;
//             nums[i]=i;
//                        tree.add(i);
//        }
//        tree.generatefromsorted(nums);
//        System.out.println(tree.successor(83));
//        System.out.println(tree.height());

      tree.add(4);
        tree.add(9);
        tree.add(7);
         tree.add(6);
        tree.add(5);
        tree.add(3);
        tree.add(2);
        //        tree.rightrotate();
        tree.display();
    }
}
