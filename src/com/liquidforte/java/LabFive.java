package com.liquidforte.java;

public class LabFive {
	public static void main(String[] args) {
		drawTriangle('*', ' ', true);
		drawTriangle('*', ' ', false);
		drawTriangle(' ', '*', true);
		drawTriangle(' ', '*', false);
	}

	public static void drawTriangle(char a, char b, boolean ltr) {
		for (int line = 0; line < 10; line++) {
			for (int c = 0; c < 10; c++) {
				if (ltr) {
					if (c <= line) {
						System.out.print(a);
					} else {
						System.out.print(b);
					}
				} else {
					if (line + c < 10) {
						System.out.print(a);
					} else {
						System.out.print(b);
					}
				}
			}
			System.out.println();
		}

	}
}
