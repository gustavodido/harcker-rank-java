package exercises.datastructures;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static java.lang.System.in;
import static java.lang.System.out;
import static java.lang.System.setIn;
import static java.lang.System.setOut;
import static org.assertj.core.api.Assertions.assertThat;

public class JavaComparatorTest {
    private static final String INPUT = "5\n" +
            "amy 100\n" +
            "david 100\n" +
            "heraldo 50\n" +
            "aakansha 75\n" +
            "aleksa 150\n";

    private static final String OUTPUT = "aleksa 150\n" +
            "amy 100\n" +
            "david 100\n" +
            "aakansha 75\n" +
            "heraldo 50\n";

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayInputStream inContent = new ByteArrayInputStream(INPUT.getBytes());

    @Before
    public void setUp() {
        setOut(new PrintStream(outContent));
        setIn(inContent);
    }

    @Test
    public void shouldSolveForFirstScenario() {
        JavaComparator exercise = new JavaComparator();

        exercise.solve();

        assertThat(outContent.toString()).isEqualTo(OUTPUT);
    }

    @After
    public void tearDown() {
        setOut(out);
        setIn(in);
    }
}