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
    private SortingStrategy[] sortingAlgorithms;
    private final int numberOfAlgorithms; 
    private static CompareAlgorithms comparison;

    private CompareAlgorithms() {
        sortingAlgorithms= new SortingStrategy[]{new SelectionSort(), new BubbleSort(), new InsertionSort(), new MergeSort(), new QuickSort(), new HeapSort()};
        numberOfAlgorithms= sortingAlgorithms.length;
    }

    private CompareAlgorithms(int[] arr) {
        this();
        this.arr = arr;
    }
    
    public static CompareAlgorithms getInstance(){
        if(comparison == null){
            comparison= new CompareAlgorithms();
            return comparison;
        }
        else return comparison;
    }
    
    public static CompareAlgorithms getInstance(int[] arr){
        if(comparison == null){
            comparison= new CompareAlgorithms(arr);
            return comparison;
        }
        else return comparison;
    }

    public void setArray(int[] arr) {
        this.arr = arr;
    }

    public int getNumberOfAlgorithms() {
        return numberOfAlgorithms;
    }
    
    long[] compare(){
        long[] executionTime= new long[sortingAlgorithms.length];
        for(int i= 0; i < sortingAlgorithms.length; i++){
            long startingTime= System.nanoTime();
            sortingAlgorithms[i].sort(arr.clone());
            long endingTime= System.nanoTime();
            executionTime[i]= (endingTime - startingTime) / 1000000;
        }
        return executionTime;
    }
}
