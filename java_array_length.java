import java.util.Scanner;

public class java_array_length {
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�迭�� ũ�⸦ �Է��ϼ��� : ");
		int count = scanner.nextInt();
		
		int intArray[] = new int[count];
		
		int sum=0;
		System.out.print(intArray.length + "���� ������ �Է��ϼ���>>");
		
		for(int i=0; i<intArray.length; i++)
			intArray[i] = scanner.nextInt(); // Ű���忡�� �Է¹��� ���� ����
		
		for(int i=0; i<intArray.length; i++)
			sum += intArray[i]; // �迭�� ����� ���� ���� ���ϱ�
		
		System.out.print("����� " + (double)sum/intArray.length);
		scanner.close();

		
	}
}
