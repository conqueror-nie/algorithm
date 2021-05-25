package _03linklist;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Jamie Nie
 * @Date: 2021/5/24 15:01
 * @Slogan: The harder you work, the more luck you have.
 * @desc:   单链表 -- 增删改查
 */
public class MyLinkedList {
    private LinkNode head;
//    private int size;

    public void print(){
        LinkNode cur = head;
        while(cur != null){
            System.out.print(cur.value + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public void insertHead(int value){  //O(1)
        LinkNode newNode = new LinkNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertNth(int value,int position){  //O(n)
        if(position == 0){ //表示插入头部了
            insertHead(value);
        }else{
            LinkNode cur = head;
            for(int i=1;i<position;i++){ //遍历找到position - 1 的位置 。  不用 i<position-1 ，是因为运算有性能损耗。
                cur = cur.next;
            }
            LinkNode newNode = new LinkNode(value);
            newNode.next = cur.next;    //把新的节点指向后面，保证不断链
            cur.next = newNode;         //将当前的点指向新的点
        }
    }

    public void deleteHead(){ //O(1)
        head = head.next;
    }

    public void deleteNth(int position){
        if(position == 0){
            deleteHead();
        }else {
            LinkNode cur = head;
            for(int i=1;i<position;i++){
                cur = cur.next;
            }
            cur.next = cur.next.next; //cur.next表示要删除的点，cur.next.next 表示要指向的点
        }
    }

    public int findValue(int position){
        if(position == 0){
            return head.value;
        }else{
            LinkNode cur = head;
            for (int i=1;i<position;i++){
                cur = cur.next;
            }
            return cur.next.value;
        }
    }

    public LinkNode findNode(int value){
        LinkNode cur = head;
        while (cur != null){
            if (cur.value == value){
                break;
            }
            cur = cur.next;
        }
        return cur;
    }

    public static void main(String[] args) {
        MyLinkedList myList = new MyLinkedList();
        myList.insertHead(5);
        myList.insertHead(7);
        myList.insertHead(10);
        myList.print(); // 10 -> 7 -> 5
        myList.deleteNth(0);
        myList.print(); // 7 -> 5
        myList.deleteHead();
        myList.print(); // 5
        myList.insertNth(11, 1);
        myList.print(); // 5 -> 11
        myList.deleteNth(1);
        myList.print(); // 5

        List list = new LinkedList();
    }

}

class LinkNode{
    int value;
    LinkNode next;

    LinkNode(int value){
        this.value = value;
        this.next = null;
    }
}