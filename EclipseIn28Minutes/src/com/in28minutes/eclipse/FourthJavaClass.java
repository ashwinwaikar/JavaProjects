package com.in28minutes.eclipse;

public class FourthJavaClass {
	static class ASW {
		// Constructor
		public ASW(int var1, int var2) {
			super();
			this.var1 = var1;
			this.var2 = var2;
		}

		private int var1;
		private int var2;

		//overriding parent class method
		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return super.hashCode();
		}

		// toString() method
		@Override
		public String toString() {
			return "ASW [var1=" + var1 + ", var2=" + var2 + "]";
		}

		// getters and setters
		public int getVar1() {
			return var1;
		}

		public void setVar1(int var1) {
			this.var1 = var1;
		}

		public int getVar2() {
			return var2;
		}

		public void setVar2(int var2) {
			this.var2 = var2;
		}
	}

	public static void main(String[] args) {
		ASW a = new ASW(5,10);
		String k = a.toString();
		System.out.println(k);
		System.out.println(a.hashCode());
	}
}

/*
 * atrl+shift+S- Select variables then apply this shortcut we will get many
 * options eg 1) we can apply getters and setters automatically for the selected
 * variables in 1 go 2)can apply toString() method directly 3)Can create
 * constructor in 1 go for a particular class(with arguments or without)
 * 4) Can override any method of parent class directly
 */