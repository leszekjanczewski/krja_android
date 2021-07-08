package pl.robous.krja;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinnerStation = (Spinner) findViewById(R.id.list_station);
        TextView stationTime = (TextView) findViewById(R.id.show_station);
        List<String> times = Arrays.asList(getResources().getStringArray(R.array.start_to_klodawa));

        spinnerStation.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                    String text = "";
                switch (position) {
                    case 0:
                        for (String time: times) {
                            text = text + time + "; ";
                        }
                        break;
                    case 1:
                        for (String time: times) {
                            String test [] = time.split(":");
                            int hh = Integer.parseInt(test[0]);
                            int mm = Integer.parseInt(test[1]);
                            if ((mm + 2) > 59) {
                                hh += 1;
                            }
                            System.out.println(hh + " " + test[0]);
                            text = text + time + "; ";
                        }
                        break;
                        default:
                            break;
                }




                stationTime.setText(times.get(position));

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void onRadioButtonDirectionClicked(View view) {

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radio_group_direction);
        int idFromRadioGroupDirection = radioGroup.getCheckedRadioButtonId();

        switch (idFromRadioGroupDirection) {
            case R.id.radio_gorzow:
                System.out.println("Gorzow");
                break;
            case R.id.radio_klodawa:
                System.out.println("Klodawa");
                break;
        }

    }
}
