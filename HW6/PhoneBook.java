package HW6;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class PhoneBook {
    static Map<String, ArrayList<Integer>> map = new HashMap<>();

    public void addPhoneNumber(String key, Integer phoneNumbers) {
        if (!map.containsKey(key)) {
           ArrayList<Integer> number = new ArrayList<>();
           map.put(key, number);
       }else {
           map.get(key).add(phoneNumbers);
        }
    }
   
public void printPhoneBook() {
    ArrayList<Map.Entry<String, ArrayList<Integer>>> sortedEntries = (ArrayList<java.util.Map.Entry<String, ArrayList<Integer>>>) map.entrySet().stream().sorted(new ContactComparator()).collect(Collectors.toList());

        for (Map.Entry<String, ArrayList<Integer>> entry : sortedEntries) {
            System.out.println(entry.getKey());
        }
    }
    private static class ContactComparator implements Comparator<Map.Entry<String, ArrayList<Integer>>>
    {
        @Override
        public int compare(Map.Entry<String, ArrayList<Integer>>e1, Map.Entry<String, ArrayList<Integer>>e2) {
            int sizeComparison = Integer.compare(e2.getValue().size(), e1.getValue().size());

            if (sizeComparison != 0) {
                return sizeComparison;
            }else {
                return e1.getKey().compareTo(e2.getKey());
            }
        }
    }
}
