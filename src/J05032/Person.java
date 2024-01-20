package J05032;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Person implements Comparable<Person> {
    private String name;
    private Date birth;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Person() {
    }

    public Person(String s) throws ParseException {
        String[] arr = s.split("\\s+");
        this.name = arr[0];
        this.birth = sdf.parse(arr[1]);
    }

    public Date getBirth() {
        return birth;
    }

    @Override
    public int compareTo(Person o) {
        return birth.compareTo(o.getBirth());
    }

    @Override
    public String toString() {
        return name;
    }
}
