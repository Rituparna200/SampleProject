import java.util.*;
public class Array {

	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<String>();
		list.add("BILA");
		list.add("BILA");
		list.add("BILA");
		list.add("BILA");
		list.add("mila");
		System.out.println("Names in the ArrayList:");
        for (String name : list) {
            System.out.println(name);
        }
	}

}
