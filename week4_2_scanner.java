import java.util.Scanner;

public class week4_2_scanner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���. : ");
		Scanner scanner = new Scanner(System.in);
				
		String name = scanner.next();
		System.out.println("�̸��� "+ name + ",");
		
		String city = scanner.next();
		System.out.println("���ô� "+city+",");
		
		int age = scanner.nextInt();
		System.out.println("���̴� "+age+"��, ");
		
		double weight = scanner.nextDouble();
		System.out.println("ü���� "+weight+"kg, ");
		
		boolean single = scanner.nextBoolean();
		System.out.println("���� ���δ� "+single+"�Դϴ�.");
		
		scanner.close(); 
	}

}
