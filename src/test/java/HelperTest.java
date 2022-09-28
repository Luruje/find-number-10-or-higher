import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HelperTest {

    Helper helper = new Helper();

    @Test
    void readLinesFromFile_shouldReadLines(){
        //when
        List<String> fileLines = helper.readLinesFromFile("testLines.txt");

        //then
        assertNotEquals(fileLines.size(), 0);
        assertEquals("test", fileLines.get(0));
    }

    @Test
    void containsNumberGreaterThan10_returnsTrueIfStringContainsNumberGreaterThan10(){
        //when
        boolean doesContain10 = helper.containsNumberGreaterThan10("lala0ala092lalaldsakdska");

        //then
        assertTrue(doesContain10);
    }
}