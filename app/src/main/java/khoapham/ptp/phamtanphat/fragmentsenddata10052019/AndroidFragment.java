package khoapham.ptp.phamtanphat.fragmentsenddata10052019;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class AndroidFragment extends Fragment {

    EditText edt;
    Button btn;
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_android, container, false);
        edt = view.findViewById(R.id.edittextAndroid);
        btn = view.findViewById(R.id.buttonAndroid);
        return view;
    }

}
