package beans;
import java.util.Hashtable;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Test {
	private Vector<?> fruits;
	private TreeSet<?> fruit_taste;
	private Hashtable<?, ?> match;
	public void setFruits(Vector<?> fruits) {
		this.fruits = fruits;
	}
	public void setFruit_taste(TreeSet<?> fruit_taste) {
		this.fruit_taste = fruit_taste;
	}
	public void setMatch(Hashtable<?, ?> match) {
		this.match = match;
	}
	
	public void info() {
		for(Object f:fruits)
		{
			System.out.println(f.toString());
		}
		System.out.println("----------------------------------------------");
		
		for(Object f:fruit_taste)
		{
			System.out.println(f.toString());
		}
		System.out.println("----------------------------------------------");
		Set<?> keys=match.keySet();
		for(Object key:keys)
		{
			System.out.println("Name="+key+": Value="+match.get(key));
		}
	}
	

}
