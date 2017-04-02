/**
 * Complete the following GeocacheList, to ensure all unit tests pass.
 * There are several errors in the code below
 *
 * Hint: Get the Geocache class working and passing its tests first.
 * @author sj2
 */
public class GeocacheList {
	private Geocache[] data = new Geocache[0];
	private int size = 0;

	public Geocache getGeocache(int i) {
		return data[i];
	}

	public int getSize() {
		return size;
	}

	public GeocacheList() 
	{
	}

	public GeocacheList(GeocacheList other, boolean deepCopy) {
		
		data = new Geocache[other.data.length];
		
		if (!deepCopy)
		{
			for (int i = 0; i < other.data.length; i++)
			{
				data[i] =other.data[i];
			}
			size = other.size;
		}
		else
		{
			data = new Geocache[other.data.length];
			for (int i = 0; i < other.data.length; i++)
			{
				data[i] = new Geocache(other.data[i]);
			}
			size = other.size;
		}
	}

	public void add(Geocache p) {
		size++;
		if (size > data.length) {
			Geocache[] old = data;
			data = new Geocache[size * 2];
			for (int i = 0; i < old.length; i++)
				data[i] = old[i];
		}
		data[size-1] = p;
	}

	public Geocache removeFromTop() {
		Geocache obj = data[size-1];
		data[size-1] = null;
		size--;
		return obj;
	}

	public String toString() {
		StringBuffer s = new StringBuffer("GeocacheList:");
		for (int i = 0; i < size; i++) {
			if (i > 0)
				s.append(',');
			s.append(data[i]);
		}
		return s.toString();
	}
}