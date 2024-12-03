package Lesson4.Question2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinCharacterTest {
    // test for min character
    @Test
    void testFindMinCharacter() {
        assertEquals('a', MinCharacter.findMinCharacterHandler("akel"));
    }

    // test for min character in single character string
    @Test
    void testFindMinCharSingleCharacter() {
        assertEquals('w', MinCharacter.findMinCharacterHandler("w"));
    }

    // test for min character with duplicates in string
    @Test
    void testFindMinCharacterWithDuplicates() {
        assertEquals('c', MinCharacter.findMinCharacterHandler("zzjcc"));
    }

    // test for min character for an empty string
    @Test
    void testFindMinCharacterInEmptyString() {
        assertThrows(IllegalArgumentException.class, () -> MinCharacter.findMinCharacterHandler(""));
    }

    // test for min character in a null string
    @Test
    void testFindMinCharacterInNullString() {
        assertThrows(IllegalArgumentException.class, () -> MinCharacter.findMinCharacterHandler(null));
    }

}