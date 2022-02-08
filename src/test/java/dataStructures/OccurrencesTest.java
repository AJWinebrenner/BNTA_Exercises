package dataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class OccurrencesTest {

    private Occurrences underTest;

    @BeforeEach
    void init() {
        underTest = new Occurrences();
    }

    @Test
    void numberOfOccurrencesTest() {
        // Given
        String input = "1,1,1,1,3,4,5,6,7,7,7,8,8";
        // When
        HashMap<String, Integer> actual = underTest.numberOfOccurrences(input);
        // Then
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("1", 4);
        expected.put("3", 1);
        expected.put("4", 1);
        expected.put("5", 1);
        expected.put("6", 1);
        expected.put("7", 3);
        expected.put("8", 2);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canComputeEmptyString() {
        // Given
        String input = " ";
        // When
        HashMap<String, Integer> actual = underTest.numberOfOccurrences(input);
        // Then
        HashMap<String, Integer> expected = new HashMap<>();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void getMostOccurrencesTest() {
        // Given
        String input = "1,1,1,1,3,4,5,6,7,7,7,8,8";;
        // When
        String actual = underTest.getMostOccurrences(input);
        // Then
        String expected = "1";
        assertThat(actual).isEqualTo(expected);
    }


}