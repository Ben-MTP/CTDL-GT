package com.ctdlgt.max;

/**
 * @author ManhKM on 3/14/2022
 * @project CTDL-GT
 * Tìm giá trị số lớn nhất trong mảng:
 * arr[n] = [33,55,53,23,54,76,43,554,65,43,65,43]
 */
public class MaxDemo {
    private static int[] intArray = new int[]{ 33,55,53,23,54,76,43,54,65,43,65,43 };
    public static void main(String[] args) {
        System.out.println(FindMaxValue(intArray));
    }

    private static int FindMaxValue(int[] intArray) {
        int maxValue = intArray[0];
        for (int item: intArray) {
            if(item > maxValue){
                maxValue = item;
            }
        }
        return maxValue;
    }
}
