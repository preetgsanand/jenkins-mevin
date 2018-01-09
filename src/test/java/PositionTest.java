import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositionTest {
    @Test
    void expectTwoEqualPositionsToBeEqual() {
        Position position = new Position(1,2);
        Position otherPosition = new Position(1,2);

        assertEquals(position, otherPosition);
    }

    @Test
    void expectTwoUnequalPositionsToNotBeEqual() {
        Position position = new Position(1,2);
        Position otherPosition = new Position(1,3);

        assertNotEquals(position, otherPosition);
    }
}