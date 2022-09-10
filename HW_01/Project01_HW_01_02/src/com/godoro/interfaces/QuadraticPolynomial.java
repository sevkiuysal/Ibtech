package com.godoro.interfaces;

public class QuadraticPolynomial implements MathFunction {

	private int a,b,c;
	
	public QuadraticPolynomial(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public double evaluate(double x) {
		
		return a*(x*x)+(b*x)+c;
	}

}
