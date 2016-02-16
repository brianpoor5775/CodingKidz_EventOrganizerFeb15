package com.example.brian.eventorganizerappfeb12;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Brian on 2/15/16.
 */
public class TaskFragmentActivity extends Fragment {
    public TaskFragmentActivity(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment as defined in fragment_task.xml.
        View rootView = inflater.inflate(R.layout.fragment_task, container, false);

        //Example Task Input
        String[] taskExample = {
                "2:30PM Friends",
                "3:30PM Work",
                "2:00PM Show",
                "6:30PM Medical",
                "5:30PM Family",
                "4:30PM Meeting"
        };
        //Turn the array of String into a List for ArrayAdapter
        ArrayList<String> dayTask = new ArrayList<String>(Arrays.asList(taskExample));
        //Layout the List of dayTask according to the list layout in "list_task.xml"
        //from the list_task_textview id.
        ArrayAdapter<String> taskAdapter =
                new ArrayAdapter<String>(
                        getActivity(),
                        R.layout.list_task,
                        R.id.list_task_textview,
                        dayTask
                );
        //listview_task is defined in fragment_task.xml
        ListView listview = (ListView) rootView.findViewById(R.id.listview_task);
        listview.setAdapter(taskAdapter);
        return rootView;
    }
}
