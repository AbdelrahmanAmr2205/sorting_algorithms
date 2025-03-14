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
public class Utilities {
    public static void swap(int[] arr, int i, int j){
        int temp= arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }

    public static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        Random random = new Random();
        for (int i=0; i < arr.length; i++) {
            arr[i] = random.nextInt();
        }
        return arr;
    }
    
    public static boolean isSorted(int[] arr){
        for(int i= 0; i < arr.length - 1; i++){
            if(arr[i] > arr[i+1])
                return false;
        }
        return true;
    }
    
    public static int getRandomNumberInRange(int start, int end){
        Random random= new Random();
        int num= random.nextInt(start, end + 1);
        return num;
    }
}
