package com.example.suyashshukla.invite;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class Invitation extends MainActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invitation);
    }


    public void Thanks(View view) {




        Toast.makeText(Invitation.this, "Thank You!", Toast.LENGTH_SHORT).show();

        Log.v("Invitation","name = "+tname);
        Log.v("Invitation","mobile = "+mobile);
        Log.v("Invitation","email = "+email);


       if (tname.equals(R.string.n14) || tname.equals(R.string.n16)) {

           Intent intent = new Intent(Intent.ACTION_SEND);
           intent.setData(Uri.parse("mailto:"+email)); // only email apps should handle this
           intent.putExtra(Intent.EXTRA_SUBJECT, "Android Workshop : RJITGEEKS");
           intent.putExtra(Intent.EXTRA_TEXT,R.string.sms);
           if (intent.resolveActivity(getPackageManager()) != null) {
               startActivity(intent);
           }

        }
      else {

           Intent intent = new Intent(Intent.ACTION_SENDTO);
           intent.setData(Uri.parse("smsto:" + mobile));
           intent.putExtra("sms_body", getString(R.string.sms));
           if (intent.resolveActivity(getPackageManager()) != null) {
               startActivity(intent);
           }


        }


    }


}
