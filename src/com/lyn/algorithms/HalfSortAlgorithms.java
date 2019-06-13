package com.lyn.algorithms;

public class HalfSortAlgorithms{
    public HalfSortAlgorithms()
    {
        System.out.println("------init---HalfSortAlgorithms");
    }
    
    public static void merge_sort(int[] arrays,int start,int end)
    {
        //递归几次拆分几次合并数据
        if(start<end)
        {
            int mid = (start+end)/2;
            //再次拆分
            merge_sort(arrays, start, mid);
            merge_sort(arrays, mid+1, end);
            //合并数组
            combin_arrays(arrays, start, mid, end);
        }
    }
    
    //合并数组
    public static void combin_arrays(int[] arrays,int start,int mid,int end)
    {
        int i=start;
        int j=mid+1;
        int c = 0;
        int length = end-start+1;
        int[] temp = new int[length];
        while(i<=mid&&j<=end)
        {
            if(arrays[i]<arrays[j])
            {
                temp[c] = arrays[i];
                c++;
                i++;
            }else
            {
                temp[c] = arrays[j];
                c++;
                j++;
            }
        }
        while(i<=mid)
        {
            temp[c]=arrays[i];
            c++;
            i++;
        }
        while(j<=end)
        {
            temp[c]=arrays[j];
            c++;
            j++;
        }
        c = 0;
        for(int k=start;k<=end;k++)
        {
            arrays[k] = temp[c];
            c++;
        }
        snp(arrays);
    }
    
    //打印数组
    public static void snp(int[] arrays){
        for(int i=0;i<arrays.length;i++){
            System.out.print(arrays[i]+" ");
        }
        System.out.println();
    }
    
    
    
    public static void main(String[] args){
        int[] arrays = new int[]{1,23,15,10,9,8,5,14,17,16,45,6};
        merge_sort(arrays, 0, arrays.length-1);
    }
}
