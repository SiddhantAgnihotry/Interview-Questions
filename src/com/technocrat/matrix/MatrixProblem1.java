package com.technocrat.matrix;

//Problem is to find a number x from a given sorted n*n matrix (sorted row & column wise in increasing order) in O(n) time.

public class MatrixProblem1 {

	public static void main(String[] args) {
		
		int[][] mat = {{10,20,30,40},
				   	   {15,25,35,45},
				   	   {27,29,37,48},
				   	   {32,33,39,50}
				  	  };
		search(mat, mat.length, 50);
		search(mat, mat.length, 1);
	}
	
	/*mat is the given matrix, 
	n is the length of matrix
	x is the element to find*/
	public static boolean search(int[][] mat, int n, int x) {
		// I will start the traversal from first row right most element. 
		int i = 0;  	// i represents row
		int j = n-1;	// j represents column 
		//looping till boundaries are reached 
		while(i < n && j >=0) {
			if (x == mat[i][j]) {
				//found the element
				System.out.println("Found "+x+" at position : ["+(i+1)+","+(j+1)+"]");
				return true;
			} else if (x < mat[i][j]) {
				//move left
				j--;
			} else {
				//go down
				i++;
			}
		}
		// Element not found in matrix
		System.out.println(x+" not found");
		return false;
	}

}
