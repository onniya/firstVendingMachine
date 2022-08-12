import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		final String[] jellyNames = {"마이쮸","하리보","새콤달콤","지구젤리"};
		final int[] jellyCost = {1000, 2000, 700, 500};
		final int[] jellyStock = {5,2,4,6};
		int money = 0;
		int selectedJelly = -1;
		int isExit = 0;
		
		
		do {
			for(int index = 0; index < 4; index++) {
				System.out.printf("%d.%s(%s원)\n", index, jellyNames[index], jellyCost[index]);
			}
			do {
				Scanner scanner = new Scanner(System.in);
				System.out.println("돈을 투입해 주세요.");
				money = money + scanner.nextInt();
				do {
					System.out.println("젤리를 선택해주세요.");
					selectedJelly = scanner.nextInt();
					if(jellyStock[selectedJelly]<=0) {
						System.out.printf("%s 젤리가 존재하지 않습니다. 다른 젤리를 선택해주세요.\n", jellyNames[selectedJelly]);
					}
				}while(jellyStock[selectedJelly]<=0);
			if(jellyCost[selectedJelly] > money) {
				System.out.println("금액이 부족합니다.");
			}
			}while(jellyCost[selectedJelly]>money);
			money = money - jellyCost[selectedJelly];
			jellyStock[selectedJelly] = jellyStock[selectedJelly] - 1;
			System.out.printf("%s 젤리를 구매했습니다.\n", jellyNames[selectedJelly]);
            System.out.printf("남은 금액은 %d원 입니다.\n", money);
            System.out.println("거스름 돈을 반환 받으시겠습니까?(yes는 1/ no는 0)");
            Scanner scanner = new Scanner(System.in); //
            isExit = scanner.nextInt();
			} while (isExit == 0);
	}
}

