package LinkedList;

public class ListMain {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(1);
        for (int i = 2; i <= 100; i++) {
            linkedList.appendNode(i);
        }
        linkedList.displayList();
        linkedList.prependNode(2000);
        linkedList.displayList();
    }
}
