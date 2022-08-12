import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		final String[] jellyNames = {"������","�ϸ���","���޴���","��������"};
		final int[] jellyCost = {1000, 2000, 700, 500};
		final int[] jellyStock = {5,2,4,6};
		int money = 0;
		int selectedJelly = -1;
		int isExit = 0;
		
		
		do {
			for(int index = 0; index < 4; index++) {
				System.out.printf("%d.%s(%s��)\n", index, jellyNames[index], jellyCost[index]);
			}
			do {
				Scanner scanner = new Scanner(System.in);
				System.out.println("���� ������ �ּ���.");
				money = money + scanner.nextInt();
				do {
					System.out.println("������ �������ּ���.");
					selectedJelly = scanner.nextInt();
					if(jellyStock[selectedJelly]<=0) {
						System.out.printf("%s ������ �������� �ʽ��ϴ�. �ٸ� ������ �������ּ���.\n", jellyNames[selectedJelly]);
					}
				}while(jellyStock[selectedJelly]<=0);
			if(jellyCost[selectedJelly] > money) {
				System.out.println("�ݾ��� �����մϴ�.");
			}
			}while(jellyCost[selectedJelly]>money);
			money = money - jellyCost[selectedJelly];
			jellyStock[selectedJelly] = jellyStock[selectedJelly] - 1;
			System.out.printf("%s ������ �����߽��ϴ�.\n", jellyNames[selectedJelly]);
            System.out.printf("���� �ݾ��� %d�� �Դϴ�.\n", money);
            System.out.println("�Ž��� ���� ��ȯ �����ðڽ��ϱ�?(yes�� 1/ no�� 0)");
            Scanner scanner = new Scanner(System.in); //
            isExit = scanner.nextInt();
			} while (isExit == 0);
	}
}

