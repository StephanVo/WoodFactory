package stephanvo.stammdaten;

import org.junit.Assert;
import org.junit.Test;
import stephanvo.MyClass;

import static org.junit.Assert.*;

public class StammdatenTest {
    @Test
    public void doesStammdatenExists() {
        // arrange

        // act
        Stammdaten stammdaten = new Stammdaten() {
            @Override
            public Materialliste ermittleBauplan(Moebel moebel) {
                return null;
            }
        };

        // assert
        Assert.assertNotNull(stammdaten);
    }
    @Test
    public void hasStammdatenErmittleBauplan() {
        // arrange
        Stammdaten stammdaten = new Stammdaten() {
            @Override
            public Materialliste ermittleBauplan(Moebel moebel) {
                moebel.getName();
                return new Materialliste() {
                };
            }
        };
        Moebel moebel = new Moebel() {
            @Override
            public String getName() {
                return null;
            }
        };

        // act
        Materialliste materialliste = stammdaten.ermittleBauplan(moebel);

        // assert
        Assert.assertTrue(true);
        Assert.assertNotNull(materialliste);
    }
}