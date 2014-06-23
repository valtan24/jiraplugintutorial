package ut.org.ida.plugin.emailhandler;

import org.junit.Test;
import org.ida.plugin.emailhandler.MyPluginComponent;
import org.ida.plugin.emailhandler.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}