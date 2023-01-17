package utilities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArraySetTest {

	@Test
	void sizeEmptyTest() {
		//push moment
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

		for(Double i = 0.0; i < 100; i++) {

			assertFalse(list.contains(i));

		}

	}

	@Test
	void toArrayEmptyTest() {

		ArraySet<Double> list = new ArraySet<Double>();

		assertArrayEquals(new Double[] {}, list.toArray());

	}

	@Test
	void toArrayTest() {

		ArraySet<Double> list = new ArraySet<Double>();

		for(Double i = 1.0; i < 11; i++) {

			list.add(i);

		}

		assertArrayEquals(new Double[] {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0}, 
				list.toArray());

	}

	@Test
	void toArrayStressTest() {

		ArraySet<Double> list = new ArraySet<Double>();

		for(Double i = 1.0; i < 11; i++) {

			list.add(i);

		}

		assertArrayEquals(new Double[] {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0}, 
				list.toArray());

		list.clear();

		list.add(1.0);

		assertArrayEquals(new Double[] {1.0}, list.toArray());

	}

	@Test
	void addTest() {

		ArraySet<Double> list = new ArraySet<Double>();

		assertTrue(list.isEmpty());

		list.add(0.0);

		assertTrue(list.contains(0.0));

		assertFalse(list.isEmpty());

	}

	@Test
	void addStressTest() {

		ArraySet<Double> list = new ArraySet<Double>();

		for(Double i = 0.0; i < 100; i++) {

			list.add(i);

		}

		for(Double i = 0.0; i < 100; i++) {

			assertTrue(list.contains(i));

			assertFalse(list.isEmpty());

		}

		list.clear();

		assertTrue(list.isEmpty());

	}

	@Test
	void removeTest() {

		ArraySet<Double> list = new ArraySet<Double>();

		list.add(1.0);

		assertTrue(list.contains(1.0));

		list.remove(1.0);

		assertFalse(list.contains(1.0));

	}

	@Test
	void removeStressTest() {

		ArraySet<Double> list = new ArraySet<Double>();

		for(Double i = 0.0; i < 100; i++) {

			list.add(i);

		}

		for(Double i = 0.0; i < 100; i++) {

			assertTrue(list.contains(i));

		}

		for(Double i = 0.0; i < 100; i++) {

			list.remove(i);

		}

		assertTrue(list.isEmpty());

	}

	@Test
	void containsAllEmptyTest() {

		ArraySet<Double> list = new ArraySet<Double>();

		assertTrue(list.containsAll(list));

	}

	@Test
	void containsAllStressTest() {

		ArraySet<Double> list = new ArraySet<Double>();

		ArraySet<Double> list2 = new ArraySet<Double>();

		for(Double i = 0.0; i < 100; i++) {

			list.add(i);

		}

		for(Double i = 0.0; i < 100; i++) {

			list2.add(i);

			assertTrue(list.containsAll(list2));

		}

	}

	@Test
	void addAllEmptyTest() {

		ArraySet<Double> list = new ArraySet<Double>();

		ArraySet<Double> list2 = new ArraySet<Double>();

		list.addAll(list2);

		assertTrue(list.isEmpty());

	}

	@Test
	void addAllTest() {

		ArraySet<Double> list = new ArraySet<Double>();

		ArraySet<Double> list2 = new ArraySet<Double>();

		list2.add(1.0);

		list.addAll(list2);

		list2.clear();

		assertTrue(list.contains(1.0));

	}

	@Test
	void addAllStressTest() {

		ArraySet<Double> list = new ArraySet<Double>();

		ArraySet<Double> list2 = new ArraySet<Double>();

		ArraySet<Double> list3 = new ArraySet<Double>();


		for(Double i = 0.0; i < 100; i++) {

			list3.add(i);

		}

		for(Double i = 0.0; i < 100; i++) {

			list2.clear();

			list2.add(i);

			list.addAll(list2);

			assertTrue(list3.containsAll(list));

		}

	}

	@Test
	void removeAllEmptyTest() {

		ArraySet<Double> list = new ArraySet<Double>();

		list.removeAll(list);

		assertTrue(list.isEmpty());

	}

	@Test
	void removeAllNoSameItemsTest() {

		ArraySet<Double> list = new ArraySet<Double>();

		list.add(1.0);

		ArraySet<Double> list2 = new ArraySet<Double>();

		list.removeAll(list2);

		assertTrue(list.contains(1.0));

		list2.add(2.0);

		list.removeAll(list2);

		assertTrue(list.contains(1.0));

	}

	@Test
	void removeAllStressTest() {

		ArraySet<Double> list = new ArraySet<Double>();

		ArraySet<Double> list2 = new ArraySet<Double>();

		for(Double i = 0.0; i < 100; i++) {

			list.add(i);

			list2.add(i);

		}

		list.removeAll(list2);

		assertTrue(list.isEmpty());

		for(Double i = 0.0; i < 100; i++) {

			list.add(i);

			list2.add(i);

		}

		list.removeAll(list);

		assertTrue(list.isEmpty());
	}

	@Test
	void testRetainAllEmpty() {

		ArraySet<Double> list = new ArraySet<Double>();

		ArraySet<Double> list2 = new ArraySet<Double>();

		list.retainAll(list);

		assertTrue(list.isEmpty());

		list.add(1.0);

		list.retainAll(list2);

		assertTrue(list.isEmpty());

	}

	@Test
	void retainAllStressTest() {

		ArraySet<Double> list = new ArraySet<Double>();

		ArraySet<Double> list2 = new ArraySet<Double>();

		for(Double i = 0.0; i < 100; i++) {

			list.add(i);

		}

		list.retainAll(list);

		assertFalse(list.isEmpty());

		list.retainAll(list2);

		assertTrue(list.isEmpty());

	}

	@Test
	void clearEmtpyTest() {

		ArraySet<Double> list = new ArraySet<Double>();

		list.clear();

		assertTrue(list.isEmpty());

	}

	@Test
	void clearStressTest() {

		ArraySet<Double> list = new ArraySet<Double>();

		for(Double i = 0.0; i < 100; i++) {

			list.add(i);

		}

		list.clear();

		assertTrue(list.isEmpty());

	}

	@Test
	void getEmptyTest() {

		ArraySet<Double> list = new ArraySet<Double>();

		assertThrows(IndexOutOfBoundsException.class, () -> {list.get(0); });


	}

	@Test
	void getTest() {

		ArraySet<Double> list = new ArraySet<Double>();

		list.add(1.0);

		list.add(2.0);

		assertEquals(1.0, list.get(0));

		assertEquals(2.0, list.get(1));

	}

	@Test
	void getStressTest() {

		ArraySet<Double> list = new ArraySet<Double>();

		for(Double i = 0.0; i < 100; i++) {

			list.add(i);

		}

		for(int i = 0; i < 100; i++) {

			Double num = 0.0;

			assertTrue(num + i - list.get(i) < 0.00000000000000000000001);

		}

	}

	@Test
	void setEmptyTest() {

		ArraySet<Double> list = new ArraySet<Double>();

		assertThrows(IndexOutOfBoundsException.class, () -> {list.set(0, 1.0); });

	}

	@Test
	void setTest() {

		ArraySet<Double> list = new ArraySet<Double>();

		list.add(0.0);

		list.add(1.0);

		list.set(0, 2.0);

		assertTrue(list.contains(2.0));

	}

	@Test
	void setStressTest() {

		ArraySet<Double> list = new ArraySet<Double>();

		for(Double i = 0.0; i < 10; i++) {

			list.add(i);

		}

		for(int i = 0; i < 10; i++) {

			list.set(i, 1.0 + i);

		}

		for(Double i = 1.0; i < 10; i++) {

			list.contains(i);

		}

	}

	@Test
	void addIndexEmpty() {

		ArraySet<Double> list = new ArraySet<Double>();

		assertThrows(IndexOutOfBoundsException.class, () -> {list.add(1, 1.0); });

	}

	@Test
	void addIndexTest() {

		ArraySet<Double> list = new ArraySet<Double>();

		list.add(0.0);

		list.add(0, 1.0);

		assertEquals(1.0, list.get(0));

		assertEquals(0.0, list.get(1));

	}

	@Test
	void removeIndexEmptyTest() {

		ArraySet<Double> list = new ArraySet<Double>();

		assertThrows(IndexOutOfBoundsException.class, () -> {list.remove(0); });

	}

	@Test
	void removeIndexTest() {

		ArraySet<Double> list = new ArraySet<Double>();

		list.add(1.0);

		list.remove(0);

		assertTrue(list.isEmpty());

	}

	@Test
	void removeIndexStressTest() {

		ArraySet<Double> list = new ArraySet<Double>();

		for(Double i = 0.0; i < 10; i++) {
			
			list.add(i);
		
		}
		
		
		while (!list.isEmpty()) {
			
			list.remove(0);
			
		}
		assertTrue(list.isEmpty());

	}

	@Test
	void indexOfTest() {

		ArraySet<Double> list = new ArraySet<Double>();

		list.add(1.0);

		assertEquals(0, list.indexOf(1.0));

	}

	@Test
	void indexOfStressTest() {

		ArraySet<Double> list = new ArraySet<Double>();

		for(Double i = 0.0; i < 10; i++) {

			list.add(i);

		}

		for(Double i = 0.0; i < 10; i++) {

			assertEquals(0 + i, list.indexOf(i));

		}

	}

	@Test
	void lastIndexOfTest() {

		ArraySet<Double> list = new ArraySet<Double>();

		list.add(1.0);

		list.add(0.0);

		list.add(1.0);

		assertEquals(2, list.lastIndexOf(1.0));

	}

	@Test
	void lastIndexOfStressTest() {

		ArraySet<Double> list = new ArraySet<Double>();
		
		for(int i = 0; i < 10; i++) {

			list.add(1.0);
			
			assertEquals(i, list.lastIndexOf(1.0));
			
		}
		
	}
	
	@Test
	void subListTest() {
		
		ArraySet<Double> list = new ArraySet<Double>();
		
		list.add(0.0);
		
		list.add(1.0);
		
		list.add(2.0);
		
		for(Double i = 0.0; i < 2.0; i++) {
			
			assertTrue(list.subList(0, 2).contains(i));
			
		}
		
	}
	
	@Test
	void removeAtIndexTest() {
		
		ArraySet<Double> list = new ArraySet<Double>();
		
		list.add(0.2);
		
		list.add(0.6);
		
		list.add(2.0);
		
		list.remove(1);
		
		assertEquals(2.0,list.get(1));
	}
	
	
	
//	@Test
//	void subListStressTest() {
//		
//		ArraySet<Double> list = new ArraySet<Double>();
//		
//		for(int i = 0; i < 10; i++) {
//
//			list.add(i + 0.0);
//
//		}
//		
//		for(int i = 0; i < 10; i++) {
//
//			for(Double j = 0.0; j < 9; j++) {
//				
//				assertTrue(list.subList(0, i).contains(j));
//				
//			}
//
//		}
//		
//	}

}

