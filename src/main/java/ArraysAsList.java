import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {

    public static void main(String args[]){
        String[] stringArray = new String[] {"A", "B","C","D"};
        List stringList = Arrays.asList(stringArray); //used to get list-view of an array*****
        System.out.println("Array elements");
        Arrays.stream(stringArray).forEach(element -> System.out.println(element));
        System.out.println("List View of an Array\n"+stringList);

        //modify first element in List, this modifies actual array, not good to welcome*****
        stringList.set(0,"E");
        System.out.println("Arrays elements after List modification");
        Arrays.stream(stringArray).forEach(element -> System.out.println(element));

        //Alternate - use ArrayList<>(Arrays.asList(array)) to create a List out of an array
        //This is an independent copy of the array, which means that modifying the new list won't affect the original array*****

        List alternateStringList = new ArrayList<>(Arrays.asList(stringArray));
        alternateStringList.set(0,"F");
        System.out.println("Array elements after list modification with alternate approach");
        Arrays.stream(stringArray).forEach(element -> System.out.println(element));

    }
}
