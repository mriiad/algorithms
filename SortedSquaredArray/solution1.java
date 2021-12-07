import java.util.*;

/**
* @author mriad
*
* Problem: return a new sorted and squared array from a sorted array of integers
*/
class Program {

    public int[] sortedSquaredArray(int[] array) {
        int[] sortedArray = new int[array.length];
        int i = 0;
        int j = array.length - 1;
        int cpt = j;
        while (i <= j) {
            if (Math.abs(array[i]) < Math.abs(array[j])) {
                sortedArray[cpt] = (int) Math.pow(array[j], 2);
                j--;
            } else {
                sortedArray[cpt] = (int) Math.pow(array[i], 2);
                i++;
            }
            cpt--;
        }
        return sortedArray;
    }
}
