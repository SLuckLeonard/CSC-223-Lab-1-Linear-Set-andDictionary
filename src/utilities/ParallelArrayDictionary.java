/**
* Creates a Parallel Array Dictionary with the fully implemented dictionary interface
*
* <p>Bugs: none known
*
* @author Sam Luck-Leonard and Mason Taylor
* @date 1/17/2023
*/
package utilities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class ParallelArrayDictionary<Key, Value> implements Map<Key, Value>
{


	protected ArraySet<Key> _Keys;

	protected ArrayList<Value> _Values;


	public ParallelArrayDictionary(ArraySet<Key> keys, ArrayList<Value> values) {
		//constructor 
		_Keys = new ArraySet<Key>();

		_Values = new ArrayList<Value>();

		for(int i = 0; i < keys.size(); i++) {

			this.put(keys.get(i), values.get(i));
		}

	}
	
	public ParallelArrayDictionary()
	
	{ this(new ArraySet<Key>(), new ArrayList<Value>()); }

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

		if(_Keys.contains(key)) return null;

		_Keys.add(key);

		_Values.add(value);

		return value;

	}

	@Override
	public Value remove(Object key) {

		Value temp = _Values.get(_Keys.indexOf(key));
		
		_Values.remove(_Keys.indexOf(key));
		
		_Keys.remove(key);

		return temp;

	}

	@Override
	public void putAll(Map<? extends Key, ? extends Value> m) {

		for (Entry<? extends Key, ? extends Value> e: m.entrySet())
		{
			put(e.getKey(),e.getValue());

		}

	}

	@Override
	public void clear() {

		_Keys.clear();

		_Values.clear();

	}

	@Override
	public Set<Key> keySet() {
		//creating a keySet of keys from _Keys to return
		ArraySet<Key> keySet = new ArraySet<Key>();

		for(Key key: _Keys) {

			keySet.add(key);

		}

		return keySet;

	}

	@Override
	public Collection<Value> values() {

		return _Values;
	}

	@Override
	public Set<Entry<Key, Value>> entrySet() {

		return this.entrySet();
	}

}
