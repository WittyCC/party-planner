import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
  public void newEvent_createNewEvent_true() {
    Event testEvent = new Event("birthday", 5, "cake and ice cream", "soda", "clown show");
    assertEquals(true, testEvent instanceof Event);
  }

  @Test
  public void newEvent_correctlyGetEventName_Birthday() {
    Event testEvent = new Event("Birthday", 5, "cake and ice cream", "soda", "clown show");
    testEvent.getEventName();
    assertEquals("Birthday", testEvent.getEventName());
  }

  @ Test
  public void newEvent_EventCost_1500() {
    Event testEvent = new Event("birthday", 10, "Full Meal", "Juices", "None");
    testEvent.computeCost();
    assertEquals(1500, testEvent.computeCost());
  }
}
