package com.deserthero.sunshine2;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class DetailActivityFragment extends Fragment {

    public DetailActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Intent i = getActivity().getIntent();
        View rootView = inflater.inflate(R.layout.fragment_detail, container, false);
        if(i != null && i.hasExtra(Intent.EXTRA_TEXT))
        {
            String forecastData = i.getStringExtra(Intent.EXTRA_TEXT);
            ((TextView) rootView.findViewById(R.id.txt_details)).setText(forecastData);
        }
        return  rootView;

    }
}
