import java.util.Objects;

public class Position {
    private final int x;
    private final int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Position)) {
            return false;
        }
        Position otherPosition = (Position) object;
        return x == otherPosition.x &&
                y == otherPosition.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
