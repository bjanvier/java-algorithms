package hashtable;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
/**
 * @author Janvier Zagabe
 * 
 * @HashTable(Hash set and hash map): get the sum of all the characters in a
 *                 string, then divide the sum by the size of the array, the
 *                 new index is the remainder value
 * 
 * 
 */
public class HashTable {

    public int generateHashCode(Object... obj) {
        String[] hStr = new String[obj.length];
        int i = 0;
        for (Object o : obj) {
            hStr[i] = (String) o;
            i++;
        }
        int hashCode = 0;
        int count = hStr.length - 1;
        int j = 0;
        while (count > 0) {
            int hc = hStr[j].hashCode();
            hashCode += hc * (int) Math.pow(31, count);
            count--;
            j++;
        }
        hashCode += hStr[hStr.length - 1].hashCode();

        return hashCode;
    }

    /**
     * Compressing the hash code to become
     * a real array index
     * 
     * @param o
     * @return
     */
    public int compress(Object o, int size) {
        int h = o.hashCode();

        if (h < 0) {
            h = -h;
        }
        return h % size;
    }

    /**
     * WHen the compressed index returns an item
     * that's not null, then the linear search should
     * be applied until the the next null/empty spot is
     * found
     */
    public Object[] linearProbing(Object[] arr) {
        Object[] newArray = new Object[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int h = compress(arr[i], arr.length);

            if (newArray[h] == null) {
                newArray[h] = arr[i];
            } else {
                // To handle the collision,
                // Do the linear search to
                // find the next open index
                // where newArray[i] is null
                int j = 0;
                while (j <= arr.length - 1) {
                    if (newArray[j] == null) {
                        newArray[j] = arr[i];
                        break;
                    }
                    j++;
                }
            }
        }
        return newArray;
    }

    public List<Object>[] separateChaining(Object[] arr) {
        List<Object>[] bucketList = new ArrayList[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int h = compress(arr[i], arr.length);

            if (bucketList[h] == null) {
                List<Object> bucket = new ArrayList<>();
                bucket.add(arr[i]);
                bucketList[h] = bucket;
            } else if (!bucketList[h].contains(arr[i])) {
                bucketList[h].add(arr[i]);
            }
        }
        return bucketList;
    }
}
