package _03linklist;

/**
 * @Author: Jamie Nie
 * @Date: 2021/5/24 16:06
 * @Slogan: The harder you work, the more luck you have.
 * @desc: 双向链表
 */
public class DoubleLinkedList {
    private DLinkNode head;
    private DLinkNode tail;

//    DoubleLinkList(){
//        this.head = null;
//        this.tail = null;
//    }

    public void print(){
        DLinkNode cur = head;
        while(cur != null){
            System.out.print(cur.value + " ");
            cur = cur.next;
        }
        System.out.println();

    }

    public void insertHead(int value){
        DLinkNode newDLinkNode = new DLinkNode(value);
        if(head == null){
            tail = newDLinkNode;
        }else{
            head.pre = newDLinkNode;
            newDLinkNode.next = head;
        }
        head = newDLinkNode;
    }

    public void insertNth(int value,int position){
        if (position == 0){
            insertHead(value);
        }else{
            DLinkNode cur = head;
            for(int i=1;i<position;i++){
                cur = cur.next;
            }
            DLinkNode newNode = new DLinkNode(value);

            if(cur == tail){
                newNode.next = cur.next;
                cur.next = newNode;
                newNode.pre = cur;
            }else{
                newNode.next = cur.next;
                cur.next.pre = newNode;
                cur.next = newNode;
                newNode.pre = cur;
            }
        }
    }

    public void deleteHead(){
        if(head == null){
            return;
        }else if(head.next == null){
            tail = null;
        }else{
            head.next.pre = null;
        }
        head = head.next;
    }

    public void deleteNth(int value){
        DLinkNode cur = head;
        while (cur.value != value){
            if(cur.next == null){
                return;
            }
            cur = cur.next;
        }

        if(cur == head){
            deleteHead();
        }else {
            cur.pre.next = cur.next;
            if(cur == tail){
                tail = cur.pre;
                cur.pre = null;
            }else {
                cur.next.pre = cur.pre;
            }
        }
    }

    public static void main(String[] args) {
        DoubleLinkedList myList = new DoubleLinkedList();
        myList.insertHead(5);
        myList.insertHead(7);
        myList.insertHead(10);
        myList.print(); // 10 -> 7 -> 5
        myList.deleteNth(10);
        myList.print(); // 7 -> 5
        myList.deleteHead();
        myList.print(); // 5
        myList.insertNth(11, 1);
        myList.print(); // 5 -> 11
        myList.deleteNth(5);
        myList.print(); // 11
    }

}

class DLinkNode{
    int value;
    DLinkNode next;
    DLinkNode pre;

    DLinkNode(int value){
        this.value = value;
        this.next = null;
        this.pre = null;
    }
}
