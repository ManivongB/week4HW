package week04class;

public class Week4Assignment {

	public static void main(String[] args) {
//1A
		int age [] = {3, 9, 23, 64, 2, 8, 28, 93};
		int sum;
		
		sum = age[0] - age[age.length - 1];
		
		int total = 0;
		
		for(int i = 0; i < age.length; i++) {
			
			total += age[i];
		
		}
		// this is to test 1A
		//System.out.println(sum);
		
		double average = total / age.length;
		System.out.println(average);
	}
	

		
	

}
	

