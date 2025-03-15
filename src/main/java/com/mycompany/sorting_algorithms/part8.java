/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sorting_algorithms;

/**
 *
 * @author boody
 */
public class part8 {
    
    public static int findkthSmallestElement(int[] arr, int k){
        if(k > arr.length || k < 1){
            System.out.println("k is out of bounds");
            return -1;
        }
        int left= 0, right= arr.length - 1;
        int[] tempArr= arr.clone();
        int target= QuickSort.partition(tempArr, left, right);
        while(target != k -1){
            if(target > k-1 ){
                right= target -1;
                target= QuickSort.partition(tempArr, left, right);
            }
            else{
                left= target + 1;
                target= QuickSort.partition(tempArr, left, right);
            }
        }
        return tempArr[target];
    }
}
