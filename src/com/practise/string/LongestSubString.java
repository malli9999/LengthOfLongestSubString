package com.practise.string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

	int i =0 , j=0, max =0;
	//Will implent the Sliding window Alogorithm
public int sudString(String s) {
	// Given String pwwkew => wke (3)
	/*
	 * p => p
	 * pw => pw
	 * pww => ww remove  p
	 * ww(from above) => remove starting w
	 * w => w
	 * wk => wk
	 * wke => wke MAX(3)
	 * wkew=> kew remove staring w
	 * kew => kew MAX()3
	 *return 3
	 */
	Set<Character> set = new HashSet<>();
	while(i<s.length()) {
		char c = s.charAt(i);
		while(set.contains(c)) {
			set.remove(s.charAt(j));
			++j;
		}
		set.add(c);
		max = Math.max(max, i -j+1);
		++i;
	}
		System.out.println(max);
	return max;
	
}
	public static void main(String[] args) {
LongestSubString obj = new LongestSubString();
obj.sudString("pwkew");
	}

}
