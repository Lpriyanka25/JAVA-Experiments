import java.util.Scanner;
class Codechef
{
	public static void main (String[] args) 
	{
		int[] array = new int[100]; // Initial array
		array[0] = 2;
	    array[1] = 4;
	    array[2] = 6;
	    array[3] = 8;
	    array[4] = 10;
        int size = 5; 

        int positionToDelete = 2; 

	for (int i = positionToDelete; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        size--;

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
	}
}
