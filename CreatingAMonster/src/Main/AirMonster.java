package Main;

public class AirMonster extends Monster{
	private String monsterType;
	private String specialAttk;
	
	
	public AirMonster() {
		super();
	}
	
	
	public AirMonster(String name, int totalLvl, int attk, int hpLvl, String monsterType, String specialAttk) {
		super(name, totalLvl, attk, hpLvl);
		this.monsterType = monsterType;
		this.specialAttk = specialAttk;
	}


	public String getMonsterType() {
		return monsterType;
	}


	public void setMonsterType(String monsterType) {
		this.monsterType = monsterType;
	}


	public String getSpecialAttk() {
		int max = 10;
        int min = 1;
        int range = max - min + 1;
		return getName() + " Hit " + (Math.round(Math.random() * range) + min) + " Damage with " + specialAttk;
	}


	public void setSpecialAttk(String specialAttk) {
		this.specialAttk = specialAttk;
	}


	@Override
	public String toString() {
		return "Monster " + getName() + ". It's type is " + monsterType + ". It's special attack is " + specialAttk;
	}
	
	
	
	
	
}
