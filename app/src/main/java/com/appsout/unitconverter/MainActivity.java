package com.appsout.unitconverter;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;


public class MainActivity extends Activity{

    Button btnTemperture,btnLength,btnWeight,btnSpeed,btnVolume,btnArea,btnfuelconsumption,
            btnTime,btnPressure,btnForce;

    private InterstitialAd mInterstitialAd;
    AdView mAdView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        creatInterstitialAdd();
        btnTemperture = (Button)findViewById(R.id.Button_temperature);
        btnLength = (Button)findViewById(R.id.Button_length);
        btnWeight = (Button)findViewById(R.id.Button_weight);
        btnSpeed =(Button)findViewById(R.id.Button_speed);
        btnVolume = (Button)findViewById(R.id.Button_volume);
        btnArea = (Button)findViewById(R.id.Button_area);
        btnfuelconsumption = (Button)findViewById(R.id.Button_fuelConsumption);
        btnTime = (Button) findViewById(R.id.Button_time);
        btnPressure = (Button) findViewById(R.id.Button_pressure);
        btnForce = (Button) findViewById(R.id.Button_force);

        ////////Admob
         mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mAdView.setActivated(true);
        /// end admob
        buttoncolors(); // This will add colors for the buttons
        //Onclick Listeners of all the buttons
        btnTemperture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disableButtons();
                Intent intent = new Intent(MainActivity.this,Temperature.class);
                intent.putExtra("key",1);
                startActivity(intent);
            }
        });
        btnLength.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disableButtons();
                Intent intent = new Intent(MainActivity.this,Temperature.class);
                intent.putExtra("key",2);
                startActivity(intent);
            }
        });
        btnWeight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disableButtons();
                Intent intent = new Intent(MainActivity.this,Temperature.class);
                intent.putExtra("key",3);
                startActivity(intent);
            }
        });
        btnSpeed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disableButtons();
                Intent intent = new Intent(MainActivity.this,Temperature.class);
                intent.putExtra("key",4);
                startActivity(intent);
            }
        });
        btnVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disableButtons();
                Intent intent = new Intent(MainActivity.this, Temperature.class);
                intent.putExtra("key",5);
                startActivity(intent);
            }
        });
        btnArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disableButtons();
                Intent intent = new Intent(MainActivity.this, Temperature.class);
                intent.putExtra("key", 6);
                startActivity(intent);
            }
        });
        btnfuelconsumption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disableButtons();
                Intent intent = new Intent(MainActivity.this,Temperature.class);
                intent.putExtra("key",7);
                startActivity(intent);
            }
        });
        btnTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disableButtons();
                Intent intent = new Intent(MainActivity.this, Temperature.class);
                intent.putExtra("key",8);
                startActivity(intent);
            }
        });
        btnPressure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disableButtons();
                Intent intent = new Intent(MainActivity.this, Temperature.class);
                intent.putExtra("key",9);
                startActivity(intent);
            }
        });
        btnForce.setVisibility(View.GONE);
        btnForce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disableButtons();
                Intent intent = new Intent(MainActivity.this,Temperature.class);
                intent.putExtra("key",10);
                startActivity(intent);
            }
        });

    }

    public void onResume(){
        super.onResume();
        enabledButtons();
    }

    private void enabledButtons() {
        btnTemperture.setEnabled(true);
        btnLength.setEnabled(true);
        btnWeight.setEnabled(true);
        btnSpeed.setEnabled(true);
        btnVolume.setEnabled(true);
        btnArea.setEnabled(true);
        btnfuelconsumption.setEnabled(true);
        btnTime.setEnabled(true);
        btnPressure.setEnabled(true);
    }

    private void disableButtons() {
        btnTemperture.setEnabled(false);
        btnLength.setEnabled(false);
        btnWeight.setEnabled(false);
        btnSpeed.setEnabled(false);
        btnVolume.setEnabled(false);
        btnArea.setEnabled(false);
        btnfuelconsumption.setEnabled(false);
        btnTime.setEnabled(false);
        btnPressure.setEnabled(false);
    }

    private void buttoncolors() {
        btnTemperture.setBackgroundColor(getResources().getColor(R.color.temp_color));
        btnLength.setBackgroundColor(getResources().getColor(R.color.length_color));
        btnWeight.setBackgroundColor(getResources().getColor(R.color.weight_color));
        btnSpeed.setBackgroundColor(getResources().getColor(R.color.speed_color));
        btnVolume.setBackgroundColor(getResources().getColor(R.color.volume_color));
        btnArea.setBackgroundColor(getResources().getColor(R.color.area_color));
        btnfuelconsumption.setBackgroundColor(getResources().getColor(R.color.fuel_color));
        btnTime.setBackgroundColor(getResources().getColor(R.color.time_color));
        btnPressure.setBackgroundColor(getResources().getColor(R.color.pressure_color));
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch(item.getItemId()) {
           /* case android.R.id.home:
                dialogonbackPressed();
                return true;*/
            //noinspection SimplifiableIfStatement
            case R.id.action_settings:
            {
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }

   /* private void  dialogonbackPressed() {

        AlertDialog.Builder alertbox = new AlertDialog.Builder(MainActivity.this);
        alertbox.setCancelable(false);
        alertbox.setMessage("Do you want to exit?");
        alertbox.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        alertbox.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        alertbox.show();
    }*/

    @Override
    public void onBackPressed() {


        showInterstitial();
//        AlertDialog.Builder alertbox = new AlertDialog.Builder(MainActivity.this);
//        alertbox.setCancelable(false);
//        alertbox.setMessage("Do you want to exit?");
//        alertbox.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                finish();
//        tbox.setNegativeButton("No", new DialogInterface.OnClickListener() {
//            @O    }
//        });
//        alerverride
//            public void onClick(DialogInterface dialog, int which) {
//                dialog.cancel();
//            }
//        });
//        alertbox.show();
    }


    private void creatInterstitialAdd()
    {
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId(getString(R.string.interstitial_ad_unit_id));
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
//                mNextLevelButton.setEnabled(true);
            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
//                mNextLevelButton.setEnabled(true);
//                finish();
            }

            @Override
            public void onAdClosed() {
                // Proceed to the next level.
//                goToNextLevel();
//                finish();
            }
        });

        loadInterstitial();
    }
    private void loadInterstitial() {
        // Disable the next level button and load the ad.
        AdRequest adRequest = new AdRequest.Builder().build();
        mInterstitialAd.loadAd(adRequest);
    }


    private void showInterstitial() {
        // Show the ad if it's ready. Otherwise toast and reload the ad.
        if (mInterstitialAd != null && mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
//            finish();
        }
    }

}
