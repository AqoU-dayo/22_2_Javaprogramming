import java.util.Scanner;

public class week4_7_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� Ŀ�� �帱���? ");
		String order = scanner.next();
		
		int price=0;
		
		switch (order) {
		case "����������":
		case "īǪġ��":
		case "ī���":
			price = 3500;
			break;
		case "�Ƹ޸�ī��" :
			price = 2000;
			break;
		default:
			System.out.println("�޴��� �����ϴ�!");
		}
		
		if(price != 0)
		System.out.print(order + "�� " + price + "���Դϴ�");
		scanner.close();
	}

}