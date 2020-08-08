
public class object {
	Double hp;
	Double gold;
}
class Char extends object{
	Double atk, exp;
	public Char(Double hp, Double gold, Double atk, Double exp){
		this.hp = hp;
		this.gold = gold;
		this.atk = atk;
		this.exp = exp;
	}
	
}

