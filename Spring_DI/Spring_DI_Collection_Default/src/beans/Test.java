package beans;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	private List fruits;
	private Set fruit_taste;
	private Map match;
	public void setFruits(List fruits) {
		this.fruits = fruits;
	}
	public void setFruit_taste(Set fruit_taste) {
		this.fruit_taste = fruit_taste;
	}
	public void setMatch(Map match) {
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
		Set keys=match.keySet();
		for(Object key:keys)
		{
			System.out.println("Name="+key+": Value="+match.get(key));
		}
	}
	

}
