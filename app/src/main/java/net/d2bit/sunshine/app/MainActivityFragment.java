package net.d2bit.sunshine.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] data = {
                "Today - Sunny - 31/17",
                "Tomorrow - Foggy - 21/8",
                "Weds - Cloudy - 22/17",
                "Thurs - Rainy - 18/11",
                "Fri - Foggy - 21/10",
                "Sat - Cloudy - 23/18"
        };
        List<String> weekForecast = new ArrayList<String>(Arrays.asList(data));

        return inflater.inflate(R.layout.fragment_main, container, false);
    }
}
