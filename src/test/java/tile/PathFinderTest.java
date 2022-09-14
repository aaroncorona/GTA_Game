package tile;

import main.Panel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PathFinderTest {

    // Check results when the target is in close range to the right
    @Test
    void whenTargetRight_ReturnRight() {
        new Panel();
        char nextDirectionExpected = 'R';
        char nextDirectionActual = PathFinder.getNextBestDir(900,950,1200,950);
        assertEquals(nextDirectionExpected, nextDirectionActual);
    }

    // Check results when the target is in close range down
    @Test
    void whenTargetDown_ReturnDown() {
        new Panel();
        char nextDirectionExpected = 'D';
        char nextDirectionActual = PathFinder.getNextBestDir(900,950,900,1050);
        assertEquals(nextDirectionExpected, nextDirectionActual);
    }
}