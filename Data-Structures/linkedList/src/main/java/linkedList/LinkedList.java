package linkedList;

public class LinkedList<T> {

    Node<T> head = null;

    public void insert(T value){
        // insert into start
        Node<T> newNode = new Node<>(value, this.head);
        this.head = newNode;
    }

    public boolean includes(T target){
        // return true if value is included in the linked list
        Node current = head;
        while ( current != null ) {
            if ( current.val.equals(target) ) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public String toString(){
        // return a string of all things in the list
        String allItems = "List: ";
        Node current = head;

        while ( current != null ) {
            if ( current.next != null ) {
                allItems += (current.val + ", ");
                current = current.next;
            } else {
                allItems += current.val;
                current = current.next;
            }
        }

        return allItems;
    }

}
