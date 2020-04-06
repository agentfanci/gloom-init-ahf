
import java.util.*;

public class InitiativeTracker implements GloomInitiativeTracker {
	
	public LinkedList<Combatant> combatList;
	
	public InitiativeTracker(){
		this.combatList = new LinkedList<Combatant>();
		System.out.println("The thing exists, probably");
	}

	
	public void addCombatant(String nam, int ini) {
		//if Scenario contains Combatant with name==nam, that.initiative = ini, combatList.add(that combatant)
		//else
		System.out.println(nam);
		Combatant comb = new Combatant(nam, ini);
		System.out.println(comb);
		combatList.add(comb);
		System.out.println(combatList);
		//if (combatList.size() > 2) {
			//Collections.sort(combatList, Collections.reverseOrder(new sortByInitiative()));
			
		//}
	}

	public Combatant getNextCombatant() {
		Combatant nc = combatList.getFirst(); //which combatant is it
		String n = nc.getName();
		System.out.println(n); //print the name
		combatList.removeFirst(); //remove this combatant from the list
		return nc; //return the object- this is to enable more complicated things later
		
	}
	
	
	
}
