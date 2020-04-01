package hu.me.krz.haladojava;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;



/**
 * Unit test for simple App.
 */
public class AstronomerTest 
{

    
    @Test
    public void getName() {
        String name = "Jóska";
        Astronomer astronomer = new Astronomer(name);
        assertThat(astronomer.getName(), is(equalTo(name)));
    }
   /* @Test
    public void getDiscoveredPlanets() {
        Astronomer astronomer = new Astronomer("Jóska2");
        Point point = new Point(10, 10, 10);
        Planet planet2 = new Planet(point, 50, "Jóska2");
        ArrayList<Planet> planet = new ArrayList<>();
        planet.add(planet2);
        assertThat(astronomer.getDiscoveredPlanets(), is(equalTo(planet2)));
    }*/
    
    @Test
    public void observeTheSky() {
        String name = "Nem Tom";
       Astronomer astronomer = new Astronomer(name);
        astronomer.observeTheSky(astronomer);
        assertThat(astronomer.getDiscoveredPlanets().size(), is(equalTo(10)));
        //assertThat(astronomer.getDiscoveredPlanets().get(0).getPosition(), is(equalTo(new Point(10, 10, 10))));
        //assertThat(astronomer.getDiscoveredPlanets().get(0).getName(), is(equalTo(String.format("%s 1", name))));
        
    }
}