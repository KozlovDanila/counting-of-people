import java.util.ArrayList;
import java.util.List;

public class App {

    public static Person playCounting(int countOfPerson) {
        List<Person> listOfPerson = createListOfPerson(countOfPerson);
        Iter iter = new Iter(listOfPerson);

        int currentPerson = 1;
        while (listOfPerson.size() != 1) {
            if (currentPerson % 2 == 0) {
                iter.remove();
            } else {
                iter.next();
            }
            currentPerson++;
        }

        return iter.next();
    }

    public static List<Person> createListOfPerson(int size) {
        List<Person> listOfPerson = new ArrayList<>();
        for (int i = 1; i <= size; i++) {
            listOfPerson.add(new Person(i + ""));
        }
        return listOfPerson;
    }
}
