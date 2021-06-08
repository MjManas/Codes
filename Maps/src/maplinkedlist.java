import java.util.LinkedList;

public class maplinkedlist<K,V>
{
    private LinkedList<Node> list= new LinkedList<>();
    public void put(K key, V value)
    {
        for (Node node : list)              //<- This works like->                //for(int i =0; i<list.size();i++)
        {                                  //<- less time complexity and compatible      //{
          if(node.key.equals(key))                                              //Node node =list.get(i)
            {                                                                        //}
                node.value=value;
                return;
            }
        }
        list.add(new Node(key,value));
    }
    public int size()
    {
        int size=0;
        for (Node n:list) {
            size++;
        }
        return size;
    }
    public V get(K key)
    {
        for (Node node : list)
        {
            if(node.key.equals(key))
            {
                return node.value;
            }
        }
        return null;
    }
    public V remove (K key)
    {
        for(Node node : list)
        {
            if(node.key.equals(key))
            {
                list.remove(node);
                return node.value;
            }
        }
        return null;
    }
    public boolean isEmpty()
    {
        return list.isEmpty();
    }
    public Boolean containskey(K key)
    {
        for (Node node : list)
        {
            if(node.key.equals(key))
            {
                return true;
            }
        }
        return false;
    }
    private class Node
    {
        K key;
        V value;
        public Node(K key,V value)
        {
            this.key=key;
            this.value=value;
        }
    }
}
