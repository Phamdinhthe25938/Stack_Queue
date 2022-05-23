package Manage;

import java.util.Comparator;
import java.util.Random;

public class SortPriceRoom implements Comparator<Room> {
    @Override
    public int compare(Room o1, Room o2) {
        if(o1.getPriceRoom()>o1.getPriceRoom()){
            return 1;
        }
        return -1;
    }
}
