import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class AssertsTests {

    @Test
    public void positiveTest() {
        assertThat(true, is(true));
    }

    @Test
    public void negativeTest() {
        assertThat(true, is(false));
    }
}
