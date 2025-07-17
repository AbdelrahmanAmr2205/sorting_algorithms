/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sorting_algorithms;

import java.util.PriorityQueue;

/**
 *
 * @author boody
 */
public class EnhancenedHybridMergeSort implements SortingStrategy {

    private class HeapNode implements Comparable<HeapNode>{
        
        int value;
        int elementIndex;
        int endIndex;

        private HeapNode(int value, int elementIndex, int endIndex) {
            this.value = value;
            this.elementIndex = elementIndex;
            this.endIndex = endIndex;
        }
        
        @Override
        public int compareTo(HeapNode other) {
            return Integer.compare(value, other.value);
        }
        
    }
    
    @Override
    public int[] sort(int[] arr) {
        final short k= 32;
        int elementIndex, endIndex, subArraysCount= arr.length / k;
        PriorityQueue<HeapNode> minHeap= new PriorityQueue<>(subArraysCount);
        for(int i = 0; i < subArraysCount; i++){
            elementIndex= i * k;
            endIndex= Math.min((i+1) * k, arr.length);
            insertionSort(arr, elementIndex, endIndex);
            minHeap.add(new HeapNode(arr[elementIndex], elementIndex, endIndex));
        }
        int i= 0;
        int[] sorted= new int[arr.length];
        HeapNode node;
        while(!minHeap.isEmpty()){
            node= minHeap.remove();
            sorted[i++]= node.value;
            if(++node.elementIndex < node.endIndex){
                node.value= arr[node.elementIndex];
                minHeap.add(node);
            }
        }
        return sorted;
    }
    
    private void insertionSort(int[] arr, int left, int right){
        for(int i= left + 1; i < right; i++){
            int key = arr[i];
            int j= i - 1;
            
            while(j >= left && arr[j] > key){
                arr[j+1]= arr[j];
                j--;
            }
            arr[j+1]= key;
        }
    }
    
    public static void main(String[] args){
        EnhancenedHybridMergeSort sorting= new EnhancenedHybridMergeSort();
        int[] arr= sorting.sort(Utilities.generateRandomArray(1000000));
        System.out.println(Utilities.isSorted(arr));
    }
    
}
