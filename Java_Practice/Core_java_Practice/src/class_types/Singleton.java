package class_types;

public enum Singleton {
INSTANCE ("Initial class info");
	private String info;

	private Singleton(String info) {
		this.info = info;
	}
	public static Singleton getInstance()
	{
		return INSTANCE;
		
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
}
