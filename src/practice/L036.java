package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class L036 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 } };
		System.out.println(a[1][1]);

	}

	public static boolean isValidSudoku(char[][] board) {

		
		for (char[] ch : board) {
			List<Character> list = new ArrayList<>();
			for (char c : ch) {
				list.add(c);
			}
			if (!check(list))
				return false;
		}

		for (int i = 0; i < 9; i++) {
			List<Character> list = new ArrayList<>();
			for (int j = 0; j < 9; j++) {
				list.add(board[j][i]);
			}
			if (!check(list))
				return false;
		}

		for (int row = 0; row < 7; row += 3) {
			for (int col = 0; col < 7; col += 3) {
				List<Character> list = new ArrayList<>();
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						list.add(board[row + i][col + j]);
					}
				}
				if (!check(list))
					return false;
			}
		}
		return true;
	}

	public static boolean check(List<Character> list) {
		List<Character> list2 = new ArrayList<>();
		for (char i : list) {
			if (Character.isDigit(i)) list2.add(i);
		}
		Set<Character> set = new HashSet<>();
		for (char i : list2) {
			set.add(i);
		}
		if (set.size() != list2.size())
			return false;
		return true;
	}

}
