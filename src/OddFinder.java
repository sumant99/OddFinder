import java.util.*;
public class OddFinder {
	
		public static ArrayList<Integer> getOddElements(int i, int[] a, ArrayList<Integer> aList) {
			if (i >= a.length) {
				return aList;
			} else {
				if ((a[i] % 2) != 0) {
					aList.add(a[i]);
				}
				return getOddElements(++i, a, aList);
			}

		}

}

	



