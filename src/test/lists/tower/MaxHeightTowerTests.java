package test.lists.tower;

import org.junit.Test;
import problems.lists.tower.Athlete;
import problems.lists.tower.MaxHeightTower;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by mtumilowicz on 2017-09-13.
 */
public class MaxHeightTowerTests {
    private List<Athlete> inputList = Arrays.asList(Athlete.Factory.get(1, 1),
            Athlete.Factory.get(2, 2),
            Athlete.Factory.get(3, 3),
            Athlete.Factory.get(4, 4),
            Athlete.Factory.get(5, 5),
            Athlete.Factory.get(50, 50));

    private List<Athlete> tower = Arrays.asList(Athlete.Factory.get(1, 1),
            Athlete.Factory.get(2, 2),
            Athlete.Factory.get(3, 3),
            Athlete.Factory.get(50, 50));

    
    @Test
    public void build_null_arg() {
        assertEquals(Collections.emptyList(), MaxHeightTower.build(null));
    }

    @Test
    public void calculateHeight_null_arg() {
        assertEquals(0, MaxHeightTower.calculateHeight(null));
    }
    
    @Test
    public void build_length5() {
        assertEquals(tower, MaxHeightTower.build(inputList));
    }

    @Test
    public void build_length5_fail() {
        assertNotEquals(Collections.singletonList(Athlete.Factory.get(1, 1)), MaxHeightTower.build(inputList));
    }

    @Test
    public void calculateHeight_length5() {
        assertEquals(tower.size(), MaxHeightTower.calculateHeight(inputList));
    }
}
