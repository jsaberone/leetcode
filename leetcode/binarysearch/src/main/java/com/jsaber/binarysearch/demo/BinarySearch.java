package com.jsaber.binarysearch.demo;

/**
 * @author zijia
 * @Desc 二分查找
 * @since 2020-1-7 8:30
 */
public class BinarySearch {

    public static int search(int[] array, int dest){
        int min = 0;
        int max = array.length-1;
        int mid = 0;

        while(min < (max - 1)) {
            mid = min + ((max - min) >> 1);
            if(array[mid] == dest){
                return array[mid];
            }
            if (array[mid] > dest) {
                max = mid;
            } else if (array[mid] < dest) {
                min = mid;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(search(array, 3));
    }
}
