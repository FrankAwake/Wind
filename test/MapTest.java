package test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by frank on 26/04/2017.
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String, String> nameMap = new HashMap<>();
        String str = nameMap.get("frank");
        if (null == nameMap.get("frank")){
            System.out.println("empty");
        }else{
            System.out.println("frank");
        }
    }
}
