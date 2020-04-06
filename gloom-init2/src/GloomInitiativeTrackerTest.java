import static org.junit.jupiter.api.Assertions.*;

import java.util.Comparator;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class GloomInitiativeTrackerTest {
	public GloomInitiativeTracker g;
	
	
	
	@Before
	public void setup() {
		g = new InitiativeTracker();
	}
	
	@Test
	void isAnythingPrintingEverPleaseTest() {
		System.out.println("Help pls");
	}
	
	
	@Test
	void compareTest() {
		Combatant a = new Combatant("Anna", 10);
		Combatant b = new Combatant("Ben", 45);
		Comparator<Combatant> com = new sortByInitiative();
		com.compare(a, b);
		assertEquals(-35, com.compare(a, b));
	}
	
	@Test
	void addingTest() {
		g.addCombatant("Anna", 10);
	}
	
	@Test
	void gettingTest() {
		g.addCombatant("Anna", 10);
		assertEquals("Anna", g.getNextCombatant().getName());
	}
	
	@Test
	void getNameTest() {
		Combatant c = new Combatant("Guard 1", 45);
		assertEquals("Guard 1", c.getName());
	}
	
	@Test
	void reorderingTest() {
		g.addCombatant("Anna", 10);
		g.addCombatant("Daniel", 50);
		g.addCombatant("Carter", 22);
		assertEquals("Anna", g.getNextCombatant().getName());
		assertEquals("Carter", g.getNextCombatant().getName());
		assertEquals("Daniel", g.getNextCombatant().getName());
	}

}
