package edu.baylor.ecs.si;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tester {
	
	@DisplayName("Test Timer pass")
	@Test
	void passingTest() throws TimerException {
		Timer.timeMe(1000);
	}
	@DisplayName("Test Timer fail")
	@Test
	void failOverTest() throws TimerException {
		assertThrows(TimerException.class, () -> {
			Timer.timeMe(-1);
		});
	}
	
	@Test
	@DisplayName("Test Timer edgecase")
	void failOverTestEdge() throws TimerException {
		assertTrue(Timer.timeMe(0) >= 0);
	}
}
