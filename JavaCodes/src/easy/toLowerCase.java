package easy;

public class toLowerCase {
	/*
	 * Date: 2019.07.26
	 * Time: 5mins
	 * Time Complexity: O(N), where N is length of str
	 */
	public String toLower(String str) {
        if (str == null || str.length() == 0)
            return "";
        StringBuilder sb = new StringBuilder();
        final int length = str.length();
        for(int i = 0; i<length; i++){
            final char c = str.charAt(i);
            if (Character.isUpperCase(c))
            	sb.append(Character.toLowerCase(c));
            else
            	sb.append(c);
        }
        return sb.toString();
    }
}
