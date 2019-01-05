package problems.set;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by mtumilowicz on 2019-01-05.
 */
class PowerSet2 {
    
    static Set<String> generate(int size) {
        Set<String> set = new HashSet<>();
        
        generate(size, "", set);
        
        return set;
    }
    
    private static void generate(int size, String str, Set<String> strings) {
        if (str.length() == size) {
            strings.add(str);
        }
        
        if (str.length() < size) {
            generate(size, str + "1", strings);
            generate(size, str + "0", strings);
        }
    }    
}
