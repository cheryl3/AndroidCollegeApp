package cheryl.com.loginregister;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FeedbackActivity extends AppCompatActivity {

    Button sendEmail;
    EditText msg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        sendEmail = (Button) findViewById(R.id.sendBtn);
        sendEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                msg = (EditText) findViewById(R.id.msgTxt);
                String message = msg.getText().toString();
                sendEmail(message);

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        //return super.onCreateOptionsMenu(menu);
        return true;
    }

    @Override
    public  boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();

        switch (id)
        {
            case R.id.feedback_id:
            {
                Intent intent = new Intent(this, FeedbackActivity.class);
                startActivity(intent);
                //return true;
            }

            case R.id.query_id:
            {
                Intent intent = new Intent(this, PostActivity.class);
                startActivity(intent);
                //return true;
            }

        }
        return true;
    }


    private void sendEmail(String message) {

        String[] to = new String[]{"chermer01@gmail.com"};
        String subject = ("Feedback from user");
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.putExtra(Intent.EXTRA_EMAIL,to);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT,subject);
        emailIntent.putExtra(Intent.EXTRA_TEXT,message);
        emailIntent.setType("message/rfc822");

        startActivity(Intent.createChooser(emailIntent, "Email"));
    }
}
