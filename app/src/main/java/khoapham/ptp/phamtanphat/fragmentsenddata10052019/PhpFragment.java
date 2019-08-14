package khoapham.ptp.phamtanphat.fragmentsenddata10052019;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;

public class PhpFragment extends Fragment {

    RatingBar ratingBar;
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_php, container, false);
        ratingBar = view.findViewById(R.id.ratingbarPhp);
        return view;
    }

}
