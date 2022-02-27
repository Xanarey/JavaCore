package Chap28.Pr.ShipsLesson.Ships;

import Chap28.Pr.ShipsLesson.Types.Size;
import Chap28.Pr.ShipsLesson.Types.Type;

public class Ship {
    private int count;
    private Size size;
    private Type type;

    public Ship(Size size, Type type) {
        this.size = size;
        this.type = type;
    }

    public void add(int count) {
        this.count += count;
    }

    public boolean countChech() {
        if (count >= size.getValue()) {
            return false;
        }
        return true;
    }

    public int getCount() {
        return count;
    }

    public Type getType() {
        return type;
    }

    public Size getSize() {
        return size;
    }
}
