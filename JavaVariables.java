package main;

public class JavaVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// #1
			int x = 5;
			int y = 10;
			System.out.println("#1");
			System.out.println(x + y);
			
			// #2
			double a = 4000.00;
			double b = 6000.00;
			System.out.println("#2");
			System.out.println(a + b);
			
			// #3
			int c = 1;
			double d = 1.3;
			System.out.println("#3");
			System.out.println(c + d);
			
			// #4
			int e = 2;
			int f = 4;
			System.out.println("#4");
			System.out.println(f / e);
			
			// #5
			double g = 2.5;
			double h = 5.5;
			System.out.println("#5");
			System.out.println(h / g);
			double result = h/g;
			System.out.println(result);
			
			// #6
			int x1 = 5;
			int y1 = 6;
			int q = y1/x1;
			System.out.println("#6");
			System.out.println(q);
			
			// #7
			final int duck = 5;
			int chicken = 10;
			System.out.println("#7");
			System.out.println(chicken - duck);
			
			// #8
			double coffee = 4.50;
			double soda = 2.00;
			double pastry = 1.50;
			double subtotal = coffee + soda + pastry;
			final double totalSale = (coffee * 3)+ (soda * 4 ) + (pastry * 2);
			
//			System.out.println(subtotal);
			
			final double SALES_TAX = 2.50;
			final double finalSale = totalSale + SALES_TAX;
			
			System.out.println(Math.round(finalSale));
			
			
			
			
	}

}
