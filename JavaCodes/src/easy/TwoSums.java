package easy;

import java.util.HashMap;

public class TwoSums {
	/*
	 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
	 * Inspired by: https://leetcode.com/problems/two-sum/discuss/654/Java-Simple-solution
	 * Date: 2019.07.26
	 * Time: 10mins
	 * 
	 * using hashmap to create integer pairs would increase the speed
	 */
	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		// create a hashmap, where the key is the values, and the values are indices
		HashMap<Integer, Integer> dict = new HashMap<Integer, Integer>();
		
		for (int i= 0; i<nums.length; i++) {
			if (dict.containsKey(target - nums[i])) {
				result[0] = dict.get(target - nums[i]);
				result[1] = i; // use i instead of dict.get(nums[i]) because nums[i] is certainly one of the answers
				break;
			}
			dict.put(nums[i], i);
		}
		return result;
		
    }
}
