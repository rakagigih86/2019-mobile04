package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.EditText;

import id.ac.polinema.intent.model.User;

public class BundleActivity extends AppCompatActivity {

    public static final String USERNAME_KEY = "username";
    public static final String NAME_KEY = "name";
    public static final String AGE_KEY = "age";


    private EditText usernameInput;
    private EditText nameInput;
    private EditText ageInput;
    private String username;
    private String name;
    private int age;
    private String USER_KEY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundle);
        usernameInput = findViewById(R.id.input_username);
        nameInput = findViewById(R.id.input_name);
        ageInput = findViewById(R.id.input_age);

    }

    public void handleSubmit(View view) {
        Intent intent = new Intent(this, ProfileBundleActivity.class);
        User user = new User(username, name, age);
        intent.putExtra(USER_KEY, (Parcelable) user);
        String username = null;
        intent.putExtra(USERNAME_KEY, username);
        String name = null;
        intent.putExtra(NAME_KEY, name);
        int age = 0;
        intent.putExtra(AGE_KEY, age);
        username = usernameInput.getText().toString();
        name = nameInput.getText().toString();
        age = Integer.parseInt(ageInput.getText().toString());


        startActivity(intent);
    }
}
