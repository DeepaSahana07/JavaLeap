package day_one;

//variable arguments

public class add {
	
	public static void main(String args[]) {
		addno(1,2,3,4,5,6,7,8,8,9);
		
	}
	
	public static void addno(int...numbers) {
		int sum=0;
		for(int n:numbers) {
			sum+=n;
		}
		System.out.println(sum);
	}
}
