package drawers.string;

/**
 * Created by mtumilowicz on 2017-03-21.
 */
public class Saw3Drawer extends SawDrawer {

    Saw3Drawer(String base, int height, int period) {
        super(base, height, period);
    }

    @Override
    void drawPart(int i, int part) {
            drawSeparator(i);
            System.out.print(base.charAt(i + part));
            if (i==height-1) {
                drawSeparator(1);
                if (height + part < base.length()) {
                    System.out.print(base.charAt(height + 1 + part));
                    drawSeparator(1);
                }
            }
            else {
                drawSeparator(2*(height - i) + 1);
            }
            if (!(i == 0)) {
                drawTwinNumber(i, part);
            }
            drawSeparator(i-1);
    }

    private void drawTwinNumber(int i, int part) {
        int twinNumberPosition = period - i + part;
        if (twinNumberPosition < base.length()) {
            System.out.print(base.charAt(twinNumberPosition));
        }
    }
}
