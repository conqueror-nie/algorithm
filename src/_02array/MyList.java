package _02array;

/**
 * @Author: Jamie Nie
 * @Date: 2021/5/24 17:15
 * @Slogan: The harder you work, the more luck you have.
 * @desc:
 */
public interface MyList<E> {
    public void add(E e);

    public void remove(int i);

    public void remove(Object e);

    public E get(int i);

    public int size();

    public boolean isEmpty();
}
