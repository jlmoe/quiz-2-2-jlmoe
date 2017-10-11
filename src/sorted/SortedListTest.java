package sorted;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Iterator;

import sorted.SortedList;

public class SortedListTest {

	/*
	 * We can write tests that check to make sure certain exceptions were
	 * thrown. Here we are verifying that we do not support the method add(Int,
	 * S).
	 */
	@Test(expected = UnsupportedOperationException.class)
	public void testAddIntS() {
		SortedList<Integer> list = new SortedList<Integer>();
		list.add(0, 1);
		assertEquals(0, list.size());
	}

	/*
	 * Test with simple data such as integers or Strings to ensure that our list
	 * maintains ascending order as elements are added.
	 * 
	 * If you are testing with primitives, remember the output from the list is
	 * an Object, so you need to either cast the output back to a primitive, or
	 * wrap the expected value up as an Object. 
	 * For example: 
	 * assertEquals(new Integer(1), list.get(0));
	 * or, alternatively,
	 * assertEquals(1, (int) list.get(0));
	 */
	@Test
	public void testAddS() {

	}
	
	/*
	 * Test to see if your list's Iterator's next() and hasNext() methods are working properly. 
	 */
	@Test
	public void testIterator() {
		
	}

	/*
	 * Finally, let's test the list with your Shapes classes.
	 * 
	 * First, we need to package up all three classes in the shapes package of
	 * the quiz2 project into a JAR file called 'shapes'. Select the shapes
	 * package, right click -> export -> Java -> JAR file. The export
	 * destination should be the lib folder of the quiz2_2 project.
	 * 
	 * Then, right click on quiz2_2 project -> Build Path -> Configure Build
	 * Path Under Libraries tab, click add JARs, and select the shapes JAR file
	 * within this project's directory structure.
	 * 
	 * Now we can import our Shape, Square, and Circle classes. 
	 */
	@Test
	public void testAddShapes() {
		/*
		 * Test to see if your list auto-sorts various <Shape> objects.
		 */
		

	}

	@Test
	public void testAddSquares() {
		/*
		 * What happens when you try to have your list sort <Square> objects?
		 */

	}
}
