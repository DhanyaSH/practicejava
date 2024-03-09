

package learning_dhanya;

public class inheritance {
	
    static String id = "1";
    static String name = "ParentClass";

    public void displayName() {
        System.out.println(name);
    }
    
    public void displayId() { 
        System.out.println(id); 
    }
}

class Child extends inheritance {
    static int id = 2;
    static String name = "ChildClass";

    @Override
    public void displayName() {
        System.out.println(name);
    }

    @Override
    public void displayId() {
        System.out.println(id);
    }

    }
