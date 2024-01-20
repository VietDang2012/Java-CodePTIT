package J07072;

import java.text.Collator;
import java.util.Locale;

public class Name implements Comparable<Name> {
    private StringBuilder firstName, lastName, midName;
    private String fullName;

    public Name() {
    }

    public Name(String s) {
        String[] a = s.trim().split("\\s+");
        this.fullName = "";
        firstName = new StringBuilder();
        lastName = new StringBuilder();
        midName = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                firstName = firstName.append(a[i].substring(0, 1).toUpperCase()).append(a[i].substring(1)).append(" ");
            } else if (i == 0) {
                lastName = lastName.append(a[i].substring(0, 1).toUpperCase()).append(a[i].substring(1)).append(" ");
            } else {
                midName = midName.append(a[i].substring(0, 1).toUpperCase()).append(a[i].substring(1)).append(" ");
            }
        }
        fullName = lastName.toString() + midName.toString() + firstName.toString();
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public int compareTo(Name other) {
        Collator collator = Collator.getInstance(new Locale("vi", "VN"));

        int compareResult = collator.compare(this.firstName.toString(), other.firstName.toString());
        if (compareResult != 0) {
            return compareResult;
        }

        compareResult = collator.compare(this.lastName.toString(), other.lastName.toString());
        if (compareResult != 0) {
            return compareResult;
        }

        return collator.compare(this.midName.toString(), other.midName.toString());
    }

}
