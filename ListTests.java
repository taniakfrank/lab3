import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests {
    @Test
    public void testMerge(){
        Checker c = new Checker();
        List<String> input = new ArrayList<>();
        input.add("12b2");
        input.add("2");
        input.add("345");
        input.add("3");
        input.add("4");
        List<String> filtered = ListExamples.filter(input, c);
        List<String> exp = new ArrayList<>();
        exp.add("2");
        exp.add("3");
        exp.add("4");
        assertEquals(exp, filtered);
    }
    @Test
    public void testFilter(){
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("c");
        list1.add("e");
        List<String> list2 = new ArrayList<>();
        list2.add("b");
        list2.add("d");
        list2.add("f");
        list2.add("g");
        list2.add("h");

        List<String> exp = new ArrayList<>();
        exp.add("a");
        exp.add("b");
        exp.add("c");
        exp.add("d");
        exp.add("e");
        exp.add("f");
        exp.add("g");
        exp.add("h");
        assertEquals(exp, ListExamples.merge(list1, list2));
    }

}