import java.util.*;
public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("x, y 값을 입력하세요.");
		System.out.print("x = ");
		int x = sc.nextInt();
		System.out.print("y = ");
		int y = sc.nextInt();
		int sum = x+y;
		int sub = x-y;
		System.out.println("x + y = " + sum + "\n" + "x - y = " + sub);
		
		ArrayList<Integer> PrimeNum = new ArrayList<>();
		ArrayList<Integer> NotPrimeNum = new ArrayList<>();
		for(int i = 2; i<=500; i++) {
			if(NotPrimeNum.contains(i)){continue;}
			else {
				PrimeNum.add(i);
				for(int t = i+1; t<= 500; t++) {
					if(t%i==0) {NotPrimeNum.add(t);}
					else {continue;}
				}
				
			}
			
		}
		System.out.println("1부터 500 중 소수는 " + PrimeNum + "입니다.");
		
	}
}
