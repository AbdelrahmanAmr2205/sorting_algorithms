/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sorting_algorithms;

/**
 *
 * @author boody
 */
public class HybridMergeSort implements SortingStrategy {

    @Override
    public int[] sort(int[] arr) {
        int[] tempArr= new int[arr.length];
        hybridMergeSort(arr, tempArr, 0, arr.length -1, 15);
        return arr;
    }
    
    private void hybridMergeSort(int[] arr, int[] tempArr, int left, int right, int threshold){
        if((right - left + 1) > threshold){
            int mid= left + (right - left) / 2;
            hybridMergeSort(arr, tempArr, left, mid,threshold);
            hybridMergeSort(arr, tempArr, mid + 1, right,threshold);
            MergeSort.merge(arr, tempArr, left, mid, right);
        }
        else insertionSort(arr, left, right);
    }
    
    private void insertionSort(int[] arr, int left, int right){
        for(int i= left + 1; i <= right; i++){
            int key= arr[i];
            int j= i-1;
            while(j >= left && arr[j] > key){
                arr[j+1]= arr[j];
                j--;
            }
            arr[j+1]= key;
        }
    }
    public static void main(String[] args){
        long executionTime;
        int[] arr;
        int[] sizes= {50000,100000,500000,1000000,10000000};
        long startingTime, endingTime;
        MergeSort s1= new MergeSort();
        HybridMergeSort s2= new HybridMergeSort();
        for(int i= 0; i < sizes.length; i++){
            arr= Utilities.generateRandomArray(sizes[i]);
            startingTime= System.nanoTime();
            s1.sort(arr.clone());
            endingTime= System.nanoTime();
            executionTime= (endingTime - startingTime) / 1000000;
            System.out.print(executionTime + "\t");
            startingTime= System.nanoTime();
            s2.sort(arr.clone());
            endingTime= System.nanoTime();
            executionTime= (endingTime - startingTime) / 1000000;
            System.out.println(executionTime);
        }
    }
}
