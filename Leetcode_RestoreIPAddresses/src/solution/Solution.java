package solution;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	public List<String> restoreIpAddresses(String s) {
		List<String> results = new LinkedList<String>();
		if (s == null || s.length() < 4 || s.length() > 12) {
			return results;
		}

		this.search(s, new StringBuilder(), 0, 0, results);
		return results;
	}

	private void search(String s, StringBuilder curr, int index, int dot,
			List<String> results) {

		if (index == s.length()) {
			if (this.isValid(curr.toString())) {
				results.add(curr.toString());
			}
		} else if (dot > 3) {
			return;
		} else {
			curr.append(s.charAt(index));
			this.search(s, curr, index + 1, dot, results);

			if (index != s.length() - 1) {
				curr.append(".");
				this.search(s, curr, index + 1, dot + 1, results);
				curr.deleteCharAt(curr.length() - 1);
			}
			curr.deleteCharAt(curr.length() - 1);
		}
	}

	private boolean isValid(String sb) {
		String[] parts = sb.split("\\.");

		if (parts.length != 4) {
			return false;
		}

		for (String s : parts) {
			if (s.length() > 3 || s.length() == 0) {
				return false;
			}
			
			if(s.length() > 1 && s.charAt(0) == '0'){
				return false;
			}

			int val = Integer.valueOf(s);

			if (val > 255) {
				return false;
			}
		}

		return true;
	}
}
