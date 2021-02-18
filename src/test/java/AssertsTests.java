import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class AssertsTests {

    @Test
    @Tag("positive")
    public void positiveTest() {
        assertThat(true, is(true));
    }

    @Test
    public void negativeTest() {
        assertThat(true, is(false));
    }
}
