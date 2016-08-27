package cheryl.com.loginregister;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class RegisterScience extends AppCompatActivity {

    EditText ET_NAMESCI,ET_EMAIL,ET_MOBILE,ET_ADDRESS,ET_CATEGORY,ET_PERCENTAGE,ET_MARKS_SCI,ET_MARKS_MATH;
    String namesci,email,mobile,address,category,percentage,marks_sci,marks_math;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_science_layout);
        ET_NAMESCI = (EditText) findViewById(R.id.namesci);
        ET_EMAIL = (EditText) findViewById(R.id.emailsci);
        ET_MOBILE = (EditText) findViewById(R.id.mobilesci);
        ET_ADDRESS = (EditText) findViewById(R.id.addresssci);
        ET_CATEGORY = (EditText) findViewById(R.id.categorysci);
        ET_PERCENTAGE = (EditText) findViewById(R.id.percentagesci);
        ET_MARKS_SCI = (EditText) findViewById(R.id.marks_sci_sci);
        ET_MARKS_MATH = (EditText) findViewById(R.id.marks_math_sci);
    }

    public void userRegScience(View view)
    {
        namesci = ET_NAMESCI.getText().toString();
        email = ET_EMAIL.getText().toString();
        mobile = ET_MOBILE.getText().toString();
        address = ET_ADDRESS.getText().toString();
        category = ET_CATEGORY.getText().toString();
        percentage = ET_PERCENTAGE.getText().toString();
        marks_sci = ET_MARKS_SCI.getText().toString();
        marks_math = ET_MARKS_MATH.getText().toString();


        String method = "registersci";
        BackgroundTask backgroundTask = new BackgroundTask(this);
        backgroundTask.execute(method,namesci,email,mobile,address,category,percentage,marks_sci,marks_math);
        finish();

    }
}
