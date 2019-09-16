package hashtable.RepeatedWord;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedWordTest {

    @Test
    public void testRepeatedWord_shortString() {
        assertEquals("The first duplicated word should be returned",
                "a", RepeatedWord.findFirstRepeatedWord("Once upon a time, there was a brave princess who..."));
    }

    @Test
    public void testRepeatedWord_mediumString() {
        assertEquals("The first duplicated word should be returned",
                "summer", RepeatedWord.findFirstRepeatedWord("It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York..."));
    }

    @Test
    public void testRepeatedWord_longString() {
        assertEquals("The first duplicated word should be returned",
                "it", RepeatedWord.findFirstRepeatedWord("It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only..."));
    }

    @Test
    public void testRepeatedWord_noDuplicates() {
        assertEquals("A string with no duplicated words should return a no duplicates response",
                "There were no duplicates", RepeatedWord.findFirstRepeatedWord("There is not a duplicated word in this one."));
    }

    @Test
    public void testRepeatedWord_empty() {
        assertEquals("An empty string should return a no duplicates response",
                "There were no duplicates", RepeatedWord.findFirstRepeatedWord(""));
    }
}