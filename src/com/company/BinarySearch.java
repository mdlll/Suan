package com.company;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class BinarySearch {

    public static int rank(int key,int[] a){
        //arrays a[] must be ordered
        int low=0;
        int high=a.length-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(key>a[mid]){
                low=mid+1;
            }else if(key<a[mid]){
                high=mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    //if low=0,high=9
    //mid=low-high/2=4.5=5
    //mid=low+high-low/2=0+4.5=5
    //low=5+1=6
    //mid=low-high/2=9-6=3/2=1.5=2
    //mid=low+high-low/2=6+3/2=6+2=8
    public static void main(String[] args){
        int[] whiteList= In.readInts(args[0]);
        Arrays.sort(whiteList);
        while (!StdIn.isEmpty()){
            int key=StdIn.readInt();
            if(rank(key,whiteList)<0){
                StdOut.print(key);
            }
        }
    }
}
