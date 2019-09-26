package com.example.examen_josefconcepcion;

import java.util.ArrayList;

public class ListDataHelper {

    public static ArrayList<ListViewItem> provideItems(){
        ArrayList<ListViewItem> list = new ArrayList<>();
        list.add(new ListViewItem(R.drawable.androind01, "Holo blue bright", android.R.color.holo_blue_bright));
        list.add(new ListViewItem(R.drawable.androind02, "Holo blue light",android.R.color.holo_blue_dark));
        list.add(new ListViewItem(R.drawable.androind03, "Holo green light",android.R.color.holo_blue_light));
        list.add(new ListViewItem(R.drawable.androind04, "Holo orange light",android.R.color.holo_green_dark));
        list.add(new ListViewItem(R.drawable.androind05, "Holo red light",android.R.color.holo_green_dark));
        list.add(new ListViewItem(R.drawable.androind06, "Holo purple",android.R.color.holo_orange_dark));
        list.add(new ListViewItem(R.drawable.androind07, "Holo blue dark",android.R.color.holo_orange_light));
        list.add(new ListViewItem(R.drawable.androind08, "Holo green dark",android.R.color.holo_red_dark));
        list.add(new ListViewItem(R.drawable.androind09, "Holo red dark",android.R.color.holo_purple));
        list.add(new ListViewItem(R.drawable.androind10, "Holo orange dark",android.R.color.holo_purple));

        return list;
    }

}