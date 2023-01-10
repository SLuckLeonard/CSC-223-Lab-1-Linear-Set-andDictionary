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
	{
		// TODO Auto-generated constructor stub
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
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public E[] toArray(E[] a) {
		
		E[] es = (E[]) new Object[_list.size()];
		
		E[] array = es;
		
		for(int i = 0; i < _list.size(); i++) {
			
			array[i] = _list.get(i);
			
		}
		return array;
	}
	@Override
	public boolean add(E e) {
		_list.add(e);
		return true;
	}
	@Override
	public boolean remove(Object o) {
		_list.remove(o);
		return true;
	}
	@Override
	public boolean containsAll(Collection<?> c) {
		_list.containsAll(c);
		return true;
	}
	@Override
	public boolean addAll(Collection<? extends E> c) {
		_list.addAll(c);
		return true;
	}
	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		_list.addAll(index, c);
		return true;
	}
	@Override
	public boolean removeAll(Collection<?> c) {
		_list.removeAll(c);
		return true;
	}
	@Override
	public boolean retainAll(Collection<?> c) {
		_list.retainAll(c);
		return true;
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
		// TODO Auto-generated method stub
		//hi
		return 0;
	}
	@Override
	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ListIterator<E> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Spliterator<E> spliterator() {
		// TODO Auto-generated method stub
		return List.super.spliterator();
	}

}
