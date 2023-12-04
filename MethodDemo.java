package project03;

public class MethodDemo {

		// TODO Auto-generated method stub

			public int addTwoNumbers(int a, int b) {
				int s = a + b;
				return s;
			}
		//call by value

			int val = 150;

			int operation(int val) {
				val = val * 10 / 100;
				return (val);
			}

		//method overloading
			public void area(int b, int h) {
				System.out.println("Area of Triangle : " + (0.5 * b * h));
			}

			public void area(int r) 
				    {
				         System.out.println("Area of Circle : "+(3.14*r*r));
				    }
			public static void main(String[] args) {

				MethodDemo b = new MethodDemo();
				int ans = b.addTwoNumbers(15, 6);
				System.out.println("Sum of two numbers is :" + ans);

				// call by value

				MethodDemo d = new MethodDemo();
				System.out.println("Before operation value of data is " + d.val);
				d.operation(100);
				System.out.println("After operation value of data is " + d.val);

				// method overloading
				MethodDemo ob = new MethodDemo();
				ob.area(10, 12);
				ob.area(5);

			}

		
	}


