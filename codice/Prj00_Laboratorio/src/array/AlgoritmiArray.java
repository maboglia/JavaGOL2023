package array;

import java.util.Arrays;

public class AlgoritmiArray {

	public static void main(String[] args) {

		String[] nani = {
				"pisolo",
				"eolo",
				"mammolo",
				"cucciolo",
				"gongolo",
				"brontolo",
				"dotto",
		};

		Arrays.sort(nani);
		
		for (String nano : nani) {
			System.out.println(nano);
		}
		
		
	}

}
