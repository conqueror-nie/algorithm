package _07sort;

import java.util.Arrays;

/**
 * @Author: Jamie Nie
 * @Date: 2021/5/27 9:56
 * @Slogan: The harder you work, the more luck you have.
 * @desc:   希尔排序
 */
public class ShellSort {

    public static void shellSort(int[] data){
        for (int add=data.length/2;add>=1;add=add/2){
            for (int i=add ;i<=data.length;i+=add){
                int a = data[i];
                int j = i-add;
                for (;j>=0;j-=add){
                    if (a < data[j]){
                        data[j+add] = a;
                    }else {
                        break;
                    }
                }
                data[j+add] = a;
            }
        }
        System.out.println(Arrays.toString(data));
    }

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
        shellSort(data);
    }
}
