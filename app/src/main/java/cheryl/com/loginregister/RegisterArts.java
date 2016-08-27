package cheryl.com.loginregister;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegisterArts extends AppCompatActivity {

    EditText ET_NAMEART,ET_EMAIL,ET_MOBILE,ET_ADDRESS,ET_CATEGORY,ET_PERCENTAGE,ET_MARKS_ENGLISH;
    String nameart,m_email,m_mobile,m_address,m_category,m_percentage,m_marks_english;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_arts_layout);
        ET_NAMEART = (EditText) findViewById(R.id.nameart);
        ET_EMAIL = (EditText) findViewById(R.id.m_email);
        ET_MOBILE = (EditText) findViewById(R.id.m_mobile);
        ET_ADDRESS = (EditText) findViewById(R.id.m_address);
        ET_CATEGORY = (EditText) findViewById(R.id.m_category);
        ET_PERCENTAGE = (EditText) findViewById(R.id.m_percentage);
        ET_MARKS_ENGLISH = (EditText) findViewById(R.id.m_marks_english);
    }

    public void userRegArts(View view)
    {
        nameart = ET_NAMEART.getText().toString();
        m_email = ET_EMAIL.getText().toString();
        m_mobile = ET_MOBILE.getText().toString();
        m_address = ET_ADDRESS.getText().toString();
        m_category = ET_CATEGORY.getText().toString();
        m_percentage = ET_PERCENTAGE.getText().toString();
        m_marks_english = ET_MARKS_ENGLISH.getText().toString();


        String method = "registerarts";
        BackgroundTask backgroundTask = new BackgroundTask(this);
        backgroundTask.execute(method,nameart,m_email,m_mobile,m_address,m_category,m_percentage,m_marks_english);
        finish();

    }
}
