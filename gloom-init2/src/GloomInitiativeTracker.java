
public interface GloomInitiativeTracker {
	
	public void addCombatant(String Name, int initiative); //add a combatant to the round
	public Combatant getNextCombatant(); //return and print name of next combatant (the one with next highest initiative) 
}
