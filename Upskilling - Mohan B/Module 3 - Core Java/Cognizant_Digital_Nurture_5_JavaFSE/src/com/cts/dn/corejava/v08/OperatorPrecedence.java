package com.cts.dn.corejava.v08;

public class OperatorPrecedence {
	public static void main(String[] args) {
		int res = 10 + 5 * 2;
		int res2 = 10 * 4 - 6 + 8/2;
		int res3 = 72/2+56+23;
		System.out.println(res);
		System.out.println(res2);
		System.out.println(res3);
	}
}
/* Explanation for Operator Precedence
 * In both programming languages (like C++, Java, and C#) and mathematics,
 * operations are executed based on operator precedence (highest to lowest). For
 * this expression, the order breaks down as follows:Division (/) and
 * Multiplication (*): These have equal precedence and are evaluated from left
 * to right First, \(12 \div 3 = 4\)Next, \(4 \times 2 = 8\)Addition (+): This
 * has a lower precedence than division and multiplication.Finally, \(10 + 8 =
 * 18\)
 */