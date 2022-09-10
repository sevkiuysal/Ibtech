package com.godoro.interfaces;

public class Test {
	
	public static void main(String[] args) {
		
		IdentityFunction f1=new IdentityFunction();
		FunctionDrawer drawer=new FunctionDrawer();
			
		drawer.draw(f1,10,15,100);
		System.out.println();
		
		QuadraticPolynomial f2=new QuadraticPolynomial(1,2,1); //y=a*x^2+b*x+c
		System.out.println("Quadratic Polynomial:");
		drawer.draw(f2, -5, 5, 100);
		
	    SinusoidalPolynomial f3=new SinusoidalPolynomial(1,Math.PI,Math.PI/3);    //y=m*sin(w*x-p)
		System.out.println("Sinusoidal Polynomial:");
		drawer.draw(f3, -Math.PI, Math.PI, 100);
		
		
	}

}
