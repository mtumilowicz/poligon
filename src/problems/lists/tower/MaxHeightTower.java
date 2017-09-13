package problems.lists.tower;

import org.apache.commons.collections4.ListUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static java.util.Collections.sort;

/**
 * Created by mtumilowicz on 2017-09-13.
 */
public class MaxHeightTower {
    public static List<Athlete> build(List<Athlete> athletes) {
        athletes = ListUtils.emptyIfNull(athletes);
        if (athletes.size() == 0) {
            return Collections.emptyList();
        }
        sort(athletes);

        List<Athlete> tower = new LinkedList<>();
        int totalWeight = 0;
        for (Athlete athlete : athletes) {
            if(athlete.couldLift(totalWeight)){
                totalWeight += athlete.getWeight();
                tower.add(athlete);
            }
        }
        return tower;
    }
    
    public static int calculateHeight(List<Athlete> athletes) {
        return build(athletes).size();
    }
    
    public static List<Athlete> get() {
        return Arrays.asList(Athlete.Factory.get(1, 1),
                Athlete.Factory.get(2, 2),
                Athlete.Factory.get(3, 3),
                Athlete.Factory.get(4, 4),
                Athlete.Factory.get(5, 5),
                Athlete.Factory.get(50, 50));
    }

    public static void main(String[] args) {
        System.out.println(build(get()));
    }
}
