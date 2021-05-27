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

        for(int i=1;i<data.length;i++){
            int a = data[i];
            int j = i-1;
            for (;j>=0;j--){
                if (a < data[j]){
                    data[j+1] = data[j];
                }else {
                    break;
                }
            }
            data[j+1] = a;
        }
        System.out.println(Arrays.toString(data));
    }

    public static void main(String[] args) {
        int[] data = new int[]{3,2,1,9,5621,56461,556,564153,5343813,531385};
        insertSort(data);
    }

}
