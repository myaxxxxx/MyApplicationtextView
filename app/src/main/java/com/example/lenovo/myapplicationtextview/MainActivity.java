package com.example.lenovo.myapplicationtextview;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        final AlertDialog.Builder buder = new AlertDialog.Builder(MainActivity.this);
        buder.setMessage("6666").setTitle("12346");
        LayoutInflater inflater = getLayoutInflater();

        final View dialoview = inflater.inflate(R.layout.login_dialog, null);
        buder.setView(dialoview);
        buder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                t1=(EditText)dialoview.findViewById(R.id.editText3);
                t2=(EditText)dialoview.findViewById(R.id.editText4);
                String name = t1.getText().toString();
               // Toast.makeText(MainActivity.this, name+t2.getText().toString(), Toast.LENGTH_LONG).show();

                if(t1.getText().toString().equals("666")&&t2.getText().toString().equals("666"))
                Toast.makeText(MainActivity.this, "用户按下了确认按钮", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(MainActivity.this, "用户1按下了确认按钮", Toast.LENGTH_LONG).show();

            }


        });
        buder.setNegativeButton("wait", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "用户按下了wait按钮", Toast.LENGTH_LONG).show();
            }
        });
        buder.setNeutralButton("exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "用户按下了exit按钮", Toast.LENGTH_LONG).show();
            }
        });

        buder.show();

    }
}
