package com.ctdlgt.find;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ManhKM on 3/14/2022
 * @project CTDL-GT
 */
public class FindValueInArray {
    private static int[] intArray = new int[]{ 1, 2, 3, 23, 33, 43, 53, 54, 54, 55, 65, 76 };

    public static void main(String[] args) {
        for (Map<String, Integer> item :findDemo(33, intArray)) {
            System.out.print("Index: " + item.get("Index"));
            System.out.println();
            System.out.print("isCheck: " + item.get("isCheck"));
        }
    }

    /**
     * Kiểm tra giá trị input có trong Array hay không?
     * Nếu có in ra Index của input
     * @param input
     * @param intArray
     */
    private static List<Map<String, Integer>> findDemo(int input, int[] intArray) {
        List<Map<String, Integer>> listResult = new ArrayList<>();
        for (int i = 0; i < intArray.length; i++){
            if (intArray[i] == input){
                Map<String, Integer> map = new HashMap<>();
                map.put("Index", i);
                map.put("isCheck", 1);
                listResult.add(map);
            }
        }
        return listResult;
    }
}
