import java.util.Scanner;

public class java_star {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���ϴ� ���� ������ �Է��ϼ��� : ");
		int floor = scanner.nextInt();
		
		for(int i=1; i<=floor; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		scanner.close();
	}

}
