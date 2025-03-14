/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sorting_algorithms;


/**
 *
 * @author boody
 */
public class MergeSort implements SortingStrategy {

    @Override
    public int[] sort(int[] arr) {
        int[] tempArr= new int[arr.length];
        mergeSort(arr, tempArr, 0, arr.length -1);
        return arr;
    }
    
    private void mergeSort(int[] arr, int[] tempArr, int left, int right){
        if(left < right){
            int mid= left + (right - left) / 2;
            mergeSort(arr, tempArr, left, mid);
            mergeSort(arr, tempArr, mid + 1, right);
            merge(arr, tempArr, left, mid, right);
        }
    }
    
    static void merge(int[] arr, int[] tempArr, int left,int mid, int right){
        System.arraycopy(arr, left,tempArr, left, right - left + 1);
        int i= left, j= mid + 1, k= left;
        while(i <= mid && j <= right){
            if(tempArr[i] < tempArr[j]){
                arr[k++]= tempArr[i++];
            }
            else{
                arr[k++]= tempArr[j++];
            }
        }
        while(i <= mid){
            arr[k++]= tempArr[i++];
        }
        while(j <= right){
            arr[k++]= tempArr[j++];
        }
    }
}
