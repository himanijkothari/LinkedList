package se.sdaproject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class  LinkedListTests {

    @Test
    void addsTwoNumbers() {
        assertEquals(2, 1 + 1, "1 + 1 should equal 2");
    }

    @Test
    void addANumberToList() {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(7);
        list.add(10);
        list.add(3);
        String expected = "LinkedList(5,7,10,3)";
        assertEquals(list.toString(), expected);
    }


    public final
    @Test
    void testToStringOfEmptyList() {
        LinkedList list = new LinkedList();
        String expected = "LinkedList()";
        assertEquals(list.toString(), expected);
    }

    @Test
    void searchANumberInList()
    {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(7);
        list.add(10);
        int index = list.search(7);
        assertEquals(1,index);
    }

    @Test
    void searchANumberNotInList()
    {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(7);
        list.add(10);
        int index = list.search(20);
        assertEquals(-1,index);
    }


    @Test
    void getANodeInListByIndex()
    {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(7);
        list.add(10);
        Node node = list.get(2);
        assertEquals(10,node.elem);
    }

/*
    @Test
    void getANodeNotInListByIndex()
    {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(7);
        list.add(10);
        Node node = list.get(5);
        thrown.expect(NullPointerException.class);
    }
*/


    @Test
    void getSizeOfList()
    {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(7);
        list.add(10);
        int size = list.size();
        assertEquals(3,size);
    }

    @Test
    void removeANumFromList()
    {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(7);
        list.add(10);
        list.remove(7);
        String expected = "LinkedList(5,10)";
        assertEquals(list.toString(), expected);
    }

    /*@Test
    void removeANumNotInList()
    {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(7);
        list.add(10);
        list.remove(2);


    }*/

}
