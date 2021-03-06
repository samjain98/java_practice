//@author sj2
import java.awt.Color;

public class KeyValueMap { // aka Dictionary or Map

	private String[] keys = new String[0];
	private Color[] values = new Color[0];
	private int size = 0;
	/**
	 * Adds a key and value. If the key already exists, it replaces the original
	 * entry.
	 */
	public void add(String key, Color value) {
		size++;
		
		if (size > keys.length - 1) 
		{
			String[] old = keys;
			Color[] olds = values;
			keys = new String[size * 2];
			values = new Color[size * 2];
			
			for (int i = 0; i < old.length; i++)
			{
				keys[i+1] = old[i];
				values[i+1] = olds[i];
			}
			keys[0] = key;
			values[0] = value;
		}
		else
		{
			String[] old = new String[keys.length]; 
			Color[] olds = new Color[keys.length];
			
			for (int i = 0; i < keys.length; i++)
			{
				old[i] = keys[i];
				olds[i] = values[i];
			}
			
			for (int i = 0; i < old.length -1; i++)
			{
				keys[i+1] = old[i];
				values[i+1] = olds[i];
			}
			keys[0] = key;
			values[0] = value;
		}
	}

	/**
	 * Returns particular Color object previously added to this map.
	 */
	public Color find(String key) {
		if (exists(key))
		{
			for ( int i = 0; i < size; i++ )
			{
				if (keys[i].equals(key))
				{
					return values[i];
				}
			}
		}	
		else
		{
			return null;
		}
		return null;
	}

	/**
	 * Returns true if the key exists in this map.
	 */
	public boolean exists(String key) {
		
		for (int i = 0; i < size; i++)
		{
			if (keys[i] == null)
			{
				if ( i == size -1 )
				{
					break;
				}
				else 
				{
					i++;
				}
			}
			if (keys[i].equals(key))
			{
				return true;
			}
		}
		
		return false;
	}

	/**
	 * Removes the key (and the color) from this map.
	 */
	public void remove(String key) 
	{
		if (exists(key))
		{
			for (int i = 0; i < size; i++ )
			{
				if (keys[i].equals(key))
				{
					keys[i] = null;
					values[i] = null;
					break;
				}
			}
		}
	}

}
