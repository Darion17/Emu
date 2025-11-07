import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class CheckResultTest {

    // 1. new object should start as passed
    @Test
    public void constructor_startsPassed() {
        CheckResult cr = new CheckResult();
        assertTrue(cr.isPassed());
    }

    // 2. new object should have empty messages
    @Test
    public void constructor_startsWithEmptyMessages() {
        CheckResult cr = new CheckResult();
        assertEquals(0, cr.getMessages().size());
    }

