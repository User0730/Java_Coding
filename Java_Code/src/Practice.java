import java.util.*;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Double hp = 0.0;
		Double gold = 0.0;
		Double atk = 0.0;
		Double exp = 0.0;
		Char player = new Char(hp, gold, atk, exp);
		Char monster = new Char(hp, gold, atk, exp);
		inputdata(player, "�÷��̾�");
		inputdata(monster, "����");
		
		
		
		
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
public static void combat(Char object1, String name1, Char object2, String name2) {
	println(name1 + "�� " + name2 + "�� �����ߴ�!");
	Random random = new Random();
	if(random.nextInt(5) == 1) {
	object2.hp = object2.hp - object1.atk * 2.5;
	println("ġ��Ÿ!");
	}
	else {object2.hp = object2.hp - object1.atk;}
	if(object1.hp <= 0.0 || object2.hp <= 0.0) {
		
	}
}
}
