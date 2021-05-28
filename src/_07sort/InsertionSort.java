package _07sort;

import java.util.Arrays;

/**
 * @Author: Jamie Nie
 * @Date: 2021/5/27 9:17
 * @Slogan: The harder you work, the more luck you have.
 * @desc:   插入排序
 */
public class InsertionSort {

    public static void insertSort(int[] data){

        for (int i=1;i<data.length;i++){
            int a = data[i];
            int j = i-1;
            for (;j>=0;j--){
                if(a < data[j]){
                    data[j+1] = data[j];
                }else {
                    break;
                }
            }
            data[j+1] = a;
            System.out.println("前 " + (i+1) + " 项已排好：" + Arrays.toString(data));
        }

    }

    public static void main(String[] args) {
        int[] data = new int[]{3,69,1,9,86,54,65,32,59,7};
        System.out.println("初始顺序：" + Arrays.toString(data));
        insertSort(data);
    }

}
