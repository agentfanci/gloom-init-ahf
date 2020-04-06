
import java.util.*;

public class InitiativeTracker implements GloomInitiativeTracker {
	
	//Linked list of Combatant classes
	private LinkedList<Combatant> combatList;
	//Linked bc more adding & removing than getting from an index
	//Collections.sort supposedly works on it
	//Allows for more complicated Combatant classes in the future
	
	
	public InitiativeTracker(){
		this.combatList = new LinkedList<Combatant>();
		Combatant ender = new Combatant("End of Round", 100); //100 is the highest/slowest possible initiative
		combatList.add(ender);
		//System.out.println(this.combatList);
	}

	
	public void addCombatant(String nam, int ini) {
		//make a new combatant with that name & initiative
		Combatant comb = new Combatant(nam, ini);
		//System.out.println("Adding: " + comb); for more visibility
		combatList.add(comb);
		Collections.sort(combatList, new sortByInitiative()); //the part we want the computer to do! it'll sort low to high, which is what we want
	}

	public Combatant getNextCombatant() {
		if(combatList.size()>0){
			Combatant nc = combatList.getFirst(); //which combatant is it
			String n = nc.getName();
			System.out.println("Next combatant is: " + n); //print the name
			combatList.removeFirst(); //remove this combatant from the list
			return nc; //return the object- this is to enable more complicated things later
		}
		else return new Combatant("End of Round", 100); //if there's nothing in there, it's the end of the round
		
	}
	
	public String toString() {
		return combatList.toString();
	}
	
	
}
