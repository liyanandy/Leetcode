package easy;

public class DefangingIPAddress {
	/*
	 * Time: 10mins
	 * Date: 2019-07-25
	 * Time Complexity: O(N), where N is the length of address
	 */
	public String defangIPaddr(String address) {
		if (address == null || address.length() == 0)
			return address;
		final int length = address.length();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < length; i++) {
			char c = address.charAt(i);
			if (c == '.')
				sb.append("[.]");
			else
				sb.append(c);
		}
		return sb.toString();
	}
}
