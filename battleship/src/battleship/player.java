package battleship;
import java.util.*;
public class player {
	public static int position_1_answer;
	public static int position_2_answer;
	public static int[] ship_ans = {position_1_answer, position_2_answer};
	public static boolean result; 
	public static int try_count = 0;
	public static int [] attempt_1 = new int[2];
	public static int count = 0;

	
	public static void main(String[] args) {
	
		Computer_base computer=new Computer_base();
		int [][][] standardship = computer.ships;
		while (count < 2) {
			combat();
			if (ship_ans[0] == standardship[0].length) {
				System.out.println("첫 번째 보트가 파괴되었습니다.");
				ship_ans[0]++;
				count++;
			}
			else if (ship_ans[1] == standardship[1].length) {
				System.out.println("두 번째 보트가 파괴되었습니다.");
				ship_ans[1]++;
				count++;
			}
		}
		System.out.println("끝");
		result = true;
	}
	
	
	
public static void combat() { 
	Scanner sc=new Scanner(System.in);
	Computer_base computer1 = new Computer_base();
	try_count++;
	int n = try_count;
	System.out.println(n + "번째 피격위치를 입력하세요.");
	int size = attempt_1.length;
	for (int x = 0; x < size; x++) {
		if (x == 0) {
			System.out.print("x 좌표를 입력하세요. : ");
			attempt_1[0] = sc.nextInt();
		}
		if (x == 1) {
			System.out.print("y 좌표를 입력하세요. : ");
			attempt_1[1] = sc.nextInt();
		}
	}
	int [][][] ship = computer1.ships;	
	checkship : for (int i=0; i<ship.length; i++) {
		for (int t=0; t<ship[i].length; t++){
			if (ship[i][t][0] == attempt_1[0] && ship[i][t][1] == attempt_1[1]) {
					System.out.println("피격 성공");
					ship_ans[i] ++;
					break checkship;				
			}	
		}				
		if (i == ship.length-1) {
			System.out.println("피격 실패");
		}	
		}
	}
}