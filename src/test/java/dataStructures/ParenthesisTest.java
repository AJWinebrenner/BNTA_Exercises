package dataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ParenthesisTest {

    private Parenthesis underTest;

    @BeforeEach
    void init() {
        underTest = new Parenthesis();
    }

    @Test
    void getOnlyTest() {
        // Given
        String input = " [] +  (abc){bl-ah}[66]00 ()";
        // When
        String actual = underTest.getOnly(input);
        // Then
        String expected = "[](){}[]()";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void getOnlyCanReturnEmpty() {
        // Given
        String input = " there are no brackets here ";
        // When
        String actual = underTest.getOnly(input);
        // Then
        String expected = "";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void isBalancedTest() {
        // Given
        String input = "[]({}[])()";
        // When
        boolean actual = underTest.isBalanced(input);
        // Then
        boolean expected = true;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void isBalancedRecognisesFalse() {
        // Given
        String input = "[]({[}[])]()";
        // When
        boolean actual = underTest.isBalanced(input);
        // Then
        boolean expected = false;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void isBalancedHandlesMixedString() {
        // Given
        String input = " [] +  (abc){bl-ah}[66]00 ()";
        // When
        boolean actual = underTest.isBalanced(input);
        // Then
        boolean expected = true;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void isBalancedHandlesOtherStrings() {
        // Given
        String input = " there are no brackets here ";
        // When
        boolean actual = underTest.isBalanced(input);
        // Then
        boolean expected = true;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void isBalancedHandlesTrailingOpeningBracket() {
        // Given
        String input = "[]({}[])(){";
        // When
        boolean actual = underTest.isBalanced(input);
        // Then
        boolean expected = false;
        assertThat(actual).isEqualTo(expected);
    }

}