package com.example.suyashshukla.invite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
   public static long mobile;
   public static String email;
    public static String tname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teachers_list);

        ArrayList<Teachers> teachers = new ArrayList<>();
        teachers.add(new Teachers(getString(R.string.ca),"Chief Administrator",R.drawable.male_android));
        teachers.add(new Teachers(getString(R.string.pr),"Principal",R.drawable.male_android));
        teachers.add(new Teachers(getString(R.string.n1),"HOD CSE/IT",R.drawable.male_android));
        teachers.add(new Teachers(getString(R.string.n2), "Faculty Coordinator : RJITGEEKS",R.drawable.male_android));
        teachers.add(new Teachers(getString(R.string.n3),"Asstt. Professor",R.drawable.male_android));
        teachers.add(new Teachers(getString(R.string.n4),"Asstt. Professor",R.drawable.male_android));
        teachers.add(new Teachers(getString(R.string.n5),"Asstt. Professor",R.drawable.male_android));
        teachers.add(new Teachers(getString(R.string.n6),"Asstt. Professor",R.drawable.male_android));
        teachers.add(new Teachers(getString(R.string.n7),"Asstt. Professor",R.drawable.male_android));
        teachers.add(new Teachers(getString(R.string.n8),"Asstt. Professor",R.drawable.male_android));
        teachers.add(new Teachers(getString(R.string.n9),"Asstt. Professor",R.drawable.male_android));
        teachers.add(new Teachers(getString(R.string.n10),"Asstt. Professor",R.drawable.male_android));
        teachers.add(new Teachers(getString(R.string.n11),"Asstt. Professor",R.drawable.male_android));

        teachers.add(new Teachers(getString(R.string.n12),"Lab Instructor",R.drawable.male_android));
        teachers.add(new Teachers(getString(R.string.n13),"Lab Instructor",R.drawable.male_android));

        teachers.add(new Teachers(getString(R.string.n14),"Asstt. Professor",R.drawable.female_android));
        teachers.add(new Teachers(getString(R.string.n15),"Asstt. Professor",R.drawable.female_android));
        teachers.add(new Teachers(getString(R.string.n16),"Hardware Engineer",R.drawable.female_android));
        teachers.add(new Teachers(getString(R.string.n17),"Asstt. Professor",R.drawable.female_android));
        teachers.add(new Teachers(getString(R.string.n18),"Lab Instructor",R.drawable.female_android));




        ListView teachers_list = (ListView)findViewById(R.id.teachers_list);

        TeachersAdapter adapter = new TeachersAdapter(this,teachers);

        teachers_list.setAdapter(adapter);




    }

    public void Invite(View view){

        TextView name = (TextView) view;

        tname = (String) (name.getText());

        if(tname.equals(getString(R.string.ca)))
            mobile = Long.parseLong(getString(R.string.mca));
        if(tname.equals(getString(R.string.pr)))
            mobile = Long.parseLong(getString(R.string.mpr));

        if (tname.equals(getString(R.string.n1)))
            mobile = Long.parseLong(getString(R.string.m1));
        if (tname.equals(getString(R.string.n2)))
            mobile = Long.parseLong(getString(R.string.m2));
        if (tname.equals(getString(R.string.n3)))
            mobile = Long.parseLong(getString(R.string.m3));
        if (tname.equals(getString(R.string.n4)))
            mobile = Long.parseLong(getString(R.string.m4));
        if (tname.equals(getString(R.string.n5)))
            mobile = Long.parseLong(getString(R.string.m5));
        if (tname.equals(getString(R.string.n6)))
            mobile = Long.parseLong(getString(R.string.m6));
        if (tname.equals(getString(R.string.n7)))
            mobile = Long.parseLong(getString(R.string.m7));
        if (tname.equals(getString(R.string.n8)))
            mobile = Long.parseLong(getString(R.string.m8));
        if (tname.equals(getString(R.string.n9)))
            mobile = Long.parseLong(getString(R.string.m9));
        if (tname.equals(getString(R.string.n10)))
            mobile = Long.parseLong(getString(R.string.m10));
        if (tname.equals(getString(R.string.n11)))
            mobile = Long.parseLong(getString(R.string.m11));
        if (tname.equals(getString(R.string.n12)))
            mobile = Long.parseLong(getString(R.string.m12));
        if (tname.equals(getString(R.string.n13)))
            mobile = Long.parseLong(getString(R.string.m13));
        if (tname.equals(getString(R.string.n14))) {
            mobile = 0;
            email = getString(R.string.m14);
        }
        if (tname.equals(getString(R.string.n15)))
            mobile = Long.parseLong(getString(R.string.m15));

        if (tname.equals(getString(R.string.n16))) {
            mobile = Long.parseLong(getString(R.string.m16));
            email = getString(R.string.m16);
        }
        if (tname.equals(getString(R.string.n17)))
            mobile = Long.parseLong(getString(R.string.m17));
        if (tname.equals(getString(R.string.n18)))
            mobile = Long.parseLong(getString(R.string.m18));

        Log.v("MainActivity","Mobile no. = "+mobile);

        Intent intent = new Intent(MainActivity.this,Invitation.class);
        startActivity(intent);

    }


}
