package ch8p01;

import java.io.*;
import java.util.*;

public class Test {

	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String s;
		s = cin.next();
		get_date();
		random(20, 50);
	}

	public static void func(String str) {
		int n = str.length();
		char[] s = str.toCharArray();
		StringBuffer buff = new StringBuffer();
		System.out.println(buff);
		for (int i = n - 1; i >= 0; --i) {
			if (s[i] >= 'a' && s[i] <= 'z') {
				buff.append(String.valueOf(s[i]).toUpperCase());
			} else {
				buff.append(String.valueOf(s[i]).toLowerCase());
			}
		}
		System.out.println(buff.toString());
	}

	public static void get_date() {
		Calendar date = Calendar.getInstance();
		date.add(date.DATE, 100);
		System.out.println(date.get(date.YEAR) + " " + date.get(date.MONTH)
				+ " " + date.get(date.DATE));
	}

	public static void random(int n, int m) {
		int num = 5;
		while ((num--) > 0) {
			System.out.println(new Random().nextInt(m - n + 1) + n);
		}

	}
}
