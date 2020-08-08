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
		inputdata(player, "플레이어");
		inputdata(monster, "몬스터");
		combat(player, "플레이어", monster, "몬스터");
		reward(player, "플레이어", monster, "몬스터");
	
	}
public static void println(Object c) {
	System.out.println(c);
}
public static void inputdata(Char object, String name) {
	Scanner sc = new Scanner(System.in);
	println(name + " 의 hp : ");
	object.hp = sc.nextDouble();
	println(name + " 의 gold : ");
	object.gold = sc.nextDouble();
	println(name + " 의 atk : ");
	object.atk = sc.nextDouble();
	println(name + " 의 exp : ");
	object.exp = sc.nextDouble();
}
public static boolean combat(Char object1, String name1, Char object2, String name2) {
	println(name1 + "가 " + name2 + "를 공격했다!");
	Random random = new Random();
	if(random.nextInt(5) == 1) {
	object2.hp = object2.hp - object1.atk * 2.5;
	println("치명타!");
	}
	else {object2.hp = object2.hp - object1.atk;}
	if(object1.hp <= 0.0 || object2.hp <= 0.0) {
		return true;
	}
	else {
		println(name2 + "의 체력 : " + object2.hp);
		combat(object2, name2, object1, name1);
		return false;
	}
}
public static void reward(Char object1, String name1, Char object2, String name2) {
	if(object1.hp<=0) {
		object2.exp = object1.exp + object2.exp;
		object2.gold = object1.gold + object2.gold;
		object1.exp = 0.0;
		object1.gold = 0.0;
		println(name1 + "가 쓰러졌다!\n" + name2 + "의 경험치 : " + object2.exp + "\n" + name2 + "의 잔고 : " + object2.gold);
	} 
	else {
		object1.exp = object1.exp + object2.exp;
		object1.gold = object1.gold + object2.gold;
		object2.exp = 0.0;
		object2.gold = 0.0;
		println(name2 + "가 쓰러졌다!\n" + name1 + "의 경험치 : " + object1.exp + "\n" + name1 + "의 잔고 : " + object1.gold);
	}
}

}
