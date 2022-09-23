import java.util.Scanner;

public class week4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		// 알고싶은 초 단위(정수)입력
		System.out.print("정수를 입력하세요: ");
		int time = scanner.nextInt(); // 정수 입력
		
		//(입력받은 정수를 초 분 시간 단위로 나누기 위한 식)
		int second = time % 60; // 60으로 나눈 나머지는 초
		int minute = (time / 60) % 60; // 60으로 나눈 몫을 다시 60으로 나눈 나머지는 분
		int hour = (time / 60) / 60; // 60으로 나눈 몫을 다시 60으로 나눈 몫은 시간
		
		//입력 받은 수를 시간 분 초 순서대로 보여줌
		System.out.print(time + "초는 ");
		System.out.print(hour + "시간, ");
		System.out.print(minute + "분, ");
		System.out.println(second + "초입니다.");
		
		scanner.close();

	}

}
