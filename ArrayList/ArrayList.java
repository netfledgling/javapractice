package ArrayList;

public class ArrayList{

    int capacity;
    int start;
    String[] al;

    public ArrayList(int userCapacity) {
        if (userCapacity <= 0) {
            this.capacity = 1;
        } else { this.capacity = userCapacity; } 
        al = new String[this.capacity];
        start = 0;
    }
    
    public void add(String element) {
        if (start<capacity) {
            al[start] = element;
            start++;
        }
        else {
            String[] temp = new String[al.length + capacity]; 
            for (int i = 0; i<al.length; i++) {
                temp[i] = al[i];
            }
            temp[start] = element;
            start++;
            al = temp; 
        }
    }

    public void set(int index, String element) {
        al[index] = element;
    }

    public void remove(String element) {
        String[] temp = new String[al.length]; 
        for (int i = 0; i < temp.length; i++) {
            if (al[i] == null || !al[i].equals(element)) {
                temp[i] = al[i];
            } else {
                System.out.println("Element is found");
            }
        }
        al = temp;
    }

    public void remove(int index) {
        al[index] = null;
    }

    public int size() {
        return al.length;
    }

    public void print() {
        for (int i = 0; i < al.length; i++) {
            System.out.println(al[i]);
        }
    }

    public static void main(String[] args) {

        ArrayList obj = new ArrayList(0);

        obj.add("Sana");
        obj.add("Husna");
        obj.add("Abdullah");

        obj.remove(0);
        obj.remove("Husna");

        obj.set(2, "Baba");

        obj.print();
        System.out.println(obj.size());

    }

}
