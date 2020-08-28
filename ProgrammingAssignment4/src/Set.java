
public class Set {
	
	/*-----------------------------------------------------------------------------------------------------------
	/ Brent Harshbarger
	/ August 28, 2020
	/ Programming Fundamentals
	/ Summer 2020
	/ Programming Assignment 4
	/ 
	-------------------------------------------------------------------------------------------------------------*/

	
	
    private LinkedNode head = null;

    public void add(int i) {
        LinkedNode thing = find(i);

        if( null == thing) {
            //it's not there
            insert(i);
        }
    }

    public boolean delete(int i) {
        if(head == null) {
            return false;
        }

        if(head.getInt() == i) {
            head = head.getNext();
        } else if(exists(i)) {
            for(LinkedNode node = head; node != null; node = node.getNext())  {
                LinkedNode nextOne = node.getNext();
                if(nextOne.getInt() == i) {
                    node.setNext(nextOne.getNext());

                    return true;
                }
            }
        }


        return false;
    }

    public boolean exists(int i) {
        return find(i) != null;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();

        if(null != head) {
            for (LinkedNode node = head; node != null; node = node.getNext()) {
                builder.append(node.getInt());
                builder.append(" ");
            }
        }

        //chop off the last space.  Neater than an if inside the loop
        return builder.toString().trim();
    }
    
    private void insert(int i) {
        if(null == head) {
            head = new LinkedNode();
            head.setInt(i);
        } else {
            LinkedNode node = new LinkedNode();
            node.setInt(i);
            node.setNext(head);
            head = node;
        }
    }

    private LinkedNode find(int i) {
        if(null == head) {
            return null;
        }

        for(LinkedNode node = head; node != null; node = node.getNext())  {
            if(node.getInt() == i) {
                return node;
            }
        }

        return null;
    }

}
