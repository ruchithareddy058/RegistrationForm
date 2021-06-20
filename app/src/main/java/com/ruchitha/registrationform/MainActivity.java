package com.ruchitha.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et_name,et_email,et_phone,et_password;
    RadioButton r_male,r_female;
    CheckBox ch_java,ch_cpp,ch_c;
    Spinner sp_branches;
    TextView tv_data;
    String gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_name=findViewById(R.id.name);
        et_email=findViewById(R.id.email);
        et_password=findViewById(R.id.password);
        et_phone=findViewById(R.id.mobile);
        r_male=findViewById(R.id.male);
        r_female=findViewById(R.id.female);
        ch_java=findViewById(R.id.java);
        ch_cpp=findViewById(R.id.cpp);
        ch_c=findViewById(R.id.c);
        tv_data=findViewById(R.id.result);
        sp_branches=findViewById(R.id.branches);

    }

    public void display(View view) {
        String name=et_name.getText().toString();
        String email=et_email.getText().toString();
        String phone=et_phone.getText().toString();
        String password=et_password.getText().toString();
        if(r_male.isChecked())
        {
            gender=r_male.getText().toString();
        }
        else if(r_female.isChecked())
        {
            gender=r_female.getText().toString();
        }
        StringBuilder builder=new StringBuilder();
        if(ch_java.isChecked())
        {
            builder.append(ch_java.getText().toString()+",");
        }
        if(ch_cpp.isChecked())
        {
            builder.append(ch_cpp.getText().toString()+",");
        }
        if(ch_c.isChecked())
        {
            builder.append(ch_c.getText().toString());
        }
        String branches=sp_branches.getSelectedItem().toString();
        tv_data.setText(name+"\n"+email+"\n"+phone+"\n"+password+"\n"+gender+
                "\n"+builder.toString()+"\n"+branches);
    }
}