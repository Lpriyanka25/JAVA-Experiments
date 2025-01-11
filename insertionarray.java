import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) 
	{
	    int []array = new int[100];
	    array[0] = 2;
	    array[1] = 4;
	    array[2] = 6;
	    array[3] = 8;
	    array[4] = 10;
        int size = 5; // Current size of the array

        int newPosition = 2; // Index where you want to insert the new element
        int newElement = 7; // Element to be inserted

        
        for (int i = size - 1; i >= newPosition; i--) {
            array[i + 1] = array[i];
        }

        
        array[newPosition] = newElement;

        size++; 

        // Print the updated array
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

	}
}
