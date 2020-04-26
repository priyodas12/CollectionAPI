package map.WeakHashMap;

public class KeyPoint {
	private String key;
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public KeyPoint(String key) {
		//System.out.println("Key"+key);
		this.key=key;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "key"+this.key;
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
}
