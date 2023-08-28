import org.example.StringUtils;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringUtilsTest {
    @Test
    public void testConcatenate() {
        String result = StringUtils.concatenate("Hello, ", "world!");
        assertEquals("Hello, world!", result);
    }

    @Test
    public void testConcatenateWithEmptyStrings() {
        String result = StringUtils.concatenate("", "");
        assertEquals("", result);
    }

    @Test
    public void testConcatenateWithNullStrings() {
        String result = StringUtils.concatenate(null, null);
        assertNull(result);
    }
}