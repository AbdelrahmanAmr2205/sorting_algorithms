/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sorting_algorithms;

import java.util.Random;

/**
 *
 * @author boody
 */
public class QuickSort implements SortingStrategy {

    @Override
    public int[] sort(int[] arr) {
        quickSort(arr, 0, arr.length -1);
        return arr;
    }
    
    private void quickSort(int[] arr, int left, int right){
        if(left < right){
            int pivot= partition(arr, left, right);
            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }
    
    static int partition(int[] arr, int left, int right){
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
        return i;
    }
}
