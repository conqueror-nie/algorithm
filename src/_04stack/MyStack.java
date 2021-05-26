package _04stack;

/**
 * @Author: Jamie Nie
 * @Date: 2021/5/25 11:08
 * @Slogan: The harder you work, the more luck you have.
 * @desc:
 */
public interface MyStack<T> {

    MyStack<T> push(T t); //入栈

    T pop();//出栈

    int size();//大小

    boolean isEmpty();

}
