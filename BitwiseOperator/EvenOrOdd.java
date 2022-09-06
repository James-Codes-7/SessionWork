package bitwise1;

public class EvenOrOdd {
    static java.util.Scanner scan =new java.util.Scanner(System.in);
	public static void main(String[] args) {
	    System.out.println("Enter the number");
	    
		int a=scan.nextInt();
		if((a&1)==1)
		/*if a=6;
		 * a&1 binary representation
		 *                                     a & b
		 * a->0 1 1 0                          0   0 =0
		 * 1->0 0 0 1                          1   0 =0
		 *                                     0   1 =0
		 *    0 0 0 0->0                       1   1 =1
		 * 
		 * if(0==1) false
		 * it print even
		 */
		
			System.out.println("Odd");
		
		else
			/*if a=5;
			 * a&1 binary representation
			 *                                     a & b
			 * a->0 1 0 1                          0   0 =0
			 * 1->0 0 0 1                          1   0 =0
			 *                                     0   1 =0
			 *    0 0 0 1->1                       1   1 =1
			 * 
			 * if(1==1) true
			 * it print odd
			 */
			System.out.println("Even");

		//we use XOR operator
		System.out.println("Enter the number");
		int x=scan.nextInt();
		
		if((x^1)==(x+1))
			/*if x=6;
			 * x&1 binary representation
			 *                                     a ^ b
			 * x->0 1 1 0                          0   0 =0
			 * 1->0 0 0 1                          1   0 =1
			 *                                     0   1 =1
			 *    0 1 1 1->7                       1   1 =0
			 * 
			 * if((x^1)==(x+1))
			 *    7==7 true
			 * it print even
			 */
			System.out.println("Even number");
		else
			/*if x=5;
			 * x&1 binary representation
			 *                                     a ^ b
			 * x->0 1 0 1                          0   0 =0
			 * 1->0 0 0 1                          1   0 =1
			 *                                     0   1 =1
			 *    0 1 0 0->4                       1   1 =0
			 * 
			 * if((x^1)==(x+1))
			 *    4==6 false
			 * it print odd
			 */
			System.out.println("Odd number");
	}

}
