import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StackTest {

    Stack stack;

    @Before
    public void before(){
        this.stack = new Stack(2);
    }


    @Test
    public void testStackEmptyOnCreation() {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testStackSizeZeroOnCreation() {
        assertEquals(0, stack.getSize());
    }

    @Test
    public void testStackSizeOneOnPush() {
        stack.push(0);
        assertEquals(1, stack.getSize());
    }

    @Test
    public void testStackEmptyOnPushAndPop() {
        stack.push(0);
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testStackSizeZeroOnPushAndPop() {
        stack.push(0);
        stack.pop();
        assertEquals(0, stack.getSize());
    }

    @Test(expected = StackOverflowError.class)
    public void testOverflows() {
        stack.push(11);
        stack.push(22);
        stack.push(33);
    }

    @Test(expected = RuntimeException.class)
    public void testUnderflows() {
        stack.pop();
    }

    @Test
    public void testPopSameAsPushed() {
        int item = 19;
        stack.push(item);
        assertEquals(item, stack.pop());
    }

    @Test
    public void testPopSameTwoAsPushed() {
        stack.push(51);
        stack.push(52);
        assertEquals(52, stack.pop());
        assertEquals(51, stack.pop());
    }

    @Test(expected = RuntimeException.class)
    public void testPositiveCapacity() {
        Stack newStack = new Stack(-3);
    }
}
