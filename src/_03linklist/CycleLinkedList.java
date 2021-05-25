package _03linklist;

/**
 * @Author: Jamie Nie
 * @Date: 2021/5/25 9:48
 * @Slogan: The harder you work, the more luck you have.
 * @desc:  单向循环链表
 */
public class CycleLinkedList {
//    int data[]; //数据
    CLinkNode head;   //链表头部
    CLinkNode tail;   //链表尾部
    int n;            //数组长度

    CycleLinkedList(){
        head = null;
        tail = null;
        n = 0;
    }

    public void print(){
        CLinkNode cur = head;
        if (cur == null) return;
        if(cur != tail){
            while (cur != null){
                System.out.print(cur.value + "");
                cur = cur.next;
            }
            System.out.println();
        }else{
            System.out.println(cur.value);
        }
    }

    public void insertHead(int value){
        CLinkNode newNode = new CLinkNode(value);
        newNode.next = head;
        tail.next = newNode;
        head = newNode;
    }

    public void insertNth(int value,int position){
        if (position == 0){
            insertHead(value);
        }else{
            CLinkNode cur = head;
            for (int i=1;i<position;i++){
                cur = cur.next;
            }
            CLinkNode newNode = new CLinkNode(value);
            newNode.next = cur.next;
            cur.next = newNode;
            if (cur.next == tail){
                tail = newNode;
            }
        }
    }

    public void deleteHead(){
        head = head.next;
        tail.next = head;
    }

    public void deleteNth(int position){
        if (position == 0){
            deleteHead();
        }else {
            CLinkNode cur = head;
            for(int i=1;i<position;i++){
                cur = cur.next;
            }
            cur.next = cur.next.next;
            if (cur.next == tail){
                tail = cur;
            }
        }
    }

    public void update(int value,int position){
        CLinkNode cur = head;
        for(int i=1;i<position;i++){
            cur = cur.next;
        }
        cur.next.value = value;
    }

    public int find(int position){
        CLinkNode cur = head;
        for(int i=1;i<position;i++){
            cur = cur.next;
        }
        return cur.next.value;
    }


}

class CLinkNode{
    int value;
    CLinkNode next;

    CLinkNode(int value){
        this.value = value;
        this.next = null;
    }
}
