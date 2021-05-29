package _07sort;

import java.util.Arrays;

/**
 * @Author: Jamie Nie
 * @Date: 2021/5/27 9:56
 * @Slogan: The harder you work, the more luck you have.
 * @desc:   希尔排序：插入排序的升级版
 */
public class ShellSort {

    public static void shellSort(int[] data){
        for (int add=data.length/2;add>=1;add=add/2){
            for (int i=add;i<data.length;i+=add){
                int udata = data[i];
                int j = i-add;
                for (;j>=0;j-=add){
                    if(udata < data[j]){
                        data[j+add] = data[j];
                    }else {
                        break;
                    }
                }
                data[j+add] = udata;
                System.out.println(Arrays.toString(data));
            }
        }
    }

    public static void main(String[] args) {
        int[] data = new int[]{3,69,1,9,86,54,65,32,59,7};
        System.out.println("初始顺序：" + Arrays.toString(data));
        shellSort(data);
    }
}
