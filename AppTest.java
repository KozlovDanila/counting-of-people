import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class AppTest {

    @Test
    public void testNextInMiddle() {
        List<Person> list = App.createListOfPerson(3);
        Person second = new Person("1");
        Iter iter = new Iter(list);
        Assert.assertEquals(second.getName(), iter.next().getName() );
    }

    @Test
    public void testNextInEnd() {
        List<Person> list = App.createListOfPerson(2);
        Person second = new Person("1");
        Iter iter = new Iter(list);
        iter.next();
        iter.next();
        Assert.assertEquals(second.getName(), iter.next().getName() );
    }

    @Test
    public void testHasNext() {
        List<Person> list = App.createListOfPerson(2);
        Iter iter = new Iter(list);
        Assert.assertTrue(iter.hasNext());
    }

    @Test
    public void testHasNextEnd() {
        List<Person> list = App.createListOfPerson(2);
        Iter iter = new Iter(list);
        iter.next();
        iter.next();
        Assert.assertFalse(iter.hasNext());
    }
}