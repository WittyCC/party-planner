import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
  public void newEvent_createNewEvent_true() {
    Event testEvent = new Event("birthday", 5, "cake and ice cream", "soda", "clown show");
    assertEquals(true, testEvent instanceof Event);
  }

  // @Test
  // public void getEventName_correctlyGetEventName_Birthday() {
  //   Event testEvent = new Event("Birthday");
  //   testEvent.getEventName(eventname);
  //   assertEquals("Birthday", testEvent.getEventName());
  // }
}
