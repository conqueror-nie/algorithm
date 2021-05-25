package _02array;

import java.io.*;

/**
 * @Author: Jamie Nie
 * @Date: 2021/5/24 11:48
 * @Slogan: The harder you work, the more luck you have.
 * @desc:
 */
public class AgeStas {
    public static void main(String[] args) throws IOException {

        String str = null;
        String fileName = "D:\\document\\NJP\\图灵\\【数据结构与算法-赵云】\\02\\基础数据结构\\数组\\age.txt";
        long beginTime = System.currentTimeMillis();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));

        int[] data = new int[120];
        int total = 0;
        while ((str = bufferedReader.readLine()) != null){
            int age = Integer.parseInt(str);
            data[age]++;
            total++;
        }
        System.out.println("共统计数据量为: " + total);

        for (int i=0;i<data.length;i++){
            System.out.println( i + "岁的人数有：" + data[i]);
        }

        System.out.println("共耗时：" + (System.currentTimeMillis() - beginTime) + " ms"); //共耗时：62376 ms
    }
}
