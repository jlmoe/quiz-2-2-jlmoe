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
		// Don't change this add method.  Implement the one below.
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
	 * Next, move on to implementing an Iterator for the list (below the add
	 * method).
	 * 
	 * After that, improve your add algorithm by considering that we are always
	 * inserting into a sorted list. Think back on algorithms we've seen that
	 * could help you *cough* conquer this problem.
	 * 
	 * Hint: objects have two special "namespaces" available to them:
	 * one for their own methods and attributes, and another distinct namespace
	 * for their superclass's methods and attributes. You already know how to
	 * access these namespaces. Think about the special keywords you've been
	 * using in constructors.
	 */
	@Override
	public void add(S value) {
		
		if(super.isFull()){
			super.remove(getMaxSize());
			super.add(value);
		}
		
		
		for(int i = 0; i < super.size(); i++){
			if(super.get(i) == null){
				super.add(value);
			}
		}
	}

	public static void main(String[] args){
		
	}
	
	@Override
	public Iterator<S> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * Implement an Iterator for our list. This lets users of our list use the
	 * more succinct for loop syntax -- for (Object o : objects){...}. More
	 * specifically, it allows use of a forEach loop:
	 * (https://docs.oracle.com/javase
	 * /8/docs/technotes/guides/language/foreach.html) This is a function which
	 * takes a function as a parameter!
	 * 
	 * Let Eclipse to help you auto-generate the necessary methods for
	 * implementing the Iterable interface, and creating an Iterator object.
	 * Refer to the Iterator API as well.
	 * 
	 * Hint: Even though Iterator is an Interface, you can create an Iterator
	 * object AND implement its methods using an "anonymous class"
	 * 
	 * You do not have to account for a user modifying the list after the
	 * Iterator has been created. We can simply say that this results in
	 * undefined behavior (you can see in the Java API that ArrayList also does
	 * not support this behavior).
	 */
}
