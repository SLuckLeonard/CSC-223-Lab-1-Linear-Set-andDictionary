package utilities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArraySetTest {

	@Test
	void sizeEmptyTest() {

		ArraySet<Double> list = new ArraySet<Double>();

		assertEquals(0, list.size());

	}

	@Test
	void sizeTest() {

		ArraySet<Double> list = new ArraySet<Double>();

		list.add(10.0);

		assertEquals(1, list.size());

	}

	@Test
	void sizeStressTest() {

		ArraySet<Double> list = new ArraySet<Double>();

		for(Double i = 0.0; i < 100; i++) {

			list.add(i);

		}

		assertEquals(100, list.size());

		list.clear();

		assertEquals(0, list.size());

	}

	@Test
	void isEmptyEmptyTest() {

		ArraySet<Double> list = new ArraySet<Double>();

		assertTrue(list.isEmpty());

	}

	@Test
	void isEmptyTest() {

		ArraySet<Double> list = new ArraySet<Double>();

		list.add(10.0);

		assertFalse(list.isEmpty());

	}

	@Test
	void isEmptyStressTest() {

		ArraySet<Double> list = new ArraySet<Double>();
		
		assertTrue(list.isEmpty());

		for(Double i = 0.0; i < 100; i++) {

			list.add(i);

		}
		
		assertFalse(list.isEmpty());
		
		list.clear();
		
		assertTrue(list.isEmpty());
		
		list.add(1.0);
		
		assertFalse(list.isEmpty());
		
	}
	
	@Test
	void containsEmptyTest() {
		
		ArraySet<Double> list = new ArraySet<Double>();
		
		assertFalse(list.contains(1.0));
		
	}
	
	@Test
	void containsTest() {
		
		ArraySet<Double> list = new ArraySet<Double>();
		
		list.add(10.0);
		
		assertTrue(list.contains(10.0));
		
		assertFalse(list.contains(1.0));
		
		list.clear();
		
		assertFalse(list.contains(null));
		
	}
	
	@Test
	void containsStressTest() {
		
		ArraySet<Double> list = new ArraySet<Double>();
		
		for(Double i = 0.0; i < 100; i++) {

			list.add(i);

		}
		
		for(Double i = 0.0; i < 100; i++) {

			assertTrue(list.contains(i));

		}
		
		list.clear();
		
		
	}

}
