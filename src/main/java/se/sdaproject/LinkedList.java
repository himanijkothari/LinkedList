package se.sdaproject;
import java.util.NoSuchElementException;
// a "box" in our previous picture
class Node {
    // field 1: the data
    // in our case just an integer
    int elem;
    // field 2: the reference to the next node
    Node next;
    Node(int num) {
        this.elem = num;
        this.next = null;
    }
}


public class LinkedList {

    private Node first = null;
    //public int size = 0;
    

    public void add(int num) {
        // int num is available!

        // step 1: is the linked list still empty?
        if (first == null) {
            // in this case, the linked list is empty
            Node node = new Node(num); // node.next == null
            first = node;
        } else {
            // in this case, the linked list is *not* empty
            // this means, first != null

            // step 2: find the last node
            
            // Key: introduce a temporary variable!
            // we can then update this temporary variable,
            // without changing "first"!
            // important, since "first" should not be changed!
            Node current = first;
            while (current.next != null) { // current is not the last node!
                current = current.next;
            }
            // what do we know about "current"?
            // current.next == null
            // AWESOME!
            // it means, "current" is the last node!

            // step 3: create a new node with the given int "num"
            Node node = new Node(num);
            //size ++;
      

            // step 4: change the reference of the last node to
            // point to the new node
            current.next = node;
        }

    }


    public int search(int num)
    {
            Node current = first.next;
            int index = 0;
            boolean found = false;

            while (current!= null )
            {
                if(current.elem == num)
                {
                    found = true;
                }
                else
                {
                    current = current.next;
                    index++;
                }

            }
            if(found)
            {
                return index;
            }
            else
            {
                return -1;
            }
    }

    

    public Node get(int index) {
        Node current = first;
        if (index > size() - 1)    // can also add a check to index if it is mionus
        {
            throw new IndexOutOfBoundsException();
        }
        else
        {
            for (int i = 0; i < index; i++)
            {
                current = current.next;
            }

            return current;
        }
    }


    public void remove(int num) {
        Node current = first;
        Node previous = null;
        int index = search(num);
        if (index == -1)
        {
             throw new NoSuchElementException();
        }
        else
        {
            for (int i = 0; i <= index; i++)
            {
                previous = current;
                current = current.next;
            }
            previous.next = current.next;            // null pointer exception for the last node
            ///size--;

        }
    }

    public int size()
    {
        Node current = first;
        int sizeOfList = 0;
        while (current!= null)   // because it was not counting last node
        {
        current=current.next;
        sizeOfList++;
        }
          return  sizeOfList;

    }

    // useful for testing!
    public String toString() {
        // goal is to return a string like this:
        // "LinkedList(5,2,10)"

        StringBuilder builder = new StringBuilder();

        // call methods on "builder" to add strings

        builder.append("LinkedList(");
        // append strings for each integer in the list

        if (first == null) {
            // what to do here?
            // string to be returned: "LinkedList()"
            // nothing left to do!
        } else {
            // here, we know that first != null
            // go through the chain of nodes, starting with
            // "first"

            Node current = first;            
            // treat first element specially:
            builder.append("" + current.elem);

            while (current.next != null) {
                current = current.next;
                builder.append("," + current.elem);
            }
            // current.next == null
            // we have already appended the last num!
        }

        // append ")"
        builder.append(")");
        return builder.toString();
    }
}