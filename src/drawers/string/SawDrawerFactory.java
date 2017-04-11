package drawers.string;

import com.google.common.base.Preconditions;

import java.util.Objects;

/**
 * Created by mtumilowicz on 2017-03-22.
 */
public class SawDrawerFactory {

    public static SawDrawer getSawDrawer(SawDrawerName name, String str, int height, int period) {
        Objects.requireNonNull(name);
        Objects.requireNonNull(str);
        Preconditions.checkArgument(height < 1);
        Preconditions.checkArgument(period < 1);
        SawDrawer sd;
        switch(name){
            case SAW1:
                sd = new Saw1Drawer(str, height, period);
                break;
            case SAW2:
                sd = new Saw2Drawer(str, height, period);
                break;
            case SAW3:
                sd = new Saw3Drawer(str, height, period);
                break;
            default:
                throw new IllegalStateException("Improper value!");
        }
        return sd;
    }
}
