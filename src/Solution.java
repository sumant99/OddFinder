import java.util.*;

public class Solution {
	public static void main(String[] args) {
	
				OddFinder of=new OddFinder();
				ArrayList<Integer> oddFinder = of.getOddElements(0, new int[] {6, 5, 2, 3, 4, 7}, new ArrayList<Integer>());
				for(int i : oddFinder){
					System.out.println(i);
				}

	}	
}

