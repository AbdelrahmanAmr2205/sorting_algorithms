/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sorting_algorithms;

import java.util.Arrays;

/**
 *
 * @author boody
 */
public class MergeSort implements SortingStrategy {

    @Override
    public int[] sort(int[] arr) {
        mergeSort(arr, 0, arr.length -1);
        return arr;
    }
    
    private void mergeSort(int[] arr, int left, int right){
        if(left < right){
            int mid= (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    
    private void merge(int[] arr, int left,int mid, int right){
        int[] tempArr= new int[arr.length];
        int i= left, j= mid + 1, k= left;
        for(; i <= mid && j <= right; k++){
            if(arr[i] < arr[j]){
                tempArr[k]= arr[i];
                i++;
            }
            else{
                tempArr[k]= arr[j];
                j++;
            }
        }
        while(i <= mid){
            tempArr[k++]= arr[i++];
        }
        while(j <= right){
            tempArr[k++]= arr[j++];
        }
        for(k= left; k <= right; k++){
            arr[k]= tempArr[k];
        }
    }
    
    public static void main(String[] args) {
        MergeSort mySort= new MergeSort();
        int[] arr= Utilities.generateRandomArray(50);
        System.out.println(Arrays.toString(mySort.sort(arr)));
    }
}
