import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NumberSequenceTest {

    @Test
    public void testCycleLengthForOddNumber() {
        // Test for an odd number within range
        assertEquals(16, NumberSequence.calculateCycleLength(7), "Cycle length for 7 should be 16.");
    }

    @Test
    public void testCycleLengthForEvenNumber() {
        // Test for an even number within range
        assertEquals(20, NumberSequence.calculateCycleLength(22), "Cycle length for 22 should be 20.");
    }
    
}
