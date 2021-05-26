package _06recursion;

/**
 * @Author: Jamie Nie
 * @Date: 2021/5/26 11:41
 * @Slogan: The harder you work, the more luck you have.
 * @desc: 阶乘
 *  5! = 5*4*3*2*1;
 *  f(n) = n*f(n-1)
 */
public class Factorial {

    //递归
    public static long fac(int n){
        if (n <= 1) return 1;
        return n * fac(n-1);
    }

    //尾递归
    public static long tailFac(long res,int n){
        if (n <= 1) return res;
        return tailFac(res * n,n-1);
    }

    public static void main(String[] args) {
        long beginTime = System.currentTimeMillis();
        for (int i=1;i<=20;i++){
            System.out.println(i + ":" + fac(i) + ",耗时：" + (System.currentTimeMillis()-beginTime) + " ms");
        }

        /*for (int i=1;i<=20;i++){
            System.out.println(i + ":" + tailFac(1,i) + ",耗时：" + (System.currentTimeMillis()-beginTime) + " ms");
        }*/
    }


}
