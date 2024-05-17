package com.sunbeam;
import java.util.Arrays;
public class q9 
{
		public static void selectionSort(int arr[], int N) 
	    {
	        int comparisions=0;
	        
			for(int i = 0 ; i < N-1 ; i++) 
	        {
				
				for(int j = i + 1 ; j < N ; j++) 
	            {
					
					if(arr[i] > arr[j])
	                {
	                    comparisions++;
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
	                    
					}
				}
	           
			}//4. repeat above steps untill array is sorted
	        System.out.println("The no of comparisons = "+comparisions);
		}

		public static void main(String[] args) {
			int arr[] = {44, 11, 55, 22, 66, 33};
			
			System.out.println("Array before sort : " + Arrays.toString(arr));
			selectionSort(arr, arr.length);
			System.out.println("Array after sort : " + Arrays.toString(arr));
		}

	}