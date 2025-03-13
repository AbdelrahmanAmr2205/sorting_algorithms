/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sorting_algorithms;



/**
 *
 * @author boody
 */
public class BubbleSort implements SortingStrategy {

    @Override
    public int[] sort(int[] arr) {
        boolean swapped;
        int n= arr.length - 1;
        for(int i= 0; i < n ; i++){
            swapped= false;
            for(int j= 0; j < n-i; j++){
                if(arr[j] > arr[j+1]){
                    Utilities.swap(arr, j, j+1);
                    swapped= true;
                }
            }
            if(!swapped)
                break;
        }
        return arr;
    }
    
    public static void main(String[] args) {
        SortingStrategy mySort= new BubbleSort();
        int[] arr= Utilities.generateRandomArray(50);
        System.out.println(Utilities.isSorted(arr));
        System.out.println(Utilities.isSorted(mySort.sort(arr)));
    }
}
