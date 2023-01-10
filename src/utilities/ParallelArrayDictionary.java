package utilities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class ParallelArrayDictionary<Key, Value> implements Map<Key, Value>
{
	
	protected ArrayList<Key> _Keys;
	
	protected ArrayList<Value> _Values;

	public ParallelArrayDictionary()
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Value get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Value put(Key key, Value value) {
		
		if(_Keys.contains(key)) return null;
		
		_Keys.add(key);
		
		_Values.add(value);
		
		return value;
		
	}

	@Override
	public Value remove(Object key) {
		
		_Keys.remove(key);
		
		Value temp = _Values.get(_Keys.indexOf(key));
		
		_Values.remove(_Keys.indexOf(key));
		
		return temp;
		
	}

	@Override
	public void putAll(Map<? extends Key, ? extends Value> m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear() {
		
		_Keys.clear();
		
		_Values.clear();
		
	}

	@Override
	public Set<Key> keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Value> values() {
		
		//return _Values.
		
	}

	@Override
	public Set<Entry<Key, Value>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

}
