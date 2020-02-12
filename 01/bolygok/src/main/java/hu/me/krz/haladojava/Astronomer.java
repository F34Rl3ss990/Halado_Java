package hu.me.krz.haladojava;

import java.util.ArrayList;
import java.util.List;

public class Astronomer {

	private String name;
	List<Planet> planet;
	
	public Astronomer(String name){
	this.name = name;
	}
	
	public List<Planet> getDiscoveredPlanets(){
		return planet;
	}
	
	public void observeTheSky(){
		Point act = new Point(0,0,0);
		for(int i=1;i<11;i++){
			act = act.translate(new Point(10,0,0));
			Planet bolygo = new Planet(act,Math.random() ,"Galileo" + i);
			
		
		}
	}

	@Override
	public String toString() {
		return "Astronomer [name=" + name + ", planet=" + planet + "]";
	}
	
	
}
