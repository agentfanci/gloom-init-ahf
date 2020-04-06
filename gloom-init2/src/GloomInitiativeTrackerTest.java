import static org.junit.jupiter.api.Assertions.*;

import java.util.Comparator;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class GloomInitiativeTrackerTest {
	public GloomInitiativeTracker g;
	
	
	
	@Before
	public void setup() {
		GloomInitiativeTracker g = new InitiativeTracker();
		//apparently this didn't work. Why, I don't know, but it sure didn't so I just made a new one for each test
	}
	
	@Test
	public void constructorTest() { //does the constructor do anything?
		GloomInitiativeTracker track = new InitiativeTracker();
		System.out.println(track);
	}
	
	//This test is specific to my implementation, but was very useful when I was doing it. Checks that the structure needed for sorting is working correctly
	
	/*
	@Test
	void compareTest() {
		Combatant a = new Combatant("Annabell", 10);
		Combatant b = new Combatant("Ben", 45);
		
		Comparator<Combatant> com = new sortByInitiative();
		com.compare(a, b);
		assertEquals(-35, com.compare(a, b));
	}
	*/ 
	
	@Test
	void addingTest() { //make sure adding things works
		GloomInitiativeTracker g = new InitiativeTracker();
		g.addCombatant("Anna", 10);
	}
	
	@Test
	void gettingTest() { //test getting names
		GloomInitiativeTracker g = new InitiativeTracker();
		g.addCombatant("Marsha", 11);
		assertEquals("Marsha", g.getNextCombatant().getName());
	}
	
	@Test
	void getNameTest() { //check that getting names works on the combatant side
		Combatant c = new Combatant("Guard 1", 45);
		assertEquals("Guard 1", c.getName());
	}
	
	@Test
	void reorderingTest() { //the big one! Add unordered combatants, get them out in the correct order!
		GloomInitiativeTracker g = new InitiativeTracker();
		g.addCombatant("Anna", 10);
		g.addCombatant("Daniel", 50);
		g.addCombatant("Carter", 22);

		assertEquals("Anna", g.getNextCombatant().getName());
		assertEquals("Carter", g.getNextCombatant().getName());
		assertEquals("Daniel", g.getNextCombatant().getName());
	}
	
	@Test
	void goTooFarTest() { //when the list is empty and you ask who's next, it should tell you it's the end of the round
		GloomInitiativeTracker g = new InitiativeTracker();
		g.getNextCombatant();
		g.getNextCombatant();
	}

}
