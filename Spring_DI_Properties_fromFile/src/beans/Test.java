package beans;
import java.util.Properties;
import java.util.Set;
public class Test {
	private Properties con;
	public void setCon(Properties con) {
		this.con = con;
	}
	 public void info()
	 {
		 Set<?> keys=con.keySet();
		 for(Object key:keys)
		 {
			 System.out.println("Key ="+key+": Value="+con.getProperty(key.toString()));
		 }
	 }

}
