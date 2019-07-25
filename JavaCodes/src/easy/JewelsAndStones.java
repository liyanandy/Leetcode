package easy;

public class JewelsAndStones {
	/*
	 * Time: 5mins
	 * Date: 2019-07-25
	 * TimeComplexity: O(N), where N is length of S
	 */
	public int numJewelsInStones(String J, String S) {
		if (J == null || S == null || J.length() == 0 || S.length() == 0)
			return 0;
		final int length = S.length();
		int count = 0;
		for (int i = 0; i < length; i++) {
			final char c = S.charAt(i);
			if (J.indexOf(c) != -1)
				count += 1;
		}
		return count;
	}
}
