import java.util.Scanner;

public class java_array {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�Է��Ͻ� ���� ������ �Է��ϼ��� : ");
		int count = scanner.nextInt();	
		int intArray[] = new int[5];
		int max=0;

		System.out.println("��� "+count+"���� �Է��ϼ���.");
		for(int i=0; i<count; i++) 
		{
			intArray[i] = scanner.nextInt();
			System.out.println((i+1)+"��° ����"+intArray[i]);
			if(intArray[i] >max) 
				max = intArray[i]; 
		}
		
	
		
		System.out.print("���� ū ���� " + max + "�Դϴ�.");
		scanner.close();
	}

}
