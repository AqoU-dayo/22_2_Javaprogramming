import java.util.Scanner;

public class java_array {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("입력하실 수의 갯수를 입력하세요 : ");
		int count = scanner.nextInt();	
		int intArray[] = new int[5];
		int max=0;

		System.out.println("양수 "+count+"개를 입력하세요.");
		for(int i=0; i<count; i++) 
		{
			intArray[i] = scanner.nextInt();
			System.out.println((i+1)+"번째 값은"+intArray[i]);
			if(intArray[i] >max) 
				max = intArray[i]; 
		}
		
	
		
		System.out.print("가장 큰 수는 " + max + "입니다.");
		scanner.close();
	}

}
