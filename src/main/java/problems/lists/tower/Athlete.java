package problems.lists.tower;

import com.google.common.base.Preconditions;

import java.util.Objects;

/**
 * Created by mtumilowicz on 2017-09-13.
 */
public class Athlete implements Comparable<Athlete> {
    private final int weight;
    private final int strength;

    private Athlete(int weight, int strength) {
        this.weight = weight;
        this.strength = strength;
    }

    public int getWeight() {
        return weight;
    }

    public int getStrength() {
        return strength;
    }
    
    public boolean couldLift(int weight) {
        return strength >= weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Athlete athlete = (Athlete) o;
        return weight == athlete.weight &&
                strength == athlete.strength;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, strength);
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "weight=" + weight +
                ", strength=" + strength +
                '}';
    }

    @Override
    public int compareTo(Athlete o) {
        return weight + strength - o.weight + o.strength;
    }


    public static class Factory {
        public static Athlete get(int weight, int strength) {
            Preconditions.checkArgument(weight > 0);
            Preconditions.checkArgument(strength > 0);
            
            return new Athlete(weight, strength);
        }
    }
}
