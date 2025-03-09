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
        final int noOfAlgorithms= 5, noOfSamples= 7;
        long[][] executionTime= new long[noOfSamples][noOfAlgorithms];
        CompareAlgorithms comparison= new CompareAlgorithms(generateRandomArray(1000));
        executionTime[0]= comparison.compare();
        for(int i=0; i < noOfSamples - 1; i++ ){
            comparison.setArray(generateRandomArray(25000 * (int)Math.pow(2, i)));
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
            }
            for(int j= 0; j < noOfSamples; j++){
                System.out.print(executionTime[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    public static int[] generateRandomArray(int size){
        int[] arr= new int[size];
        Random random= new Random();
        for(int i : arr){
            i= random.nextInt();
        }
        return arr;
    }
}
