package _07sort;

import java.util.Arrays;

/**
 * 选择排序：每次找最小值的下标，然后与基准值交换。基准值从下标为0开始
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] data = new int[]{95,8,46,985,41,65,1223,5641,55,4,6};
        System.out.println("初始的数组是：" + Arrays.toString(data));
        slcSort(data);
    }

    private static void slcSort(int[] data){
        for (int i=0;i<data.length;i++){
            int minIndex = i;
            for (int j=i+1;j<data.length;j++){
                if (data[j] < data[minIndex]){
                    minIndex = j;
                }
            }
            int temp = data[minIndex];
            data[minIndex] = data[i];
            data[i] = temp;
            System.out.println(Arrays.toString(data));
        }

    }


}
