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
        Num target= partition(tempArr, left, right);
        while(target.index != k -1){
            if(target.index > k-1 ){
                right= target.index -1;
                target= partition(tempArr, left, right);
            }
            else{
                left= target.index + 1;
                target= partition(tempArr, left, right);
            }
        }
        return target.number;
    }  
    
    private static Num partition(int[] arr, int left, int right){
        int pivot= Utilities.getRandomNumberInRange(left, right);
        Utilities.swap(arr, pivot, right);
        pivot= arr[right];
        int i= left - 1;
        for(int j= left; j < right; j++){
            if(arr[j] < pivot){
                i++;
                Utilities.swap(arr,i,j);
            }
        }
        i++;
        Utilities.swap(arr, i, right);
        return new Num(arr[i], i);
    }
    
    private static class Num{
        private int number;
        private int index;
        
        Num(int number, int index){
            this.index= index;
            this.number= number;
        }
    }
}
