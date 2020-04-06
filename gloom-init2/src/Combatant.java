
public class Combatant {
	int initiative;
	String name;
	//and I can add lots of other things, too! But later, this is all we need for now
	public Combatant(String nam, int ini) {
		this.initiative = ini;
		this.name = nam;
	}
	public int getInitiative() {
		return this.initiative; 
	}
	public String getName() {
		return this.name;
		
	}
	public String toString() {
		return this.name;
	}
}
