package _07sort;

import java.util.Arrays;

/**
 * @Author: Jamie Nie
 * @Date: 2021/5/27 9:17
 * @Slogan: The harder you work, the more luck you have.
 * @desc:   插入排序：找基准的有序序列，然后无须序列一个个取出来，与有序序列从尾到头比较，小于有序序列的值则移位。最后将取出来的值放到第一个比它小的值后面。
 */
public class InsertionSort {

    public static void insertSort(int[] data){

        for(int i=1;i<data.length;i++){
            int datum = data[i];
            int j = i -1;
            for (;j>=0;j--){
                if(data[j] > datum){
                    data[j+1] = data[j];
                }else {
                    break;
                }
            }
            data[j+1] = datum;
            System.out.println(Arrays.toString(data));
        }
    }

    public static void main(String[] args) {
        int[] data = new int[]{3,69,1,9,86,54,65,32,59,7};
        System.out.println("初始顺序：" + Arrays.toString(data));
        insertSort(data);
    }

}
