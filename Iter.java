import java.util.Iterator;
import java.util.List;

public class Iter implements Iterator<Person>{

    private int currentElement;
    private List<Person> personList;

    public Iter(List<Person> person) {
        this.personList = person;
        currentElement = 0;
    }

    @Override
    public boolean hasNext(){
        if (currentElement < personList.size()) {
            return true;
        }
        return false;
    }

    @Override
    public Person next() {
        if (!hasNext()) {
            currentElement = 0;
        }
        return personList.get(currentElement++);
    }

    @Override
    public void remove() {
      if (!hasNext()) {
         currentElement = 0;
      }
      personList.remove(currentElement);
    }
}