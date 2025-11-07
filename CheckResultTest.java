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

// 3. adding one message stores it
    @Test
    public void addMessage_storesMessage() {
        CheckResult cr = new CheckResult();
        cr.addMessage("Missing period.");
        assertEquals("Missing period.", cr.getMessages().get(0));
    }

    // 4. adding one message makes it fail
    @Test
    public void addMessage_setsPassedFalse() {
        CheckResult cr = new CheckResult();
        cr.addMessage("Missing subject.");
        assertFalse(cr.isPassed());
    }