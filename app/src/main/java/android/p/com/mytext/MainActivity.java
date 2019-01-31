package android.p.com.mytext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int result = 0;
    private Button mDick;
    private ImageView mImageView;
    private EditText mValueInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onButton();


    }


    public void getValue() {
        mValueInput = (EditText) findViewById(R.id.value_input);


    }

    public void onButton() {
        mDick = (Button) findViewById(R.id.done_btn);
        mDick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mImageView = (ImageView) findViewById(R.id.image_bg);
                getValue();
                String stringInput = mValueInput.getText().toString();
                int intInput = Integer.parseInt(stringInput);
                result = intInput + result;


                if (result >= 700) {

                    int colorAccent = getResources().getColor(R.color.colorAccent);
                    mImageView.setBackgroundColor(colorAccent);

                } else if (result >= 500 && result < 700) {

                    int colorPrimary = getResources().getColor(R.color.colorPrimary);
                    mImageView.setBackgroundColor(colorPrimary);

                } else {

                    int colorPrimaryDark = getResources().getColor(R.color.colorPrimaryDark);
                    mImageView.setBackgroundColor(colorPrimaryDark);

                }

                Toast toast = Toast.makeText(getApplicationContext(),
                        "" + result, Toast.LENGTH_SHORT);

                toast.show();


                mValueInput.setText(null);

            }
        });
    }


}

