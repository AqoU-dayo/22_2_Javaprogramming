import java.util.Scanner;

public class week4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		// �˰���� �� ����(����)�Է�
		System.out.print("������ �Է��ϼ���: ");
		int time = scanner.nextInt(); // ���� �Է�
		
		//(�Է¹��� ������ �� �� �ð� ������ ������ ���� ��)
		int second = time % 60; // 60���� ���� �������� ��
		int minute = (time / 60) % 60; // 60���� ���� ���� �ٽ� 60���� ���� �������� ��
		int hour = (time / 60) / 60; // 60���� ���� ���� �ٽ� 60���� ���� ���� �ð�
		
		//�Է� ���� ���� �ð� �� �� ������� ������
		System.out.print(time + "�ʴ� ");
		System.out.print(hour + "�ð�, ");
		System.out.print(minute + "��, ");
		System.out.println(second + "���Դϴ�.");
		
		scanner.close();

	}

}
