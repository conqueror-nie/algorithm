package _07sort;

import java.util.Arrays;

/**
 * 冒泡排序：相邻值比较，前面值大则交换
 */
public class BubbleSort {

    private static int count = 0; //优化一  若一次内层循环没有一次位置交换，则直接推出
    private static boolean flag = true; //优化二  原理同上
    private static int time = 0;
    public static void main(String[] args) {
        int[] data = new int[]{95,8,46,985,41,65,1223,5641,55,4,6};
        System.out.println("初始的数组是：" + Arrays.toString(data));
        slcSort(data);
        System.out.println("time = " + time);
    }

    private static void slcSort(int[] data) {

        for (int i=data.length-1;i>=0;i--){
            count = 0;
            flag = true;
            for (int j=0;j<i;j++){
                if (data[j+1] < data[j]){
                    data[j+1] = data[j] + data[j+1];
                    data[j] = data[j+1] -data[j];
                    data[j+1] = data[j+1] -data[j];
                    count++;
                    flag = false;
                }
                time++;
            }
            /*if (count == 0){
                return;
            }*/
            if (flag){
                return;
            }

            System.out.println(Arrays.toString(data));
        }
    }

}
