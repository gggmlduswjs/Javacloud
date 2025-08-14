package hello;

public class 등차수열의합 {

	public static void main(String[] args) {
		//변수
		int Sum=0; int k=0; int j=0;
		final int MAX=100;
		
		for (int i=0;i<=MAX;i++) {
			
				k=i+1;
				j=j+k;
				Sum=Sum+j;
			
			
		}
		
		System.out.println(Sum);
	}

}
