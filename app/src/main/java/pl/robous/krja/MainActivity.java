package pl.robous.krja;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayList line2a = new ArrayList<List>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        line2a.add(0, "Santocko");
        line2a.add(1,"7:00");
        line2a.add(2,"Mironice");
        line2a.add(3,"7:15");
    }


    public void onRadioButtonDirectionClicked(View view) {

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radio_group_direction);
        int idFromRadioGroupDirection = radioGroup.getCheckedRadioButtonId();

        switch (idFromRadioGroupDirection) {
            case R.id.radio_gorzow:
                System.out.println("Gorzow");
                System.out.println(line2a.toString());
                break;
            case R.id.radio_klodawa:
                System.out.println("Klodawa");
                break;
        }

    }
}
