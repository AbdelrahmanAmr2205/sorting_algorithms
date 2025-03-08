/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sorting_algorithms;

/**
 *
 * @author boody
 */
public class Sort {
    private int[] arr;
    private Sortable sortingAlgorithm;

    public Sort() {
    }

    public Sort(int[] arr) {
        this.arr = arr;
    }

    public Sort(int[] arr, Sortable sortingAlgorithm) {
        this.arr = arr;
        this.sortingAlgorithm = sortingAlgorithm;
    }

    public void setArray(int[] arr) {
        this.arr = arr;
    }

    public void setSortingAlgorithm(Sortable sortingAlgorithm) {
        this.sortingAlgorithm = sortingAlgorithm;
    }
    
    public int[] sort(){
        return sortingAlgorithm.sort(arr);
    }
}
