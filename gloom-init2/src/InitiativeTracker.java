
import java.util.*;

public class InitiativeTracker implements GloomInitiativeTracker {
	
	//Linked list of Combatant classes
	private LinkedList<Combatant> combatList;
	//Linked bc more adding & removing than getting from an index
	//Collections.sort supposedly works on it
	//Allows for more complicated Combatant classes in the future
	
	
	public InitiativeTracker(){
		this.combatList = new LinkedList<Combatant>();
		Combatant ender = new Combatant("End of Round", 100);
		combatList.add(ender);
		System.out.println(this.combatList);
	}

	
	public void addCombatant(String nam, int ini) {
		//if Scenario contains Combatant with name==nam, that.initiative = ini, combatList.add(that combatant)
		//else
		System.out.println(nam);
		Combatant comb = new Combatant(nam, ini);
		System.out.println(comb);
		combatList.add(comb);
		System.out.println(combatList);
		if (combatList.size() > 1) {
			Collections.sort(combatList, Collections.reverseOrder(new sortByInitiative()));
			
		}
	}

	public Combatant getNextCombatant() {
		Combatant nc = combatList.getFirst(); //which combatant is it
		String n = nc.getName();
		System.out.println(n); //print the name
		combatList.removeFirst(); //remove this combatant from the list
		return nc; //return the object- this is to enable more complicated things later
		
	}
	
	public String toString() {
		return combatList.toString();
	}
	
	
}
