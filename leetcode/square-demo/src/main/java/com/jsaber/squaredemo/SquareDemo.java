package com.jsaber.squaredemo;

/**
 * @author zijia
 * @Desc 平方根-计算类
 * @since 2020-1-6 15:31
 */
public class SquareDemo {

    public static double sqrt(double x, double precision) {
        if (x < 0) {
            return Double.NaN;
        }
        double low = 0;
        double up = x;
        if (x < 1 && x > 0) {
/** 小于1的时候*/
            low = x;
            up = 1;
        }
        double mid = low + (up - low)/2;
        while(up - low > precision) {
            if (mid * mid > x ) {//TODO mid可能会溢出
                up = mid;
            } else if (mid * mid < x) {
                low = mid;
            } else {
                return mid;
            }
            mid = low + (up - low)/2;
        }
        return mid;
    }


    public static void main(String[] args) {
        System.out.println(sqrt(64.00099, 0.000001d));



    }

}
