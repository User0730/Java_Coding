import java.util.*;

public class Practice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Double hp = 0.0;
		Double gold = 0.0;
		Double atk = 0.0;
		Double exp = 0.0;
		boolean result1 = false;
		Char player = new Char(hp, gold, atk, exp);
		Char monster = new Char(hp, gold, atk, exp);
		inputdata(player, "�÷��̾�");
		inputdata(monster, "����");
		combat(player, "�÷��̾�", monster, "����", result1);
		println(result1);
		
		
	}
public static void println(Object c) {
	System.out.println(c);
}
public static void inputdata(Char object, String name) {
	Scanner sc = new Scanner(System.in);
	println(name + " �� hp : ");
	object.hp = sc.nextDouble();
	println(name + " �� gold : ");
	object.gold = sc.nextDouble();
	println(name + " �� atk : ");
	object.atk = sc.nextDouble();
	println(name + " �� exp : ");
	object.exp = sc.nextDouble();
}
public static boolean combat(Char object1, String name1, Char object2, String name2, boolean combat_result) {
	println(name1 + "�� " + name2 + "�� �����ߴ�!");
	Random random = new Random();
	if(random.nextInt(5) == 1) {
	object2.hp = object2.hp - object1.atk * 2.5;
	println("ġ��Ÿ!");
	}
	else {object2.hp = object2.hp - object1.atk;}
	if(object1.hp <= 0.0 || object2.hp <= 0.0) {
		combat_result = true;
		return true;
	}
	else {
		println(name2 + "�� ü�� : " + object2.hp);
		combat(object2, name2, object1, name1, combat_result);
		return false;
	}
}


}
