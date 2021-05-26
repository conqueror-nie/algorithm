package _05queue;

/**
 * @Author: Jamie Nie
 * @Date: 2021/5/26 10:35
 * @Slogan: The harder you work, the more luck you have.
 * @desc:
 */
public class CircleQueue {

    int[] data; //数据
    int head;   //队列头
    int tail;   //队列尾
    int n;      //队列最大长度

    CircleQueue(int cap){
        data = new int[cap];
        n = cap;
    }

    public void push(int a){
        //判断队列是否满了
        if ((tail+1) % n == head) return;
        data[tail] = a;
        tail = (tail+1) % n ;
    }

    public int pop(){
        if (isEmpty()) return -1; //表示空
        int m = data[head];
        head = (head+1) % n;
        return m;
    }

    public boolean isEmpty(){
        if (head == tail) return true;
        return false;
    }


}
