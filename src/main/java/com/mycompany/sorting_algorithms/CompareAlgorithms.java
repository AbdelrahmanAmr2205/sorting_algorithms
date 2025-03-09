/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sorting_algorithms;

/**
 *
 * @author boody
 */
public class CompareAlgorithms {
    private int[] arr;
    private SortingStrategy[] sortingAlgorithm;

    public CompareAlgorithms() {
        sortingAlgorithm= new SortingStrategy[]{new SelectionSort(), new BubbleSort(), new InsertionSort(), new MergeSort(), new QuickSort()};
    }

    public CompareAlgorithms(int[] arr) {
        this.arr = arr;
        sortingAlgorithm= new SortingStrategy[]{new SelectionSort(), new BubbleSort(), new InsertionSort(), new MergeSort(), new QuickSort()};
    }

    public void setArray(int[] arr) {
        this.arr = arr;
    }
    
    long[] compare(){
        long[] executionTime= new long[sortingAlgorithm.length];
        for(int i= 0; i < sortingAlgorithm.length; i++){
            long startingTime= System.nanoTime();
            sortingAlgorithm[i].sort(arr.clone());
            long endingTime= System.nanoTime();
            executionTime[i]= (endingTime - startingTime) / 1000000;
        }
        return executionTime;
    }
}
