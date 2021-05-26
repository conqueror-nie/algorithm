package _06recursion;

/**
 * @Author: Jamie Nie
 * @Date: 2021/5/26 10:54
 * @Slogan: The harder you work, the more luck you have.
 * @desc: 斐波那契数列
 *  1   1   2   3   5   8   13  21  34  55
 *  f(n) = f(n-1) + f(n-2)
 */
public class Fibonacci {
    private static long[] data;

    //基础递归实现斐波那契数列，效率低。时间复杂度O(2^n),空间复杂度O(2^n)
    public static long fab(int n){
        if (n <= 2) return 1;
        return fab(n-1) + fab(n-2);
    }

    //循环实现斐波那契数列。时间复杂度O(n)
    public static long noFab(int n){
        if (n <= 2) return 1;
        long a = 1;
        long b = 1;
        long c = 0;
        for (int i=3;i<=n;i++){
            c = a+b;
            a = b;
            b = c;
        }
        return c;
    }

    //数组缓存递归实现的斐波那契数列结果
    public static long fab2(int n){
        if (n <= 2) return 1;
        if (data[n] > 0) return data[n];
        long res = fab2(n-1) + fab2(n-2);
        data[n] = res;
        return res;
    }

    //使用尾递归实现波那契数列结果
    public static long tailFab(long pre,long res,int n){
        if (n <= 2) return res;
        return tailFab(res,pre+res,n-1);
    }

    public static void main(String[] args) {
        long beginTime = System.currentTimeMillis();

        //平铺打印递归实现的斐波那契数列结果
        /*for (int i=1;i<60;i++){
            System.out.print(fab(i) + " ");
        }*/

        //按位置、值、耗时 打印递归实现的斐波那契数列结果
        /*for (int i=1;i<=60;i++){
            System.out.println(i + ":" + fab(i) + ",总耗时" + (System.currentTimeMillis()-beginTime) + "ms");//50:12586269025,总耗时78400ms
        }*/

        //按位置、值、耗时 打印循环实现的斐波那契数列结果
        /*for (int i=1;i<=60;i++){
            System.out.println(i + ":" + noFab(i) + ",总耗时" + (System.currentTimeMillis()-beginTime) + "ms");//60:1548008755920,总耗时2ms
        }*/

        //按位置、值、耗时 打印数组缓存递归实现的斐波那契数列结果
        /*data = new long[100];
        for (int i=1;i<=60;i++){
            System.out.println(i + ":" + fab2(i) + ",总耗时" + (System.currentTimeMillis()-beginTime) + "ms");//60:1548008755920,总耗时3ms
        }*/

        //按位置、值、耗时 打印尾递归实现的斐波那契数列结果
        for (int i=1;i<=60;i++){
            System.out.println(i + ":" + tailFab(1,1,i) + ",总耗时" + (System.currentTimeMillis()-beginTime) + "ms");//60:1548008755920,总耗时2ms
        }

    }


}
