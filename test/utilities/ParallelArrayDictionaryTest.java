/**
* Provides a set of test cases for the ParallelArrayDictionary class we wrote
*
* <p>Bugs: none known
*
* @author Sam Luck-Leonard and Mason Taylor
* @date 1/17/2023
*/
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

	@Test
	void sizeTestStress() {

		ParallelArrayDictionary<Integer, Double> dict = 
				new ParallelArrayDictionary<Integer, Double>();

		for(int i = 0; i < 100; i++) {

			dict.put(i, 0.0);

				assertEquals(i + 1, dict.size());

		}

	}

	@Test
	void isEmptyEmptyTest() {

		ParallelArrayDictionary<Integer, Double> dict = 
				new ParallelArrayDictionary<Integer, Double>();

		assertTrue(dict.isEmpty());

	}

	@Test
	void isEmptyStressTest() {

		ParallelArrayDictionary<Integer, Double> dict = 
				new ParallelArrayDictionary<Integer, Double>();

		for(int i = 0; i < 100; i++) {

			dict.put(i, 0.0);

		}

		assertFalse(dict.isEmpty());

		dict.clear();

		assertTrue(dict.isEmpty());

	}

	@Test
	void containsKeyEmptyTest() {

		ParallelArrayDictionary<Integer, Double> dict = 
				new ParallelArrayDictionary<Integer, Double>();

		assertFalse(dict.containsKey(0));

	}

	@Test
	void containsKeyTest() {

		ParallelArrayDictionary<Integer, Double> dict = 
				new ParallelArrayDictionary<Integer, Double>();

		dict.put(0, 0.0);

		assertTrue(dict.containsKey(0));

		assertFalse(dict.containsKey(1));

	}

	@Test
	void containsKeyStressTest() {

		ParallelArrayDictionary<Integer, Double> dict = 
				new ParallelArrayDictionary<Integer, Double>();

		for(int i = 0; i < 100; i++) {

			dict.put(i, i + 0.0);

			for(int j = 0; j <= i; j++) {

				assertTrue(dict.containsKey(j));

			}

		}

		dict.clear();

		for(int i = 0; i < 100; i++) {

			assertFalse(dict.containsKey(i));

		}

	}

	void containsValueEmptyTest() {

		ParallelArrayDictionary<Integer, Double> dict = 
				new ParallelArrayDictionary<Integer, Double>();

		assertFalse(dict.containsValue(0.0));

	}

	@Test
	void containsValueTest() {

		ParallelArrayDictionary<Integer, Double> dict = 
				new ParallelArrayDictionary<Integer, Double>();

		dict.put(0, 0.0);

		assertTrue(dict.containsValue(0.0));

		assertFalse(dict.containsValue(1.0));

	}

	@Test
	void containsValueStressTest() {

		ParallelArrayDictionary<Integer, Double> dict = 
				new ParallelArrayDictionary<Integer, Double>();

		for(int i = 0; i < 100; i++) {

			dict.put(i, i + 0.0);

			for(Double j = 0.0; j <= i; j++) {

				assertTrue(dict.containsValue(j));

			}

		}

		dict.clear();

		for(Double i = 0.0; i < 100; i++) {

			assertFalse(dict.containsValue(i));

		}

	}

	@Test
	void getNotThereTest() {

		ParallelArrayDictionary<Integer, Double> dict = 
				new ParallelArrayDictionary<Integer, Double>();

		assertEquals(null, dict.get(0));

	}

	@Test
	void getTest() {

		ParallelArrayDictionary<Integer, Double> dict = 
				new ParallelArrayDictionary<Integer, Double>();

		dict.put(0, 0.0);

		assertEquals(0.0, dict.get(0));

	}

	@Test
	void getStressTest() {

		ParallelArrayDictionary<Integer, Double> dict = 
				new ParallelArrayDictionary<Integer, Double>();

		for(int i = 0; i < 100; i++) {

			dict.put(i, i + 0.0);

		}

		for(int i = 0; i < 100; i++) {

			assertEquals(i + 0.0, dict.get(i));

		}

	}

	@Test
	void putTest() {

		ParallelArrayDictionary<Integer, Double> dict = 
				new ParallelArrayDictionary<Integer, Double>();
		
		dict.put(0, 0.0);
		
		assertEquals(0, dict.get(0));

	}
	
	@Test
	void putTestStress() {
		
		ParallelArrayDictionary<Integer, Double> dict = 
				new ParallelArrayDictionary<Integer, Double>();

		for(int i = 0; i < 100; i++) {

			dict.put(i, i + 0.0);

		}

		for(int i = 0; i < 100; i++) {

			assertEquals(i + 0.0, dict.get(i));

		}
		
	}
	
	@Test
	void removeEmptyTest() {
		
		ParallelArrayDictionary<Integer, Double> dict = 
				new ParallelArrayDictionary<Integer, Double>();
		
		assertThrows(IndexOutOfBoundsException.class, () -> { dict.remove(0); });
		
	}
	
	@Test
	void removeTest() {
		
		ParallelArrayDictionary<Integer, Double> dict = 
				new ParallelArrayDictionary<Integer, Double>();
		
		dict.put(0, 0.0);
		
		dict.remove(0);
		
		assertTrue(dict.isEmpty());
		
	}
	
	@Test
	void removeStressTest() {
		
		ParallelArrayDictionary<Integer, Double> dict = 
				new ParallelArrayDictionary<Integer, Double>();
		
		for(int i = 0; i < 100; i++) {
			
			dict.put(i, i + 0.0);
			
		}
		
		for(int i = 0; i < 100; i++) {
			
			dict.remove(i);
			
		}
		
		assertTrue(dict.isEmpty());
		
	}
	
	@Test
	void clearEmptyTest() {
		
		ParallelArrayDictionary<Integer, Double> dict = 
				new ParallelArrayDictionary<Integer, Double>();
		
		dict.clear();
		
		assertTrue(dict.isEmpty());
		
	}
	
	@Test
	void clearStressTest() {
		
		ParallelArrayDictionary<Integer, Double> dict = 
				new ParallelArrayDictionary<Integer, Double>();
		
		for(int i = 0; i < 100; i++) {

			dict.put(i, i + 0.0);
			
			assertFalse(dict.isEmpty());

		}
		
		dict.clear();
		
		assertTrue(dict.isEmpty());
		
	}
	
	@Test
	void putAllTest() {
		ParallelArrayDictionary<Integer, Double> dict = 
				new ParallelArrayDictionary<Integer, Double>();
		
	
	}


}