import java.util.Scanner;

public class java_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수 5개를 입력하세요.");
		int sum = 0;
		for(int i=0; i<5; i++)
		{
			int n = scanner.nextInt();
			
			if(n<=0)
			{
				continue;
			}
			else
			{
				sum += n;
			}
		}
		System.out.println("양수의 합은 " + sum);
		
		scanner.close();
	}

}
