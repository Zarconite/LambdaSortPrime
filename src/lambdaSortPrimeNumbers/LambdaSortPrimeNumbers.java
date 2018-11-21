package lambdaSortPrimeNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaSortPrimeNumbers {

	public static boolean getPrime(int getPrime){
		
		boolean isPrime=false;
		
		for(int i=1; i<(0.5*getPrime); i++) {
			
			if(getPrime%i!=0) {
				isPrime=true;
			}
			else {
				isPrime=false;
			}
			
		}
		System.out.print(isPrime);
		return isPrime;
		
	}
	
	public static List<Integer> listSortPrime(List<Integer> listSortPrime) {
	
	return listSortPrime.stream().filter(number -> (getPrime(number) == true)).sorted().collect(Collectors.toList());
	
}
	
	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<Integer>(5);
		intList.add(10);
		intList.add(7);
		intList.add(3);
		intList.add(9);
		intList.add(11);
		
		//listSortUnique(intList);
		
		listSortPrime(intList);
		
		System.out.print(listSortPrime(intList));
		
	}
	
	
}
