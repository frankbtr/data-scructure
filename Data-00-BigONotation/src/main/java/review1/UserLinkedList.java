package src.main.java.review1;

public class UserLinkedList {
    UserNode head;
    UserNode tail;
    int size;

    public UserLinkedList() {
        this.size=0;
    }
    boolean isEmpty() {return head==null;}
    void insertLast(UserNode node){
        //Case1; List is empty
        if(isEmpty()) {head=tail=node;
        } else {// Case2: List is not empty
            tail.next=node;
            tail=node;
        }
        size++;
    }
    void deleteByName(String name){
        // check if list is empty
        if (isEmpty()) {System.out.println("List is empty");
            return;}
        UserNode prev=head;
        UserNode current=head;
        while(current!=null){
            if(current.name.equals(name)){
                // case1: Node is head
                if(current==head) {
                    if(head==tail) tail=null;
                    head=current.next;// if one element this will assign null
                    current.next=null;// eligible for GC
                } else if(current==tail){
                    //case2 node tobe deleted is tail
                    prev.next=null;
                    tail=prev;
                } else {
                    prev.next=current.next;
                    current.next=null;
                }
                size--;
            }
            // move next
            prev=current;
            current=current.next;
        }

    }
    void printList(){
        UserNode current=head;
        while(current!=null){
            System.out.print(current.name+" => ");
            current=current.next;
            if(current==null) System.out.print("null");
        }
    }
}
