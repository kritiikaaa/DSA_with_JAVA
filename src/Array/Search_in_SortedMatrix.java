package Array;

// we need to search for an element in a sorted 2-D matrix
public class Search_in_SortedMatrix {

    public static void stairCaseSearch(int[][] matrix, int key){ //Time Complexity = O(n+m)
        int row = 0;
        int col = matrix[0].length - 1;
        boolean found = false; // Flag to track if the key is found

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == key){
                System.out.println("Found at (" + row + ", " + col + ")");
                found = true; // Update flag when key is found
                break;
            } else if(key < matrix[row][col]){
                col--;
            } else{
                row++;
            }
        }

        if(!found) {
            System.out.println("Key not found");
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}
        };
        stairCaseSearch(matrix, 33); // Test case where key is present
        stairCaseSearch(matrix, 34); // Test case where key is not present
    }
}
