package Main;

public class Monster {
		private String name;
		private int totalLvl;
		private int attk;
		private int hpLvl;
		
		
		public Monster() {
			
		}
		
		public Monster(String name, int totalLvl, int attk, int hpLvl) {
			super();
			this.name = name;
			this.totalLvl = totalLvl;
			this.attk = attk;
			this.hpLvl = hpLvl;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getTotalLvl() {
			return totalLvl;
		}
		public void setTotalLvl(int totalLvl) {
			this.totalLvl = totalLvl;
		}
		public int getAttk() {
			return attk;
		}
		public void setAttk(int attk) {
			this.attk = attk;
		}
		public int getHpLvl() {
			return hpLvl;
		}
		public void setHpLvl(int hpLvl) {
			this.hpLvl = hpLvl;
		}

		@Override
		public String toString() {
			return "Monster [name=" + name + ", "
					+ "totalLvl=" + totalLvl + ", "
							+ "attk=" + attk + ", "
									+ "hpLvl=" + hpLvl+ "]";
		}
		
		
		
		
		
		
		
		
		
		
		
		
}
