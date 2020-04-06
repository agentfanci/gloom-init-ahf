import static org.junit.jupiter.api.Assertions.*;

import java.util.Comparator;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class GloomInitiativeTrackerTest {
	public GloomInitiativeTracker g;
	
	
	
	@Before
	public void setup() {
		GloomInitiativeTracker g = new InitiativeTracker();
		
	}
	
	@Test
	public void constructorTest() {
		GloomInitiativeTracker track = new InitiativeTracker();
		System.out.println(track);
	}
	
	@Test
	public void testingTest() {
		GloomInitiativeTracker g = new InitiativeTracker();
		
		System.out.println("Test test: " + g);
	}
	
	@Test
	void isAnythingPrintingEverPleaseTest() {
		System.out.println("Print Test");
	}
	
	
	@Test
	void compareTest() {
		Combatant a = new Combatant("Annabell", 10);
		Combatant b = new Combatant("Ben", 45);
		//System.out.println(a);
		//System.out.println(a.getInitiative());
		Comparator<Combatant> com = new sortByInitiative();
		com.compare(a, b);
		assertEquals(-35, com.compare(a, b));
	}
	
	@Test
	void addingTest() {
		GloomInitiativeTracker g = new InitiativeTracker();
		g.addCombatant("Anna", 10);
	}
	
	@Test
	void gettingTest() {
		GloomInitiativeTracker g = new InitiativeTracker();
		g.addCombatant("Marsha", 11);
		System.out.println(g);
		System.out.println(g.getNextCombatant().getName());
		assertEquals("Marsha", g.getNextCombatant().getName());
	}
	
	@Test
	void getNameTest() {
		Combatant c = new Combatant("Guard 1", 45);
		assertEquals("Guard 1", c.getName());
	}
	
	@Test
	void reorderingTest() {
		GloomInitiativeTracker g = new InitiativeTracker();
		g.addCombatant("Anna", 10);
		g.addCombatant("Daniel", 50);
		g.addCombatant("Carter", 22);
		System.out.println(g);
		assertEquals("Anna", g.getNextCombatant().getName());
		assertEquals("Carter", g.getNextCombatant().getName());
		assertEquals("Daniel", g.getNextCombatant().getName());
	}

}
