import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AndrewListTest {

    private AndrewList underTest;

    @BeforeEach
    void init() {

    }

    @Test
    void canGetSize() {
        // Given
        AndrewList testList = new AndrewList(5);

        // When
        int items = testList.getSize();

        // Then
        int expected = 0;
        assertThat(items).isEqualTo(expected);
    }

    @Test
    void canAdd() {
        // Given
        AndrewList testList = new AndrewList(1);

        // When
        testList.add("first");
        testList.add("second");

        // Then
        int expected = 2;
        assertThat(testList.getSize()).isEqualTo(expected);
        assertThat(testList.getStrings()[0]).isEqualTo("first");
        assertThat(testList.getStrings()[1]).isEqualTo("second");

    }

    @Test
    void canDelete() {
        // Given
        AndrewList testList = new AndrewList(5);

        // When
        testList.add("first");
        testList.add("second");
        testList.add("third");
        testList.add("fourth");
        testList.add("fifth");
        testList.deleteAtIndex(2);

        // Then
        int expected = 4;
        System.out.println(Arrays.toString(testList.getStrings()));
        assertThat(testList.getSize()).isEqualTo(expected);
        assertThat(testList.getStrings()[0]).isEqualTo("first");
        assertThat(testList.getStrings()[1]).isEqualTo("second");
        assertThat(testList.getStrings()[2]).isEqualTo("fourth");
        assertThat(testList.getStrings()[3]).isEqualTo("fifth");
        assertThat(testList.getStrings()[4]).isEqualTo(null);
    }

    @Test
    void canDeleteLast() {
        // Given
        AndrewList testList = new AndrewList(5);

        // When
        testList.add("first");
        testList.add("second");
        testList.add("third");
        testList.add("fourth");
        testList.add("fifth");
        testList.deleteAtIndex(4);

        // Then
        int expected = 4;
        System.out.println(Arrays.toString(testList.getStrings()));
        assertThat(testList.getSize()).isEqualTo(expected);
        assertThat(testList.getStrings()[0]).isEqualTo("first");
        assertThat(testList.getStrings()[1]).isEqualTo("second");
        assertThat(testList.getStrings()[2]).isEqualTo("third");
        assertThat(testList.getStrings()[3]).isEqualTo("fourth");
        assertThat(testList.getStrings()[4]).isEqualTo(null);
    }
}