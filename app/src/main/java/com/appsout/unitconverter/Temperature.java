package com.appsout.unitconverter;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

import java.util.List;


public class Temperature extends Activity {

    TextView tvResult,tvUnitName;
    Spinner spinnerfrom,spinnerto;
    ImageButton DownButtonFrom,DownButtonTO;
    EditText etInput;
    Utility functions;
    double resulttext;
    Context mContext;
    int val;
    double inputValue;
    private InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);
        mContext = this;
        functions = new Utility();
        creatInterstitialAdd();
        spinnerfrom = (Spinner)findViewById(R.id.spinner);
        spinnerto = (Spinner)findViewById(R.id.spinnerTo);
        spinnerfrom.setVerticalScrollBarEnabled(false);
        spinnerfrom.setHorizontalScrollBarEnabled(false);
        spinnerto.setVerticalScrollBarEnabled(false);
        spinnerto.setHorizontalScrollBarEnabled(false);
        tvResult = (TextView)findViewById(R.id.tvDisplayResult);
        tvUnitName = (TextView) findViewById(R.id.textViewLarge);
        DownButtonFrom = (ImageButton)findViewById(R.id.downbuttonfrom);
        DownButtonTO = (ImageButton)findViewById(R.id.downbuttonto);
        etInput = (EditText) findViewById(R.id.editTextValue);
        Intent i = getIntent();
        Bundle bd = i.getExtras();
         val = bd.getInt("key");
        if (val == 1)
        {
            DownButtonFrom.setBackgroundColor(getResources().getColor(R.color.temp_color));
            DownButtonTO.setBackgroundColor(getResources().getColor(R.color.templight_color));
            List <String> listfrom = functions.getTemperatureUnits("");
            ArrayAdapter <String> adapter = new ArrayAdapter<String>(this,R.layout.custom_spinner_layout,listfrom);
            adapter.setDropDownViewResource(R.layout.custom_spinner_layout);
            adapter.notifyDataSetChanged();
            spinnerfrom.setAdapter(adapter);
            spinnerfrom.setBackgroundColor(getResources().getColor(R.color.temp_color));
            spinnerfrom.setPopupBackgroundResource(R.color.temp_color);
            spinnerfrom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    String spfrom = String.valueOf(spinnerfrom.getSelectedItem());
                    List<String> listto = functions.getTemperatureUnits(spfrom);
                    ArrayAdapter<String> ad = new ArrayAdapter<String>(mContext, R.layout.custom_spinner_layout, listto);
                    ad.setDropDownViewResource(R.layout.custom_spinner_layout);
                    ad.notifyDataSetChanged();
                    spinnerto.setAdapter(ad);
                    spinnerto.setBackgroundColor(getResources().getColor(R.color.templight_color));
                    spinnerto.setPopupBackgroundResource(R.color.templight_color);
                }
                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                }
            });
            tvUnitName.setText("Temperature");
        }
        else if (val == 2)
        {
            DownButtonFrom.setBackgroundColor(getResources().getColor(R.color.length_color));
            DownButtonTO.setBackgroundColor(getResources().getColor(R.color.lengthlight_color));
            List <String> listfrom = functions.lengthsList("");
            ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, R.layout.custom_spinner_layout,listfrom);
            adapter.setDropDownViewResource(R.layout.custom_spinner_layout);
            adapter.notifyDataSetChanged();
            spinnerfrom.setAdapter(adapter);
            spinnerfrom.setBackgroundColor(getResources().getColor(R.color.length_color));
            spinnerfrom.setPopupBackgroundResource(R.color.length_color);
            spinnerfrom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    String spfrom = String.valueOf(spinnerfrom.getSelectedItem());
                    List <String> listto = functions.lengthsList(spfrom);
                    ArrayAdapter<String> ad = new ArrayAdapter<String>(mContext, R.layout.custom_spinner_layout, listto);
                    ad.setDropDownViewResource(R.layout.custom_spinner_layout);
                    ad.notifyDataSetChanged();
                    spinnerto.setAdapter(ad);
                    spinnerto.setBackgroundColor(getResources().getColor(R.color.lengthlight_color));
                    spinnerto.setPopupBackgroundResource(R.color.lengthlight_color);
                }
                @Override
                public void onNothingSelected(AdapterView<?> parent) {}
            });
            tvUnitName.setText("Length");
        }
        else if (val == 3)
        {
            DownButtonFrom.setBackgroundColor(getResources().getColor(R.color.weight_color));
            DownButtonTO.setBackgroundColor(getResources().getColor(R.color.weightlight_color));
            List <String> listfrom = functions.getWeightUnits("");
            ArrayAdapter <String> adapter = new ArrayAdapter<String>(mContext, R.layout.custom_spinner_layout,listfrom);
            adapter.setDropDownViewResource(R.layout.custom_spinner_layout);
            adapter.notifyDataSetChanged();
            spinnerfrom.setAdapter(adapter);
            spinnerfrom.setBackgroundColor(getResources().getColor(R.color.weight_color));
            spinnerfrom.setPopupBackgroundResource(R.color.weight_color);
            spinnerfrom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    String spfrom = String.valueOf(spinnerfrom.getSelectedItem());
                    List <String> listto = functions.getWeightUnits(spfrom);
                    ArrayAdapter <String> ad = new ArrayAdapter<String>(mContext, R.layout.custom_spinner_layout,listto);
                    ad.setDropDownViewResource(R.layout.custom_spinner_layout);
                    ad.notifyDataSetChanged();
                    spinnerto.setAdapter(ad);
                    spinnerto.setBackgroundColor(getResources().getColor(R.color.weightlight_color));
                    spinnerto.setPopupBackgroundResource(R.color.weightlight_color);
                }
                @Override
                public void onNothingSelected(AdapterView<?> parent) {}
            });
            tvUnitName.setText("Weight");
        }
        else if (val == 4)
        {
            DownButtonFrom.setBackgroundColor(getResources().getColor(R.color.speed_color));
            DownButtonTO.setBackgroundColor(getResources().getColor(R.color.speedlight_color));
            List<String> listfrom = functions.getSpeedUnits("");
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(mContext, R.layout.custom_spinner_layout,listfrom);
            adapter.setDropDownViewResource(R.layout.custom_spinner_layout);
            adapter.notifyDataSetChanged();
            spinnerfrom.setAdapter(adapter);
            spinnerfrom.setBackgroundColor(getResources().getColor(R.color.speed_color));
            spinnerfrom.setPopupBackgroundResource(R.color.speed_color);
            spinnerfrom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                    String spfrom = String.valueOf(spinnerfrom.getSelectedItem());
                    List<String> listto = functions.getSpeedUnits(spfrom);
                    ArrayAdapter<String> ad = new ArrayAdapter<String>(mContext, R.layout.custom_spinner_layout,listto);
                    ad.setDropDownViewResource(R.layout.custom_spinner_layout);
                    ad.notifyDataSetChanged();
                    spinnerto.setAdapter(ad);
                    spinnerto.setBackgroundColor(getResources().getColor(R.color.speedlight_color));
                    spinnerto.setPopupBackgroundResource(R.color.speedlight_color);
                    callConvertFunction();
                }
                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                }
            });
            tvUnitName.setText("Speed/Velocity");
        }
        else if (val ==5)
        {
            DownButtonFrom.setBackgroundColor(getResources().getColor(R.color.volume_color));
            DownButtonTO.setBackgroundColor(getResources().getColor(R.color.volumelight_color));
            List<String> listfrom = functions.getVolumeUnits("");
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(mContext,R.layout.custom_spinner_layout,listfrom);
            adapter.setDropDownViewResource(R.layout.custom_spinner_layout);
            adapter.notifyDataSetChanged();
            spinnerfrom.setAdapter(adapter);
            spinnerfrom.setBackgroundColor(getResources().getColor(R.color.volume_color));
            spinnerfrom.setPopupBackgroundResource(R.color.volume_color);
            spinnerfrom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    String spfrom = String.valueOf(spinnerfrom.getSelectedItem());
                    List<String> listto = functions.getVolumeUnits(spfrom);
                    ArrayAdapter<String> ad = new ArrayAdapter<String>(mContext, R.layout.custom_spinner_layout,listto);
                    ad.setDropDownViewResource(R.layout.custom_spinner_layout);
                    ad.notifyDataSetChanged();
                    spinnerto.setAdapter(ad);
                    spinnerto.setBackgroundColor(getResources().getColor(R.color.volumelight_color));
                    spinnerto.setPopupBackgroundResource(R.color.volumelight_color);
                }
                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                }
            });
            tvUnitName.setText("Volume");
        }
        else if (val == 6)
        {
            DownButtonFrom.setBackgroundColor(getResources().getColor(R.color.area_color));
            DownButtonTO.setBackgroundColor(getResources().getColor(R.color.arealight_color));
            List<String> listfrom = functions.getAreaUnits("");
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(mContext,R.layout.custom_spinner_layout,listfrom);
            adapter.setDropDownViewResource(R.layout.custom_spinner_layout);
            adapter.notifyDataSetChanged();
            spinnerfrom.setAdapter(adapter);
            spinnerfrom.setBackgroundColor(getResources().getColor(R.color.area_color));
            spinnerfrom.setPopupBackgroundResource(R.color.area_color);
            spinnerfrom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    String spfrom = String.valueOf(spinnerfrom.getSelectedItem());
                    List<String> listto = functions.getAreaUnits(spfrom);
                    ArrayAdapter<String> ad = new ArrayAdapter<String>(mContext, R.layout.custom_spinner_layout,listto);
                    ad.setDropDownViewResource(R.layout.custom_spinner_layout);
                    ad.notifyDataSetChanged();
                    spinnerto.setAdapter(ad);
                    spinnerto.setBackgroundColor(getResources().getColor(R.color.arealight_color));
                    spinnerto.setPopupBackgroundResource(R.color.arealight_color);
                }
                @Override
                public void onNothingSelected(AdapterView<?> parent) {}
            });
            tvUnitName.setText("Area");
        }
        else if (val == 7)
        {
            DownButtonFrom.setBackgroundColor(getResources().getColor(R.color.fuel_color));
            DownButtonTO.setBackgroundColor(getResources().getColor(R.color.fuellight_color));
            List<String> listfrom = functions.getFuelConsumption("");
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(mContext,R.layout.custom_spinner_layout,listfrom);
            adapter.setDropDownViewResource(R.layout.custom_spinner_layout);
            adapter.notifyDataSetChanged();
            spinnerfrom.setAdapter(adapter);
            spinnerfrom.setBackgroundColor(getResources().getColor(R.color.fuel_color));
            spinnerfrom.setPopupBackgroundResource(R.color.fuel_color);
            spinnerfrom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    String spfrom = String.valueOf(spinnerfrom.getSelectedItem());
                    List<String> listto = functions.getFuelConsumption(spfrom);
                    ArrayAdapter<String> ad = new ArrayAdapter<String>(mContext, R.layout.custom_spinner_layout,listto);
                    ad.setDropDownViewResource(R.layout.custom_spinner_layout);
                    ad.notifyDataSetChanged();
                    spinnerto.setAdapter(ad);
                    spinnerto.setBackgroundColor(getResources().getColor(R.color.fuellight_color));
                    spinnerto.setPopupBackgroundResource(R.color.fuellight_color);
                }
                @Override
                public void onNothingSelected(AdapterView<?> parent) {}
            });
            tvUnitName.setText("Fuel Consumption");
        }
        else if (val == 8)
        {
            DownButtonFrom.setBackgroundColor(getResources().getColor(R.color.time_color));
            DownButtonTO.setBackgroundColor(getResources().getColor(R.color.timelight_color));
            List<String> listfrom = functions.getTimeUnits("");
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(mContext,R.layout.custom_spinner_layout,listfrom);
            adapter.setDropDownViewResource(R.layout.custom_spinner_layout);
            adapter.notifyDataSetChanged();
            spinnerfrom.setAdapter(adapter);
            spinnerfrom.setBackgroundColor(getResources().getColor(R.color.time_color));
            spinnerfrom.setPopupBackgroundResource(R.color.time_color);
            spinnerfrom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    String spfrom = String.valueOf(spinnerfrom.getSelectedItem());
                    List<String> listto = functions.getTimeUnits(spfrom);
                    ArrayAdapter<String> ad = new ArrayAdapter<String>(mContext,R.layout.custom_spinner_layout,listto);
                    ad.setDropDownViewResource(R.layout.custom_spinner_layout);
                    ad.notifyDataSetChanged();
                    spinnerto.setAdapter(ad);
                    spinnerto.setBackgroundColor(getResources().getColor(R.color.timelight_color));
                    spinnerto.setPopupBackgroundResource(R.color.timelight_color);
                }
                @Override
                public void onNothingSelected(AdapterView<?> parent) {}
            });
            tvUnitName.setText("Time");
        }
        else if (val == 9)
        {
            DownButtonFrom.setBackgroundColor(getResources().getColor(R.color.pressure_color));
            DownButtonTO.setBackgroundColor(getResources().getColor(R.color.pressurelight_color));
            List<String> listfrom = functions.getPressureUnits("");
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(mContext,R.layout.custom_spinner_layout,listfrom);
            adapter.setDropDownViewResource(R.layout.custom_spinner_layout);
            adapter.notifyDataSetChanged();
            spinnerfrom.setAdapter(adapter);
            spinnerfrom.setBackgroundColor(getResources().getColor(R.color.pressure_color));
            spinnerfrom.setPopupBackgroundResource(R.color.pressure_color);
            spinnerfrom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    String spfrom = String.valueOf(spinnerfrom.getSelectedItem());
                    List<String> listto = functions.getPressureUnits(spfrom);
                    ArrayAdapter<String> ad = new ArrayAdapter<String>(mContext,R.layout.custom_spinner_layout,listto);
                    ad.setDropDownViewResource(R.layout.custom_spinner_layout);
                    ad.notifyDataSetChanged();
                    spinnerto.setAdapter(ad);
                    spinnerto.setBackgroundColor(getResources().getColor(R.color.pressurelight_color));
                    spinnerto.setPopupBackgroundResource(R.color.pressurelight_color);
                }
                @Override
                public void onNothingSelected(AdapterView<?> parent) {}
            });
            tvUnitName.setText("Pressure");
        }
        else if (val == 10)
        {
            List<String> listfrom = functions.getForceUnits("");
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(mContext,R.layout.custom_spinner_layout,listfrom);
            adapter.setDropDownViewResource(R.layout.custom_spinner_layout);
            adapter.notifyDataSetChanged();
            spinnerfrom.setAdapter(adapter);
            spinnerfrom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    String spfrom = String.valueOf(spinnerfrom.getSelectedItem());
                    List<String> listto = functions.getForceUnits(spfrom);
                    ArrayAdapter<String> ad = new ArrayAdapter<String>(mContext,android.R.layout.simple_spinner_item,listto);
                    ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    ad.notifyDataSetChanged();
                    spinnerto.setAdapter(ad);
                }
                @Override
                public void onNothingSelected(AdapterView<?> parent) {}
            });
            tvUnitName.setText("Force");
        }

        etInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                callConvertFunction();
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        DownButtonFrom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spinnerfrom.performClick();
            }
        });
        DownButtonTO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spinnerto.performClick();
            }
        });


        spinnerto.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                callConvertFunction();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });


    }

    private void callConvertFunction()
    {
        String inputStr = etInput.getText().toString();
        if(inputStr.equals(""))
        {
        // show message that input cannot be empty
            tvResult.setText("0.00");
            return;
        }
        else {
            inputValue = Float.parseFloat(inputStr);
            if (val == 1) {
                temperatureUnit(spinnerfrom.getSelectedItem(), spinnerto.getSelectedItem());
            } else if (val == 2) {
                lengthUnit(spinnerfrom.getSelectedItem(), spinnerto.getSelectedItem());
            } else if (val == 3) {
                weightUnit(spinnerfrom.getSelectedItem(), spinnerto.getSelectedItem());
            } else if (val == 4) {
                speedUnit(spinnerfrom.getSelectedItem(), spinnerto.getSelectedItem());
            } else if (val == 5) {
                volumeUnit(spinnerfrom.getSelectedItem(), spinnerto.getSelectedItem());
            } else if (val == 6) {
                areaUnit(spinnerfrom.getSelectedItem(), spinnerto.getSelectedItem());
            } else if (val == 7) {
                fuelconsumptionUnit(spinnerfrom.getSelectedItem(), spinnerto.getSelectedItem());
            } else if (val == 8) {
                timeUnit(spinnerfrom.getSelectedItem(), spinnerto.getSelectedItem());
            } else if (val == 9) {
                pressureUnit(spinnerfrom.getSelectedItem(), spinnerto.getSelectedItem());
            } else if (val == 10) {
                forceUnit(spinnerfrom.getSelectedItem(), spinnerto.getSelectedItem());
            }
        }
    }

    private void forceUnit(Object selectedItem, Object selectedItem1) {
        // These will work when the Dynes will selected to convert into different units of Force from Utlility Class
        if (spinnerfrom.getSelectedItem().equals("Dynes") && spinnerto.getSelectedItem().equals("Kilograms Force")) {
            functions.convertDynestoKilogramForce(resulttext);// Funciton Call of convertDynestoKilogramForce from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertDynestoKilogramForce(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Dynes") && spinnerto.getSelectedItem().equals("Kip")) {
            functions.convertDynestoKip(resulttext);//Function Call of convertDynestoKip from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertDynestoKip(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Dynes") && spinnerto.getSelectedItem().equals("Newtons")) {
            functions.convertDynestoNewtons(resulttext);// Funciton Call of convertDynestoNewtons from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertDynestoNewtons(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Dynes") && spinnerto.getSelectedItem().equals("Pound Force")) {
            functions.convertDynestoPoundForce(resulttext);// Funciton Call of convertDynestoPoundForce from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertDynestoPoundForce(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Dynes") && spinnerto.getSelectedItem().equals("Tons Force")) {
            functions.convertDynestoTonForce(resulttext);// Funciton Call of convertDynestoTonForce from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertDynestoTonForce(inputValue)));
        }
        // These will work when the Kilograms Force will selected to convert into different units of Force from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Kilograms Force") && spinnerto.getSelectedItem().equals("Dynes")) {
            functions.convertKGForcetoDynes(resulttext);// Funciton Call of convertKGForcetoDynes from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKGForcetoDynes(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilograms Force") && spinnerto.getSelectedItem().equals("Kip")) {
            functions.convertKGForcetoKip(resulttext);//Function Call of convertKGForcetoKip from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKGForcetoKip(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilograms Force") && spinnerto.getSelectedItem().equals("Newtons")) {
            functions.convertKGForcetoNewton(resulttext);// Funciton Call of convertKGForcetoNewton from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKGForcetoNewton(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilograms Force") && spinnerto.getSelectedItem().equals("Pound Force")) {
            functions.convertKGForcetoPoundForce(resulttext);// Funciton Call of convertKGForcetoPoundForce from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKGForcetoPoundForce(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilograms Force") && spinnerto.getSelectedItem().equals("Tons Force")) {
            functions.convertKGForcetoTonsForce(resulttext);// Funciton Call of convertKGForcetoTonsForce from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKGForcetoTonsForce(inputValue)));
        }
        // These will work when the Kip will selected to convert into different units of Force from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Kip") && spinnerto.getSelectedItem().equals("Dynes")) {
            functions.convertKiptoDynes(resulttext);// Funciton Call of convertKiptoDynes from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKiptoDynes(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kip") && spinnerto.getSelectedItem().equals("Kilograms Force")) {
            functions.convertKiptoKGForce(resulttext);//Function Call of convertKiptoKGForce from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKiptoKGForce(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kip") && spinnerto.getSelectedItem().equals("Newtons")) {
            functions.convertKiptoNewtons(resulttext);// Funciton Call of convertKiptoNewtons from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKiptoNewtons(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kip") && spinnerto.getSelectedItem().equals("Pound Force")) {
            functions.convertKiptoPoundForce(resulttext);// Funciton Call of convertKiptoPoundForce from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKiptoPoundForce(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kip") && spinnerto.getSelectedItem().equals("Tons Force")) {
            functions.convertKiptoTonsFrce(resulttext);// Funciton Call of convertKiptoTonsFrce from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKiptoTonsFrce(inputValue)));
        }
        // These will work when Newtons will selected to convert into different units of Force from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Newtons") && spinnerto.getSelectedItem().equals("Dynes")) {
            functions.convertNewtonstoDynes(resulttext);// Funciton Call of convertNewtonstoDynes from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertNewtonstoDynes(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Newtons") && spinnerto.getSelectedItem().equals("Kilograms Force")) {
            functions.convertNewtonstoKgForce(resulttext);//Function Call of convertNewtonstoKgForce from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertNewtonstoKgForce(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Newtons") && spinnerto.getSelectedItem().equals("Kip")) {
            functions.convertNewtonstoKip(resulttext);// Funciton Call of convertNewtonstoKip from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertNewtonstoKip(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Newtons") && spinnerto.getSelectedItem().equals("Pound Force")) {
            functions.convertNewtonstoPoundForce(resulttext);// Funciton Call of convertNewtonstoPoundForce from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertNewtonstoPoundForce(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Newtons") && spinnerto.getSelectedItem().equals("Tons Force")) {
            functions.convertNewtonstoTonsForce(resulttext);// Funciton Call of convertNewtonstoTonsForce from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertNewtonstoTonsForce(inputValue)));
        }
        // These will work when Pound Force will selected to convert into different units of Force from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Pound Force") && spinnerto.getSelectedItem().equals("Dynes")) {
            functions.convertLBForcetoDynes(resulttext);// Funciton Call of convertLBForcetoDynes from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertLBForcetoDynes(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Pound Force") && spinnerto.getSelectedItem().equals("Kilograms Force")) {
            functions.convertLBForcetoKgForce(resulttext);//Function Call of convertLBForcetoKgForce from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertLBForcetoKgForce(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Pound Force") && spinnerto.getSelectedItem().equals("Kip")) {
            functions.convertLBForcetoKip(resulttext);// Funciton Call of convertLBForcetoKip from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertLBForcetoKip(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Pound Force") && spinnerto.getSelectedItem().equals("Newtons")) {
            functions.convertLBForcetoNewton(resulttext);// Funciton Call of convertLBForcetoNewton from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertLBForcetoNewton(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Pound Force") && spinnerto.getSelectedItem().equals("Tons Force")) {
            functions.convertLBForcetoTonsForce(resulttext);// Funciton Call of convertLBForcetoTonsForce from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertLBForcetoTonsForce(inputValue))) ;
        }
        // These will work when Tons Force will selected to convert into different units of Force from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Tons Force") && spinnerto.getSelectedItem().equals("Dynes")) {
            functions.convertTonsForcetoDynes(resulttext);// Funciton Call of convertTonsForcetoDynes from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertTonsForcetoDynes(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Tons Force") && spinnerto.getSelectedItem().equals("Kilograms Force")) {
            functions.convertTonsForcetoKgForce(resulttext);//Function Call of convertTonsForcetoKgForce from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertTonsForcetoKgForce(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Tons Force") && spinnerto.getSelectedItem().equals("Kip")) {
            functions.convertTonsForcetoKip(resulttext);// Funciton Call of convertTonsForcetoKip from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertTonsForcetoKip(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Tons Force") && spinnerto.getSelectedItem().equals("Newtons")) {
            functions.convertTonsForcetoNewtons(resulttext);// Funciton Call of convertTonsForcetoNewtons from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertTonsForcetoNewtons(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Tons Force") && spinnerto.getSelectedItem().equals("Pound Force")) {
            functions.convertTonsForcetoLbForce(resulttext);// Funciton Call of convertTonsForcetoLbForce from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertTonsForcetoLbForce(inputValue)));
        }
    }

    private void pressureUnit(Object selectedItem, Object selectedItem1) {
        // These will work when the Atmosphere will selected to convert into different units of Pressure from Utlility Class
        if (spinnerfrom.getSelectedItem().equals("Atmosphere") && spinnerto.getSelectedItem().equals("Bar")) {
            functions.convertAtmospheretoBar(resulttext);// Funciton Call of convertAtmospheretoBar from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertAtmospheretoBar(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Atmosphere") && spinnerto.getSelectedItem().equals("Pascal")) {
            functions.convertAtmospheretoPascal(resulttext);//Function Call of convertAtmospheretoPascal from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertAtmospheretoPascal(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Atmosphere") && spinnerto.getSelectedItem().equals("Pound/Square Inch")) {
            functions.convertAtmospheretoPoundperInch(resulttext);// Funciton Call of convertAtmospheretoPoundperInch from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertAtmospheretoPoundperInch(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Atmosphere") && spinnerto.getSelectedItem().equals("Torr")) {
            functions.convertAtmospheretoTorr(resulttext);// Funciton Call of convertAtmospheretoTorr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertAtmospheretoTorr(inputValue)));
        }
        // These will work when the Bar will selected to convert into different units of Pressure from Utlility Class
        if (spinnerfrom.getSelectedItem().equals("Bar") && spinnerto.getSelectedItem().equals("Atmosphere")) {
            functions.convertBartoAtmosphere(resulttext);// Funciton Call of convertBartoAtmosphere from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertBartoAtmosphere(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Bar") && spinnerto.getSelectedItem().equals("Pascal")) {
            functions.convertBartoPascal(resulttext);//Function Call of convertBartoPascal from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertBartoPascal(inputValue)) + " Pascal");
        } else if (spinnerfrom.getSelectedItem().equals("Bar") && spinnerto.getSelectedItem().equals("Pound/Square Inch")) {
            functions.convertBartoPoundperSQInches(resulttext);// Funciton Call of convertBartoPoundperSQInches from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertBartoPoundperSQInches(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Bar") && spinnerto.getSelectedItem().equals("Torr")) {
            functions.convertBartoTorr(resulttext);// Funciton Call of convertBartoTorr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertBartoTorr(inputValue)));
        }
        // These will work when the Pascal will selected to convert into different units of Pressure from Utlility Class
        if (spinnerfrom.getSelectedItem().equals("Pascal") && spinnerto.getSelectedItem().equals("Atmosphere")) {
            functions.convertPascaltoAtmosphere(resulttext);// Funciton Call of convertPascaltoAtmosphere from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertPascaltoAtmosphere(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Pascal") && spinnerto.getSelectedItem().equals("Bar")) {
            functions.convertPascaltoBar(resulttext);//Function Call of convertPascaltoBar from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertPascaltoBar(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Pascal") && spinnerto.getSelectedItem().equals("Pound/Square Inch")) {
            functions.convertPascaltoPoundperSqInches(resulttext);// Funciton Call of convertPascaltoPoundperSqInches from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertPascaltoPoundperSqInches(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Pascal") && spinnerto.getSelectedItem().equals("Torr")) {
            functions.convertPascaltoTorr(resulttext);// Funciton Call of convertPascaltoTorr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertPascaltoTorr(inputValue)));
        }
        // These will work when the Pound/Square Inch will selected to convert into different units of Pressure from Utlility Class
        if (spinnerfrom.getSelectedItem().equals("Pound/Square Inch") && spinnerto.getSelectedItem().equals("Atmosphere")) {
            functions.convertPoundperSqInchtoAtmosphere(resulttext);// Funciton Call of convertPoundperSqInchtoAtmosphere from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertPoundperSqInchtoAtmosphere(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Pound/Square Inch") && spinnerto.getSelectedItem().equals("Bar")) {
            functions.convertPoundperSqInchtoBar(resulttext);//Function Call of convertPoundperSqInchtoBar from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertPoundperSqInchtoBar(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Pound/Square Inch") && spinnerto.getSelectedItem().equals("Pascal")) {
            functions.convertPoundperSqInchtoPascal(resulttext);// Funciton Call of convertPoundperSqInchtoPascal from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertPoundperSqInchtoPascal(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Pound/Square Inch") && spinnerto.getSelectedItem().equals("Torr")) {
            functions.convertPoundperSqInchtoTorr(resulttext);// Funciton Call of convertPoundperSqInchtoTorr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertPoundperSqInchtoTorr(inputValue)));
        }
        // These will work when the Torr will selected to convert into different units of Pressure from Utlility Class
        if (spinnerfrom.getSelectedItem().equals("Torr") && spinnerto.getSelectedItem().equals("Atmosphere")) {
            functions.convertTorrtoAtmosphere(resulttext);// Funciton Call of convertTorrtoAtmosphere from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertTorrtoAtmosphere(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Torr") && spinnerto.getSelectedItem().equals("Bar")) {
            functions.convertTorrtoBar(resulttext);//Function Call of convertTorrtoBar from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertTorrtoBar(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Torr") && spinnerto.getSelectedItem().equals("Pascal")) {
            functions.convertTorrtoPascal(resulttext);// Funciton Call of convertTorrtoPascal from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertTorrtoPascal(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Torr") && spinnerto.getSelectedItem().equals("Pound/Square Inch")) {
            functions.convertTorrtoPoundperSqInch(resulttext);// Funciton Call of convertTorrtoPoundperSqInch from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertTorrtoPoundperSqInch(inputValue)));
        }
    }

    private void timeUnit(Object selectedItem, Object selectedItem1) {
        // These will work when the Millisecond will selected to convert into different units of Time from Utlility Class
        if (spinnerfrom.getSelectedItem().equals("Milliseconds") && spinnerto.getSelectedItem().equals("Seconds")) {
            functions.convertMillisecondtoSeconds(resulttext);// Funciton Call of convertMillisecondtoSeconds from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMillisecondtoSeconds(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Milliseconds") && spinnerto.getSelectedItem().equals("Minutes")) {
            functions.convertMillisecondtoMinutes(resulttext);// Funciton Call of convertMillisecondtoMinutes from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMillisecondtoMinutes(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Milliseconds") && spinnerto.getSelectedItem().equals("Hours")) {
            functions.convertMillisecondtoHours(resulttext);// Funciton Call of convertMillisecondtoHours from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMillisecondtoHours(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Milliseconds") && spinnerto.getSelectedItem().equals("Days")) {
            functions.convertMillisecondtoDays(resulttext);// Funciton Call of convertMillisecondtoDays from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMillisecondtoDays(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Milliseconds") && spinnerto.getSelectedItem().equals("Weeks")) {
            functions.convertMillisecondtoWeeks(resulttext);// Funciton Call of convertMillisecondtoWeeks from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMillisecondtoWeeks(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Milliseconds") && spinnerto.getSelectedItem().equals("Months")) {
            functions.convertMillisecondtoMonths(resulttext);// Funciton Call of convertMillisecondtoMonths from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMillisecondtoMonths(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Milliseconds") && spinnerto.getSelectedItem().equals("Years")) {
            functions.convertMillisecondtoYears(resulttext);// Funciton Call of convertMillisecondtoYears from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMillisecondtoYears(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Milliseconds") && spinnerto.getSelectedItem().equals("Leap Years")) {
            functions.convertMillisecondtoLeapyears(resulttext);// Funciton Call of convertMillisecondtoLeapyears from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMillisecondtoLeapyears(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Milliseconds") && spinnerto.getSelectedItem().equals("Decade")) {
            functions.convertMillisecondtoDecade(resulttext);// Funciton Call of convertMillisecondtoDecade from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMillisecondtoDecade(inputValue)));
        }
        // These will work when the Seconds will selected to convert into different units of Time from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Seconds") && spinnerto.getSelectedItem().equals("Milliseconds")) {
            functions.convertSecondtoMillisecond(resulttext);// Funciton Call of convertSecondtoMillisecond from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSecondtoMillisecond(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Seconds") && spinnerto.getSelectedItem().equals("Minutes")) {
            functions.convertSecondtoMinute(resulttext);// Funciton Call of convertSecondtoMinute from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSecondtoMinute(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Seconds") && spinnerto.getSelectedItem().equals("Hours")) {
            functions.convertSecondtoHours(resulttext);// Funciton Call of convertSecondtoHours from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSecondtoHours(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Seconds") && spinnerto.getSelectedItem().equals("Days")) {
            functions.convertSecondtoDays(resulttext);// Funciton Call of convertSecondtoDays from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSecondtoDays(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Seconds") && spinnerto.getSelectedItem().equals("Weeks")) {
            functions.convertSecondtoWeeks(resulttext);// Funciton Call of convertSecondtoWeeks from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSecondtoWeeks(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Seconds") && spinnerto.getSelectedItem().equals("Months")) {
            functions.convertSecondtoMonths(resulttext);// Funciton Call of convertSecondtoMonths from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSecondtoMonths(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Seconds") && spinnerto.getSelectedItem().equals("Years")) {
            functions.convertSecondtoYears(resulttext);// Funciton Call of convertSecondtoYears from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSecondtoYears(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Seconds") && spinnerto.getSelectedItem().equals("Leap Years")) {
            functions.convertSecondtoLeapYear(resulttext);// Funciton Call of convertSecondtoLeapYear from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSecondtoLeapYear(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Seconds") && spinnerto.getSelectedItem().equals("Decade")) {
            functions.convertSecondtoDecade(resulttext);// Funciton Call of convertSecondtoDecade from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSecondtoDecade(inputValue)));
        }
        // These will work when the Minutes will selected to convert into different units of Time from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Minutes") && spinnerto.getSelectedItem().equals("Milliseconds")) {
            functions.convertMinutetoMilliseconds(resulttext);// Funciton Call of convertMinutetoMilliseconds from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMinutetoMilliseconds(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Minutes") && spinnerto.getSelectedItem().equals("Seconds")) {
            functions.convertMinutetoSeconds(resulttext);// Funciton Call of convertMinutetoSeconds from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMinutetoSeconds(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Minutes") && spinnerto.getSelectedItem().equals("Hours")) {
            functions.convertMinutetoHours(resulttext);// Funciton Call of convertMinutetoHours from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMinutetoHours(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Minutes") && spinnerto.getSelectedItem().equals("Days")) {
            functions.convertMinutetoDays(resulttext);// Funciton Call of convertMinutetoDays from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMinutetoDays(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Minutes") && spinnerto.getSelectedItem().equals("Weeks")) {
            functions.convertMinutetoWeeks(resulttext);// Funciton Call of convertMinutetoWeeks from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMinutetoWeeks(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Minutes") && spinnerto.getSelectedItem().equals("Months")) {
            functions.convertMinutetoMonths(resulttext);// Funciton Call of convertMinutetoMonths from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMinutetoMonths(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Minutes") && spinnerto.getSelectedItem().equals("Years")) {
            functions.convertMinutetoYears(resulttext);// Funciton Call of convertMinutetoYears from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMinutetoYears(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Minutes") && spinnerto.getSelectedItem().equals("Leap Years")) {
            functions.convertMinutetoleapYear(resulttext);// Funciton Call of convertMinutetoleapYear from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMinutetoleapYear(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Minutes") && spinnerto.getSelectedItem().equals("Decade")) {
            functions.convertMinutetoDecade(resulttext);// Funciton Call of convertMinutetoDecade from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMinutetoDecade(inputValue)));
        }
        // These will work when the Hours will selected to convert into different units of Time from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Hours") && spinnerto.getSelectedItem().equals("Milliseconds")) {
            functions.convertHourtoMillisecond(resulttext);// Funciton Call of convertHourtoMillisecond from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertHourtoMillisecond(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Hours") && spinnerto.getSelectedItem().equals("Seconds")) {
            functions.convertHourtoSecond(resulttext);// Funciton Call of convertHourtoSecond from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertHourtoSecond(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Hours") && spinnerto.getSelectedItem().equals("Minutes")) {
            functions.convertHourtoMinute(resulttext);// Funciton Call of convertHourtoMinute from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertHourtoMinute(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Hours") && spinnerto.getSelectedItem().equals("Days")) {
            functions.convertHourtodays(resulttext);// Funciton Call of convertHourtodays from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertHourtodays(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Hours") && spinnerto.getSelectedItem().equals("Weeks")) {
            functions.convertHourtoWeeks(resulttext);// Funciton Call of convertHourtoWeeks from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertHourtoWeeks(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Hours") && spinnerto.getSelectedItem().equals("Months")) {
            functions.convertHourtoMonths(resulttext);// Funciton Call of convertHourtoMonths from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertHourtoMonths(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Hours") && spinnerto.getSelectedItem().equals("Years")) {
            functions.convertHourtoYears(resulttext);// Funciton Call of convertHourtoYears from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertHourtoYears(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Hours") && spinnerto.getSelectedItem().equals("Leap Years")) {
            functions.convertHourtoleapYear(resulttext);// Funciton Call of convertHourtoleapYear from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertHourtoleapYear(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Hours") && spinnerto.getSelectedItem().equals("Decade")) {
            functions.convertHourtoDecade(resulttext);// Funciton Call of convertHourtoDecade from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertHourtoDecade(inputValue)));
        }
        // These will work when the Days will selected to convert into different units of Time from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Days") && spinnerto.getSelectedItem().equals("Milliseconds")) {
            functions.convertDaystoMillisecond(resulttext);// Funciton Call of convertDaystoMillisecond from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertDaystoMillisecond(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Days") && spinnerto.getSelectedItem().equals("Seconds")) {
            functions.convertDaystoSecond(resulttext);// Funciton Call of convertDaystoSecond from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertDaystoSecond(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Days") && spinnerto.getSelectedItem().equals("Minutes")) {
            functions.convertDaystoMinute(resulttext);// Funciton Call of convertDaystoMinute from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertDaystoMinute(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Days") && spinnerto.getSelectedItem().equals("Hours")) {
            functions.convertDaystoHours(resulttext);// Funciton Call of convertDaystoHours from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertDaystoHours(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Days") && spinnerto.getSelectedItem().equals("Weeks")) {
            functions.convertDaystoWeeks(resulttext);// Funciton Call of convertDaystoWeeks from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertDaystoWeeks(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Days") && spinnerto.getSelectedItem().equals("Months")) {
            functions.convertDaystoMonths(resulttext);// Funciton Call of convertDaystoMonths from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertDaystoMonths(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Days") && spinnerto.getSelectedItem().equals("Years")) {
            functions.convertDaystoYears(resulttext);// Funciton Call of convertDaystoYears from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertDaystoYears(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Days") && spinnerto.getSelectedItem().equals("Leap Years")) {
            functions.convertDaystoLeapYear(resulttext);// Funciton Call of convertDaystoLeapYear from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertDaystoLeapYear(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Days") && spinnerto.getSelectedItem().equals("Decade")) {
            functions.convertDaystoDecade(resulttext);// Funciton Call of convertDaystoDecade from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertDaystoDecade(inputValue)));
        }
        // These will work when Weeks will selected to convert into different units of Time from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Weeks") && spinnerto.getSelectedItem().equals("Milliseconds")) {
            functions.convertWeekstoMilliseconds(resulttext);// Funciton Call of convertWeekstoMilliseconds from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertWeekstoMilliseconds(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Weeks") && spinnerto.getSelectedItem().equals("Seconds")) {
            functions.convertWeekstoSeconds(resulttext);// Funciton Call of convertWeekstoSeconds from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertWeekstoSeconds(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Weeks") && spinnerto.getSelectedItem().equals("Minutes")) {
            functions.convertWeekstoMinute(resulttext);// Funciton Call of convertWeekstoMinute from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertWeekstoMinute(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Weeks") && spinnerto.getSelectedItem().equals("Hours")) {
            functions.convertWeekstoHours(resulttext);// Funciton Call of convertWeekstoHours from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertWeekstoHours(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Weeks") && spinnerto.getSelectedItem().equals("Days")) {
            functions.convertWeekstoDays(resulttext);// Funciton Call of convertWeekstoDays from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertWeekstoDays(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Weeks") && spinnerto.getSelectedItem().equals("Months")) {
            functions.convertWeekstoMonths(resulttext);// Funciton Call of convertWeekstoMonths from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertWeekstoMonths(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Weeks") && spinnerto.getSelectedItem().equals("Years")) {
            functions.convertWeekstoYears(resulttext);// Funciton Call of convertWeekstoYears from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertWeekstoYears(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Weeks") && spinnerto.getSelectedItem().equals("Leap Years")) {
            functions.convertWeekstoLeapYear(resulttext);// Funciton Call of convertWeekstoLeapYear from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertWeekstoLeapYear(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Weeks") && spinnerto.getSelectedItem().equals("Decade")) {
            functions.convertWeekstoDecade(resulttext);// Funciton Call of convertWeekstoDecade from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertWeekstoDecade(inputValue)));
        }
        // These will work when Months will selected to convert into different units of Time from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Months") && spinnerto.getSelectedItem().equals("Milliseconds")) {
            functions.convertMonthstoMillisecond(resulttext);// Funciton Call of convertMonthstoMillisecond from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMonthstoMillisecond(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Months") && spinnerto.getSelectedItem().equals("Seconds")) {
            functions.convertMonthstoSecond(resulttext);// Funciton Call of convertMonthstoSecond from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMonthstoSecond(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Months") && spinnerto.getSelectedItem().equals("Minutes")) {
            functions.convertMonthstoMinute(resulttext);// Funciton Call of convertMonthstoMinute from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMonthstoMinute(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Months") && spinnerto.getSelectedItem().equals("Hours")) {
            functions.convertMonthstoHours(resulttext);// Funciton Call of convertMonthstoHours from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMonthstoHours(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Months") && spinnerto.getSelectedItem().equals("Days")) {
            functions.convertMonthstoDays(resulttext);// Funciton Call of convertMonthstoDays from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMonthstoDays(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Months") && spinnerto.getSelectedItem().equals("Weeks")) {
            functions.convertMonthstoWeeks(resulttext);// Funciton Call of convertMonthstoWeeks from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMonthstoWeeks(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Months") && spinnerto.getSelectedItem().equals("Years")) {
            functions.convertMonthstoYears(resulttext);// Funciton Call of convertMonthstoYears from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMonthstoYears(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Months") && spinnerto.getSelectedItem().equals("Leap Years")) {
            functions.convertMonthstoLeapYears(resulttext);// Funciton Call of convertMonthstoLeapYears from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMonthstoLeapYears(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Months") && spinnerto.getSelectedItem().equals("Decade")) {
            functions.convertMonthstoDecade(resulttext);// Funciton Call of convertMonthstoDecade from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMonthstoDecade(inputValue)));
        }
        // These will work when Years will selected to convert into different units of Time from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Years") && spinnerto.getSelectedItem().equals("Milliseconds")) {
            functions.convertYearstoMilliseconds(resulttext);// Funciton Call of convertYearstoMilliseconds from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYearstoMilliseconds(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Years") && spinnerto.getSelectedItem().equals("Seconds")) {
            functions.convertYearstoSeconds(resulttext);// Funciton Call of convertYearstoSeconds from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYearstoSeconds(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Years") && spinnerto.getSelectedItem().equals("Minutes")) {
            functions.convertYearstoMinutes(resulttext);// Funciton Call of convertYearstoMinutes from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYearstoMinutes(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Years") && spinnerto.getSelectedItem().equals("Hours")) {
            functions.convertYearstoHours(resulttext);// Funciton Call of convertYearstoHours from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYearstoHours(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Years") && spinnerto.getSelectedItem().equals("Days")) {
            functions.convertYearstoDays(resulttext);// Funciton Call of convertYearstoDays from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYearstoDays(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Years") && spinnerto.getSelectedItem().equals("Weeks")) {
            functions.convertYearstoWeeks(resulttext);// Funciton Call of convertYearstoWeeks from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYearstoWeeks(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Years") && spinnerto.getSelectedItem().equals("Months")) {
            functions.convertYearstoMonths(resulttext);// Funciton Call of convertYearstoMonths from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYearstoMonths(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Years") && spinnerto.getSelectedItem().equals("Leap Years")) {
            functions.convertYearstoLeapYears(resulttext);// Funciton Call of convertYearstoLeapYears from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYearstoLeapYears(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Years") && spinnerto.getSelectedItem().equals("Decade")) {
            functions.convertYearstoDecade(resulttext);// Funciton Call of convertYearstoDecade from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYearstoDecade(inputValue)));
        }
        // These will work when Leap Years will selected to convert into different units of Time from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Leap Years") && spinnerto.getSelectedItem().equals("Milliseconds")) {
            functions.convertYearstoMilliseconds(resulttext);// Funciton Call of convertYearstoMilliseconds from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYearstoMilliseconds(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Leap Years") && spinnerto.getSelectedItem().equals("Seconds")) {
            functions.convertYearstoSeconds(resulttext);// Funciton Call of convertYearstoSeconds from Utlility Class
        } else if (spinnerfrom.getSelectedItem().equals("Leap Years") && spinnerto.getSelectedItem().equals("Minutes")) {
            tvResult.setText(String.format("%.2f", functions.convertYearstoSeconds(inputValue)));
            functions.convertYearstoMinutes(resulttext);// Funciton Call of convertYearstoMinutes from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYearstoMinutes(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Leap Years") && spinnerto.getSelectedItem().equals("Hours")) {
            functions.convertYearstoHours(resulttext);// Funciton Call of convertYearstoHours from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYearstoHours(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Leap Years") && spinnerto.getSelectedItem().equals("Days")) {
            functions.convertYearstoDays(resulttext);// Funciton Call of convertYearstoDays from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYearstoDays(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Leap Years") && spinnerto.getSelectedItem().equals("Weeks")) {
            functions.convertYearstoWeeks(resulttext);// Funciton Call of convertYearstoWeeks from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYearstoWeeks(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Leap Years") && spinnerto.getSelectedItem().equals("Months")) {
            functions.convertYearstoMonths(resulttext);// Funciton Call of convertYearstoMonths from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYearstoMonths(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Leap Years") && spinnerto.getSelectedItem().equals("Years")) {
            functions.convertYearstoLeapYears(resulttext);// Funciton Call of convertYearstoLeapYears from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYearstoLeapYears(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Leap Years") && spinnerto.getSelectedItem().equals("Decade")) {
            functions.convertYearstoDecade(resulttext);// Funciton Call of convertYearstoDecade from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYearstoDecade(inputValue)));
        }
        // These will work when Decade will selected to convert into different units of Time from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Decade") && spinnerto.getSelectedItem().equals("Milliseconds")) {
            functions.convertDecadetoMillisecond(resulttext);// Funciton Call of convertDecadetoMillisecond from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertDecadetoMillisecond(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Decade") && spinnerto.getSelectedItem().equals("Seconds")) {
            functions.convertDecadetoSecond(resulttext);// Funciton Call of convertDecadetoSecond from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertDecadetoSecond(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Decade") && spinnerto.getSelectedItem().equals("Minutes")) {
            functions.convertDecadetoMinute(resulttext);// Funciton Call of convertDecadetoMinute from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertDecadetoMinute(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Decade") && spinnerto.getSelectedItem().equals("Hours")) {
            functions.convertDecadetoHours(resulttext);// Funciton Call of convertDecadetoHours from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertDecadetoHours(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Decade") && spinnerto.getSelectedItem().equals("Days")) {
            functions.convertDecadetoDays(resulttext);// Funciton Call of convertDecadetoDays from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertDecadetoDays(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Decade") && spinnerto.getSelectedItem().equals("Weeks")) {
            functions.convertDecadetoWeeks(resulttext);// Funciton Call of convertDecadetoWeeks from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertDecadetoWeeks(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Decade") && spinnerto.getSelectedItem().equals("Months")) {
            functions.convertDecadetoMonths(resulttext);// Funciton Call of convertDecadetoMonths from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertDecadetoMonths(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Decade") && spinnerto.getSelectedItem().equals("Years")) {
            functions.convertDecadetoYears(resulttext);// Funciton Call of convertDecadetoYears from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertDecadetoYears(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Decade") && spinnerto.getSelectedItem().equals("Leap Years")) {
            functions.convertDecadetoLeapYears(resulttext);// Funciton Call of convertDecadetoLeapYears from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertDecadetoLeapYears(inputValue)));
        }
    }

    private void fuelconsumptionUnit(Object selectedItem, Object selectedItem1) {
        // These will work when the Liters/Kilometer will selected to convert into different units of Fuel Consumption from Utlility Class
        if (spinnerfrom.getSelectedItem().equals("Liters/Kilometer") && spinnerto.getSelectedItem().equals("Liters/Miles")) {
            functions.convertLiterperKMtoLitersperMi(resulttext);// Funciton Call of convertLiterperKMtoLitersperMi from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertLiterperKMtoLitersperMi(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Liters/Kilometer") && spinnerto.getSelectedItem().equals("Gallons/Kilometer")) {
            functions.convertLiterperKMtoGallonsperKM(resulttext);//Function Call of convertLiterperKMtoGallonsperKM from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertLiterperKMtoGallonsperKM(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Liters/Kilometer") && spinnerto.getSelectedItem().equals("Gallons/Miles")) {
            functions.convertLiterperKMtoGallonsperMi(resulttext);// Funciton Call of convertLiterperKMtoGallonsperMi from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertLiterperKMtoGallonsperMi(inputValue)));
        }
        // These will work when the Liters/Miles will selected to convert into different units of Fuel Consumption from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Liters/Miles") && spinnerto.getSelectedItem().equals("Liters/Kilometer")) {
            functions.convertLiterperMItoLiterperKM(resulttext);// Funciton Call of convertLiterperMItoLiterperKM from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertLiterperMItoLiterperKM(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Liters/Miles") && spinnerto.getSelectedItem().equals("Gallons/Kilometer")) {
            functions.convertLiterperMItoGallonperKM(resulttext);//Function Call of convertLiterperMItoGallonperKM from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertLiterperMItoGallonperKM(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Liters/Miles") && spinnerto.getSelectedItem().equals("Gallons/Miles")) {
            functions.convertLiterperMItoGallonperMI(resulttext);// Funciton Call of convertLiterperMItoGallonperMI from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertLiterperMItoGallonperMI(inputValue)));
        }
        // These will work when the Gallons/Kilometer will selected to convert into different units of Fuel Consumption from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Gallons/Kilometer") && spinnerto.getSelectedItem().equals("Liters/Kilometer")) {
            functions.convertGallonsperKMtoLitersperKM(resulttext);// Funciton Call of convertGallonsperKMtoLitersperKM from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertGallonsperKMtoLitersperKM(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Gallons/Kilometer") && spinnerto.getSelectedItem().equals("Liters/Miles")) {
            functions.convertGallonsperKMtoLitersperMI(resulttext);//Function Call of convertGallonsperKMtoLitersperMI from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertGallonsperKMtoLitersperMI(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Gallons/Kilometer") && spinnerto.getSelectedItem().equals("Gallons/Miles")) {
            functions.convertGallonsperKMtoGallonsperMI(resulttext);// Funciton Call of convertGallonsperKMtoGallonsperMI from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertGallonsperKMtoGallonsperMI(inputValue)));
        }
        // These will work when the Gallons/Miles will selected to convert into different units of Fuel Consumption from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Gallons/Miles") && spinnerto.getSelectedItem().equals("Liters/Kilometer")) {
            functions.convertGallonsperMItoLitersperKM(resulttext);// Funciton Call of convertGallonsperMItoLitersperKM from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertGallonsperMItoLitersperKM(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Gallons/Miles") && spinnerto.getSelectedItem().equals("Liters/Miles")) {
            functions.convertGallonsperMItoLitersperMI(resulttext);//Function Call of convertGallonsperMItoLitersperMI from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertGallonsperMItoLitersperMI(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Gallons/Miles") && spinnerto.getSelectedItem().equals("Gallons/Kilometer")) {
            functions.convertGallonsperMItoGallonsperKM(resulttext);// Funciton Call of convertGallonsperMItoGallonsperKM from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertGallonsperMItoGallonsperKM(inputValue)));
        }
    }

    private void areaUnit(Object selectedItem, Object selectedItem1) {
        // These will work when the Square Centimeter will selected to convert into different units of Area from Utlility Class
        if (spinnerfrom.getSelectedItem().equals("Square Centimeter") && spinnerto.getSelectedItem().equals("Square meter")) {
            functions.convertSqCentimetertoSqMeter(resulttext);// Funciton Call of convertSqCentimetertoSqMeter from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqCentimetertoSqMeter(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Square Centimeter") && spinnerto.getSelectedItem().equals("Square Kilometer")) {
            functions.convertSqCentimetertoSqKilometer(resulttext);//Function Call of convertSqCentimetertoSqKilometer from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqCentimetertoSqKilometer(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Square Centimeter") && spinnerto.getSelectedItem().equals("Square Inch")) {
            functions.convertSqCentimetertoSqInches(resulttext);// Funciton Call of convertSqCentimetertoSqInches from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqCentimetertoSqInches(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Square Centimeter") && spinnerto.getSelectedItem().equals("Square Foot")) {
            functions.convertSqCentimetertoSqFoot(resulttext);//Function Call of convertSqCentimetertoSqFoot from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqCentimetertoSqFoot(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Square Centimeter") && spinnerto.getSelectedItem().equals("Square Yard")) {
            functions.convertSqCentimetertoSqYards(resulttext);// Funciton Call of convertSqCentimetertoSqYards from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqCentimetertoSqYards(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Square Centimeter") && spinnerto.getSelectedItem().equals("Square Mile")) {
            functions.convertSqCentimetertoSqMiles(resulttext);//Function Call of convertSqCentimetertoSqMiles from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqCentimetertoSqMiles(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Square Centimeter") && spinnerto.getSelectedItem().equals("Acre")) {
            functions.convertSqCentimetertoAcre(resulttext);// Funciton Call of convertSqCentimetertoAcre from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqCentimetertoAcre(inputValue)));
        }
        // These will work when the Square meter will selected to convert into different units of Area from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Square meter") && spinnerto.getSelectedItem().equals("Square Centimeter")) {
            functions.convertSqMetertoSqCentimeter(resulttext);// Funciton Call of convertSqMetertoSqCentimeter from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqMetertoSqCentimeter(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Square meter") && spinnerto.getSelectedItem().equals("Square Kilometer")) {
            functions.convertSqMetertoSqKilometer(resulttext);//Function Call of convertSqMetertoSqKilometer from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqMetertoSqKilometer(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Square meter") && spinnerto.getSelectedItem().equals("Square Inch")) {
            functions.convertSqMetertoSqInches(resulttext);// Funciton Call of convertSqMetertoSqInches from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqMetertoSqInches(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Square meter") && spinnerto.getSelectedItem().equals("Square Foot")) {
            functions.convertSqMetertoSqFoot(resulttext);//Function Call of convertSqMetertoSqFoot from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqMetertoSqFoot(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Square meter") && spinnerto.getSelectedItem().equals("Square Yard")) {
            functions.convertSqMetertoSqYards(resulttext);// Funciton Call of convertSqMetertoSqYards from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqMetertoSqYards(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Square meter") && spinnerto.getSelectedItem().equals("Square Mile")) {
            functions.convertSqMetertoSqMiles(resulttext);//Function Call of convertSqMetertoSqMiles from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqMetertoSqMiles(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Square meter") && spinnerto.getSelectedItem().equals("Acre")) {
            functions.convertSqMetertoAcre(resulttext);// Funciton Call of convertSqMetertoAcre from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqMetertoAcre(inputValue)));
        }
        // These will work when the Square Kilometer will selected to convert into different units of Area from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Square Kilometer") && spinnerto.getSelectedItem().equals("Square Centimeter")) {
            functions.convertSqKilometertoSqCenitmeter(resulttext);// Funciton Call of convertSqKilometertoSqCenitmeter from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqKilometertoSqCenitmeter(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Square Kilometer") && spinnerto.getSelectedItem().equals("Square meter")) {
            functions.convertSqKilometertoSqMeter(resulttext);//Function Call of convertSqKilometertoSqMeter from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqKilometertoSqMeter(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Square Kilometer") && spinnerto.getSelectedItem().equals("Square Inch")) {
            functions.convertSqKilometertoSqInches(resulttext);// Funciton Call of convertSqKilometertoSqInches from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqKilometertoSqInches(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Square Kilometer") && spinnerto.getSelectedItem().equals("Square Foot")) {
            functions.convertSqKilometertoSqFoot(resulttext);//Function Call of convertSqKilometertoSqFoot from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqKilometertoSqFoot(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Square Kilometer") && spinnerto.getSelectedItem().equals("Square Yard")) {
            functions.convertSqKilometertoSqYards(resulttext);// Funciton Call of convertSqKilometertoSqYards from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqKilometertoSqYards(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Square Kilometer") && spinnerto.getSelectedItem().equals("Square Mile")) {
            functions.convertSqKilometertoSqMiles(resulttext);//Function Call of convertSqKilometertoSqMiles from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqKilometertoSqMiles(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Square Kilometer") && spinnerto.getSelectedItem().equals("Acre")) {
            functions.convertSqKilometertoArce(resulttext);// Funciton Call of convertSqKilometertoArce from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqKilometertoArce(inputValue)));
        }
        // These will work when the Square Inches will selected to convert into different units of Area from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Square Inch") && spinnerto.getSelectedItem().equals("Square Centimeter")) {
            functions.convertSqInchestoSqCentimeter(resulttext);// Funciton Call of convertSqInchestoSqCentimeter from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqInchestoSqCentimeter(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Square Inch") && spinnerto.getSelectedItem().equals("Square meter")) {
            functions.convertSqInchestoSqmeter(resulttext);//Function Call of convertSqInchestoSqmeter from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqInchestoSqmeter(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Square Inch") && spinnerto.getSelectedItem().equals("Square Kilometer")) {
            functions.convertSqInchestoSqKilometer(resulttext);// Funciton Call of convertSqInchestoSqKilometer from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqInchestoSqKilometer(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Square Inch") && spinnerto.getSelectedItem().equals("Square Foot")) {
            functions.convertSqInchestoSqFoot(resulttext);//Function Call of convertSqInchestoSqFoot from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqInchestoSqFoot(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Square Inch") && spinnerto.getSelectedItem().equals("Square Yard")) {
            functions.convertSqInchestoSqYards(resulttext);// Funciton Call of convertSqInchestoSqYards from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqInchestoSqYards(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Square Inch") && spinnerto.getSelectedItem().equals("Square Mile")) {
            functions.convertSqInchestoSqMiles(resulttext);//Function Call of convertSqInchestoSqMiles from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqInchestoSqMiles(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Square Inch") && spinnerto.getSelectedItem().equals("Acre")) {
            functions.convertSqInchestoArce(resulttext);// Funciton Call of convertSqInchestoArce from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqInchestoArce(inputValue)));
        }
        // These will work when the Square Foot will selected to convert into different units of Area from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Square Foot") && spinnerto.getSelectedItem().equals("Square Centimeter")) {
            functions.convertSqFoottoSqCentimeter(resulttext);// Funciton Call of convertSqFoottoSqCentimeter from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqFoottoSqCentimeter(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Square Foot") && spinnerto.getSelectedItem().equals("Square meter")) {
            functions.convertSqFoottoSqMeter(resulttext);//Function Call of convertSqFoottoSqMeter from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqFoottoSqMeter(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Square Foot") && spinnerto.getSelectedItem().equals("Square Kilometer")) {
            functions.convertSqFoottoSqKilometer(resulttext);// Funciton Call of convertSqFoottoSqKilometer from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqFoottoSqKilometer(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Square Foot") && spinnerto.getSelectedItem().equals("Square Inch")) {
            functions.convertSqFoottoSqInches(resulttext);//Function Call of convertSqFoottoSqInches from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqFoottoSqInches(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Square Foot") && spinnerto.getSelectedItem().equals("Square Yard")) {
            functions.convertSqFoottoSqYards(resulttext);// Funciton Call of convertSqFoottoSqYards from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqFoottoSqYards(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Square Foot") && spinnerto.getSelectedItem().equals("Square Mile")) {
            functions.convertSqFoottoSqMiles(resulttext);//Function Call of convertSqFoottoSqMiles from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqFoottoSqMiles(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Square Foot") && spinnerto.getSelectedItem().equals("Acre")) {
            functions.convertSqFoottoArce(resulttext);// Funciton Call of convertSqFoottoArce from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqFoottoArce(inputValue)));
        }
        // These will work when the Square Yards will selected to convert into different units of Area from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Square Yard") && spinnerto.getSelectedItem().equals("Square Centimeter")) {
            functions.convertSqYardstoSqCentimeter(resulttext);// Funciton Call of convertSqYardstoSqCentimeter from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqYardstoSqCentimeter(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Square Yard") && spinnerto.getSelectedItem().equals("Square meter")) {
            functions.convertSqYardstoSqMeter(resulttext);//Function Call of convertSqYardstoSqMeter from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqYardstoSqMeter(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Square Yard") && spinnerto.getSelectedItem().equals("Square Kilometer")) {
            functions.convertSqYardstoSqKilometer(resulttext);// Funciton Call of convertSqYardstoSqKilometer from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqYardstoSqKilometer(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Square Yard") && spinnerto.getSelectedItem().equals("Square Inch")) {
            functions.convertSqYardstoSqInches(resulttext);//Function Call of convertSqYardstoSqInches from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqYardstoSqInches(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Square Yard") && spinnerto.getSelectedItem().equals("Square Foot")) {
            functions.convertSqYardstoSqFoot(resulttext);// Funciton Call of convertSqYardstoSqFoot from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqYardstoSqFoot(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Square Yard") && spinnerto.getSelectedItem().equals("Square Mile")) {
            functions.convertSqYardstoSqMiles(resulttext);//Function Call of convertSqYardstoSqMiles from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqYardstoSqMiles(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Square Yard") && spinnerto.getSelectedItem().equals("Acre")) {
            functions.convertSqYardstoAcre(resulttext);// Funciton Call of convertSqYardstoAcre from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqYardstoAcre(inputValue)));
        }
        // These will work when the Square Miles will selected to convert into different units of Area from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Square Mile") && spinnerto.getSelectedItem().equals("Square Centimeter")) {
            functions.convertSqMilestoSqCentimeter(resulttext);// Funciton Call of convertSqMilestoSqCentimeter from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqMilestoSqCentimeter(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Square Mile") && spinnerto.getSelectedItem().equals("Square meter")) {
            functions.convertSqMilestoSqMeter(resulttext);//Function Call of convertSqMilestoSqMeter from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqMilestoSqMeter(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Square Mile") && spinnerto.getSelectedItem().equals("Square Kilometer")) {
            functions.convertSqMilestoSqKilometer(resulttext);// Funciton Call of convertSqMilestoSqKilometer from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqMilestoSqKilometer(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Square Mile") && spinnerto.getSelectedItem().equals("Square Inch")) {
            functions.convertSqMilestoSqInches(resulttext);//Function Call of convertSqMilestoSqInches from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqMilestoSqInches(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Square Mile") && spinnerto.getSelectedItem().equals("Square Foot")) {
            functions.convertSqMilestoSqFoot(resulttext);// Funciton Call of convertSqMilestoSqFoot from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqMilestoSqFoot(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Square Mile") && spinnerto.getSelectedItem().equals("Square Yard")) {
            functions.convertSqMilestoSqYards(resulttext);//Function Call of convertSqMilestoSqYards from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqMilestoSqYards(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Square Mile") && spinnerto.getSelectedItem().equals("Acre")) {
            functions.convertSqMilestoAcre(resulttext);// Funciton Call of convertSqMilestoAcre from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertSqMilestoAcre(inputValue)));
        }
        // These will work when the Acre will selected to convert into different units of Area from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Acre") && spinnerto.getSelectedItem().equals("Square Centimeter")) {
            functions.convertAcretoSqCentimeter(resulttext);// Funciton Call of convertAcretoSqCentimeter from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertAcretoSqCentimeter(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Acre") && spinnerto.getSelectedItem().equals("Square meter")) {
            functions.convertAcretoSqMeter(resulttext);//Function Call of convertAcretoSqMeter from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertAcretoSqMeter(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Acre") && spinnerto.getSelectedItem().equals("Square Kilometer")) {
            functions.convertAcretoSqKilometer(resulttext);// Funciton Call of convertAcretoSqKilometer from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertAcretoSqKilometer(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Acre") && spinnerto.getSelectedItem().equals("Square Inch")) {
            functions.convertAcretoSqInches(resulttext);//Function Call of convertAcretoSqInches from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertAcretoSqInches(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Acre") && spinnerto.getSelectedItem().equals("Square Foot")) {
            functions.convertAcretoSqFoot(resulttext);// Funciton Call of convertAcretoSqFoot from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertAcretoSqFoot(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Acre") && spinnerto.getSelectedItem().equals("Square Yard")) {
            functions.convertAcretoSqYards(resulttext);//Function Call of convertAcretoSqYards from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertAcretoSqYards(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Acre") && spinnerto.getSelectedItem().equals("Square Mile")) {
            functions.convertAcretoSqMiles(resulttext);// Funciton Call of convertAcretoSqMiles from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertAcretoSqMiles(inputValue)));
        }
    }

    private void volumeUnit(Object selectedItem, Object selectedItem1) {
        // These will work when the MilliLiter will selected to convert into different units of Volume from Utlility Class
        if (spinnerfrom.getSelectedItem().equals("MilliLiter") && spinnerto.getSelectedItem().equals("Liter")) {
            functions.convertMillilitertoLiter(resulttext);// Funciton Call of convertMillilitertoLiter from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMillilitertoLiter(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("MilliLiter") && spinnerto.getSelectedItem().equals("Cubic Meter")) {
            functions.convertMillilitertoCubicMeter(resulttext);//Function Call of convertMillilitertoCubicMeter from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMillilitertoCubicMeter(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("MilliLiter") && spinnerto.getSelectedItem().equals("Cubic Foot/Feet")) {
            functions.convertMillilitertoCubicFoot(resulttext);// Funciton Call of convertMillilitertoCubicFoot from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMillilitertoCubicFoot(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("MilliLiter") && spinnerto.getSelectedItem().equals("Cubic Yard")) {
            functions.convertMillilitertoCubicYard(resulttext);// Funciton Call of convertMillilitertoCubicYard from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMillilitertoCubicYard(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("MilliLiter") && spinnerto.getSelectedItem().equals("Gallon")) {
            functions.convertMillilitertoGallons(resulttext);//Function Call of convertMillilitertoGallons from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMillilitertoGallons(inputValue)));
        }
        // These will work when the Liters will selected to convert into different units of Volume from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Liter") && spinnerto.getSelectedItem().equals("MilliLiter")) {
            functions.convertLiterstoMilliliter(resulttext);// Funciton Call of convertLiterstoMilliliter from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertLiterstoMilliliter(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Liter") && spinnerto.getSelectedItem().equals("Cubic Meter")) {
            functions.convertLiterstoCubicMeter(resulttext);//Function Call of convertLiterstoCubicMeter from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertLiterstoCubicMeter(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Liter") && spinnerto.getSelectedItem().equals("Cubic Foot/Feet")) {
            functions.convertLiterstoCubicFoot(resulttext);// Funciton Call of convertLiterstoCubicFoot from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertLiterstoCubicFoot(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Liter") && spinnerto.getSelectedItem().equals("Cubic Yard")) {
            functions.convertLiterstoCubicYards(resulttext);// Funciton Call of convertLiterstoCubicYards from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertLiterstoCubicYards(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Liter") && spinnerto.getSelectedItem().equals("Gallon")) {
            functions.convertLiterstoGallons(resulttext);//Function Call of convertLiterstoGallons from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertLiterstoGallons(inputValue)));
        }
        // These will work when the Cubic Meter will selected to convert into different units of Volume from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Cubic Meter") && spinnerto.getSelectedItem().equals("MilliLiter")) {
            functions.convertCubicMetertoMilliLiter(resulttext);// Funciton Call of convertCubicMetertoMilliLiter from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCubicMetertoMilliLiter(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Cubic Meter") && spinnerto.getSelectedItem().equals("Liter")) {
            functions.convertCubicMetertoLiters(resulttext);//Function Call of convertCubicMetertoLiters from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCubicMetertoLiters(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Cubic Meter") && spinnerto.getSelectedItem().equals("Cubic Foot/Feet")) {
            functions.convertCubicMetertoCubicFoot(resulttext);// Funciton Call of convertCubicMetertoCubicFoot from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCubicMetertoCubicFoot(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Cubic Meter") && spinnerto.getSelectedItem().equals("Cubic Yard")) {
            functions.convertCubicMetertoCubicYard(resulttext);// Funciton Call of convertCubicMetertoCubicYard from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCubicMetertoCubicYard(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Cubic Meter") && spinnerto.getSelectedItem().equals("Gallon")) {
            functions.convertCubicMetertoGallons(resulttext);//Function Call of convertCubicMetertoGallons from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCubicMetertoGallons(inputValue)));
        }
        // These will work when the Cubic Foot will selected to convert into different units of Volume from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Cubic Foot/Feet") && spinnerto.getSelectedItem().equals("MilliLiter")) {
            functions.convertCubicFoottoMilliLiter(resulttext);// Funciton Call of convertCubicFoottoMilliLiter from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCubicFoottoMilliLiter(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Cubic Foot/Feet") && spinnerto.getSelectedItem().equals("Liter")) {
            functions.convertCubicFoottoLiter(resulttext);//Function Call of convertCubicFoottoLiter from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCubicFoottoLiter(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Cubic Foot/Feet") && spinnerto.getSelectedItem().equals("Cubic Meter")) {
            functions.convertCubicFoottoCubicMeter(resulttext);// Funciton Call of convertCubicFoottoCubicMeter from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCubicFoottoCubicMeter(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Cubic Foot/Feet") && spinnerto.getSelectedItem().equals("Cubic Yard")) {
            functions.convertCubicFoottoCubicYard(resulttext);// Funciton Call of convertCubicFoottoCubicYard from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCubicFoottoCubicYard(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Cubic Foot/Feet") && spinnerto.getSelectedItem().equals("Gallon")) {
            functions.convertCubicFoottoGallons(resulttext);//Function Call of convertCubicFoottoGallons from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCubicFoottoGallons(inputValue)));
        }
        // These will work when the Cubic Yard will selected to convert into different units of Volume from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Cubic Yard") && spinnerto.getSelectedItem().equals("MilliLiter")) {
            functions.convertCubicYardtoMilliLiter(resulttext);// Funciton Call of convertCubicYardtoMilliLiter from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCubicYardtoMilliLiter(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Cubic Yard") && spinnerto.getSelectedItem().equals("Liter")) {
            functions.convertCubicYardtoLiter(resulttext);//Function Call of convertCubicYardtoLiter from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCubicYardtoLiter(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Cubic Yard") && spinnerto.getSelectedItem().equals("Cubic Meter")) {
            functions.convertCubicYardtoCubicMeter(resulttext);// Funciton Call of convertCubicYardtoCubicMeter from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCubicYardtoCubicMeter(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Cubic Yard") && spinnerto.getSelectedItem().equals("Cubic Foot/Feet")) {
            functions.convertCubicYardtoCubicFoot(resulttext);// Funciton Call of convertCubicYardtoCubicFoot from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCubicYardtoCubicFoot(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Cubic Yard") && spinnerto.getSelectedItem().equals("Gallon")) {
            functions.convertCubicYardtoGallon(resulttext);//Function Call of convertCubicYardtoGallon from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCubicYardtoGallon(inputValue)));
        }
        // These will work when the Gallons will selected to convert into different units of Volume from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Gallon") && spinnerto.getSelectedItem().equals("MilliLiter")) {
            functions.convertGallonstoMilliLiters(resulttext);// Funciton Call of convertGallonstoMilliLiters from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertGallonstoMilliLiters(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Gallon") && spinnerto.getSelectedItem().equals("Liter")) {
            functions.convertGallonstoLiters(resulttext);//Function Call of convertGallonstoLiters from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertGallonstoLiters(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Gallon") && spinnerto.getSelectedItem().equals("Cubic Meter")) {
            functions.convertGallonstoCubicMeter(resulttext);// Funciton Call of convertGallonstoCubicMeter from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertGallonstoCubicMeter(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Gallon") && spinnerto.getSelectedItem().equals("Cubic Foot/Feet")) {
            functions.convertGallonstoCubicFoot(resulttext);// Funciton Call of convertGallonstoCubicFoot from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertGallonstoCubicFoot(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Gallon") && spinnerto.getSelectedItem().equals("Cubic Yard")) {
            functions.convertGallonstoCubicYards(resulttext);//Function Call of convertGallonstoCubicYards from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertGallonstoCubicYards(inputValue)));
        }
    }

    private void speedUnit(Object selectedItem, Object selectedItem1) {
        // These will work when the Centimeter/hour will selected to convert into different units of Speed from Utlility Class
        if (spinnerfrom.getSelectedItem().equals("Centimeter/hour") && spinnerto.getSelectedItem().equals("Centimeter/minute")) {
            functions.convertCentimeterperhrtoCentimeterpermin(resulttext);// Funciton Call of convertCentimeterperhrtoCentimeterpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterperhrtoCentimeterpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/hour") && spinnerto.getSelectedItem().equals("Centimeter/second")) {
            functions.convertCentimeterperhrtoCentimeterpers(resulttext);//Function Call of convertCentimeterperhrtoCentimeterpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterperhrtoCentimeterpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/hour") && spinnerto.getSelectedItem().equals("Kilometer/hour")) {
            functions.convertCentimeterperhrtoKilometerperhr(resulttext);// Funciton Call of convertCentimeterperhrtoKilometerperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterperhrtoKilometerperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/hour") && spinnerto.getSelectedItem().equals("Kilometer/minute")) {
            functions.convertCentimeterperhrtoKilometerpermin(resulttext);//Function Call of convertCentimeterperhrtoKilometerpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterperhrtoKilometerpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/hour") && spinnerto.getSelectedItem().equals("Kilometer/second")) {
            functions.convertCentimeterperhrtoKilometerpers(resulttext);// Funciton Call of convertCentimeterperhrtoKilometerpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterperhrtoKilometerpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/hour") && spinnerto.getSelectedItem().equals("Meter/hour")) {
            functions.convertCentimeterperhrtoMeterperhr(resulttext);//Function Call of convertCentimeterperhrtoMeterperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterperhrtoMeterperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/hour") && spinnerto.getSelectedItem().equals("Meter/minute")) {
            functions.convertCentimeterperhrtoMeterpermin(resulttext);// Funciton Call of convertCentimeterperhrtoMeterpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterperhrtoMeterpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/hour") && spinnerto.getSelectedItem().equals("Meter/second")) {
            functions.convertCentimeterperhrtoMeterpers(resulttext);//Function Call of convertCentimeterperhrtoMeterpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterperhrtoMeterpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/hour") && spinnerto.getSelectedItem().equals("Mile/hour")) {
            functions.convertCentimeterperhrtoMileperhr(resulttext);// Funciton Call of convertCentimeterperhrtoMileperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterperhrtoMileperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/hour") && spinnerto.getSelectedItem().equals("Mile/minute")) {
            functions.convertCentimeterperhrtoMilepermin(resulttext);//Function Call of convertCentimeterperhrtoMilepermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterperhrtoMilepermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/hour") && spinnerto.getSelectedItem().equals("Mile/second")) {
            functions.convertCentimeterperhrtoMilepers(resulttext);//Function Call of convertCentimeterperhrtoMilepers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterperhrtoMilepers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/hour") && spinnerto.getSelectedItem().equals("Foot/hour")) {
            functions.convertCentimeterperhrtoFootperhr(resulttext);// Funciton Call of convertCentimeterperhrtoFootperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterperhrtoFootperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/hour") && spinnerto.getSelectedItem().equals("Foot/minute")) {
            functions.convertCentimeterperhrtoFootpermin(resulttext);//Function Call of convertCentimeterperhrtoFootpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterperhrtoFootpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/hour") && spinnerto.getSelectedItem().equals("Foot/second")) {
            functions.convertCentimeterperhrtoFootpers(resulttext);//Function Call of convertCentimeterperhrtoFootpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterperhrtoFootpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/hour") && spinnerto.getSelectedItem().equals("Yard/hour")) {
            functions.convertCentimeterperhrtoYardperhr(resulttext);// Funciton Call of convertCentimeterperhrtoYardperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterperhrtoYardperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/hour") && spinnerto.getSelectedItem().equals("Yard/minute")) {
            functions.convertCentimeterperhrtoYardpermin(resulttext);//Function Call of convertCentimeterperhrtoYardpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterperhrtoYardpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/hour") && spinnerto.getSelectedItem().equals("Yard/second")) {
            functions.convertCentimeterperhrtoYardpers(resulttext);//Function Call of convertCentimeterperhrtoYardpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterperhrtoYardpers(inputValue)));
        }
        // These will work when the Centimeter/minute will selected to convert into different units of Speed from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Centimeter/minute") && spinnerto.getSelectedItem().equals("Centimeter/hour")) {
            functions.convertCentimeterpermintoCenitmeterperhr(resulttext);// Funciton Call of convertCentimeterpermintoCenitmeterperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterpermintoCenitmeterperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/minute") && spinnerto.getSelectedItem().equals("Centimeter/second")) {
            functions.convertCentimeterpermintoCentimeterpers(resulttext);//Function Call of convertCentimeterpermintoCentimeterpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterpermintoCentimeterpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/minute") && spinnerto.getSelectedItem().equals("Kilometer/hour")) {
            functions.convertCentimeterpermintoKilometerperhr(resulttext);// Funciton Call of convertCentimeterpermintoKilometerperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterpermintoKilometerperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/minute") && spinnerto.getSelectedItem().equals("Kilometer/minute")) {
            functions.convertCentimeterpermintoKilometerpermin(resulttext);//Function Call of convertCentimeterpermintoKilometerpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterpermintoKilometerpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/minute") && spinnerto.getSelectedItem().equals("Kilometer/second")) {
            functions.convertCentimeterpermintoKilometerpers(resulttext);// Funciton Call of convertCentimeterpermintoKilometerpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterpermintoKilometerpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/minute") && spinnerto.getSelectedItem().equals("Meter/hour")) {
            functions.convertCentimeterpermintoMeterperhr(resulttext);//Function Call of convertCentimeterpermintoMeterperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterpermintoMeterperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/minute") && spinnerto.getSelectedItem().equals("Meter/minute")) {
            functions.convertCentimeterpermintoMeterpermin(resulttext);// Funciton Call of convertCentimeterpermintoMeterpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterpermintoMeterpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/minute") && spinnerto.getSelectedItem().equals("Meter/second")) {
            functions.convertCentimeterpermintoMeterpers(resulttext);//Function Call of convertCentimeterpermintoMeterpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterpermintoMeterpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/minute") && spinnerto.getSelectedItem().equals("Mile/hour")) {
            functions.convertCentimeterpermintoMileperhr(resulttext);// Funciton Call of convertCentimeterpermintoMileperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterpermintoMileperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/minute") && spinnerto.getSelectedItem().equals("Mile/minute")) {
            functions.convertCentimeterpermintoMilepermin(resulttext);//Function Call of convertCentimeterpermintoMilepermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterpermintoMilepermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/minute") && spinnerto.getSelectedItem().equals("Mile/second")) {
            functions.convertCentimeterpermintoMilepers(resulttext);//Function Call of convertCentimeterpermintoMilepers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterpermintoMilepers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/minute") && spinnerto.getSelectedItem().equals("Foot/hour")) {
            functions.convertCentimeterpermintoFootperhr(resulttext);// Funciton Call of convertCentimeterpermintoFootperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterpermintoFootperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/minute") && spinnerto.getSelectedItem().equals("Foot/minute")) {
            functions.convertCentimeterpermintoFootpermin(resulttext);//Function Call of convertCentimeterpermintoFootpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterpermintoFootpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/minute") && spinnerto.getSelectedItem().equals("Foot/second")) {
            functions.convertCentimeterpermintoFootpers(resulttext);//Function Call of convertCentimeterpermintoFootpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterpermintoFootpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/minute") && spinnerto.getSelectedItem().equals("Yard/hour")) {
            functions.convertCentimeterpermintoYardperhr(resulttext);// Funciton Call of convertCentimeterpermintoYardperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterpermintoYardperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/minute") && spinnerto.getSelectedItem().equals("Yard/minute")) {
            functions.convertCentimeterpermintoYardpermin(resulttext);//Function Call of convertCentimeterpermintoYardpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterpermintoYardpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/minute") && spinnerto.getSelectedItem().equals("Yard/second")) {
            functions.convertCentimeterpermintoYardpers(resulttext);//Function Call of convertCentimeterpermintoYardpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterpermintoYardpers(inputValue)));
        }
        // These will work when the Centimeter/second will selected to convert into different units of Speed from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Centimeter/second") && spinnerto.getSelectedItem().equals("Centimeter/hour")) {
            functions.convertCentimeterperStoCentimeterperhr(resulttext);// Funciton Call of convertCentimeterperStoCentimeterperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterperStoCentimeterperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/second") && spinnerto.getSelectedItem().equals("Centimeter/minute")) {
            functions.convertCentimeterperStoCentimeterpermin(resulttext);//Function Call of convertCentimeterperStoCentimeterpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterperStoCentimeterpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/second") && spinnerto.getSelectedItem().equals("Kilometer/hour")) {
            functions.convertCentimeterperStokilometerperhr(resulttext);// Funciton Call of convertCentimeterperStokilometerperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterperStokilometerperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/second") && spinnerto.getSelectedItem().equals("Kilometer/minute")) {
            functions.convertCentimeterperStoKilometerpermin(resulttext);//Function Call of convertCentimeterperStoKilometerpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterperStoKilometerpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/second") && spinnerto.getSelectedItem().equals("Kilometer/second")) {
            functions.convertCentimeterperStoKilometerpers(resulttext);// Funciton Call of convertCentimeterperStoKilometerpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterperStoKilometerpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/second") && spinnerto.getSelectedItem().equals("Meter/hour")) {
            functions.convertCentimeterperStoMeterperhr(resulttext);//Function Call of convertCentimeterperStoMeterperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterperStoMeterperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/second") && spinnerto.getSelectedItem().equals("Meter/minute")) {
            functions.convertCentimeterperStoMeterpermin(resulttext);// Funciton Call of convertCentimeterperStoMeterpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterperStoMeterpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/second") && spinnerto.getSelectedItem().equals("Meter/second")) {
            functions.convertCentimeterperStoMeterpers(resulttext);//Function Call of convertCentimeterperStoMeterpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterperStoMeterpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/second") && spinnerto.getSelectedItem().equals("Mile/hour")) {
            functions.convertCentimeterperStoMileperhr(resulttext);// Funciton Call of convertCentimeterperStoMileperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterperStoMileperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/second") && spinnerto.getSelectedItem().equals("Mile/minute")) {
            functions.convertCentimeterperStoMilepermin(resulttext);//Function Call of convertCentimeterperStoMilepermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterperStoMilepermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/second") && spinnerto.getSelectedItem().equals("Mile/second")) {
            functions.convertCentimeterperStoMilepers(resulttext);//Function Call of convertCentimeterperStoMilepers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterperStoMilepers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/second") && spinnerto.getSelectedItem().equals("Foot/hour")) {
            functions.convertCentimeterperStoFootperhr(resulttext);// Funciton Call of convertCentimeterperStoFootperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterperStoFootperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/second") && spinnerto.getSelectedItem().equals("Foot/minute")) {
            functions.convertCentimeterperStoFootpermin(resulttext);//Function Call of convertCentimeterperStoFootpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterperStoFootpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/second") && spinnerto.getSelectedItem().equals("Foot/second")) {
            functions.convertCentimeterperStoFootpers(resulttext);//Function Call of convertCentimeterperStoFootpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterperStoFootpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/second") && spinnerto.getSelectedItem().equals("Yard/hour")) {
            functions.convertCentimeterperStoYardperhr(resulttext);// Funciton Call of convertCentimeterperStoYardperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterperStoYardperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/second") && spinnerto.getSelectedItem().equals("Yard/minute")) {
            functions.convertCentimeterperStoYardpermin(resulttext);//Function Call of convertCentimeterperStoYardpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterperStoYardpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter/second") && spinnerto.getSelectedItem().equals("Yard/second")) {
            functions.convertCentimeterperStoYardpers(resulttext);//Function Call of convertCentimeterperStoYardpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentimeterperStoYardpers(inputValue)));
        }
        // These will work when the Kilometer/hour will selected to convert into different units of Speed from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Kilometer/hour") && spinnerto.getSelectedItem().equals("Centimeter/hour")) {
            functions.convertKilometerperHRtoCentimeterperhr(resulttext);// Funciton Call of convertKilometerperHRtoCentimeterperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperHRtoCentimeterperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/hour") && spinnerto.getSelectedItem().equals("Centimeter/minute")) {
            functions.convertKilometerperHRtoCentimeterpermin(resulttext);//Function Call of convertKilometerperHRtoCentimeterpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperHRtoCentimeterpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/hour") && spinnerto.getSelectedItem().equals("Centimeter/second")) {
            functions.convertKilometerperHRtoCentimeterpers(resulttext);// Funciton Call of convertKilometerperHRtoCentimeterpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperHRtoCentimeterpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/hour") && spinnerto.getSelectedItem().equals("Kilometer/minute")) {
            functions.convertKilometerperHRtoKilometerpermin(resulttext);//Function Call of convertKilometerperHRtoKilometerpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperHRtoKilometerpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/hour") && spinnerto.getSelectedItem().equals("Kilometer/second")) {
            functions.convertKilometerperHRtoKilometerpers(resulttext);// Funciton Call of convertKilometerperHRtoKilometerpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperHRtoKilometerpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/hour") && spinnerto.getSelectedItem().equals("Meter/hour")) {
            functions.convertKilometerperHRtoMeterperhr(resulttext);//Function Call of convertKilometerperHRtoMeterperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperHRtoMeterperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/hour") && spinnerto.getSelectedItem().equals("Meter/minute")) {
            functions.convertKilometerperHRtoMeterpermin(resulttext);// Funciton Call of convertKilometerperHRtoMeterpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperHRtoMeterpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/hour") && spinnerto.getSelectedItem().equals("Meter/second")) {
            functions.convertKilometerperHRtoMeterpers(resulttext);//Function Call of convertKilometerperHRtoMeterpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperHRtoMeterpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/hour") && spinnerto.getSelectedItem().equals("Mile/hour")) {
            functions.convertKilometerperHRtoMileperhr(resulttext);// Funciton Call of convertKilometerperHRtoMileperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperHRtoMileperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/hour") && spinnerto.getSelectedItem().equals("Mile/minute")) {
            functions.convertKilometerperHRtoMilepermin(resulttext);//Function Call of convertKilometerperHRtoMilepermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperHRtoMilepermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/hour") && spinnerto.getSelectedItem().equals("Mile/second")) {
            functions.convertKilometerperHRtoMilepers(resulttext);//Function Call of convertKilometerperHRtoMilepers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperHRtoMilepers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/hour") && spinnerto.getSelectedItem().equals("Foot/hour")) {
            functions.convertKilometerperHRtoFootperhr(resulttext);// Funciton Call of convertKilometerperHRtoFootperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperHRtoFootperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/hour") && spinnerto.getSelectedItem().equals("Foot/minute")) {
            functions.convertKilometerperHRtoFootpermin(resulttext);//Function Call of convertKilometerperHRtoFootpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperHRtoFootpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/hour") && spinnerto.getSelectedItem().equals("Foot/second")) {
            functions.convertKilometerperHRtoFootpers(resulttext);//Function Call of convertKilometerperHRtoFootpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperHRtoFootpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/hour") && spinnerto.getSelectedItem().equals("Yard/hour")) {
            functions.convertKilometerperHRtoYardperhr(resulttext);// Funciton Call of convertKilometerperHRtoYardperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperHRtoYardperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/hour") && spinnerto.getSelectedItem().equals("Yard/minute")) {
            functions.convertKilometerperHRtoYardpermin(resulttext);//Function Call of convertKilometerperHRtoYardpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperHRtoYardpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/hour") && spinnerto.getSelectedItem().equals("Yard/second")) {
            functions.convertKilometerperHRtoYardpers(resulttext);//Function Call of convertKilometerperHRtoYardpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperHRtoYardpers(inputValue)));
        }
        // These will work when the Kilometer/minute will selected to convert into different units of Speed from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Kilometer/minute") && spinnerto.getSelectedItem().equals("Centimeter/hour")) {
            functions.convertKilometerperMintoCentimeterperhr(resulttext);// Funciton Call of convertKilometerperMintoCentimeterperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperMintoCentimeterperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/minute") && spinnerto.getSelectedItem().equals("Centimeter/minute")) {
            functions.convertKilometerperMintoCentimeterpermin(resulttext);//Function Call of convertKilometerperMintoCentimeterpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperMintoCentimeterpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/minute") && spinnerto.getSelectedItem().equals("Centimeter/second")) {
            functions.convertKilometerperMintoCentimeterpers(resulttext);// Funciton Call of convertKilometerperMintoCentimeterpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperMintoCentimeterpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/minute") && spinnerto.getSelectedItem().equals("Kilometer/hour")) {
            functions.convertKilometerperMintoKilometerperhr(resulttext);//Function Call of convertKilometerperMintoKilometerperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperMintoKilometerperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/minute") && spinnerto.getSelectedItem().equals("Kilometer/second")) {
            functions.convertKilometerperMintoKilometerpers(resulttext);// Funciton Call of convertKilometerperMintoKilometerpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperMintoKilometerpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/minute") && spinnerto.getSelectedItem().equals("Meter/hour")) {
            functions.convertKilometerperMintoMeterperhr(resulttext);//Function Call of convertKilometerperMintoMeterperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperMintoMeterperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/minute") && spinnerto.getSelectedItem().equals("Meter/minute")) {
            functions.convertKilometerperMintoMeterpermin(resulttext);// Funciton Call of convertKilometerperMintoMeterpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperMintoMeterpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/minute") && spinnerto.getSelectedItem().equals("Meter/second")) {
            functions.convertKilometerperMintoMeterpers(resulttext);//Function Call of convertKilometerperMintoMeterpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperMintoMeterpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/minute") && spinnerto.getSelectedItem().equals("Mile/hour")) {
            functions.convertKilometerperMintoMileperhr(resulttext);// Funciton Call of convertKilometerperMintoMileperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperMintoMileperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/minute") && spinnerto.getSelectedItem().equals("Mile/minute")) {
            functions.convertKilometerperMintoMilepermin(resulttext);//Function Call of convertKilometerperMintoMilepermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperMintoMilepermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/minute") && spinnerto.getSelectedItem().equals("Mile/second")) {
            functions.convertKilometerperMintoMilepers(resulttext);//Function Call of convertKilometerperMintoMilepers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperMintoMilepers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/minute") && spinnerto.getSelectedItem().equals("Foot/hour")) {
            functions.convertKilometerperMintoFootperhr(resulttext);// Funciton Call of convertKilometerperMintoFootperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperMintoFootperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/minute") && spinnerto.getSelectedItem().equals("Foot/minute")) {
            functions.convertKilometerperMintoFootpermin(resulttext);//Function Call of convertKilometerperMintoFootpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperMintoFootpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/minute") && spinnerto.getSelectedItem().equals("Foot/second")) {
            functions.convertKilometerperMintoFootpers(resulttext);//Function Call of convertKilometerperMintoFootpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperMintoFootpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/minute") && spinnerto.getSelectedItem().equals("Yard/hour")) {
            functions.convertKilometerperMintoYardperhr(resulttext);// Funciton Call of convertKilometerperMintoYardperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperMintoYardperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/minute") && spinnerto.getSelectedItem().equals("Yard/minute")) {
            functions.convertKilometerperMintoYardpermin(resulttext);//Function Call of convertKilometerperMintoYardpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperMintoYardpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/minute") && spinnerto.getSelectedItem().equals("Yard/second")) {
            functions.convertKilometerperMintoYardpers(resulttext);//Function Call of convertKilometerperHRtoYardpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperMintoYardpers(inputValue)));
        }
        // These will work when the Kilometer/second will selected to convert into different units of Speed from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Kilometer/second") && spinnerto.getSelectedItem().equals("Centimeter/hour")) {
            functions.convertKilometerperStoCentimeterperhr(resulttext);// Funciton Call of convertKilometerperStoCentimeterperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperStoCentimeterperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/second") && spinnerto.getSelectedItem().equals("Centimeter/minute")) {
            functions.convertKilometerperStoCentimeterpermin(resulttext);//Function Call of convertKilometerperStoCentimeterpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperStoCentimeterpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/second") && spinnerto.getSelectedItem().equals("Centimeter/second")) {
            functions.convertKilometerperStoCentimeterpers(resulttext);// Funciton Call of convertKilometerperStoCentimeterpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperStoCentimeterpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/second") && spinnerto.getSelectedItem().equals("Kilometer/hour")) {
            functions.convertKilometerperStoKilometerperhr(resulttext);//Function Call of convertKilometerperStoKilometerperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperStoKilometerperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/second") && spinnerto.getSelectedItem().equals("Kilometer/minute")) {
            functions.convertKilometerperStoKilometerpermin(resulttext);// Funciton Call of convertKilometerperStoKilometerpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperStoKilometerpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/second") && spinnerto.getSelectedItem().equals("Meter/hour")) {
            functions.convertKilometerperStoMeterperhr(resulttext);//Function Call of convertKilometerperStoMeterperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperStoMeterperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/second") && spinnerto.getSelectedItem().equals("Meter/minute")) {
            functions.convertKilometerperStoMeterpermin(resulttext);// Funciton Call of convertKilometerperStoMeterpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperStoMeterpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/second") && spinnerto.getSelectedItem().equals("Meter/second")) {
            functions.convertKilometerperStoMeterpers(resulttext);//Function Call of convertKilometerperStoMeterpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperStoMeterpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/second") && spinnerto.getSelectedItem().equals("Mile/hour")) {
            functions.convertKilometerperStoMileperhr(resulttext);// Funciton Call of convertKilometerperStoMileperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperStoMileperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/second") && spinnerto.getSelectedItem().equals("Mile/minute")) {
            functions.convertKilometerperStoMilepermin(resulttext);//Function Call of convertKilometerperStoMilepermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperStoMilepermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/second") && spinnerto.getSelectedItem().equals("Mile/second")) {
            functions.convertKilometerperStoMilepers(resulttext);//Function Call of convertKilometerperStoMilepers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperStoMilepers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/second") && spinnerto.getSelectedItem().equals("Foot/hour")) {
            functions.convertKilometerperStoFootperhr(resulttext);// Funciton Call of convertKilometerperStoFootperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperStoFootperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/second") && spinnerto.getSelectedItem().equals("Foot/minute")) {
            functions.convertKilometerperStoFootpermin(resulttext);//Function Call of convertKilometerperStoFootpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperStoFootpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/second") && spinnerto.getSelectedItem().equals("Foot/second")) {
            functions.convertKilometerperStoFootpers(resulttext);//Function Call of convertKilometerperStoFootpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperStoFootpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/second") && spinnerto.getSelectedItem().equals("Yard/hour")) {
            functions.convertKilometerperStoYardperhr(resulttext);// Funciton Call of convertKilometerperStoYardperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperStoYardperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/second") && spinnerto.getSelectedItem().equals("Yard/minute")) {
            functions.convertKilometerperStoYardpermin(resulttext);//Function Call of convertKilometerperStoYardpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperStoYardpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer/second") && spinnerto.getSelectedItem().equals("Yard/second")) {
            functions.convertKilometerperStoYardpers(resulttext);//Function Call of convertKilometerperStoYardpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilometerperStoYardpers(inputValue)));
        }
        // These will work when the Meter/hour will selected to convert into different units of Speed from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Meter/hour") && spinnerto.getSelectedItem().equals("Centimeter/hour")) {
            functions.convertMeterperHRtoCentimeterperhr(resulttext);// Funciton Call of convertMeterperHRtoCentimeterperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperHRtoCentimeterperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/hour") && spinnerto.getSelectedItem().equals("Centimeter/minute")) {
            functions.convertMeterperHRtoCentimeterpermin(resulttext);//Function Call of convertMeterperHRtoCentimeterpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperHRtoCentimeterpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/hour") && spinnerto.getSelectedItem().equals("Centimeter/second")) {
            functions.convertMeterperHRtoCentimeterpers(resulttext);// Funciton Call of convertMeterperHRtoCentimeterpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperHRtoCentimeterpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/hour") && spinnerto.getSelectedItem().equals("Kilometer/hour")) {
            functions.convertMeterperHRtoKilometerperhr(resulttext);//Function Call of convertMeterperHRtoKilometerperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperHRtoKilometerperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/hour") && spinnerto.getSelectedItem().equals("Kilometer/minute")) {
            functions.convertMeterperHRtoKilometerpermin(resulttext);// Funciton Call of convertMeterperHRtoKilometerpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperHRtoKilometerpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/hour") && spinnerto.getSelectedItem().equals("Kilometer/second")) {
            functions.convertMeterperHRtoKilometerpers(resulttext);//Function Call of convertMeterperHRtoKilometerpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperHRtoKilometerpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/hour") && spinnerto.getSelectedItem().equals("Meter/minute")) {
            functions.convertMeterperHRtoMeterpermin(resulttext);// Funciton Call of convertMeterperHRtoMeterpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperHRtoMeterpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/hour") && spinnerto.getSelectedItem().equals("Meter/second")) {
            functions.convertMeterperHRtoMeterpers(resulttext);//Function Call of convertMeterperHRtoMeterpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperHRtoMeterpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/hour") && spinnerto.getSelectedItem().equals("Mile/hour")) {
            functions.convertMeterperHRtoMileperhr(resulttext);// Funciton Call of convertMeterperHRtoMileperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperHRtoMileperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/hour") && spinnerto.getSelectedItem().equals("Mile/minute")) {
            functions.convertMeterperHRtoMilepermin(resulttext);//Function Call of convertMeterperHRtoMilepermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperHRtoMilepermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/hour") && spinnerto.getSelectedItem().equals("Mile/second")) {
            functions.convertMeterperHRtoMilepers(resulttext);//Function Call of convertMeterperHRtoMilepers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperHRtoMilepers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/hour") && spinnerto.getSelectedItem().equals("Foot/hour")) {
            functions.convertMeterperHRtoFootperhr(resulttext);// Funciton Call of convertMeterperHRtoFootperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperHRtoFootperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/hour") && spinnerto.getSelectedItem().equals("Foot/minute")) {
            functions.convertMeterperHRtoFootpermin(resulttext);//Function Call of convertMeterperHRtoFootpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperHRtoFootpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/hour") && spinnerto.getSelectedItem().equals("Foot/second")) {
            functions.convertMeterperHRtoFootpers(resulttext);//Function Call of convertMeterperHRtoFootpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperHRtoFootpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/hour") && spinnerto.getSelectedItem().equals("Yard/hour")) {
            functions.convertMeterperHRtoYardperhr(resulttext);// Funciton Call of convertMeterperHRtoYardperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperHRtoYardperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/hour") && spinnerto.getSelectedItem().equals("Yard/minute")) {
            functions.convertMeterperHRtoYardpermin(resulttext);//Function Call of convertMeterperHRtoYardpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperHRtoYardpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/hour") && spinnerto.getSelectedItem().equals("Yard/second")) {
            functions.convertMeterperHRtoYardpers(resulttext);//Function Call of convertMeterperHRtoYardpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperHRtoYardpers(inputValue)));
        }

        // These will work when the Meter/minute will selected to convert into different units of Speed from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Meter/minute") && spinnerto.getSelectedItem().equals("Centimeter/hour")) {
            functions.convertMeterperMintoCentimeterperhr(resulttext);// Funciton Call of convertMeterperMintoCentimeterperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperMintoCentimeterperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/minute") && spinnerto.getSelectedItem().equals("Centimeter/minute")) {
            functions.convertMeterperMintoCentimeterpermin(resulttext);//Function Call of convertMeterperMintoCentimeterpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperMintoCentimeterpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/minute") && spinnerto.getSelectedItem().equals("Centimeter/second")) {
            functions.convertMeterperMintoCentimeterpers(resulttext);// Funciton Call of convertMeterperMintoCentimeterpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperMintoCentimeterpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/minute") && spinnerto.getSelectedItem().equals("Kilometer/hour")) {
            functions.convertMeterperMintoKilometerperhr(resulttext);//Function Call of convertMeterperMintoKilometerperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperMintoKilometerperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/minute") && spinnerto.getSelectedItem().equals("Kilometer/minute")) {
            functions.convertMeterperMintoKilometerpermin(resulttext);// Funciton Call of convertMeterperMintoKilometerpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperMintoKilometerpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/minute") && spinnerto.getSelectedItem().equals("Kilometer/second")) {
            functions.convertMeterperMintoKilometerpers(resulttext);//Function Call of convertMeterperMintoKilometerpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperMintoKilometerpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/minute") && spinnerto.getSelectedItem().equals("Meter/hour")) {
            functions.convertMeterperMintoMeterperhr(resulttext);// Funciton Call of convertMeterperMintoMeterperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperMintoMeterperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/minute") && spinnerto.getSelectedItem().equals("Meter/second")) {
            functions.convertMeterperMintoMeterpers(resulttext);//Function Call of convertMeterperMintoMeterpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperMintoMeterpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/minute") && spinnerto.getSelectedItem().equals("Mile/hour")) {
            functions.convertMeterperMintoMileperhr(resulttext);// Funciton Call of convertMeterperMintoMileperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperMintoMileperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/minute") && spinnerto.getSelectedItem().equals("Mile/minute")) {
            functions.convertMeterperMintoMilepermin(resulttext);//Function Call of convertMeterperMintoMilepermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperMintoMilepermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/minute") && spinnerto.getSelectedItem().equals("Mile/second")) {
            functions.convertMeterperMintoMilepers(resulttext);//Function Call of convertMeterperMintoMilepers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperMintoMilepers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/minute") && spinnerto.getSelectedItem().equals("Foot/hour")) {
            functions.convertMeterperMintoFootperhr(resulttext);// Funciton Call of convertMeterperMintoFootperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperMintoFootperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/minute") && spinnerto.getSelectedItem().equals("Foot/minute")) {
            functions.convertMeterperMintoFootpermin(resulttext);//Function Call of convertMeterperMintoFootpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperMintoFootpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/minute") && spinnerto.getSelectedItem().equals("Foot/second")) {
            functions.convertMeterperMintoFootpers(resulttext);//Function Call of convertMeterperMintoFootpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperMintoFootpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/minute") && spinnerto.getSelectedItem().equals("Yard/hour")) {
            functions.convertMeterperMintoYardperhr(resulttext);// Funciton Call of convertMeterperMintoYardperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperMintoYardperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/minute") && spinnerto.getSelectedItem().equals("Yard/minute")) {
            functions.convertMeterperMintoYardpermin(resulttext);//Function Call of convertMeterperMintoYardpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperMintoYardpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/minute") && spinnerto.getSelectedItem().equals("Yard/second")) {
            functions.convertMeterperMintoYardpers(resulttext);//Function Call of convertMeterperMintoYardpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperMintoYardpers(inputValue)));
        }
        // These will work when the Meter/second will selected to convert into different units of Speed from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Meter/second") && spinnerto.getSelectedItem().equals("Centimeter/hour")) {
            functions.convertMeterperStoCentimeterperhr(resulttext);// Funciton Call of convertMeterperStoCentimeterperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperStoCentimeterperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/second") && spinnerto.getSelectedItem().equals("Centimeter/minute")) {
            functions.convertMeterperStoCentimeterpermin(resulttext);//Function Call of convertMeterperStoCentimeterpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperStoCentimeterpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/second") && spinnerto.getSelectedItem().equals("Centimeter/second")) {
            functions.convertMeterperStoCentimeterpers(resulttext);// Funciton Call of convertMeterperStoCentimeterpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperStoCentimeterpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/second") && spinnerto.getSelectedItem().equals("Kilometer/hour")) {
            functions.convertMeterperStoKilometerperhr(resulttext);//Function Call of convertMeterperStoKilometerperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperStoKilometerperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/second") && spinnerto.getSelectedItem().equals("Kilometer/minute")) {
            functions.convertMeterperStoKilometerpermin(resulttext);// Funciton Call of convertMeterperStoKilometerpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperStoKilometerpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/second") && spinnerto.getSelectedItem().equals("Kilometer/second")) {
            functions.convertMeterperStoKilometerpers(resulttext);//Function Call of convertMeterperStoKilometerpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperStoKilometerpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/second") && spinnerto.getSelectedItem().equals("Meter/hour")) {
            functions.convertMeterperStoMeterperhr(resulttext);// Funciton Call of convertMeterperStoMeterperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperStoMeterperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/second") && spinnerto.getSelectedItem().equals("Meter/minute")) {
            functions.convertMeterperStoMeterpermin(resulttext);//Function Call of convertMeterperStoMeterpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperStoMeterpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/second") && spinnerto.getSelectedItem().equals("Mile/hour")) {
            functions.convertMeterperStoMileperhr(resulttext);// Funciton Call of convertMeterperStoMileperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperStoMileperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/second") && spinnerto.getSelectedItem().equals("Mile/minute")) {
            functions.convertMeterperStoMilepermin(resulttext);//Function Call of convertMeterperStoMilepermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperStoMilepermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/second") && spinnerto.getSelectedItem().equals("Mile/second")) {
            functions.convertMeterperStoMilepers(resulttext);//Function Call of convertMeterperStoMilepers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperStoMilepers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/second") && spinnerto.getSelectedItem().equals("Foot/hour")) {
            functions.convertMeterperStoFootperhr(resulttext);// Funciton Call of convertMeterperStoFootperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperStoFootperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/second") && spinnerto.getSelectedItem().equals("Foot/minute")) {
            functions.convertMeterperStoFootpermin(resulttext);//Function Call of convertMeterperStoFootpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperStoFootpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/second") && spinnerto.getSelectedItem().equals("Foot/second")) {
            functions.convertMeterperStoFootpers(resulttext);//Function Call of convertMeterperStoFootpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperStoFootpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/second") && spinnerto.getSelectedItem().equals("Yard/hour")) {
            functions.convertMeterperStoYardperhr(resulttext);// Funciton Call of convertMeterperStoYardperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperStoYardperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/second") && spinnerto.getSelectedItem().equals("Yard/minute")) {
            functions.convertMeterperStoYardpermin(resulttext);//Function Call of convertMeterperStoYardpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperStoYardpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter/second") && spinnerto.getSelectedItem().equals("Yard/second")) {
            functions.convertMeterperStoYardpers(resulttext);//Function Call of convertMeterperStoYardpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMeterperStoYardpers(inputValue)));
        }
        // These will work when the Mile/hour will selected to convert into different units of Speed from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Mile/hour") && spinnerto.getSelectedItem().equals("Centimeter/hour")) {
            functions.convertMileperHRtoCentimeterperhr(resulttext);// Funciton Call of convertMileperHRtoCentimeterperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperHRtoCentimeterperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/hour") && spinnerto.getSelectedItem().equals("Centimeter/minute")) {
            functions.convertMileperHRtoCentimeterpermin(resulttext);//Function Call of convertMileperHRtoCentimeterpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperHRtoCentimeterpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/hour") && spinnerto.getSelectedItem().equals("Centimeter/second")) {
            functions.convertMileperHRtoCentimeterpers(resulttext);// Funciton Call of convertMileperHRtoCentimeterpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperHRtoCentimeterpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/hour") && spinnerto.getSelectedItem().equals("Kilometer/hour")) {
            functions.convertMileperHRtoKilometerperhr(resulttext);//Function Call of convertMileperHRtoKilometerperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperHRtoKilometerperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/hour") && spinnerto.getSelectedItem().equals("Kilometer/minute")) {
            functions.convertMileperHRtoKilometerpermin(resulttext);// Funciton Call of convertMileperHRtoKilometerpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperHRtoKilometerpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/hour") && spinnerto.getSelectedItem().equals("Kilometer/second")) {
            functions.convertMileperHRtoKilometerpers(resulttext);//Function Call of convertMileperHRtoKilometerpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperHRtoKilometerpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/hour") && spinnerto.getSelectedItem().equals("Meter/hour")) {
            functions.convertMileperHRtoMeterperhr(resulttext);// Funciton Call of convertMileperHRtoMeterperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperHRtoMeterperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/hour") && spinnerto.getSelectedItem().equals("Meter/minute")) {
            functions.convertMileperHRtoMeterpermin(resulttext);//Function Call of convertMileperHRtoMeterpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperHRtoMeterpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/hour") && spinnerto.getSelectedItem().equals("Meter/second")) {
            functions.convertMileperHrtoMeterpers(resulttext);// Funciton Call of convertMileperHRtoMeterpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperHrtoMeterpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/hour") && spinnerto.getSelectedItem().equals("Mile/minute")) {
            functions.convertMileperHRtoMilepermin(resulttext);//Function Call of convertMileperHRtoMilepermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperHRtoMilepermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/hour") && spinnerto.getSelectedItem().equals("Mile/second")) {
            functions.convertMileperHRtoMilepers(resulttext);//Function Call of convertMileperHRtoMilepers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperHRtoMilepers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/hour") && spinnerto.getSelectedItem().equals("Foot/hour")) {
            functions.convertMileperHRtoFootperhr(resulttext);// Funciton Call of convertMileperHRtoFootperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperHRtoFootperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/hour") && spinnerto.getSelectedItem().equals("Foot/minute")) {
            functions.convertMileperHRtoFootpermin(resulttext);//Function Call of convertMileperHRtoFootpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperHRtoFootpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/hour") && spinnerto.getSelectedItem().equals("Foot/second")) {
            functions.convertMileperHRtoFootpers(resulttext);//Function Call of convertMileperHRtoFootpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperHRtoFootpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/hour") && spinnerto.getSelectedItem().equals("Yard/hour")) {
            functions.convertMileperHRtoYardperhr(resulttext);// Funciton Call of convertMileperHRtoYardperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperHRtoYardperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/hour") && spinnerto.getSelectedItem().equals("Yard/minute")) {
            functions.convertMileperHRtoYardpermin(resulttext);//Function Call of convertMileperHRtoYardpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperHRtoYardpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/hour") && spinnerto.getSelectedItem().equals("Yard/second")) {
            functions.convertMileperHRtoYardpers(resulttext);//Function Call of convertMileperHRtoYardpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperHRtoYardpers(inputValue)));
        }
        // These will work when the Mile/minute will selected to convert into different units of Speed from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Mile/minute") && spinnerto.getSelectedItem().equals("Centimeter/hour")) {
            functions.convertMileperMintoCentimeterperhr(resulttext);// Funciton Call of convertMileperMintoCentimeterperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperMintoCentimeterperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/minute") && spinnerto.getSelectedItem().equals("Centimeter/minute")) {
            functions.convertMileperMintoCentimeterpermin(resulttext);//Function Call of convertMileperMintoCentimeterpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperMintoCentimeterpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/minute") && spinnerto.getSelectedItem().equals("Centimeter/second")) {
            functions.convertMileperMintoCentimeterpers(resulttext);// Funciton Call of convertMileperMintoCentimeterpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperMintoCentimeterpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/minute") && spinnerto.getSelectedItem().equals("Kilometer/hour")) {
            functions.convertMileperMintoKilometerperhr(resulttext);//Function Call of convertMileperMintoKilometerperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperMintoKilometerperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/minute") && spinnerto.getSelectedItem().equals("Kilometer/minute")) {
            functions.convertMileperMintoKilometerpermin(resulttext);// Funciton Call of convertMileperMintoKilometerpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperMintoKilometerpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/minute") && spinnerto.getSelectedItem().equals("Kilometer/second")) {
            functions.convertMileperMintoKilometerpers(resulttext);//Function Call of convertMileperMintoKilometerpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperMintoKilometerpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/minute") && spinnerto.getSelectedItem().equals("Meter/hour")) {
            functions.convertMileperMintoMeterperhr(resulttext);// Funciton Call of convertMileperMintoMeterperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperMintoMeterperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/minute") && spinnerto.getSelectedItem().equals("Meter/minute")) {
            functions.convertMileperMintoMeterpermin(resulttext);//Function Call of convertMileperMintoMeterpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperMintoMeterpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/minute") && spinnerto.getSelectedItem().equals("Meter/second")) {
            functions.convertMileperMintoMeterpers(resulttext);// Funciton Call of convertMileperMintoMeterpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperMintoMeterpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/minute") && spinnerto.getSelectedItem().equals("Mile/hour")) {
            functions.convertMileperMintoMileperhr(resulttext);//Function Call of convertMileperMintoMileperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperMintoMileperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/minute") && spinnerto.getSelectedItem().equals("Mile/second")) {
            functions.convertMileperMintoMilepers(resulttext);//Function Call of convertMileperMintoMilepers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperMintoMilepers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/minute") && spinnerto.getSelectedItem().equals("Foot/hour")) {
            functions.convertMileperMintoFootperhr(resulttext);// Funciton Call of convertMileperMintoFootperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperMintoFootperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/minute") && spinnerto.getSelectedItem().equals("Foot/minute")) {
            functions.convertMileperMintoFootpermin(resulttext);//Function Call of convertMileperMintoFootpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperMintoFootpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/minute") && spinnerto.getSelectedItem().equals("Foot/second")) {
            functions.convertMileperMintoFootpers(resulttext);//Function Call of convertMileperMintoFootpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperMintoFootpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/minute") && spinnerto.getSelectedItem().equals("Yard/hour")) {
            functions.convertMileperMintoYardperhr(resulttext);// Funciton Call of convertMileperMintoYardperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperMintoYardperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/minute") && spinnerto.getSelectedItem().equals("Yard/minute")) {
            functions.convertMileperMintoYardpermin(resulttext);//Function Call of convertMileperMintoYardpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperMintoYardpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/minute") && spinnerto.getSelectedItem().equals("Yard/second")) {
            functions.convertMileperMintoYardpers(resulttext);//Function Call of convertMileperMintoYardpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperMintoYardpers(inputValue)));
        }
        // These will work when the Mile/second will selected to convert into different units of Speed from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Mile/second") && spinnerto.getSelectedItem().equals("Centimeter/hour")) {
            functions.convertMileperStoCentimeterperhr(resulttext);// Funciton Call of convertMileperStoCentimeterperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperStoCentimeterperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/second") && spinnerto.getSelectedItem().equals("Centimeter/minute")) {
            functions.convertMileperStoCentimeterpermin(resulttext);//Function Call of convertMileperStoCentimeterpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperStoCentimeterpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/second") && spinnerto.getSelectedItem().equals("Centimeter/second")) {
            functions.convertMileperStoCentimeterpers(resulttext);// Funciton Call of convertMileperStoCentimeterpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperStoCentimeterpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/second") && spinnerto.getSelectedItem().equals("Kilometer/hour")) {
            functions.convertMileperStoKilometerperhr(resulttext);//Function Call of convertMileperStoKilometerperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperStoKilometerperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/second") && spinnerto.getSelectedItem().equals("Kilometer/minute")) {
            functions.convertMileperStoKilometerpermin(resulttext);// Funciton Call of convertMileperStoKilometerpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperStoKilometerpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/second") && spinnerto.getSelectedItem().equals("Kilometer/second")) {
            functions.convertMileperStoKilometerpers(resulttext);//Function Call of convertMileperStoKilometerpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperStoKilometerpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/second") && spinnerto.getSelectedItem().equals("Meter/hour")) {
            functions.convertMileperStoMeterperhr(resulttext);// Funciton Call of convertMileperStoMeterperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperStoMeterperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/second") && spinnerto.getSelectedItem().equals("Meter/minute")) {
            functions.convertMileperStoMeterpermin(resulttext);//Function Call of convertMileperStoMeterpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperStoMeterpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/second") && spinnerto.getSelectedItem().equals("Meter/second")) {
            functions.convertMileperStoMeterpers(resulttext);// Funciton Call of convertMileperStoMeterpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperStoMeterpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/second") && spinnerto.getSelectedItem().equals("Mile/hour")) {
            functions.convertMileperStoMileperhr(resulttext);//Function Call of convertMileperStoMileperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperStoMileperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/second") && spinnerto.getSelectedItem().equals("Mile/minute")) {
            functions.convertMileperStoMilepermin(resulttext);//Function Call of convertMileperStoMilepermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperStoMilepermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/second") && spinnerto.getSelectedItem().equals("Foot/hour")) {
            functions.convertMileperStoFootperhr(resulttext);// Funciton Call of convertMileperStoFootperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperStoFootperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/second") && spinnerto.getSelectedItem().equals("Foot/minute")) {
            functions.convertMileperStoFootpermin(resulttext);//Function Call of convertMileperStoFootpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperStoFootpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/second") && spinnerto.getSelectedItem().equals("Foot/second")) {
            functions.convertMileperStoFootpers(resulttext);//Function Call of convertMileperStoFootpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperStoFootpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/second") && spinnerto.getSelectedItem().equals("Yard/hour")) {
            functions.convertMileperStoYardperhr(resulttext);// Funciton Call of convertMileperStoYardperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperStoYardperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/second") && spinnerto.getSelectedItem().equals("Yard/minute")) {
            functions.convertMileperStoYardpermin(resulttext);//Function Call of convertMileperStoYardpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperStoYardpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile/second") && spinnerto.getSelectedItem().equals("Yard/second")) {
            functions.convertMileperStoYardpers(resulttext);//Function Call of convertMileperStoYardpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMileperStoYardpers(inputValue)));
        }
        // These will work when the Foot/hour will selected to convert into different units of Speed from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Foot/hour") && spinnerto.getSelectedItem().equals("Centimeter/hour")) {
            functions.convertFootperHRtoCentimeterperhr(resulttext);// Funciton Call of convertFootperHRtoCentimeterperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperHRtoCentimeterperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/hour") && spinnerto.getSelectedItem().equals("Centimeter/minute")) {
            functions.convertFootperHRtoCentimeterpermin(resulttext);//Function Call of convertFootperHRtoCentimeterpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperHRtoCentimeterpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/hour") && spinnerto.getSelectedItem().equals("Centimeter/second")) {
            functions.convertFootperHRtoCentimeterpers(resulttext);// Funciton Call of convertFootperHRtoCentimeterpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperHRtoCentimeterpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/hour") && spinnerto.getSelectedItem().equals("Kilometer/hour")) {
            functions.convertFootperHRtoKilometerperhr(resulttext);//Function Call of convertFootperHRtoKilometerperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperHRtoKilometerperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/hour") && spinnerto.getSelectedItem().equals("Kilometer/minute")) {
            functions.convertFootperHRtoKilometerpermin(resulttext);// Funciton Call of convertFootperHRtoKilometerpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperHRtoKilometerpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/hour") && spinnerto.getSelectedItem().equals("Kilometer/second")) {
            functions.convertFootperHRtoKilometerpers(resulttext);//Function Call of convertFootperHRtoKilometerpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperHRtoKilometerpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/hour") && spinnerto.getSelectedItem().equals("Meter/hour")) {
            functions.convertFootperHRtoMeterperhr(resulttext);// Funciton Call of convertFootperHRtoMeterperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperHRtoMeterperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/hour") && spinnerto.getSelectedItem().equals("Meter/minute")) {
            functions.convertFootperHRtoMeterpermin(resulttext);//Function Call of convertFootperHRtoMeterpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperHRtoMeterpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/hour") && spinnerto.getSelectedItem().equals("Meter/second")) {
            functions.convertFootperHRtoMeterpers(resulttext);// Funciton Call of convertFootperHRtoMeterpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperHRtoMeterpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/hour") && spinnerto.getSelectedItem().equals("Mile/hour")) {
            functions.convertFootperHRtoMileperhr(resulttext);//Function Call of convertFootperHRtoMileperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperHRtoMileperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/hour") && spinnerto.getSelectedItem().equals("Mile/minute")) {
            functions.convertFootperHRtoMilepermin(resulttext);//Function Call of convertFootperHRtoMilepermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperHRtoMilepermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/hour") && spinnerto.getSelectedItem().equals("Mile/second")) {
            functions.convertFootperHRtoMilepers(resulttext);// Funciton Call of convertFootperHRtoMilepers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperHRtoMilepers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/hour") && spinnerto.getSelectedItem().equals("Foot/minute")) {
            functions.convertFootperHRtoFootpermin(resulttext);//Function Call of convertFootperHRtoFootpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperHRtoFootpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/hour") && spinnerto.getSelectedItem().equals("Foot/second")) {
            functions.convertFootperHRtoFootpers(resulttext);//Function Call of convertFootperHRtoFootpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperHRtoFootpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/hour") && spinnerto.getSelectedItem().equals("Yard/hour")) {
            functions.convertFootperHRtoYardperhr(resulttext);// Funciton Call of convertFootperHRtoYardperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperHRtoYardperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/hour") && spinnerto.getSelectedItem().equals("Yard/minute")) {
            functions.convertFootperHRtoYardpermin(resulttext);//Function Call of convertFootperHRtoYardpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperHRtoYardpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/hour") && spinnerto.getSelectedItem().equals("Yard/second")) {
            functions.convertFootperHRtoYardpers(resulttext);//Function Call of convertFootperHRtoYardpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperHRtoYardpers(inputValue)));
        }
        // These will work when the Foot/minute will selected to convert into different units of Speed from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Foot/minute") && spinnerto.getSelectedItem().equals("Centimeter/hour")) {
            functions.convertFootperMintoCentimeterperhr(resulttext);// Funciton Call of convertFootperMintoCentimeterperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperMintoCentimeterperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/minute") && spinnerto.getSelectedItem().equals("Centimeter/minute")) {
            functions.convertFootperMintoCentimeterpermin(resulttext);//Function Call of convertFootperMintoCentimeterpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperMintoCentimeterpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/minute") && spinnerto.getSelectedItem().equals("Centimeter/second")) {
            functions.convertFootperMintoCentimeterpers(resulttext);// Funciton Call of convertFootperMintoCentimeterpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperMintoCentimeterpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/minute") && spinnerto.getSelectedItem().equals("Kilometer/hour")) {
            functions.convertFootperMintoKilometerperhr(resulttext);//Function Call of convertFootperMintoKilometerperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperMintoKilometerperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/minute") && spinnerto.getSelectedItem().equals("Kilometer/minute")) {
            functions.convertFootperMintoKilometerpermin(resulttext);// Funciton Call of convertFootperMintoKilometerpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperMintoKilometerpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/minute") && spinnerto.getSelectedItem().equals("Kilometer/second")) {
            functions.convertFootperMintoKilometerpers(resulttext);//Function Call of convertFootperMintoKilometerpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperMintoKilometerpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/minute") && spinnerto.getSelectedItem().equals("Meter/hour")) {
            functions.convertFootperMintoMeterperhr(resulttext);// Funciton Call of convertFootperMintoMeterperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperMintoMeterperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/minute") && spinnerto.getSelectedItem().equals("Meter/minute")) {
            functions.convertFootperMintoMeterpermin(resulttext);//Function Call of convertFootperMintoMeterpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperMintoMeterpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/minute") && spinnerto.getSelectedItem().equals("Meter/second")) {
            functions.convertFootperMintoMeterpers(resulttext);// Funciton Call of convertFootperMintoMeterpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperMintoMeterpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/minute") && spinnerto.getSelectedItem().equals("Mile/hour")) {
            functions.convertFootperMintoMileperhr(resulttext);//Function Call of convertFootperMintoMileperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperMintoMileperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/minute") && spinnerto.getSelectedItem().equals("Mile/minute")) {
            functions.convertFootperMintoMilepermin(resulttext);//Function Call of convertFootperMintoMilepermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperMintoMilepermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/minute") && spinnerto.getSelectedItem().equals("Mile/second")) {
            functions.convertFootperMintoMilepers(resulttext);// Funciton Call of convertFootperMintoMilepers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperMintoMilepers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/minute") && spinnerto.getSelectedItem().equals("Foot/hour")) {
            functions.convertFootperMintoFootperhr(resulttext);//Function Call of convertFootperMintoFootperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperMintoFootperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/minute") && spinnerto.getSelectedItem().equals("Foot/second")) {
            functions.convertFootperMintoFootpers(resulttext);//Function Call of convertFootperMintoFootpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperMintoFootpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/minute") && spinnerto.getSelectedItem().equals("Yard/hour")) {
            functions.convertFootperMintoYardperhr(resulttext);// Funciton Call of convertFootperMintoYardperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperMintoYardperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/minute") && spinnerto.getSelectedItem().equals("Yard/minute")) {
            functions.convertFootperMintoYardpermin(resulttext);//Function Call of convertFootperMintoYardpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperMintoYardpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/minute") && spinnerto.getSelectedItem().equals("Yard/second")) {
            functions.convertFootperMintoYardpers(resulttext);//Function Call of convertFootperMintoYardpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperMintoYardpers(inputValue)));
        }
        // These will work when the Foot/second will selected to convert into different units of Speed from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Foot/second") && spinnerto.getSelectedItem().equals("Centimeter/hour")) {
            functions.convertFootperStoCentimeterperhr(resulttext);// Funciton Call of convertFootperStoCentimeterperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperStoCentimeterperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/second") && spinnerto.getSelectedItem().equals("Centimeter/minute")) {
            functions.convertFootperStoCentimeterpermin(resulttext);//Function Call of convertFootperStoCentimeterpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperStoCentimeterpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/second") && spinnerto.getSelectedItem().equals("Centimeter/second")) {
            functions.convertFootperStoCentimeterpers(resulttext);// Funciton Call of convertFootperStoCentimeterpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperStoCentimeterpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/second") && spinnerto.getSelectedItem().equals("Kilometer/hour")) {
            functions.convertFootperStoKilometerperhr(resulttext);//Function Call of convertFootperStoKilometerperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperStoKilometerperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/second") && spinnerto.getSelectedItem().equals("Kilometer/minute")) {
            functions.convertFootperStoKilometerpermin(resulttext);// Funciton Call of convertFootperStoKilometerpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperStoKilometerpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/second") && spinnerto.getSelectedItem().equals("Kilometer/second")) {
            functions.convertFootperStoKilometerpers(resulttext);//Function Call of convertFootperStoKilometerpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperStoKilometerpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/second") && spinnerto.getSelectedItem().equals("Meter/hour")) {
            functions.convertFootperStoMeterperhr(resulttext);// Funciton Call of convertFootperStoMeterperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperStoMeterperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/second") && spinnerto.getSelectedItem().equals("Meter/minute")) {
            functions.convertFootperStoMeterpermin(resulttext);//Function Call of convertFootperStoMeterpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperStoMeterpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/second") && spinnerto.getSelectedItem().equals("Meter/second")) {
            functions.convertFootperStoMeterpers(resulttext);// Funciton Call of convertFootperStoMeterpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperStoMeterpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/second") && spinnerto.getSelectedItem().equals("Mile/hour")) {
            functions.convertFootperStoMileperhr(resulttext);//Function Call of convertFootperStoMileperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperStoMileperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/second") && spinnerto.getSelectedItem().equals("Mile/minute")) {
            functions.convertFootperStoMilepermin(resulttext);//Function Call of convertFootperStoMilepermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperStoMilepermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/second") && spinnerto.getSelectedItem().equals("Mile/second")) {
            functions.convertFootperStoMilepers(resulttext);// Funciton Call of convertFootperStoMilepers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperStoMilepers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/second") && spinnerto.getSelectedItem().equals("Foot/hour")) {
            functions.convertFootperStoFootperhr(resulttext);//Function Call of convertFootperStoFootperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperStoFootperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/second") && spinnerto.getSelectedItem().equals("Foot/minute")) {
            functions.convertFootperStoFootpermin(resulttext);//Function Call of convertFootperStoFootpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperStoFootpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/second") && spinnerto.getSelectedItem().equals("Yard/hour")) {
            functions.convertFootperStoYardperhr(resulttext);// Funciton Call of convertFootperStoYardperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperStoYardperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/second") && spinnerto.getSelectedItem().equals("Yard/minute")) {
            functions.convertFootperStoYardpermin(resulttext);//Function Call of convertFootperStoYardpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperStoYardpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Foot/second") && spinnerto.getSelectedItem().equals("Yard/second")) {
            functions.convertFootperStoYardpers(resulttext);//Function Call of convertFootperStoYardpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertFootperStoYardpers(inputValue)));
        }
        // These will work when the Yard/hour will selected to convert into different units of Speed from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Yard/hour") && spinnerto.getSelectedItem().equals("Centimeter/hour")) {
            functions.convertYardsperHRtoCentimeterperhr(resulttext);// Funciton Call of convertYardsperHRtoCentimeterperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperHRtoCentimeterperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/hour") && spinnerto.getSelectedItem().equals("Centimeter/minute")) {
            functions.convertYardsperHRtoCentimeterpermin(resulttext);//Function Call of convertYardsperHRtoCentimeterpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperHRtoCentimeterpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/hour") && spinnerto.getSelectedItem().equals("Centimeter/second")) {
            functions.convertYardsperHRtoCentimeterpers(resulttext);// Funciton Call of convertYardsperHRtoCentimeterpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperHRtoCentimeterpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/hour") && spinnerto.getSelectedItem().equals("Kilometer/hour")) {
            functions.convertYardsperHRtoKilometerperhr(resulttext);//Function Call of convertYardsperHRtoKilometerperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperHRtoKilometerperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/hour") && spinnerto.getSelectedItem().equals("Kilometer/minute")) {
            functions.convertYardsperHRtoKilometerpermin(resulttext);// Funciton Call of convertYardsperHRtoKilometerpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperHRtoKilometerpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/hour") && spinnerto.getSelectedItem().equals("Kilometer/second")) {
            functions.convertYardsperHRtoKilometerpers(resulttext);//Function Call of convertYardsperHRtoKilometerpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperHRtoKilometerpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/hour") && spinnerto.getSelectedItem().equals("Meter/hour")) {
            functions.convertYardsperHRtoMeterperhr(resulttext);// Funciton Call of convertYardsperHRtoMeterperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperHRtoMeterperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/hour") && spinnerto.getSelectedItem().equals("Meter/minute")) {
            functions.convertYardsperHRtoMeterpermin(resulttext);//Function Call of convertYardsperHRtoMeterpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperHRtoMeterpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/hour") && spinnerto.getSelectedItem().equals("Meter/second")) {
            functions.convertYardsperHRtoMeterpers(resulttext);// Funciton Call of convertYardsperHRtoMeterpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperHRtoMeterpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/hour") && spinnerto.getSelectedItem().equals("Mile/hour")) {
            functions.convertYardsperHRtoMileperhr(resulttext);//Function Call of convertYardsperHRtoMileperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperHRtoMileperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/hour") && spinnerto.getSelectedItem().equals("Mile/minute")) {
            functions.convertYardsperHRtoMilepermin(resulttext);//Function Call of convertYardsperHRtoMilepermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperHRtoMilepermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/hour") && spinnerto.getSelectedItem().equals("Mile/second")) {
            functions.convertYardsperHRtoMilepers(resulttext);// Funciton Call of convertYardsperHRtoMilepers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperHRtoMilepers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/hour") && spinnerto.getSelectedItem().equals("Foot/hour")) {
            functions.convertYardsperHRtoFootperhr(resulttext);//Function Call of convertYardsperHRtoFootperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperHRtoFootperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/hour") && spinnerto.getSelectedItem().equals("Foot/minute")) {
            functions.convertYardsperHRtoFootpermin(resulttext);//Function Call of convertYardsperHRtoFootpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperHRtoFootpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/hour") && spinnerto.getSelectedItem().equals("Foot/second")) {
            functions.convertYardsperHRtoFootpers(resulttext);// Funciton Call of convertYardsperHRtoFootpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperHRtoFootpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/hour") && spinnerto.getSelectedItem().equals("Yard/minute")) {
            functions.convertYardsperHRtoYardpermin(resulttext);//Function Call of convertYardsperHRtoYardpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperHRtoYardpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/hour") && spinnerto.getSelectedItem().equals("Yard/second")) {
            functions.convertYardsperHRtoYardpers(resulttext);//Function Call of convertYardsperHRtoYardpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperHRtoYardpers(inputValue)));
        }
        // These will work when the Yard/minute will selected to convert into different units of Speed from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Yard/minute") && spinnerto.getSelectedItem().equals("Centimeter/hour")) {
            functions.convertYardsperMintoCentimeterperhr(resulttext);// Funciton Call of convertYardsperMintoCentimeterperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperMintoCentimeterperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/minute") && spinnerto.getSelectedItem().equals("Centimeter/minute")) {
            functions.convertYardsperMintoCentimeterpermin(resulttext);//Function Call of convertYardsperMintoCentimeterpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperMintoCentimeterpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/minute") && spinnerto.getSelectedItem().equals("Centimeter/second")) {
            functions.convertYardsperMintoCentimeterpers(resulttext);// Funciton Call of convertYardsperMintoCentimeterpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperMintoCentimeterpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/minute") && spinnerto.getSelectedItem().equals("Kilometer/hour")) {
            functions.convertYardsperMintoKilometerperhr(resulttext);//Function Call of convertYardsperMintoKilometerperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperMintoKilometerperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/minute") && spinnerto.getSelectedItem().equals("Kilometer/minute")) {
            functions.convertYardsperMintoKilometerpermin(resulttext);// Funciton Call of convertYardsperMintoKilometerpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperMintoKilometerpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/minute") && spinnerto.getSelectedItem().equals("Kilometer/second")) {
            functions.convertYardsperMintoKilometerpers(resulttext);//Function Call of convertYardsperMintoKilometerpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperMintoKilometerpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/minute") && spinnerto.getSelectedItem().equals("Meter/hour")) {
            functions.convertYardsperMintoMeterperhr(resulttext);// Funciton Call of convertYardsperMintoMeterperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperMintoMeterperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/minute") && spinnerto.getSelectedItem().equals("Meter/minute")) {
            functions.convertYardsperMintoMeterpermin(resulttext);//Function Call of convertYardsperMintoMeterpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperMintoMeterpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/minute") && spinnerto.getSelectedItem().equals("Meter/second")) {
            functions.convertYardsperMintoMeterpers(resulttext);// Funciton Call of convertYardsperMintoMeterpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperMintoMeterpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/minute") && spinnerto.getSelectedItem().equals("Mile/hour")) {
            functions.convertYardsperMintoMileperhr(resulttext);//Function Call of convertYardsperMintoMileperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperMintoMileperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/minute") && spinnerto.getSelectedItem().equals("Mile/minute")) {
            functions.convertYardsperMintoMilepermin(resulttext);//Function Call of convertYardsperMintoMilepermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperMintoMilepermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/minute") && spinnerto.getSelectedItem().equals("Mile/second")) {
            functions.convertYardsperMintoMilepers(resulttext);// Funciton Call of convertYardsperMintoMilepers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperMintoMilepers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/minute") && spinnerto.getSelectedItem().equals("Foot/hour")) {
            functions.convertYardsperMintoFootperhr(resulttext);//Function Call of convertYardsperMintoFootperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperMintoFootperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/minute") && spinnerto.getSelectedItem().equals("Foot/minute")) {
            functions.convertYardsperMintoFootpermin(resulttext);//Function Call of convertYardsperMintoFootpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperMintoFootpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/minute") && spinnerto.getSelectedItem().equals("Foot/second")) {
            functions.convertYardsperMintoFootpers(resulttext);// Funciton Call of convertYardsperMintoFootpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperMintoFootpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/minute") && spinnerto.getSelectedItem().equals("Yard/hour")) {
            functions.convertYardsperMintoYardperhr(resulttext);//Function Call of convertYardsperMintoYardperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperMintoYardperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/minute") && spinnerto.getSelectedItem().equals("Yard/second")) {
            functions.convertYardsperMintoYardpers(resulttext);//Function Call of convertYardsperMintoYardpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperMintoYardpers(inputValue)));
        }
        // These will work when the Yard/second will selected to convert into different units of Speed from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Yard/second") && spinnerto.getSelectedItem().equals("Centimeter/hour")) {
            functions.convertYardsperStoCentimeterperhr(resulttext);// Funciton Call of convertYardsperStoCentimeterperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperStoCentimeterperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/second") && spinnerto.getSelectedItem().equals("Centimeter/minute")) {
            functions.convertYardsperStoCentimeterpermin(resulttext);//Function Call of convertYardsperStoCentimeterpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperStoCentimeterpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/second") && spinnerto.getSelectedItem().equals("Centimeter/second")) {
            functions.convertYardsperStoCentimeterpers(resulttext);// Funciton Call of convertYardsperStoCentimeterpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperStoCentimeterpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/second") && spinnerto.getSelectedItem().equals("Kilometer/hour")) {
            functions.convertYardsperStoKilometerperhr(resulttext);//Function Call of convertYardsperStoKilometerperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperStoKilometerperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/second") && spinnerto.getSelectedItem().equals("Kilometer/minute")) {
            functions.convertYardsperStoKilometerpermin(resulttext);// Funciton Call of convertYardsperStoKilometerpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperStoKilometerpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/second") && spinnerto.getSelectedItem().equals("Kilometer/second")) {
            functions.convertYardsperStoKilometerpers(resulttext);//Function Call of convertYardsperStoKilometerpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperStoKilometerpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/second") && spinnerto.getSelectedItem().equals("Meter/hour")) {
            functions.convertYardsperStoMeterperhr(resulttext);// Funciton Call of convertYardsperStoMeterperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperStoMeterperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/second") && spinnerto.getSelectedItem().equals("Meter/minute")) {
            functions.convertYardsperStoMeterpermin(resulttext);//Function Call of convertYardsperStoMeterpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperStoMeterpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/second") && spinnerto.getSelectedItem().equals("Meter/second")) {
            functions.convertYardsperStoMeterpers(resulttext);// Funciton Call of convertYardsperStoMeterpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperStoMeterpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/second") && spinnerto.getSelectedItem().equals("Mile/hour")) {
            functions.convertYardsperStoMileperhr(resulttext);//Function Call of convertYardsperStoMileperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperStoMileperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/second") && spinnerto.getSelectedItem().equals("Mile/minute")) {
            functions.convertYardsperStoMilepermin(resulttext);//Function Call of convertYardsperStoMilepermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperStoMilepermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/second") && spinnerto.getSelectedItem().equals("Mile/second")) {
            functions.convertYardsperStoMilepers(resulttext);// Funciton Call of convertYardsperStoMilepers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperStoMilepers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/second") && spinnerto.getSelectedItem().equals("Foot/hour")) {
            functions.convertYardsperStoFootperhr(resulttext);//Function Call of convertYardsperStoFootperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperStoFootperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/second") && spinnerto.getSelectedItem().equals("Foot/minute")) {
            functions.convertYardsperStoFootpermin(resulttext);//Function Call of convertYardsperStoFootpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperStoFootpermin(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/second") && spinnerto.getSelectedItem().equals("Foot/second")) {
            functions.convertYardsperStoFootpers(resulttext);// Funciton Call of convertYardsperStoFootpers from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperStoFootpers(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/second") && spinnerto.getSelectedItem().equals("Yard/hour")) {
            functions.convertYardsperStoYardperhr(resulttext);//Function Call of convertYardsperStoYardperhr from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperStoYardperhr(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard/second") && spinnerto.getSelectedItem().equals("Yard/minute")) {
            functions.convertYardsperStoYardpermin(resulttext);//Function Call of convertYardsperStoYardpermin from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertYardsperStoYardpermin(inputValue)));
        }
    }

    private void weightUnit(Object selectedItem, Object selectedItem1) {
        // These will work when the Carat will selected to convert into different units of Weight from Utlility Class
        if (spinnerfrom.getSelectedItem().equals("Carat") && spinnerto.getSelectedItem().equals("Centigram")) {
            functions.convertCarattoCentigrams(resulttext);// Funciton Call of convertCarattoCentigrams from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCarattoCentigrams(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Carat") && spinnerto.getSelectedItem().equals("Grain")) {
            functions.convertCarattoGrains(resulttext);//Function Call of convertCarattoGrains from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCarattoGrains(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Carat") && spinnerto.getSelectedItem().equals("Gram")) {
            functions.convertCarattoGrams(resulttext);// Funciton Call of convertCarattoGrams from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCarattoGrams(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Carat") && spinnerto.getSelectedItem().equals("Kilogram")) {
            functions.convertCarattoKilograms(resulttext);//Function Call of convertCarattoKilograms from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCarattoKilograms(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Carat") && spinnerto.getSelectedItem().equals("Microgram")) {
            functions.convertCarattoMicrograms(resulttext);// Funciton Call of convertCarattoMicrograms from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCarattoMicrograms(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Carat") && spinnerto.getSelectedItem().equals("Milligram")) {
            functions.convertCarattoMilligrams(resulttext);//Function Call of convertCarattoMilligrams from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCarattoMilligrams(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Carat") && spinnerto.getSelectedItem().equals("Ounce")) {
            functions.convertCarattoOunce(resulttext);// Funciton Call of convertCarattoOunce from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCarattoOunce(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Carat") && spinnerto.getSelectedItem().equals("Pound")) {
            functions.convertCarattoPound(resulttext);//Function Call of convertCarattoPound from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCarattoPound(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Carat") && spinnerto.getSelectedItem().equals("Tonne")) {
            functions.convertCarattoTonne(resulttext);// Funciton Call of convertCarattoTonne from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCarattoTonne(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Carat") && spinnerto.getSelectedItem().equals("Troy Ounce")) {
            functions.convertCarattoTroyOuce(resulttext);//Function Call of convertCarattoTroyOuce from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCarattoTroyOuce(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Carat") && spinnerto.getSelectedItem().equals("Troy Pound")) {
            functions.convertCarattoTroyPound(resulttext);//Function Call of convertCarattoTroyPound from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCarattoTroyPound(inputValue)));
        }
        // These will work when the Centigram will selected to convert into different units of Weight from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Centigram") && spinnerto.getSelectedItem().equals("Carat")) {
            functions.convertCentigramtoCarat(resulttext);// Funciton Call of convertCentigramtoCarat from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentigramtoCarat(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centigram") && spinnerto.getSelectedItem().equals("Grain")) {
            functions.convertCentigramtoGrains(resulttext);//Function Call of convertCentigramtoGrains from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentigramtoGrains(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centigram") && spinnerto.getSelectedItem().equals("Gram")) {
            functions.convertCentigramtoGrams(resulttext);// Funciton Call of convertCentigramtoGrams from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentigramtoGrams(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centigram") && spinnerto.getSelectedItem().equals("Kilogram")) {
            functions.convertCentigramtoKilograms(resulttext);//Function Call of convertCentigramtoKilograms from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentigramtoKilograms(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centigram") && spinnerto.getSelectedItem().equals("Microgram")) {
            functions.convertCentigramtoMicrogram(resulttext);// Funciton Call of convertCentigramtoMicrogram from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentigramtoMicrogram(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centigram") && spinnerto.getSelectedItem().equals("Milligram")) {
            functions.convertCentigramtoMilligram(resulttext);//Function Call of convertCentigramtoMilligram from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentigramtoMilligram(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centigram") && spinnerto.getSelectedItem().equals("Ounce")) {
            functions.convertCentigramtoOunce(resulttext);// Funciton Call of convertCentigramtoOunce from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentigramtoOunce(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centigram") && spinnerto.getSelectedItem().equals("Pound")) {
            functions.convertCentigramtoPound(resulttext);//Function Call of convertCentigramtoPound from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentigramtoPound(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centigram") && spinnerto.getSelectedItem().equals("Tonne")) {
            functions.convertCentigramtoTonne(resulttext);// Funciton Call of convertCentigramtoTonne from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentigramtoTonne(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centigram") && spinnerto.getSelectedItem().equals("Troy Ounce")) {
            functions.convertCentigramtoTroyOunce(resulttext);//Function Call of convertCentigramtoTroyOunce from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentigramtoTroyOunce(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centigram") && spinnerto.getSelectedItem().equals("Troy Pound")) {
            functions.convertCentigramtoTroyPound(resulttext);//Function Call of convertCentigramtoTroyPound from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertCentigramtoTroyPound(inputValue)));
        }
        // These will work when the Grains will selected to convert into different units of Weight from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Grain") && spinnerto.getSelectedItem().equals("Carat")) {
            functions.convertGrainstoCarat(resulttext);// Funciton Call of convertGrainstoCarat from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertGrainstoCarat(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Grain") && spinnerto.getSelectedItem().equals("Centigram")) {
            functions.convertGrainstoCentigrams(resulttext);//Function Call of convertGrainstoCentigrams from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertGrainstoCentigrams(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Grain") && spinnerto.getSelectedItem().equals("Gram")) {
            functions.convertGrainstoGrams(resulttext);// Funciton Call of convertGrainstoGrams from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertGrainstoGrams(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Grain") && spinnerto.getSelectedItem().equals("Kilogram")) {
            functions.convertGrainstoKilograms(resulttext);//Function Call of convertGrainstoKilograms from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertGrainstoKilograms(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Grain") && spinnerto.getSelectedItem().equals("Microgram")) {
            functions.convertGrainstoMicrograms(resulttext);// Funciton Call of convertGrainstoMicrograms from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertGrainstoMicrograms(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Grain") && spinnerto.getSelectedItem().equals("Milligram")) {
            functions.convertGrainstoMilligrams(resulttext);//Function Call of convertGrainstoMilligrams from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertGrainstoMilligrams(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Grain") && spinnerto.getSelectedItem().equals("Ounce")) {
            functions.convertGrainstoOunce(resulttext);// Funciton Call of convertGrainstoOunce from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertGrainstoOunce(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Grain") && spinnerto.getSelectedItem().equals("Pound")) {
            functions.convertGrainstoPound(resulttext);//Function Call of convertGrainstoPound from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertGrainstoPound(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Grain") && spinnerto.getSelectedItem().equals("Tonne")) {
            functions.convertGrainstoTonne(resulttext);// Funciton Call of convertGrainstoTonne from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertGrainstoTonne(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Grain") && spinnerto.getSelectedItem().equals("Troy Ounce")) {
            functions.convertGrainstoTroyOunce(resulttext);//Function Call of convertGrainstoTroyOunce from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertGrainstoTroyOunce(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Grain") && spinnerto.getSelectedItem().equals("Troy Pound")) {
            functions.convertGrainstoTroyPound(resulttext);//Function Call of convertGrainstoTroyPound from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertGrainstoTroyPound(inputValue)));
        }
        // These will work when the Grams will selected to convert into different units of Weight from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Gram") && spinnerto.getSelectedItem().equals("Carat")) {
            functions.convertGramstoCarat(resulttext);// Funciton Call of convertGramstoCarat from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertGramstoCarat(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Gram") && spinnerto.getSelectedItem().equals("Centigram")) {
            functions.convertGramstoCentigram(resulttext);//Function Call of convertGramstoCentigram from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertGramstoCentigram(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Gram") && spinnerto.getSelectedItem().equals("Grain")) {
            functions.convertGramstoGrains(resulttext);// Funciton Call of convertGrainstoGrams from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertGramstoGrains(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Gram") && spinnerto.getSelectedItem().equals("Kilogram")) {
            functions.convertGramstoKilograms(resulttext);//Function Call of convertGramstoKilograms from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertGramstoKilograms(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Gram") && spinnerto.getSelectedItem().equals("Microgram")) {
            functions.convertGramstoMicrogram(resulttext);// Funciton Call of convertGramstoMicrogram from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertGramstoMicrogram(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Gram") && spinnerto.getSelectedItem().equals("Milligram")) {
            functions.convertGramstoMilligram(resulttext);//Function Call of convertGramstoMilligram from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertGramstoMilligram(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Gram") && spinnerto.getSelectedItem().equals("Ounce")) {
            functions.convertGramstoOunce(resulttext);// Funciton Call of convertGramstoOunce from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertGramstoOunce(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Gram") && spinnerto.getSelectedItem().equals("Pound")) {
            functions.convertGramstoPound(resulttext);//Function Call of convertGramstoPound from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertGramstoPound(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Gram") && spinnerto.getSelectedItem().equals("Tonne")) {
            functions.convertGramstoTonne(resulttext);// Funciton Call of convertGramstoTonne from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertGramstoTonne(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Gram") && spinnerto.getSelectedItem().equals("Troy Ounce")) {
            functions.convertGramstoTroyOunce(resulttext);//Function Call of convertGramstoTroyOunce from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertGramstoTroyOunce(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Gram") && spinnerto.getSelectedItem().equals("Troy Pound")) {
            functions.convertGramstoTroyPound(resulttext);//Function Call of convertGramstoTroyPound from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertGramstoTroyPound(inputValue)));
        }
        // These will work when the Kilograms will selected to convert into different units of Weight from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Kilogram") && spinnerto.getSelectedItem().equals("Carat")) {
            functions.convertKilogramtoCarat(resulttext);// Funciton Call of convertKilogramtoCarat from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilogramtoCarat(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilogram") && spinnerto.getSelectedItem().equals("Centigram")) {
            functions.convertKilogramtoCentigram(resulttext);//Function Call of convertKilogramtoCentigram from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilogramtoCentigram(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilogram") && spinnerto.getSelectedItem().equals("Grain")) {
            functions.convertKilogramtoGrains(resulttext);// Funciton Call of convertKilogramtoGrains from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilogramtoGrains(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilogram") && spinnerto.getSelectedItem().equals("Gram")) {
            functions.convertKilogramtoGrams(resulttext);//Function Call of convertKilogramtoGrams from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilogramtoGrams(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilogram") && spinnerto.getSelectedItem().equals("Microgram")) {
            functions.convertKilogramtoMicrograms(resulttext);// Funciton Call of convertKilogramtoMicrograms from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilogramtoMicrograms(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilogram") && spinnerto.getSelectedItem().equals("Milligram")) {
            functions.convertKilogramtoMilligrams(resulttext);//Function Call of convertKilogramtoMilligrams from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilogramtoMilligrams(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilogram") && spinnerto.getSelectedItem().equals("Ounce")) {
            functions.convertKilogramtoOunce(resulttext);// Funciton Call of convertKilogramtoOunce from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilogramtoOunce(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilogram") && spinnerto.getSelectedItem().equals("Pound")) {
            functions.convertKilogramtoPound(resulttext);//Function Call of convertKilogramtoPound from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilogramtoPound(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilogram") && spinnerto.getSelectedItem().equals("Tonne")) {
            functions.convertKilogramtoTonnes(resulttext);// Funciton Call of convertKilogramtoTonnes from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilogramtoTonnes(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilogram") && spinnerto.getSelectedItem().equals("Troy Ounce")) {
            functions.convertKilogramtoTroyOunce(resulttext);//Function Call of convertKilogramtoTroyOunce from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilogramtoTroyOunce(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilogram") && spinnerto.getSelectedItem().equals("Troy Pound")) {
            functions.convertKilogramtoTroyPound(resulttext);//Function Call of convertKilogramtoTroyPound from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertKilogramtoTroyPound(inputValue)));
        }
        // These will work when the Micrograms will selected to convert into different units of Weight from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Microgram") && spinnerto.getSelectedItem().equals("Carat")) {
            functions.convertMicrogramtoCarat(resulttext);// Funciton Call of convertMicrogramtoCarat from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMicrogramtoCarat(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Microgram") && spinnerto.getSelectedItem().equals("Centigram")) {
            functions.convertMicrogramtoCentigrams(resulttext);//Function Call of convertMicrogramtoCentigrams from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMicrogramtoCentigrams(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Microgram") && spinnerto.getSelectedItem().equals("Grain")) {
            functions.convertMicrogramtoGrains(resulttext);// Funciton Call of convertMicrogramtoGrains from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMicrogramtoGrains(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Microgram") && spinnerto.getSelectedItem().equals("Gram")) {
            functions.convertMicrogramtoGrams(resulttext);//Function Call of convertMicrogramtoGrams from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMicrogramtoGrams(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Microgram") && spinnerto.getSelectedItem().equals("Kilogram")) {
            functions.convertMicrogramtoKilogram(resulttext);// Funciton Call of convertMicrogramtoKilogram from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMicrogramtoKilogram(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Microgram") && spinnerto.getSelectedItem().equals("Milligram")) {
            functions.convertMicrogramtoMilligram(resulttext);//Function Call of convertMicrogramtoMilligram from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMicrogramtoMilligram(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Microgram") && spinnerto.getSelectedItem().equals("Ounce")) {
            functions.convertMicrogramtoOunce(resulttext);// Funciton Call of convertMicrogramtoOunce from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMicrogramtoOunce(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Microgram") && spinnerto.getSelectedItem().equals("Pound")) {
            functions.convertMicrogramtoPound(resulttext);//Function Call of convertMicrogramtoPound from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMicrogramtoPound(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Microgram") && spinnerto.getSelectedItem().equals("Tonne")) {
            functions.convertMicrogramtoTonne(resulttext);// Funciton Call of convertMicrogramtoTonne from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMicrogramtoTonne(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Microgram") && spinnerto.getSelectedItem().equals("Troy Ounce")) {
            functions.convertMicrogramtoTroyOunce(resulttext);//Function Call of convertMicrogramtoTroyOunce from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMicrogramtoTroyOunce(inputValue)) + " oz t");
        } else if (spinnerfrom.getSelectedItem().equals("Microgram") && spinnerto.getSelectedItem().equals("Troy Pound")) {
            functions.convertMicrogramtoTroyPound(resulttext);//Function Call of convertMicrogramtoTroyPound from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMicrogramtoTroyPound(inputValue)));
        }
        // These will work when the Milligrams will selected to convert into different units of Weight from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Milligram") && spinnerto.getSelectedItem().equals("Carat")) {
            functions.convertMilligramstoCarat(resulttext);// Funciton Call of convertMilligramstoCarat from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMilligramstoCarat(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Milligram") && spinnerto.getSelectedItem().equals("Centigram")) {
            functions.convertMilligramstoCentigram(resulttext);//Function Call of convertMilligramstoCentigram from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMilligramstoCentigram(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Milligram") && spinnerto.getSelectedItem().equals("Grain")) {
            functions.convertMilligramstoGrains(resulttext);// Funciton Call of convertMilligramstoGrains from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMilligramstoGrains(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Milligram") && spinnerto.getSelectedItem().equals("Gram")) {
            functions.convertMilligramstoGrams(resulttext);//Function Call of convertMilligramstoGrams from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMilligramstoGrams(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Milligram") && spinnerto.getSelectedItem().equals("Kilogram")) {
            functions.convertMilligramstoKilograms(resulttext);// Funciton Call of convertMilligramstoKilograms from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMilligramstoKilograms(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Milligram") && spinnerto.getSelectedItem().equals("Microgram")) {
            functions.convertMilligramstoMicrograms(resulttext);//Function Call of convertMilligramstoMicrograms from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMilligramstoMicrograms(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Milligram") && spinnerto.getSelectedItem().equals("Ounce")) {
            functions.convertMilligramstoOunce(resulttext);// Funciton Call of convertMilligramstoOunce from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMilligramstoOunce(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Milligram") && spinnerto.getSelectedItem().equals("Pound")) {
            functions.convertMilligramstoPound(resulttext);//Function Call of convertMilligramstoPound from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMilligramstoPound(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Milligram") && spinnerto.getSelectedItem().equals("Tonne")) {
            functions.convertMilligramstoTonne(resulttext);// Funciton Call of convertMilligramstoTonne from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMilligramstoTonne(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Milligram") && spinnerto.getSelectedItem().equals("Troy Ounce")) {
            functions.convertMilligramstoTroyOunce(resulttext);//Function Call of convertMilligramstoTroyOunce from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMilligramstoTroyOunce(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Milligram") && spinnerto.getSelectedItem().equals("Troy Pound")) {
            functions.convertMilligramstoTroyPound(resulttext);//Function Call of convertMilligramstoTroyPound from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertMilligramstoTroyPound(inputValue)));
        }
        // These will work when the Ounce will selected to convert into different units of Weight from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Ounce") && spinnerto.getSelectedItem().equals("Carat")) {
            functions.convertOuncetoCarat(resulttext);// Funciton Call of convertOuncetoCarat from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertOuncetoCarat(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Ounce") && spinnerto.getSelectedItem().equals("Centigram")) {
            functions.convertOuncetoCentigram(resulttext);//Function Call of convertOuncetoCentigram from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertOuncetoCentigram(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Ounce") && spinnerto.getSelectedItem().equals("Grain")) {
            functions.convertOuncetoGrains(resulttext);// Funciton Call of convertOuncetoGrains from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertOuncetoGrains(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Ounce") && spinnerto.getSelectedItem().equals("Gram")) {
            functions.convertOuncetoGrams(resulttext);//Function Call of convertOuncetoGrams from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertOuncetoGrams(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Ounce") && spinnerto.getSelectedItem().equals("Kilogram")) {
            functions.convertOuncetoKilograms(resulttext);// Funciton Call of convertOuncetoKilograms from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertOuncetoKilograms(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Ounce") && spinnerto.getSelectedItem().equals("Microgram")) {
            functions.convertOuncetoMicrograms(resulttext);//Function Call of convertOuncetoMicrograms from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertOuncetoMicrograms(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Ounce") && spinnerto.getSelectedItem().equals("Milligram")) {
            functions.convertOuncetoMilligrams(resulttext);// Funciton Call of convertOuncetoMilligrams from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertOuncetoMilligrams(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Ounce") && spinnerto.getSelectedItem().equals("Pound")) {
            functions.convertOuncetoPounds(resulttext);//Function Call of convertOuncetoPounds from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertOuncetoPounds(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Ounce") && spinnerto.getSelectedItem().equals("Tonne")) {
            functions.convertOuncetoTonne(resulttext);// Funciton Call of convertOuncetoTonne from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertOuncetoTonne(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Ounce") && spinnerto.getSelectedItem().equals("Troy Ounce")) {
            functions.convertOuncetoTroyOunce(resulttext);//Function Call of convertOuncetoTroyOunce from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertOuncetoTroyOunce(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Ounce") && spinnerto.getSelectedItem().equals("Troy Pound")) {
            functions.convertOuncetoTroyPound(resulttext);//Function Call of convertOuncetoTroyPound from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertOuncetoTroyPound(inputValue)));
        }
        // These will work when the Pound will selected to convert into different units of Weight from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Pound") && spinnerto.getSelectedItem().equals("Carat")) {
            functions.convertPoundtoCarat(resulttext);// Funciton Call of convertPoundtoCarat from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertPoundtoCarat(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Pound") && spinnerto.getSelectedItem().equals("Centigram")) {
            functions.convertPoundtoCentigram(resulttext);//Function Call of convertPoundtoCentigram from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertPoundtoCentigram(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Pound") && spinnerto.getSelectedItem().equals("Grain")) {
            functions.convertPoundtoGrains(resulttext);// Funciton Call of convertPoundtoGrains from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertPoundtoGrains(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Pound") && spinnerto.getSelectedItem().equals("Gram")) {
            functions.convertPoundtoGrams(resulttext);//Function Call of convertPoundtoGrams from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertPoundtoGrams(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Pound") && spinnerto.getSelectedItem().equals("Kilogram")) {
            functions.convertPoundtoKilograms(resulttext);// Funciton Call of convertPoundtoKilograms from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertPoundtoKilograms(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Pound") && spinnerto.getSelectedItem().equals("Microgram")) {
            functions.convertPoundtoMicrograms(resulttext);//Function Call of convertPoundtoMicrograms from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertPoundtoMicrograms(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Pound") && spinnerto.getSelectedItem().equals("Milligram")) {
            functions.convertPoundtoMilligrams(resulttext);// Funciton Call of convertPoundtoMilligrams from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertPoundtoMilligrams(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Pound") && spinnerto.getSelectedItem().equals("Ounce")) {
            functions.convertPoundtoOunces(resulttext);//Function Call of convertPoundtoOunces from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertPoundtoOunces(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Pound") && spinnerto.getSelectedItem().equals("Tonne")) {
            functions.convertPoundtoTonne(resulttext);// Funciton Call of convertPoundtoTonne from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertPoundtoTonne(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Pound") && spinnerto.getSelectedItem().equals("Troy Ounce")) {
            functions.convertPoundtoTroyOunce(resulttext);//Function Call of convertPoundtoTroyOunce from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertPoundtoTroyOunce(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Pound") && spinnerto.getSelectedItem().equals("Troy Pound")) {
            functions.convertPoundtoTroyPound(resulttext);//Function Call of convertPoundtoTroyPound from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertPoundtoTroyPound(inputValue)));
        }
        // These will work when the Tonne will selected to convert into different units of Weight from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Tonne") && spinnerto.getSelectedItem().equals("Carat")) {
            functions.convertTonnetoCarat(resulttext);// Funciton Call of convertTonnetoCarat from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertTonnetoCarat(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Tonne") && spinnerto.getSelectedItem().equals("Centigram")) {
            functions.convertTonnetoCentigrams(resulttext);//Function Call of convertTonnetoCentigrams from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertTonnetoCentigrams(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Tonne") && spinnerto.getSelectedItem().equals("Grain")) {
            functions.convertTonnetoGrains(resulttext);// Funciton Call of convertTonnetoGrains from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertTonnetoGrains(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Tonne") && spinnerto.getSelectedItem().equals("Gram")) {
            functions.convertTonnetoGrams(resulttext);//Function Call of convertTonnetoGrams from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertTonnetoGrams(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Tonne") && spinnerto.getSelectedItem().equals("Kilogram")) {
            functions.convertTonnetoKilograms(resulttext);// Funciton Call of convertTonnetoKilograms from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertTonnetoKilograms(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Tonne") && spinnerto.getSelectedItem().equals("Microgram")) {
            functions.convertTonnetoMicrograms(resulttext);//Function Call of convertTonnetoMicrograms from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertTonnetoMicrograms(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Tonne") && spinnerto.getSelectedItem().equals("Milligram")) {
            functions.convertTonnetoMilligrams(resulttext);// Funciton Call of convertTonnetoMilligrams from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertTonnetoMilligrams(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Tonne") && spinnerto.getSelectedItem().equals("Ounce")) {
            functions.convertTonnetoOunce(resulttext);//Function Call of convertTonnetoOunce from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertTonnetoOunce(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Tonne") && spinnerto.getSelectedItem().equals("Pound")) {
            functions.convertTonnetoPound(resulttext);// Funciton Call of convertTonnetoPound from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertTonnetoPound(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Tonne") && spinnerto.getSelectedItem().equals("Troy Ounce")) {
            functions.convertTonnetoTroyOunce(resulttext);//Function Call of convertTonnetoTroyOunce from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertTonnetoTroyOunce(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Tonne") && spinnerto.getSelectedItem().equals("Troy Pound")) {
            functions.convertTonnetoTroyPound(resulttext);//Function Call of convertTonnetoTroyPound from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertTonnetoTroyPound(inputValue)));
        }
        // These will work when the Troy Ounce will selected to convert into different units of Weight from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Troy Ounce") && spinnerto.getSelectedItem().equals("Carat")) {
            functions.convertTroyOuncetoCarat(resulttext);// Funciton Call of convertTroyOuncetoCarat from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertTroyOuncetoCarat(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Troy Ounce") && spinnerto.getSelectedItem().equals("Centigram")) {
            functions.convertTroyOuncetoCentigram(resulttext);//Function Call of convertTroyOuncetoCentigram from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertTroyOuncetoCentigram(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Troy Ounce") && spinnerto.getSelectedItem().equals("Grain")) {
            functions.convertTroyOuncetoGrains(resulttext);// Funciton Call of convertTroyOuncetoGrains from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertTroyOuncetoGrains(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Troy Ounce") && spinnerto.getSelectedItem().equals("Gram")) {
            functions.convertTroyOuncetoGrams(resulttext);//Function Call of convertTroyOuncetoGrams from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertTroyOuncetoGrams(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Troy Ounce") && spinnerto.getSelectedItem().equals("Kilogram")) {
            functions.convertTroyOuncetoKilograms(resulttext);// Funciton Call of convertTroyOuncetoKilograms from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertTroyOuncetoKilograms(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Troy Ounce") && spinnerto.getSelectedItem().equals("Microgram")) {
            functions.convertTroyOuncetoMicrograms(resulttext);//Function Call of convertTroyOuncetoMicrograms from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertTroyOuncetoMicrograms(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Troy Ounce") && spinnerto.getSelectedItem().equals("Milligram")) {
            functions.convertTroyOuncetoMilligrams(resulttext);// Funciton Call of convertTroyOuncetoMilligrams from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertTroyOuncetoMilligrams(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Troy Ounce") && spinnerto.getSelectedItem().equals("Ounce")) {
            functions.convertTroyOuncetoOunce(resulttext);//Function Call of convertTroyOuncetoOunce from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertTroyOuncetoOunce(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Troy Ounce") && spinnerto.getSelectedItem().equals("Pound")) {
            functions.convertTroyOuncetoPound(resulttext);// Funciton Call of convertTroyOuncetoPound from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertTroyOuncetoPound(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Troy Ounce") && spinnerto.getSelectedItem().equals("Tonne")) {
            functions.convertTroyOuncetoTonne(resulttext);//Function Call of convertTroyOuncetoTonne from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertTroyOuncetoTonne(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Troy Ounce") && spinnerto.getSelectedItem().equals("Troy Pound")) {
            functions.convertTroyOuncetoTroyPound(resulttext);//Function Call of convertTroyOuncetoTroyPound from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertTroyOuncetoTroyPound(inputValue)));
        }
        // These will work when the Troy Pound will selected to convert into different units of Weight from Utlility Class
        else if (spinnerfrom.getSelectedItem().equals("Troy Pound") && spinnerto.getSelectedItem().equals("Carat")) {
            functions.convertTroyPoundtoCarat(resulttext);// Funciton Call of convertTroyPoundtoCarat from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertTroyPoundtoCarat(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Troy Pound") && spinnerto.getSelectedItem().equals("Centigram")) {
            functions.convertTroyPoundtoCentigram(resulttext);//Function Call of convertTroyPoundtoCentigram from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertTroyPoundtoCentigram(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Troy Pound") && spinnerto.getSelectedItem().equals("Grain")) {
            functions.convertTroyPoundtoGrains(resulttext);// Funciton Call of convertTroyPoundtoGrains from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertTroyPoundtoGrains(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Troy Pound") && spinnerto.getSelectedItem().equals("Gram")) {
            functions.convertTroyPoundtoGrams(resulttext);//Function Call of convertTroyPoundtoGrams from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertTroyPoundtoGrams(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Troy Pound") && spinnerto.getSelectedItem().equals("Kilogram")) {
            functions.convertTroyPoundtoKilograms(resulttext);// Funciton Call of convertTroyPoundtoKilograms from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertTroyPoundtoKilograms(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Troy Pound") && spinnerto.getSelectedItem().equals("Microgram")) {
            functions.convertTroyPoundtoMicrograms(resulttext);//Function Call of convertTroyPoundtoMicrograms from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertTroyPoundtoMicrograms(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Troy Pound") && spinnerto.getSelectedItem().equals("Milligram")) {
            functions.convertTroyPoundtoMilligrams(resulttext);// Funciton Call of convertTroyPoundtoMilligrams from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertTroyPoundtoMilligrams(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Troy Pound") && spinnerto.getSelectedItem().equals("Ounce")) {
            functions.convertTroyPoundtoOunce(resulttext);//Function Call of convertTroyPoundtoOunce from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertTroyPoundtoOunce(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Troy Pound") && spinnerto.getSelectedItem().equals("Pound")) {
            functions.convertTroyPoundtoPound(resulttext);// Funciton Call of convertTroyPoundtoPound from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertTroyPoundtoPound(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Troy Pound") && spinnerto.getSelectedItem().equals("Tonne")) {
            functions.convertTroyPoundtoTonne(resulttext);//Function Call of convertTroyPoundtoTonne from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertTroyPoundtoTonne(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Troy Pound") && spinnerto.getSelectedItem().equals("Troy Ounce")) {
            functions.convertTroyPoundtoTroyOunce(resulttext);//Function Call of convertTroyPoundtoTroyOunce from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertTroyPoundtoTroyOunce(inputValue)));
        }
    }

    private void lengthUnit(Object selectedItem, Object selectedItem1) {
        // These will work when the Millimeter will selected to convert into different units of Length
        if (spinnerfrom.getSelectedItem().equals("Millimeter") && spinnerto.getSelectedItem().equals("Centimeter")) {
            functions.convertmillimetertoCentimeteer(resulttext);//Function Call of convertmillimetertoCentimeteer from Utlility Class
            tvResult.setText(String.format("%.2f", functions.convertmillimetertoCentimeteer(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Millimeter") && spinnerto.getSelectedItem().equals("Meter")) {
            functions.convertmillimetertoMeter(resulttext);//Function Call of
            tvResult.setText(String.format("%.2f", functions.convertmillimetertoMeter(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Millimeter") && spinnerto.getSelectedItem().equals("Kilometer")) {
            functions.convertmillimetertoKilometer(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertmillimetertoKilometer(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Millimeter") && spinnerto.getSelectedItem().equals("Inch")) {
            functions.convertmillimetertoInches(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertmillimetertoInches(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Millimeter") && spinnerto.getSelectedItem().equals("Feet")) {
            functions.convertmillimetertoFeets(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertmillimetertoFeets(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Millimeter") && spinnerto.getSelectedItem().equals("Yard")) {
            functions.convertmillimetertoYards(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertmillimetertoYards(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Millimeter") && spinnerto.getSelectedItem().equals("Mile")) {
            functions.convertmillimetertoMiles(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertmillimetertoMiles(inputValue)));
        }
        // These will work when the Centimeter will selected to convert into different units of Length
        else if (spinnerfrom.getSelectedItem().equals("Centimeter") && spinnerto.getSelectedItem().equals("Millimeter")) {
            functions.convertcentimetertoMillimeters(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertcentimetertoMillimeters(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter") && spinnerto.getSelectedItem().equals("Meter")) {
            functions.convertcentimetertoMeters(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertcentimetertoMeters(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter") && spinnerto.getSelectedItem().equals("Kilometer")) {
            functions.convertcentimetertoKilometer(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertcentimetertoKilometer(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter") && spinnerto.getSelectedItem().equals("Inch")) {
            functions.convertcentimetertoInches(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertcentimetertoInches(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter") && spinnerto.getSelectedItem().equals("Feet")) {
            functions.convertcentimetertoFeets(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertcentimetertoFeets(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter") && spinnerto.getSelectedItem().equals("Yard")) {
            functions.convertcentimetertoYards(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertcentimetertoYards(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Centimeter") && spinnerto.getSelectedItem().equals("Mile")) {
            functions.convertcentimetertoMiles(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertcentimetertoMiles(inputValue)));
        }
        // These will work when the Meter will selected to convert into different units of Length
        else if (spinnerfrom.getSelectedItem().equals("Meter") && spinnerto.getSelectedItem().equals("Millimeter")) {
            functions.convertmetertoMillimeter(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertmetertoMillimeter(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter") && spinnerto.getSelectedItem().equals("Centimeter")) {
            functions.convertmetertoCentimeter(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertmetertoCentimeter(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter") && spinnerto.getSelectedItem().equals("Kilometer")) {
            functions.convertmetertoKilometer(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertmetertoKilometer(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter") && spinnerto.getSelectedItem().equals("Inch")) {
            functions.convertmetertoInches(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertmetertoInches(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter") && spinnerto.getSelectedItem().equals("Feet")) {
            functions.convertmetertoFeets(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertmetertoFeets(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter") && spinnerto.getSelectedItem().equals("Yard")) {
            functions.convertmetertoYards(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertmetertoYards(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Meter") && spinnerto.getSelectedItem().equals("Miles")) {
            functions.convertmetertoMiles(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertmetertoMiles(inputValue)));
        }
        // These will work when the Kilometer will selected to convert into different units of Length
        else if (spinnerfrom.getSelectedItem().equals("Kilometer") && spinnerto.getSelectedItem().equals("Millimeter")) {
            functions.convertkilometertoMillimeter(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertkilometertoMillimeter(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer") && spinnerto.getSelectedItem().equals("Centimeter")) {
            functions.convertkilometertoCentimeter(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertkilometertoCentimeter(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer") && spinnerto.getSelectedItem().equals("Meter")) {
            functions.convertkilometertoMeter(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertkilometertoMeter(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer") && spinnerto.getSelectedItem().equals("Inch")) {
            functions.convertkilometertoInches(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertkilometertoInches(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer") && spinnerto.getSelectedItem().equals("Feet")) {
            functions.convertkilometertoFeets(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertkilometertoFeets(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer") && spinnerto.getSelectedItem().equals("Yard")) {
            functions.convertkilometertoYards(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertkilometertoYards(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Kilometer") && spinnerto.getSelectedItem().equals("Mile")) {
            functions.convertkilometertoMiles(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertkilometertoMiles(inputValue)));
        }
        // These will work when the Inches will selected to convert into different units of Length
        else if (spinnerfrom.getSelectedItem().equals("Inch") && spinnerto.getSelectedItem().equals("Millimeter")) {
            functions.convertinchestoMillimeter(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertinchestoMillimeter(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Inch") && spinnerto.getSelectedItem().equals("Centimeter")) {
            functions.convertinchestoCentimeter(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertinchestoCentimeter(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Inch") && spinnerto.getSelectedItem().equals("Meter")) {
            functions.convertinchestoMeter(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertinchestoMeter(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Inch") && spinnerto.getSelectedItem().equals("Kilometer")) {
            functions.convertinchestoKilometer(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertinchestoKilometer(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Inch") && spinnerto.getSelectedItem().equals("Feet")) {
            functions.convertinchestoFeet(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertinchestoFeet(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Inch") && spinnerto.getSelectedItem().equals("Yard")) {
            functions.convertinchestoYards(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertinchestoYards(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Inch") && spinnerto.getSelectedItem().equals("Mile")) {
            functions.convertinchestoMiles(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertinchestoMiles(inputValue)));
        }
        // These will work when the Feet will selected to convert into different units of Length
        else if (spinnerfrom.getSelectedItem().equals("Feet") && spinnerto.getSelectedItem().equals("Millimeter")) {
            functions.convertfeettoMillimeter(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertfeettoMillimeter(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Feet") && spinnerto.getSelectedItem().equals("Centimeter")) {
            functions.convertfeettoCentimeter(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertfeettoCentimeter(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Feet") && spinnerto.getSelectedItem().equals("Meter")) {
            functions.convertfeettoMeter(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertfeettoMeter(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Feet") && spinnerto.getSelectedItem().equals("Kilometer")) {
            functions.convertfeettoKilometer(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertfeettoKilometer(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Feet") && spinnerto.getSelectedItem().equals("Inch")) {
            functions.convertfeettoInches(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertfeettoInches(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Feet") && spinnerto.getSelectedItem().equals("Yard")) {
            functions.convertfeettoYards(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertfeettoYards(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Feet") && spinnerto.getSelectedItem().equals("Mile")) {
            functions.convertfeettoMiles(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertfeettoMiles(inputValue)));
        }
        // These will work when the Yards will selected to convert into different units of Length
        else if (spinnerfrom.getSelectedItem().equals("Yard") && spinnerto.getSelectedItem().equals("Millimeter")) {
            functions.convertyardstoMillimeter(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertyardstoMillimeter(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard") && spinnerto.getSelectedItem().equals("Centimeter")) {
            functions.convertyardstoCentimeter(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertyardstoCentimeter(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard") && spinnerto.getSelectedItem().equals("Meter")) {
            functions.convertyardstoMeters(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertyardstoMeters(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard") && spinnerto.getSelectedItem().equals("Kilometer")) {
            functions.convertyardstoKilometer(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertyardstoKilometer(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard") && spinnerto.getSelectedItem().equals("Inch")) {
            functions.convertyardstoInches(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertyardstoInches(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard") && spinnerto.getSelectedItem().equals("Feet")) {
            functions.convertyardstoFeet(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertyardstoFeet(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Yard") && spinnerto.getSelectedItem().equals("Mile")) {
            functions.convertyardstoMiles(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertyardstoMiles(inputValue)));
        }
        // These will work when the Miles will selected to convert into different units of Length
        else if (spinnerfrom.getSelectedItem().equals("Mile") && spinnerto.getSelectedItem().equals("Millimeter")) {
            functions.convertmilestomillimeter(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertmilestomillimeter(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile") && spinnerto.getSelectedItem().equals("Centimeter")) {
            functions.convertmilestoCentimeter(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertmilestoCentimeter(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile") && spinnerto.getSelectedItem().equals("Meter")) {
            functions.convertmilestoMeters(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertmilestoMeters(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile") && spinnerto.getSelectedItem().equals("Kilometer")) {
            functions.convertmilestoKilometer(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertmilestoKilometer(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile") && spinnerto.getSelectedItem().equals("Inch")) {
            functions.convertmilestoInches(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertmilestoInches(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile") && spinnerto.getSelectedItem().equals("Feet")) {
            functions.convertmilestoFeet(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertmilestoFeet(inputValue)));
        } else if (spinnerfrom.getSelectedItem().equals("Mile") && spinnerto.getSelectedItem().equals("Yard")) {
            functions.convertmilestoYards(resulttext);
            tvResult.setText(String.format("%.2f", functions.convertmilestoYards(inputValue)));
        }
    }

    private void temperatureUnit(Object selectedItem, Object selectedItem1) {
        // These will work when the Fahrenheit will selected to convert into different units of Temperature
            if (spinnerfrom.getSelectedItem().equals("Fahrenheit") && spinnerto.getSelectedItem().equals("Celsius")) {
                functions.convertfahrenheittoCelsius(resulttext);//Function Call of convertfahrenheittoCelsius from Utlility Class
                tvResult.setText(String.format("%.2f", functions.convertfahrenheittoCelsius(inputValue)));
            } else if (spinnerfrom.getSelectedItem().equals("Fahrenheit") && spinnerto.getSelectedItem().equals("Kelvin")) {
                functions.convertFahrenheittoKelvin(resulttext);//Function Call of convertFahrenheittoKelvin from Utlility Class
                tvResult.setText(String.format("%.2f", functions.convertFahrenheittoKelvin(inputValue)));
            }
            // These will work when the Celsius will selected to convert into different units of Temperature from Utlility Class
            else if (spinnerfrom.getSelectedItem().equals("Celsius") && spinnerto.getSelectedItem().equals("Fahrenheit")) {
                functions.convertcelsiustoFahrenheit(resulttext);// Funciton Call of convertcelsiustoFahrenheit from Utlility Class
                tvResult.setText(String.format("%.2f", functions.convertcelsiustoFahrenheit(inputValue)));
            } else if (spinnerfrom.getSelectedItem().equals("Celsius") && spinnerto.getSelectedItem().equals("Kelvin")) {
                functions.convertCelsiustoKelvin(resulttext);//Function Call of convertCelsiustoKelvin from Utlility Class
                tvResult.setText(String.format("%.2f", functions.convertCelsiustoKelvin(inputValue)));
            }
            // These will work when the Kelvin will selected to convert into different units of Temperature
            else if (spinnerfrom.getSelectedItem().equals("Kelvin") && spinnerto.getSelectedItem().equals("Fahrenheit")) {
                functions.convertkelvintoFahrenheit(resulttext);//Function Call of convertkelvintoFahrenheit from Utlility Class
                tvResult.setText(String.format("%.2f", functions.convertkelvintoFahrenheit(inputValue)));

            } else if (spinnerfrom.getSelectedItem().equals("Kelvin") && spinnerto.getSelectedItem().equals("Celsius")) {
                functions.convertKelvintoCelsius(resulttext); //Function Call of convertKelvintoCelsius from Utlility Class
                tvResult.setText(String.format("%.2f", functions.convertKelvintoCelsius(inputValue)));
            }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_temperature, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch(item.getItemId()) {
            //noinspection SimplifiableIfStatement
            case R.id.action_settings:
            {
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
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

    @Override
    public void onBackPressed() {
        showInterstitial();
    }
}
