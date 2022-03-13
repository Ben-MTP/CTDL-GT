package com.ctdlgt.arraysort;

/**
 * @author ManhKM on 3/14/2022
 * @project CTDL-GT
 * Sắp xếp giá trị trong mảng theo giá trị từ nhỏ đến lớn
 * int[] intArray = new int[]{33,55,53,23,54,76,43,554,65,43,65,43};
 */
public class SortArrayDemo {
    private static int[] intArray = new int[]{ 33,55,53,23,54,76,43,54,65,3,2,1 };
    public static void main(String[] args) {
        for (int item: sortValueASC(intArray)) {
            System.out.print(item +", ");
        }
    }

    /**
     * Chọn lấy vị trí thứ i trong mảng
     *      -> Tìm và hoán vị giá trị bé trong các giá trị còn lại của mảng.
     * @param intArray
     * @return
     */
    private static int[] sortValueASC(int[] intArray) {
        int lengthOfArray = intArray.length;
        for (int i = 0; i < lengthOfArray; i++) {           // N
            for(int j = i + 1; j < lengthOfArray; j++){     // N - i
                if(intArray[j] < intArray[i]){
                    int temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }

        return intArray;
    }
}
