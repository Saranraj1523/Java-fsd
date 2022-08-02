package lis;

public class Solution {
	 static int lis(int arr[], int arr_len){
	      int s_arr[] = new int[arr_len];
	      int i, j, max = 0;
	      for (i = 0; i < arr_len; i++)
	         s_arr[i] = 1;
	      for (i = 1; i < arr_len; i++)
	      for (j = 0; j < i; j++)
	      if (arr[i] > arr[j] && s_arr[i] < s_arr[j] + 1)
	      s_arr[i] = s_arr[j] + 1;
	      for (i = 0; i < arr_len; i++)
	      if (max < s_arr[i])
	      max = s_arr[i];
	      return max;
	   }
	   public static void main(String args[]){
	      int arr[] = {50,3,10,7,40,80 };
	      int arr_len = arr.length;
	      System.out.println("The length of the lis is " +  lis(arr, arr_len));
	   }
	}


