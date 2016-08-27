package cheryl.com.loginregister;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.support.v7.app.AppCompatActivity;


//AppCompatActivity
public class MainActivity extends AppCompatActivity{
    EditText ET_NAME,ET_PASS;
    String login_name,login_pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ET_NAME = (EditText)findViewById(R.id.user_name);
        ET_PASS = (EditText)findViewById(R.id.user_pass);

    }

    /* **

    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        //return super.onCreateOptionsMenu(menu);
        return true;
    }


    public void userRegScience(View view)
    {
        startActivity(new Intent(this, RegisterScience.class));
    }
    public void userRegArts(View view)
    {
        startActivity(new Intent(this,RegisterArts.class));
    }
    ** */

    public void userLogin(View view)
    {
        String response;
        login_name = ET_NAME.getText().toString();
        login_pass = ET_PASS.getText().toString();
        String method = "login";
        BackgroundTask backgroundTask = new BackgroundTask(this);
        response=backgroundTask.execute(method,login_name,login_pass).toString();

        //response=new backgroundTask().execute.get();
        //if(response.equals("Login Failed.......Try Again.."))
        if(response.equals("cheryl.com.loginregister.BackgroundTask@1dfe8228"))
        {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        else
        {
            Intent intent = new Intent(this, ApplyActivity.class);
            startActivity(intent);
        }
        //startActivityForResult(intent);


    }

    public void userReg(View view)
    {
        startActivity(new Intent(this, Register.class));
    }


}


