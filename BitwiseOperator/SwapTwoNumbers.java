package bitwise1;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		int a=5,b=6;
		
		a=a^b;
		/*a=5,b=6;                                          a ^ b 
		 * binary representation of a,b                     0   0 =0
		 * a->0 1 0 1                                       1   0 =1
		 * b->0 1 1 0                                       0   1 =1
		 *                                                  1   1 =0
		 *    0 0 1 1->3
		 *   now a=3; 
		 */
		b=a^b;
		/*
		 * binary representation of a,b
		 * 
		 * a->0 0 1 1
		 * b->0 1 1 0
		 * 
		 *    0 1 0 1->5;
		 *    now b=5;
		 */
		a=a^b;
		/*
		 * binary representation of a,b
		 * 
		 * a->0 0 1 1
		 * b->0 1 0 1
		 * 
		 *    0 1 1 0->6
		 *    now a=6
		 *    numbers are swap
		 */
		System.out.println("a= "+a+" b= "+b);
	

	}

}
