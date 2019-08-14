package khoapham.ptp.phamtanphat.fragmentsenddata10052019;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnMain;
    EditText edtMain;
    SendValue sendValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtMain = findViewById(R.id.edittextMain);
        btnMain = findViewById(R.id.buttonMain);

        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chuoi = edtMain.getText().toString();
                if (chuoi.length() >0){
                    AndroidFragment androidFragment = (AndroidFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentAndroid);
                    if (androidFragment != null && androidFragment.isInLayout()){
                        sendValue =  androidFragment;
                        sendValue.revice(chuoi);
                    }
                }
            }
        });
    }

}
