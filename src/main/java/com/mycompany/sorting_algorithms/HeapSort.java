/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sorting_algorithms;


/**
 *
 * @author boody
 */
public class HeapSort implements SortingStrategy{
    private int heapSize;
    
    @Override
    public int[] sort(int[] arr) {
        heapSize= arr.length;
        buildMaxHeap(arr);
        while(heapSize > 1){
            Utilities.swap(arr, 0, heapSize - 1);
            heapSize--;
            maxHeapify(arr, 0);
        }
        return arr;
    }
    
    private void maxHeapify(int[] arr, int i){
        int largest;
        int left= 2*i + 1;
        int right= 2*i +2;
        if(left < heapSize && arr[left] > arr[i])
            largest= left;
        else largest= i;
        if(right < heapSize && arr[right] > arr[largest])
            largest= right;
        if(largest != i){
            Utilities.swap(arr, i, largest);
            maxHeapify(arr, largest);
        }
    }
    
    private void buildMaxHeap(int[] arr){
        for(int i= (arr.length - 2) / 2; i >= 0; i--){
            maxHeapify(arr, i);
        }
    }
}
