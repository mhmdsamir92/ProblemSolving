// LEETCode Problem
// https://leetcode.com/problems/two-sum/

import java.util.HashMap;

public class Main {
	
	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> differences = new HashMap<Integer, Integer>();
		for(int i=0; i<nums.length; i++) {
			if (differences.containsKey(nums[i]))
				return differences.get(nums[i]) < i ? 
						new int [] {differences.get(nums[i]), i} :
						new int [] {i, differences.get(nums[i])};
			differences.put(target - nums[i], i);
		}
		return null;
    }

	public static void main(String[] args) {
		System.out.println(twoSum(new int [] {7, 5, 4, 15, 2, 3, 11}, 16)[0]);
		System.out.println(twoSum(new int [] {7, 5, 4, 15, 2, 3, 11}, 16)[1]);
		
	}

}
