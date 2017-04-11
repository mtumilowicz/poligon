package drawers.string;

/**
 * Created by mtumilowicz on 2017-03-21.
 */
public class Saw1Drawer extends SawDrawer {

    Saw1Drawer(String base, int height, int period) {
        super(base, height, period);
    }

    @Override
    void drawPart(int i, int part) {
        System.out.print(base.charAt(i + part));
        drawSeparator(height - 1 - i);
        // first and last row doesn't have twin number
        if (!(i==height || i==0)) {
            drawTwinNumber(i, part);
        }
        drawSeparator(i - 1);
    }

    private void drawTwinNumber(int i, int part) {
        int twinNumberPosition = period - i + part;
        if (twinNumberPosition < base.length()) {
            System.out.print(base.charAt(twinNumberPosition));
        }
    }
}
