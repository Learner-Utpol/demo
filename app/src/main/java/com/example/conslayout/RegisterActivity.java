package com.example.conslayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterActivity extends AppCompatActivity {

    private EditText userName,emailAdd,password,phoneNumber;
    private Button register;
    private FirebaseDatabase db = FirebaseDatabase.getInstance();
    DatabaseReference rf = db.getReference();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        init();

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = userName.getText().toString();
                String email = emailAdd.getText().toString();
                String pass = password.getText().toString();
                String phn = phoneNumber.getText().toString();

                if (!TextUtils.isEmpty(user) && !TextUtils.isEmpty(email) && !TextUtils.isEmpty(pass) && !TextUtils.isEmpty(phn)){
                    User sentData = new User(user,email,pass,phn);
                    rf.push().setValue(sentData);
                    Toast.makeText(RegisterActivity.this, "Successfully Registered", Toast.LENGTH_SHORT).show();
                    userName.setText("");
                    emailAdd.setText("");
                    password.setText("");
                    phoneNumber.setText("");
                }else {
                    Toast.makeText(RegisterActivity.this, "Error", Toast.LENGTH_SHORT).show();

//                    userName.setText("");
//                    emailAdd.setText("");
//                    password.setText("");
//                    phoneNumber.setText("");
                }
            }
        });
    }

    private void init() {
        userName = findViewById(R.id.userET);
        emailAdd = findViewById(R.id.emailET);
        password = findViewById(R.id.passET);
        phoneNumber = findViewById(R.id.phnET);
        register = findViewById(R.id.loginBtn);

    }
}
