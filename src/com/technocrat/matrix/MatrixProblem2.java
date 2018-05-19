package com.technocrat.matrix;

import java.util.HashSet;

/*Problem is to print unique rows from a matrix in time:O(row*col) & space:O(row)
There are several approaches to do this:
1) Using Brute force
2) Using BST (convert the binary into decimal equivalent and then print bst (BST avoids duplicates))
3) Using trie data structure 
4) Using HashSet 

The best among them is using HashSet*/ 

public class MatrixProblem2 {

	public static void main(String[] args) {
		int[][] mat = {{0,1,0,0,1},
					   {1,0,1,1,0},
					   {0,1,0,0,1},
					   {1,1,1,0,0}
					  };
		printUniqueRows(mat, mat.length, mat[0].length);
		
		int[][] mat1 = {{0,1,0,0,1,1},
				   		{1,0,1,1,0,1},
				   		{0,1,0,0,1,1},
				   		{1,1,1,0,0,1}
				  	   };
		printUniqueRows(mat1, mat1.length, mat1[0].length);
	}
	
	public static void printUniqueRows(int[][] mat, int m, int n) {
		HashSet<String> set = new HashSet<>();
		String s;
		for (int i = 0 ; i < m ; i++) {
			s = "";
			for (int j = 0 ; j < n ; j++) {
				s += mat[i][j];
			}
			if(!set.contains(s)) {
				set.add(s);
				System.out.println(s);
			}
		}
		System.out.println();
	}

}
