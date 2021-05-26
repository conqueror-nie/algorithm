package _04stack;

/**
 * @Author: Jamie Nie
 * @Date: 2021/5/25 11:11
 * @Slogan: The harder you work, the more luck you have.
 * @desc:
 */
public class ArrayStack<T> implements MyStack{

    private Object[] a = new Object[1];//设置栈大小
    private int n = 0;//初始的元素数量

    ArrayStack(int cap){
        a = new Object[cap];
    }

    @Override
    public MyStack push(Object o) {
        judgeSize();
        a[n++] = o;

        return null;
    }

    @Override
    public Object pop() {
        judgeSize();
        if(isEmpty()){
            return null;
        }
        Object o = a[--n];
        a[n] = null;
        return o;
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public boolean isEmpty() {
        return n == 0;
    }

    public void judgeSize(){
        if(n >= a.length){
            resize(a.length * 2); //扩容两倍
        }else if (n > 0 && n < a.length / 2){
            resize(a.length / 2);  //缩容至1/2
        }
    }

    public void resize(int size){ //扩容 O(n)
        Object[] o = new Object[size];
        for (int i=0;i<n;i++){
            o[i] = a[i];
        }
        a = o;
    }

    public void print(){
        for (int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(10);
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.pop();
        System.out.println(arrayStack.size());
        arrayStack.print();


    }
}
