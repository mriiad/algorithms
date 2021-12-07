import java.util.*;

/**
* @author mriad
*
* Problem: return an array of two integers which their sum is equal to a target integer
*/
class Program {
    public static int[] twoNumberSum(int[] array, int targetSum) {

        if (array.length > 1) {

            HashMap < Integer, Integer > map = new HashMap < Integer, Integer > ();
            for (int i = 0; i < array.length; i++) {
                if (targetSum - array[i] == 0) {
                    return new int[] {
                        array[i], targetSum - array[i]
                    };
                } else if (map.get(targetSum - array[i]) != null) {
                    return new int[] {
                        array[i], targetSum - array[i]
                    };
                } else {
                    map.put(array[i], i);
                }
            }
        }
        return new int[0];
    }
}
