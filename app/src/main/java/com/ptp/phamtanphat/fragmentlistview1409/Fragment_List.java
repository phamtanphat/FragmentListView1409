package com.ptp.phamtanphat.fragmentlistview1409;

import android.app.ListFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by KhoaPhamPC on 5/12/2017.
 */

public class Fragment_List extends ListFragment {

    ArrayList<String> mangten;
    ArrayAdapter arrayAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        mangten = new ArrayList<>();
        mangten.add("Nguyen Van A");
        mangten.add("Nguyen Van B");
        mangten.add("Nguyen Van C");
        mangten.add("Nguyen Van D");
        mangten.add("Nguyen Van E");
        mangten.add("Nguyen Van F");
        mangten.add("Nguyen Van G");
        mangten.add("Nguyen Van H");
        arrayAdapter = new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1,mangten);
        setListAdapter(arrayAdapter);

        return inflater.inflate(R.layout.fragment_list,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        getListView().setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getActivity(), "Long Click", Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Toast.makeText(getActivity(), mangten.get(position), Toast.LENGTH_SHORT).show();
        super.onListItemClick(l, v, position, id);
    }
}
