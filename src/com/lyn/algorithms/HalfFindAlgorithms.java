package com.lyn.algorithms;

public class HalfFindAlgorithms{
    static int[] arrays = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};

    public static int getIndex(int value){
        int min = 0;
        int max = arrays.length-1;
        int mid = (max+min)/2;
        while(arrays[mid]!=value){
            if(arrays[mid]>value)
            {
                max = mid-1;
            }
            if(arrays[mid]<value)
            {
                min = mid+1;
            }
            if(min>max)
            {
                return -1;
            }
            mid = (max+min)/2;
        }
        return mid;
    }

    public static void main(String[] args){
        System.out.println(getIndex(6));
    }
}
