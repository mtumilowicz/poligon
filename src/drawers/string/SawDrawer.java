package drawers.string;

/**
 * Created by mtumilowicz on 2017-03-21.
 */
public abstract class SawDrawer implements StringDrawer {

    final String base;
    final int height;
    final int period;
    private final char separator = ' ';

    SawDrawer(String base, int height, int period) {
        this.base = base;
        this.height = height;
        this.period = period;
    }

    public void draw() {
        for (int i = 0; i <= height; i++) {
            drawRow(i);
            System.out.println();
        }
    }

    private void drawRow(int i) {
        int k = 0;
        while (i + k < base.length()) {
            drawPart(i, k);
            k = k + period;
        }
    }

    abstract void drawPart(int i, int part);

    void drawSeparator(int i) {
        for (int a = 0; a < i; a++) System.out.print(separator);
    }
}
