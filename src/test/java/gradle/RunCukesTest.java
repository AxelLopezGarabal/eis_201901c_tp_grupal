package gradle;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.junit.Test;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"})
public class RunCukesTest {

    @Test

    public void testUnBombermanSueltaUnaBombaYHayParedDeMelaminaA3Casilleros(){

        Bomberman bomberman = new Bomberman();
        ParedMelamina pared = new ParedMelamina();
        bomberman.setCoord(0,1);
        pared.setCoord(0,4);
        bomerman.soltarBomba();
        asserTrue(derriboLaPared(bomberman(getCoordBomba()),pared(getCoord())));
    }

    @Test

    public void testUnBombermanSueltaUnaBombaYHayUnEnemigoCerca(){

        Bomberman bomberman = new Bomberman();
        Enemigo enemigo = new Enemigo();
        bomberman.setCoord(2,3);
        enemigo.setCoord(4,3);
        bomberman.soltarBomba();
        assertTrue(bombaMataAlEnemigo(bomberman(getCoord()),enemigo(getCoord())));
    }

    @Test

    public void testUnBombermanSueltaUnaBombaYHayParedDeAceroA3Casilleros(){

        Bomberman bomberman = new Bomberman();
        ParedAcero pared = new ParedAcero();
        bomberman.setCoord(0,1);
        pared.setCoord(0,2);
        bomerman.soltarBomba();
        assertFalse(derriboLaPared(bomberman(getCoord()),pared(getCoord())));
    }

    @Test

    public void testUnBombermanSueltaUnaBombaYMataABagulaa(){

        Bomberman bomberman = new Bomberman();
        Bagulaa enemigo = new Bagulaa();
        bomberman.setCoord(2,3);
        enemigo.setCoord(4,3);
        bomberman.soltarBomba();
        assertTrue(bombaMataAlEnemigo(bomberman(getCoord()),enemigo(getCoord())));
        assertTrue(bomberman.tienePoderDeBagula());
    }

    @Test

    public void testBombermanTienePoderDeLanzarBombas(){

        //Prec: al lanzar la bomba no hay nada que obstruya en el camino
        Bomberman bomberman = new Bomberman();
        ParedMelamina pared = new ParedMelamina();
        pared.setCoord(2,8);
        bomberman.setCoord(2,3);
        bomberman.setPoder(poderBagula);
        assertTrue(bomberman.tienePoderBagulaa());
        bomberman.lanzarBomba(2,6);   //recibe una coord y un tiempo de detonacion
        assertTrue(derriboLaPared(pared(getCoord())),bomberman(getCoordBomba()));//no hay nada que obstruya el camino de la bomba.
    }
}