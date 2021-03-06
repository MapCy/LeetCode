package com.leetcode.methold;

import java.util.HashMap;

public class Solution {

	/*
	 * ������
	 */
	 public int[] twoSum(int[] nums, int target) {
		    int i,j;
		    int[] solution = {0,0};
	        for (i = 0; i < nums.length; i++) {
	        	for (j = i + 1; j < nums.length; j++) {
					if (nums[i] + nums[j] == target) {
						solution[0] = i;
						solution[1] = j;
						return solution;
					}
				}
			}
	        return solution;
	    }
	 /*
	  * ��ϣ����
	  */
	 public int[] twoSumHash(int[] nums, int target) {
		    int i,j;
		    HashMap<Integer , Integer> map = new HashMap<>();
	        for (i = 0; i < nums.length; i++) {
	        	map.put(nums[i],i);
			}
	        for(j = 0; j < nums.length; j++){
	        	int another = target - nums[j];
	        	if(map.containsKey(another) && map.get(another) != j){
	        		return new int[]{j,map.get(another)};
	        	}
	        }
	        throw new IllegalArgumentException("error");
	    }
}
