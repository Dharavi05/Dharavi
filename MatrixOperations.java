package assign_5;

public class MatrixOperations {
	

	    // Method to add two matrices
	    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
	        int rows = matrix1.length;
	        int columns = matrix1[0].length;
	        int[][] result = new int[rows][columns];
	        
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                result[i][j] = matrix1[i][j] + matrix2[i][j];
	            }
	        }
	        
	        return result;
	    }
	    
	    // Method to multiply two matrices
	    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
	        int rows1 = matrix1.length;
	        int columns1 = matrix1[0].length;
	        int rows2 = matrix2.length;
	        int columns2 = matrix2[0].length;
	        
	        if (columns1 != rows2) {
	            System.out.println("Invalid dimensions for matrix multiplication.");
	            return null;
	        }
	        
	        int[][] result = new int[rows1][columns2];
	        
	        for (int i = 0; i < rows1; i++) {
	            for (int j = 0; j < columns2; j++) {
	                for (int k = 0; k < columns1; k++) {
	                    result[i][j] += matrix1[i][k] * matrix2[k][j];
	                }
	            }
	        }
	        
	        return result;
	    }
	    
	    // Method to transpose a matrix
	    public static int[][] transposeMatrix(int[][] matrix) {
	        int rows = matrix.length;
	        int columns = matrix[0].length;
	        int[][] result = new int[columns][rows];
	        
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                result[j][i] = matrix[i][j];
	            }
	        }
	        
	        return result;
	    }
	    
	    // Method to display a matrix
	    public static void displayMatrix(int[][] matrix) {
	        int rows = matrix.length;
	        int columns = matrix[0].length;
	        
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	    
	    public static void main(String[] args) {
	        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}};
	        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}};
	        
	        System.out.println("Matrix 1:");
	        displayMatrix(matrix1);
	        System.out.println("\nMatrix 2:");
	        displayMatrix(matrix2);
	        int[][] transposeResult = transposeMatrix(matrix1);
	        System.out.println("\nTranspose Result of Matrix 1:");
	        displayMatrix(transposeResult);
	        
	        int[][] additionResult = addMatrices(matrix1, matrix2);
	        System.out.println("\nAddition Result:");
	        displayMatrix(additionResult);
	        
	        int[][] multiplicationResult = multiplyMatrices(matrix1, transposeResult);
	        if (multiplicationResult != null) {
	            System.out.println("\nMultiplication Result:");
	            displayMatrix(multiplicationResult);
	        }
	        
	        
	    }
	}

