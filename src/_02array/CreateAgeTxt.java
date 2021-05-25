package _02array;

import java.io.*;
import java.util.Random;

/**
 * @Author: Jamie Nie
 * @Date: 2021/5/24 11:32
 * @Slogan: The harder you work, the more luck you have.
 * @desc:
 */
public class CreateAgeTxt {
    public static void main(String[] args) throws IOException {
        String fileName = "D:\\document\\NJP\\图灵\\【数据结构与算法-赵云】\\02\\基础数据结构\\数组\\age.txt";
        System.out.println("开始生成年龄测试文件：" + fileName);
        Random random = new Random();
        long beginTime = System.currentTimeMillis();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));

        int n = 1400000000;
        for(int i=0; i<n; i++){
            bufferedWriter.write(Math.abs(random.nextInt()) % 120 + "\r\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
        System.out.println("生成" + n +"条数据共耗时：" + (System.currentTimeMillis() - beginTime) + " ms"); //生成1400000000条数据共耗时：84047 ms

    }
}
