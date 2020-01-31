
public class Solution {

	public int reverse(int x) {
		long result = 0;
		int factor = 10;
		while (x != 0) {
			result = result * factor;
			result = result + (x % 10);
			if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
				return 0;
			x = x / 10;
		}
		return (int)result;
	}

}
