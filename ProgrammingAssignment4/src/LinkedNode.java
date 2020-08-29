
public class LinkedNode {
	/*-----------------------------------------------------------------------------------------------------------
	/ Brent Harshbarger
	/ August 28, 2020
	/ Programming Fundamentals
	/ Summer 2020
	/ Programming Assignment 4
	/ 
	-------------------------------------------------------------------------------------------------------------*/

	private int i;
	private LinkedNode next;

	public LinkedNode() {
		next = null;
		i = 42;
	}

	public void setInt(int i) {
		this.i = i;
	}

	public void setNext(LinkedNode next) {
		this.next = next;
	}

	public int getInt() {
		return i;
	}

	public LinkedNode getNext() {
		return this.next;
	}

}
