import java.util.Comparator;

public class sortByInitiative implements Comparator<Combatant> {

	public int compare(Combatant a, Combatant b) {
		return a.getInitiative() - b.getInitiative();
		//allows comparison by initiative- which is the important part we want to look at
	}


}
