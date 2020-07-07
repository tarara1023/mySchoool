package myextras.dataStructure_Algoritms;

public class LinkedList {
    private class Node{
    private int value;
    private Node next;

    public Node(int value) {
        this.value = value;
    }
    }

    private Node first;
    private Node last;

    //addFirst
    //addLast
    //deleteFirst
    //deleteLast
    //contains
    //indexOf

    public void addLast(int item) {
        Node node = new Node(item);
        if(first == null)
            first = last = node;
        else{
            last.next =node;
            last = node;
        }

    }
    public void addFirst(int item) {
        Node node = new Node(item);
        if(first == null)
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
    }
    private boolean isEmpty() {
        return first == null;
    }


}
