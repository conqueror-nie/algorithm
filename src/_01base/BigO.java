package _01base;

/** 时间复杂度
 * @Author: Jamie Nie
 * @Date: 2021/5/24 10:24
 * @Slogan: The harder you work, the more luck you have.
 * @desc:
 */
public class BigO {
    public static void main(String[] args) {
        int a = 1;  //O(1)

        for (int i=0;i<10;i++){
            a++;    //O(1)  常量均看为 1次
        }
        System.out.println(a);

        int n = Integer.MAX_VALUE;  //表示 n 是未知数
        int i = 1;
        while(i<=n){
            i = i * 3;  //O(logn)
        }

        i = 1;
        for (int j=1;j<n;j++){
            while(i<=n){
                i = i * 2;  //O(nlogn)
            }
        }

        for(i = 0 ; i < n;i++){	// 乘法 n次
            for(int j = 0 ; j < n ;j ++){		//n次
                a = a +1;			//运行了多少次？		O(n^2)
            }
        }


        for(i = 0 ; i < n;i++){	// 乘法 n次
            for(int j = i ; j < n ;j ++){		//n次
                a = a +1;			//运行了多少次？	n*(n+1)/2 => O(n^2); => (n^2+n)/2 => 注意有个规律，有加减法的时候，找次数最高的那个  O(n^2)
            }
        }



    }
}
