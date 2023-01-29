package week04class;

public class Week4Project2 {

	public static void main(String[] args) {
		//1A
				int age [] = {3, 9, 23, 64, 2, 8, 28, 93, 107};
				int sum;
				
				sum = age[0] - age[age.length - 1];
				
				int total = 0;
				
				for(int i = 0; i < age.length; i++) {
					
					total += age[i];
				
				}
				// this is to test 1A
				System.out.println(sum);
				
				double average = total / age.length;
				System.out.println(average);
			
		
		
		String names [] = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		//2A
		int nameSum = 0;
		
		//5
		int nameLengthSum = 0;
		int [] nameLength = new int[names.length];
		//2B
		String longString = "";	
	
		for(int i = 0; i < names.length; i++) {
			//5
			nameLength[i] += names[i].length();
			//2
			nameSum += names[i].length();
			//2B
			longString += names[i] + " ";
			//5
			nameLengthSum += nameLength[i];
			
			
			
		}
		//2A
		double nameAverage = nameSum / names.length;
		
		//2A
		System.out.println(nameAverage);
		//2B
		System.out.println(longString);
		
		//3
		System.out.println(names[names.length -1]);
		//4
		System.out.println(names[0]);
		//6
		System.out.println(nameLengthSum);
		//7
		System.out.println(wordTimesThree("hello", 3));
		//8
		System.out.println(fullName("Tony", "Stark"));
		
		//9
		int[] allNum = new int [5];
		allNum[0] = 87;
		allNum[1] = 7;
		allNum[2] = 17;
		allNum[3] = 6;
		
		
		System.out.println(allNumSum(allNum));
		
		//10
		double decimals[] = {1.0, 3.5, 4.6, 7.6, 9.9, 7.56};
		System.out.println(sumOfDouble(decimals));
		
		//11
		double decimals1[] = {1.0, 3.5, 4.6, 7.6, 9.9, 7.56};
		double decimals2[] = {1.3, 1.5, 3.6, 3.6, 7.9, 3.56};
		System.out.println(avgOfTwoArrays(decimals1, decimals2));
		
		//12
		System.out.println(willBuyDrink(true, 11.5));
		
		//13
		System.out.println(willEatTacos(false));
	}


//7
public static String wordTimesThree(String word, int times) {
	
	String longString = "";
	for(int i =0; i < times; i++) {
		longString += word;
		
	}
return longString;
}
//8
public static String  fullName(String firstName, String lastName) {
	return firstName + " " + lastName;
}

//9
public static boolean allNumSum(int[] numbers) {
	int sum = 0;
	
	for(int number : numbers) {
		sum += number;
	}
	if(sum > 100) {
		return true;
	}
	else return false;
}
	
//10
public static double sumOfDouble(double[]decimal) {
	double sum = 0;
	
	for(int i = 0; i < decimal.length; i++) {
		sum += decimal[i];
	}
	return sum/decimal.length;
}

//11
public static boolean avgOfTwoArrays(double[]decima1, double[]decimal2) {
	double sum1 = 0;
	double sum2 = 0;
	
	for(int i = 0; i < decima1.length; i++) {
		sum1 += decima1[i];
	}
	
	for(int i = 0; i < decimal2.length; i++) {
		sum2 += decimal2[i];
	}
	
	if(sum1 / decima1.length > sum2 / decimal2.length) {
		return true;
	}
	else return false;
}

//12
public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	
	if(isHotOutside == true && moneyInPocket >= 10.50) {
		return true;
	}
	else return false;
}

//13
public static String willEatTacos(boolean stillHungry) {
if(stillHungry == true) {
	return  "Lets eat more Tacos";
}
else return  "No thanks to full";

}

}


