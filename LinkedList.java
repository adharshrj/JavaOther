class Node
{
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}

public class LinkedList {
    Node head;
    public void push(int new_data)
    {

        Node new_node = new Node(new_data);

        new_node.next = head;

        head = new_node;
    }

    public int getCount()
    {
        Node temp = head;
        int count = 0;
        while (temp != null)
        {
            System.out.println("Node value: " + temp.data);
            count++;
            System.out.println(count);
            temp = temp.next;

        }
        return count;
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();


        list.push(7);
        list.push(3);
        list.push(5);
        list.push(2);
        list.push(9);


        System.out.println("Count of list nodes is " +
                list.getCount());

    }
}