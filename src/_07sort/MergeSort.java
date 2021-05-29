package _07sort;

import java.util.Arrays;

/**
 * @Author: Jamie Nie
 * @Date: 2021/5/26 14:23
 * @Slogan: The harder you work, the more luck you have.
 * @desc:   归并排序：先递归拆分，再合并
 */
public class MergeSort {

    private static int[] temp;
    private static int count=0;

    public static void mgSort(int[] data,int left,int right){
        if (left < right) {
            int mid = (left+right)/2;
            mgSort(data,left,mid);
            mgSort(data,mid+1,right);
            merge(data,left,mid,right);
        }else {
            System.out.println("count = " + ++count);
        }

    }
    public static void merge(int[] data,int left,int mid,int right){
        temp = new int[data.length];

        int point1 = left;
        int point2 = mid+1;

        int loc = left;

        while (point1<=mid && point2<=right){
            if (data[point1] < data[point2]){
                temp[loc] = data[point1];
                point1 ++;
                loc++;
            }else {
                temp[loc] = data[point2];
                point2++;
                loc++;
            }
        }

        while (point1<=mid){
            temp[loc++] = data[point1++];
        }

        while (point2<=right){
            temp[loc++] = data[point2++];
        }

        for (int i=left;i<=right;i++){
            data[i] = temp[i];
        }

        System.out.println(Arrays.toString(data));
    }
    public static void main(String[] args) {
        int[] data = new int[]{95,8,46,985,41,65,1223,5641,55,4,6};
        System.out.println("初始的数组是：" + Arrays.toString(data));
        mgSort(data,0,data.length-1);
    }
}
