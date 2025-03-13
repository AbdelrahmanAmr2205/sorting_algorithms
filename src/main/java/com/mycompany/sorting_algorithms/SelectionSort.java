/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sorting_algorithms;

/**
 *
 * @author boody
 */
public class SelectionSort implements SortingStrategy {

    @Override
    public int[] sort(int[] arr) {
        int n= arr.length - 1;
        for(int i= 0; i < n; i++){
            int minIndex= i;
            for(int j= i+1; j < arr.length; j++){
                if(arr[j] < arr[minIndex])
                    minIndex= j;
            }
            Utilities.swap(arr, i, minIndex);
        }
        return arr;
    }
    
    public static void main(String[] args) {
        SortingStrategy mySort= new SelectionSort();
        int[] arr= Utilities.generateRandomArray(50);
        System.out.println(Utilities.isSorted(arr));
        System.out.println(Utilities.isSorted(mySort.sort(arr)));
    }
    
}
