package com.tnisf.oops;



	class AnimalDemo{
		
		void sound() {
			System.out.println("Animal can make a sound");
		}
	}

	class Cat extends AnimalDemo{
		
		void sound() {
			System.out.println("Cat makes a sound Meowwww!!!");
		}
	}
	class MathOp{
		double add(double a,double b) {
			return a+b;
		}

	}
	public class PolymorphismDemo {

		public static void main(String[] args) {
			
			
			MathOp mo = new MathOp();
			System.out.println(mo.add(20.00, 40.00));
			System.out.println(mo.add(20, 50));
			
			
//			AnimalDemo ad = new AnimalDemo();
//			ad.sound();
			Cat c = new Cat();
			c.sound();
			
			
			

		}

	}



