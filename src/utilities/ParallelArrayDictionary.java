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
		return _Values.size();
	}

	@Override
	public boolean isEmpty() {
		return _Values.isEmpty();
	}

	@Override
	public boolean containsKey(Object key) {
		return _Keys.contains(key);
	}

	@Override
	public boolean containsValue(Object value) {
		return _Values.contains(value);
	}

	@Override
	public Value get(Object key) {
		if (!containsKey(key)) return null;
		return _Values.get(_Keys.indexOf(key));
	}

	@Override
	public Value put(Key key, Value value) {
		
		return null;
	}

	@Override
	public Value remove(Object key) {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Entry<Key, Value>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

}
