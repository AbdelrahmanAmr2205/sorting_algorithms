/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sorting_algorithms;


/**
 *
 * @author boody
 */
public class Main {
    public static void main(String[] args){
        CompareAlgorithms comparison= CompareAlgorithms.getInstance(Utilities.generateRandomArray(1000));
        int[] sizes= {1000, 10000, 25000, 50000, 100000, 500000};
        final int noOfAlgorithms= comparison.getNumberOfAlgorithms(), noOfSamples= sizes.length;
        long[][] executionTime= new long[noOfSamples][noOfAlgorithms];
        for(int i=0; i < noOfSamples; i++ ){
            comparison.setArray(Utilities.generateRandomArray(sizes[i]));
            executionTime[i]= comparison.compare();
        }
        printResult(executionTime, noOfSamples, noOfAlgorithms);
        int[] arr= {3, 41,16, 25, 63, 52, 40};
        System.out.println(part8.findkthSmallestElement(arr, 3));
    }
    
    public static void printResult(long[][] arr, int n, int m){
        for(int i= 0; i < m; i++){
            switch(i){
                case 0: 
                    System.out.print("Selection Sort: ");
                    break;
                case 1:
                    System.out.print("Bubble Sort: ");
                    break;
                case 2:
                    System.out.print("Insertion Sort: ");
                    break;
                case 3:
                    System.out.print("Merge Sort: ");
                    break;
                case 4:
                    System.out.print("Quick Sort: ");
                    break;
                case 5:
                    System.out.print("Heap Sort: ");
                    break;
            }
            for(int j= 0; j < n; j++){
                System.out.print(arr[j][i] + "\t");
            }
            System.out.println();
        }
    }
    
}
