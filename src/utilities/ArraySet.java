/**
* Creates an ArraySet with all of the expected implementations for an ArraySet
*
* <p>Bugs: none known
*
* @author Sam Luck-Leonard and Mason Taylor
* @date 1/17/2023
*/
package utilities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Spliterator;

public class ArraySet<E> implements List<E>, Set<E>
{

	
	protected ArrayList<E> _list;
	
	public ArraySet(){
		
		_list = new ArrayList<E>();
		
	}
	
	public ArraySet(Collection<E> collection) {
		
		this();
		
		for(E item : collection) {
			
			add(item);
			
		}
		
	}
	@Override
	public int size() {
		
		return _list.size();
		
	}
	@Override
	public boolean isEmpty() {

		return _list.isEmpty();
		
	}
	@Override
	public boolean contains(Object o) {
		
		return _list.contains(o);
		
	}
	@Override
	public Iterator<E> iterator() {
		
		return _list.iterator();
		
	}
	@Override
	public Object[] toArray() {
		
		return _list.toArray();
		
	}
	@Override
	public  <E> E[] toArray(E[] a) {

	return _list.toArray(a);
	
	}
	@Override
	public boolean add(E e) {
		
		if(_list.contains(e)) return false;
		
		_list.add(e);
		
		return true;
		
	}
	@Override
	public boolean remove(Object o) {
		
		return _list.remove(o);
		
	}
	@Override
	public boolean containsAll(Collection<?> c) {
		
		return _list.containsAll(c);
		
		
	}
	@Override
	public boolean addAll(Collection<? extends E> c) {
		
		for(E item: c) {
			
			if(_list.contains(item)) return false;
			//add boolean for if its being added
		}
		_list.addAll(c);
		
		return true;
		
	}
	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		
		for(E item : c) {
			
			if(_list.contains(item)) return false;
			
		}
		
		_list.addAll(index, c);
		
		return true;
		
	}
	@Override
	public boolean removeAll(Collection<?> c) {
		
		return _list.removeAll(c);
		
	}
	@Override
	public boolean retainAll(Collection<?> c) {
		
		return _list.retainAll(c);
		
	}
	@Override
	public void clear() {
		
		_list.clear();
		
	}
	@Override
	public E get(int index) {
		
		return _list.get(index);
		
	}
	@Override
	public E set(int index, E element) {
		
		return _list.set(index, element);
		
	}
	@Override
	public void add(int index, E element) {
		
		if(_list.contains(element)) return;
		
		_list.add(index, element);
		
	}
	@Override
	public E remove(int index) {
		
		return _list.remove(index);
		
	}
	@Override
	public int indexOf(Object o) {
		
		return _list.indexOf(o);
		
	}
	@Override
	public int lastIndexOf(Object o) {
		
		return _list.lastIndexOf(o);
		
	}
	@Override
	public ListIterator<E> listIterator() {	
		
		return _list.listIterator();
		
	}
	@Override
	public ListIterator<E> listIterator(int index) {
		
		// TODO Auto-generated method stub
		
		return _list.listIterator(index);
		
	}
	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		
		return _list.subList(fromIndex, toIndex);
		
	}
	@Override
	public Spliterator<E> spliterator() {
		
		return _list.spliterator();
		
	}

}
