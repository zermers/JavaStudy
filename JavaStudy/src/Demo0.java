import java.util.Scanner;


public class Demo0 {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.print("������ɼ���");
		int score = input.nextInt();
		int count = 0;
		System.out.println("�ӷ�ǰ�ĳɼ���" + score);
		while (score<60) {
			score++;
			count++;
		}
		System.out.println("�ӷֺ�ĳɼ���" + score);
		System.out.println("������" + count + "�Σ�");
	}

}
