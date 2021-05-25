package _02array;

/**
 * @Author: Jamie Nie
 * @Date: 2021/5/24 14:01
 * @Slogan: The harder you work, the more luck you have.
 * @desc: 数组的增删改查
 */
public class ArrayTest {
    private int size;//数组长度
    private int data[];
    private int index;//当前已经存的数据大小

    public ArrayTest(int size){ //数组初始化
        this.size = size;
        data = new int[size];   //分配的内存空间
        index = 0;


    }

    public void print(){
        System.out.println("index = " + index);
        for(int i=0;i<index;i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public void insert(int loc,int n){  //O(n)
        if(index++ < size){
            for(int i=size-1;i>loc;i--){
                data[i] = data[i-1];
            }
            data[loc] = n;
        }else {
            //需要扩容
        }
    }

    public void delete(int loc){    //O(n)
        for(int i=loc;i<size;i++){
            if(i != size-1){    //加判断防止越界
                data[i] = data[i+1];
            }else {
                data[i] = 0;
            }
        }
        index--;
    }

    public void update(int loc,int n){ //O(1)
        data[loc] = n;
    }

    public int get(int loc){        //O(1)
        return data[loc];
    }

}
