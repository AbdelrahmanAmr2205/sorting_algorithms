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
public class Main {
    public static void main(String[] args){
        CompareAlgorithms comparison= CompareAlgorithms.getInstance(Utilities.generateRandomArray(1000));
        final int noOfAlgorithms= comparison.getNumberOfAlgorithms(), noOfSamples= 7;
        long[][] executionTime= new long[noOfSamples][noOfAlgorithms];
        executionTime[0]= comparison.compare();
        for(int i=0; i < noOfSamples - 1; i++ ){
            comparison.setArray(Utilities.generateRandomArray(25000 * (int)Math.pow(2, i)));
            executionTime[i+1]= comparison.compare();
        }
        for(int i= 0; i < noOfAlgorithms; i++){
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
            for(int j= 0; j < noOfSamples; j++){
                System.out.print(executionTime[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
}
