/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sorting_algorithms;

/**
 *
 * @author boody
 */
public class InsertionSort implements SortingStrategy {

    @Override
    public int[] sort(int[] arr) {
        for(int i= 1; i < arr.length; i++){
            int key= arr[i];
            int j= i-1;
            while(j >= 0 && arr[j] > key){
                arr[j+1]= arr[j];
                j--;
            }
            arr[j+1]= key;
        }
        return arr;
    }
}
