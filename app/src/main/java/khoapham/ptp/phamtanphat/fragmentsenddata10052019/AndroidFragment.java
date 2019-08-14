package khoapham.ptp.phamtanphat.fragmentsenddata10052019;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.OnLifecycleEvent;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AndroidFragment extends Fragment implements LifecycleOwner {

    EditText edt;
    Button btn;
    View view;

    MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_android, container, false);
        edt = view.findViewById(R.id.edittextAndroid);
        btn = view.findViewById(R.id.buttonAndroid);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mutableLiveData.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                if (s.length()>0){
                    Toast.makeText(getActivity(), s, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void setValue(String value){
        mutableLiveData.setValue(value);
    }
}
