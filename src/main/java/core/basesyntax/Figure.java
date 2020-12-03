package core.basesyntax;

import core.basesyntax.constant.Color;

public abstract class Figure implements Drawable, Area {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

}
