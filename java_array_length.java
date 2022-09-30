import java.util.Scanner;

public class java_array_length {
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int count = scanner.nextInt();
		
		int intArray[] = new int[count];
		
		int sum=0;
		System.out.print(intArray.length + "개의 정수를 입력하세요>>");
		
		for(int i=0; i<intArray.length; i++)
			intArray[i] = scanner.nextInt(); // 키보드에서 입력받은 정수 저장
		
		for(int i=0; i<intArray.length; i++)
			sum += intArray[i]; // 배열에 저장된 정수 값을 더하기
		
		System.out.print("평균은 " + (double)sum/intArray.length);
		scanner.close();

		
	}
}
