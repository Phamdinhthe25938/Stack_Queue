package Manage;

import java.util.Comparator;

public class SortDateGust implements Comparator<Guest> {


    @Override
    public int compare(Guest o1, Guest o2) {
        if(o1.getDate().getDate()>o2.getDate().getDate()){
            return 1;
        }
        return -1;
    }
}
