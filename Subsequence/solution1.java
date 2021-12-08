import java.util.*;

class Program {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    if(array.size() < sequence.size()){
			return false;
		}
		int i = 0, j = 0;
		while(i < array.size() && j < sequence.size()){
			if(array.get(i) == sequence.get(j)){
				j++;
			}
			i++;
		}
    return j == sequence.size();
  }
}
