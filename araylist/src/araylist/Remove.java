package araylist;

import java.util.ArrayList;
import java.util.List;

public class Remove {
public static void main(String args[]) {
List<Integer> id=new ArrayList<>();

id.add(123);
id.add(457);
id.add(897);
id.add(4521);
id.add(023);

id.remove(2);
System.out.println(id);
}
}
