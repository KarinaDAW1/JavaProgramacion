package Quicksort;

public class QuickSort {
	
	 public static void main(String[] args) {
	        int[] array = {8,10,4,6,8,7,1,5};
	        quicksort(array, 0, array.length - 1);
	        for (int i : array) {
	            System.out.print(i);
	        }
	    }

	    public static void quicksort(int[] array, int first_index, int last_index) {
	        if (first_index < last_index) {
	            int pivot_index = partition(array, first_index, last_index);
	            quicksort(array, first_index, pivot_index - 1);
	            quicksort(array, pivot_index + 1, last_index);
	        }
	    }

	    private static int partition(int[] array, int first_index, int last_index) {
	        int pivot = array[first_index];
	        int left = first_index + 1;
	        int right = last_index;

	        while (left <= right) {
	            while (left <= right && array[left] <= pivot) {
	                left++;
	            }
	            while (left <= right && array[right] >= pivot) {
	                right--;
	            }
	            if (left < right) {
	                swap(array, left, right);
	            }
	        }
	        swap(array, first_index, right);
	        return right;
	    }

	    private static void swap(int[] array, int i, int j) {
	        int temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	    }

}

