package beans;
import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
public class Car {
	
/*
 * Both @Inject and @Resource works similar way but the order of the searching of the deendancy types 
 * like by Name first or by Type first differs in both
 * https://www.linkedin.com/pulse/difference-between-inject-vs-autowire-resource-pankaj-kumar#:~:text=%40Resource%3A%20annotation%20based%20on%20JSR,the%20required%20bean%20to%20inject.&text=%40Autowired%20and%20%40Inject%20will%20narrow,and%20finally%20by%20the%20name.
 *  
 *  
 *  */	

//	@Qualifier("e3")
//	@Autowired
	@Resource
	@Qualifier(value="e3")
//	@Inject
	private Engine e4;

	private int id;
//	@Required
	public void setId(int id) {
		this.id = id;
	}
//	@Required
	public void setName(String name) {
//		System.out.println("Car name  initialized using setter");

		this.name = name;
	}
	private String name;
	public void carInfo() {
		System.out.println(e4.getModel());
		System.out.println("Name:"+name+"\n Id:"+id);
	
			
	}

}
