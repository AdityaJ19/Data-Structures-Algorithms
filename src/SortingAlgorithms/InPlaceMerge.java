package SortingAlgorithms;

import java.util.Arrays;

public class InPlaceMerge {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        mergeInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeInPlace(int[] arr, int start, int end){
        if (end - start == 1){
            return;
        }
        int mid = start + (end - start) / 2;

        mergeInPlace(arr, start, mid);
        mergeInPlace(arr, mid, end);

        mergeSortInPlace(arr, start, mid, end);
    }
    private static void mergeSortInPlace(int[] arr, int s, int m, int e){
        int[] mix = new int[e-s];

        //Now let's create pointers for both sub-arrays and one new pointer for the new merge array
        int i = s;
        int j = m;
        int k = 0;

        //for out of bound condition
        while(i < m && j < e){
            //whenever any of these condition is false the loop will terminate
            if (arr[i] < arr[j]){
                //now the new element will be added in the new array
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        // It may be possible that one of the sub-array did not complete
        // Copy the remaining elements
        while(i < m){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
}
