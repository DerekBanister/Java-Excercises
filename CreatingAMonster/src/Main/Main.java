package Main;

public class Main {

	public static void main(String[] args) {
		
		
		BoogeyMonster underTheBed = 
				new BoogeyMonster("Boogey", 5, 10, 40, "Ground", "TakeSoul");

		GrassMonster grassyBoi = 
				new GrassMonster("Bulba", 10, 15, 50, "Grass", "LawnMow");
		
		AirMonster aang = new AirMonster("Aang", 20, 25, 80, "Air", "CallAppa");
		
		
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println(underTheBed);
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println(grassyBoi);
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println(aang);
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println(underTheBed.getSpecialAttk());
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println(grassyBoi.getSpecialAttk());
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println(aang.getSpecialAttk());
		System.out.println("-----------------------------------------------------------------------------");
	}

}
