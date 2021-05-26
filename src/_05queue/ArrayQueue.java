package _05queue;

/**
 * @Author: Jamie Nie
 * @Date: 2021/5/26 9:38
 * @Slogan: The harder you work, the more luck you have.
 * @desc:
 */
public class ArrayQueue {
    int[] data; //数据
    int head;   //队列头
    int tail;   //队列尾
    int n;      //队列最大长度

    ArrayQueue(int cap){
        data = new int[cap];
        n = cap;
    }

    public void push(int a){
        //判断队列是否满了
        if (tail == n) return;
        data[tail] = a;
        tail++;
    }

    public int pop(){
        if (isEmpty()) return -1; //表示空
        int m = data[head];
        head++;
        return m;
    }

    public boolean isEmpty(){
        if (head == tail) return true;
        return false;
    }

}
