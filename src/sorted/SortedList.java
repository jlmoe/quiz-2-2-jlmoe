package sorted;

import java.util.Iterator;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

import lecture.ListTTH;

/**
 * An ArrayList-like data structure that automatically maintains a sorted order.
 * Elements are arranged in ascending order according to each element's
 * implementation of the compareTo method.
 *
 * @param <S>
 *            type implementing Comparable interface
 */
public class SortedList<S extends Comparable<S>> extends ListTTH<S> implements
		Iterable<S> {

	/*
	 * Since this list enforces an ordering, we don't want to give the user the
	 * impression that they can insert elements where ever they wish.
	 */
	@Override
	public void add(int position, S value) {
		throw new UnsupportedOperationException();
	}

	/*
	 * Now we need to override the superclass's behavior so that instead of
	 * adding to the end of the list, we add the element in its sorted position.
	 * 
	 * First, try to implement this using a simple linear search to find the
	 * insertion point. You will need to use compareTo. If you're not sure how
	 * it works, check the API.
	 * 
	 * Next, move on to implementing an Iterator for the list (below the add method).
	 * 
	 * After that, improve your add algorithm by considering that we are always
	 * inserting into a sorted list. Think back on algorithms we've seen that
	 * could help you *cough* conquer this problem.
	 * 
	 * You will receive partial credit for the simpler linear search method.
	 */
	@Override
	public void add(S value) {

	}

	/*
	 * Implement an Iterator for our list so users can use more convenient
	 * forEach loops. Use Eclipse to help you auto-generate the necessary
	 * methods. Refer to the Iterator API as well.
	 * 
	 * You do not have to account for a user modifying the list after the
	 * Iterator has been created. We can simply say that this results in
	 * undefined behavior (you can see in the Java API that ArrayList also does
	 * not support this behavior).
	 */
}
