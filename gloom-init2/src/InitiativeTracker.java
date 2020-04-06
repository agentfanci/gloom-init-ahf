
import java.util.*;

public class InitiativeTracker implements GloomInitiativeTracker {
	
	//git still hasn't noticed that I've been changing this file?? but like whatever I guess
	//okay how do I make an instance variable again-
	//what do I want it to be? I want it to be a thing that is Easily Sortable
	private LinkedList<Combatant> combatList;
	
	public InitiativeTracker(){
		//so that's for the constructor
		//I don't think I have to do anything other than just... make it exist
		//so there's that
		//yay?
		this.addCombatant("End of Round", 100);
		//bc that is a useful way to do the thing I think
	}

	
	public void addCombatant(String nam, int ini) {
		//if Scenario contains Combatant with name==nam, that.initiative = ini, combatList.add(that combatant)
		//else
		Combatant comb = new Combatant(nam, ini);
		combatList.add(comb);
		Collections.sort(combatList, new sortByInitiative());
	}

	public Combatant getNextCombatant() {
		Combatant nc = combatList.getFirst(); //which combatant is it
		String n = nc.getName();
		System.out.println(n); //print the name
		combatList.removeFirst(); //remove this combatant from the list
		return nc; //return the object- this is to enable more complicated things later
		
	}
	
}
