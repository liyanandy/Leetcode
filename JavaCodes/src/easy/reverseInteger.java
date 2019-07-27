package easy;

public class reverseInteger {
	/*
	 * Date:2019.07.26
	 * Time: 26mins
	 * Time Complexity: O(1)
	 * 
	 * Comments: Lots of corrections, handled bad with overflow
	 */
	public int reverse(int x) {
        if (x == Integer.MIN_VALUE) return 0;
        int ret = 0;
		if (x<0) return -reverse(-x);
		while (x!=0) {
			if (ret > Integer.MAX_VALUE/10)
				return 0;
			//prevents overflow
			ret = ret * 10 + x % 10;
			x /= 10;
		}
		return ret;
	}
}
