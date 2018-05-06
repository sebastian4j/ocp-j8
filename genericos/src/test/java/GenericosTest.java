
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author sebastian
 */
public class GenericosTest {
    @Test
    public void listasTest() {
        final List<String> lista1 = new ArrayList<>();
        Assert.assertTrue(lista1.add("hola"));
        Assert.assertTrue(lista1.add("hola"));
        Assert.assertTrue(lista1.remove("hola"));
        Assert.assertEquals(1, lista1.size());
        final Set<Number> set1 = new HashSet<>();
        Assert.assertTrue(set1.add(1));
        Assert.assertTrue(set1.add(2));
        Assert.assertFalse(set1.add(1));
        Assert.assertFalse(set1.add(2));
        Assert.assertTrue(set1.remove(2));
        Assert.assertEquals(1, set1.size());
    }
}
