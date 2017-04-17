package drawers.string;

import com.google.common.base.Preconditions;

/**
 * Created by mtumilowicz on 2017-03-22.
 */
public class SawDrawerFactory {

    public static SawDrawer getSawDrawer(SawDrawerName name, String str, int height) {
        Preconditions.checkArgument(name != null && str != null);
        Preconditions.checkArgument(height >= 1);
        SawDrawer sd;
        switch(name){
            case SAW1:
                sd = new Saw1Drawer(str, height, 2*height);
                break;
            case SAW2:
                sd = new Saw2Drawer(str, height, 2*height);
                break;
            case SAW3:
                sd = new Saw3Drawer(str, height, 2*(height+1));
                break;
            default:
                throw new IllegalStateException("Improper value!");
        }
        return sd;
    }
}
