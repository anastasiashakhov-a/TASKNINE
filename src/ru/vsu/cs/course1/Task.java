package ru.vsu.cs.course1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task {
    public static void Process(int[][] arr2) {
        for (int r = 0; r < arr2.length; r++) {
            for (int c = 0; c < arr2[r].length; c++) {
                arr2[r][c]++;
            }
        }
    }

    public static int[][] Process2(int[][] arr2) {
        int[][] res = new int[2][2];
        for (int r = 0; r < Math.min(arr2.length, 2); r++) {
            for (int c = 0; c < Math.min(arr2[0].length, 2); c++) {
                res[r][c] = arr2[r][c];
            }
        }
        return res;
    }

    public static List<Integer> createNewList(List<Integer> list, int k) {
        int n = realLength(k, list);
        List<Integer> listNew = new ArrayList<>();
        if (n < 0) {
            n = list.size()-absMethod(n);
        }
        int j = 0;
        for (int i = list.size() - n; i < list.size(); i++) {
            listNew.add(j, list.get(i));
            j++;
        }

        for (int i = n; i < list.size(); i++) {
            listNew.add(i, list.get(i - n));
        }

        return listNew;
    }

    public static int realLength(int n, List<Integer> list) {
        int listSize = list.size();
        int trueN = absMethod(n);
        while (trueN > listSize) {
            trueN -= listSize;
        }
        int answer = 0;
        if (n >= 0) {
            answer = trueN;
        } else {
            answer = 0 - trueN;
        }
        return answer;
    }

    public static int absMethod(int n) {
        int answer = 0;
        if (n >= 0) {
            answer = n;
        } else {
            answer = 0 - n;
        }
        return answer;
    }

    public static List<Integer> toList (int[][] array) {
        List list = new ArrayList();
        for (int[] i : array) {
            for(int j : i){
                list.add(j);
            }
        }
        return list;
    }
    public static int[] toArray(List <Integer> list){
        int [] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
    }





}
