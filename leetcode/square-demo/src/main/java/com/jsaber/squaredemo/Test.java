package com.jsaber.squaredemo;

/**
 * @author zijia
 * @Desc test
 * @since 2020-1-6 16:17
 */
public class Test {

    public static Double getEnergy(double distance, double weight, double ratio){
        return distance * Math.pow(weight, 0.75 ) * ratio / 1000;
    }

    public static void main(String[] args) {
        System.out.println(getEnergy(0, 60, 1.8));
    }
}
