import java.util.Comparator;

public class sortByInitiative implements Comparator<Combatant> {

	public int compare(Combatant a, Combatant b) {
		return a.getInitiative() - b.getInitiative();
	}


}
