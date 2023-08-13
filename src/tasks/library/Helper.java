package tasks.library;

import java.util.ArrayList;
import java.util.Arrays;

public class Helper {
    public static int[] toIntArray(String[] strs) {
        ArrayList<Integer> array = new ArrayList<Integer>();

        Arrays.stream(strs).forEach( str -> {
            if(str.length()!=0)
                array.add(Integer.parseInt(str));
        });

        int[] newArr = new int[array.size()];

        for(int i=0;i<array.size(); i++) {
            newArr[i] = array.get(i);
        }

        return newArr;
    }
}
