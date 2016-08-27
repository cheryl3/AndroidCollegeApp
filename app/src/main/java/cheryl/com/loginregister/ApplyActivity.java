package cheryl.com.loginregister;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class ApplyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apply);
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
                return true;
            }

            case R.id.query_id:
            {
                Intent intent = new Intent(this, PostActivity.class);
                startActivity(intent);
                return true;
            }

        }
        return true;
    }

    public void userRegScience(View view)
    {
        startActivity(new Intent(this, RegisterScience.class));
    }

    public void userRegArts(View view)
    {
        startActivity(new Intent(this, RegisterArts.class));
    }
}
