package learning_dhanya;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class synchronization {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		List<String> namesList = Collections.synchronizedList(new ArrayList<String>());

		namesList.add("java");
		namesList.add("python");
		namesList.add("ruby");
		// add,remove -we dont need explicit synchronization

		// to fetch/traverse the values from this list- we have to eplicit
		// synchronization.
		synchronized (namesList) {
			Iterator<String> it = namesList.iterator();
			while (it.hasNext()) {
				System.out.println(it.hasNext());
			}
		}
//	2.CopyOnWriteArrayList
	
	CopyOnWriteArrayList<String> emplist = new CopyOnWriteArrayList<String>();
	
	emplist.add("java");
	emplist.add("python");
	emplist.add("ruby");
				//we dont need eplicit synchronization for any operation:add/remove.traverse
	
				Iterator<String> iterator = emplist.iterator();
				
				while(iterator.hasNext()) {
					
				
				System.out.println(iterator.next());
				
				
				
				
			}

		}

	}


