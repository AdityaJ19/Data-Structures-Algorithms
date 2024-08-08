package SortingAlgorithms;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        arr = merge(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] merge(int[] arr){
        if (arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;

        int[] left = merge(Arrays.copyOfRange(arr, 0, mid));
        int[] right = merge(Arrays.copyOfRange(arr, mid, arr.length));

        return mergeSort(left, right);
    }
    private static int[] mergeSort(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];

        //Now let's create pointers for both sub-arrays and one new pointer for the new merge array
        int i = 0;
        int j = 0;
        int k = 0;

        //for out of bound condition
        while(i < first.length && j < second.length){
            //whenever any of these condition is false the loop will terminate
            if (first[i] < second[j]){
                //now the new element will be added in the new array
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        // It may be possible that one of the sub-array did not complete
        // Copy the remaining elements
        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}
