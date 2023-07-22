package src.main.java.review1;

public class Test {
    public static void main(String[] args) {
        UserLinkedList list = new UserLinkedList();
        list.insertLast(new UserNode("Abdul", "XWQ"));
        list.insertLast(new UserNode("Jack", "Reacher"));
        list.insertLast(new UserNode("Carol1", "White"));
        list.insertLast(new UserNode("Jack2", "Reacher"));
        list.insertLast(new UserNode("Carol", "White"));
        list.deleteByName("Abdul"); //head
        list.deleteByName("Carol"); //tail
        list.deleteByName("Carol1");// middle
        list.printList();


    }
}
