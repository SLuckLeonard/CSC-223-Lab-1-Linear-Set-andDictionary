package utilities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ParallelArrayDictionaryTest {

	@Test
	void testSizeEmpty() {
		
		ParallelArrayDictionary<Integer, Double> dict = 
		new ParallelArrayDictionary<Integer, Double>();
		
		assertEquals(0, dict.size());
		
	}

}
