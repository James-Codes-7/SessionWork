package control;

public class Chess {

	public static void main(String[] args) {
		int t=1;
		long number =1;
		while(t<64)
		{
			number+=number;
			t++;
		}
		System.out.println(number);


	}

}
