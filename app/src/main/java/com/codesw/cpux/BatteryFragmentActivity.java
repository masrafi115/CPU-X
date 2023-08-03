package com.codesw.cpux;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import org.json.*;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import android.widget.ScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import java.text.DecimalFormat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class BatteryFragmentActivity extends  Fragment  { 
	
	
	private String chargeType = "";
	private String healthStatus = "";
	private double level = 0;
	private String PERCENT = "";
	private String VOLT = "";
	private String TEMP = "";
	private String STAT = "";
	private String TECH = "";
	
	private LinearLayout linear1;
	private CardView cardview1;
	private LinearLayout linear2;
	private ScrollView vscroll1;
	private LinearLayout linear3;
	private LinearLayout linear5;
	private LinearLayout linear37;
	private LinearLayout linear20;
	private LinearLayout linear38;
	private LinearLayout linear32;
	private LinearLayout linear39;
	private LinearLayout linear33;
	private LinearLayout linear40;
	private LinearLayout linear34;
	private LinearLayout linear41;
	private LinearLayout linear35;
	private LinearLayout linear42;
	private LinearLayout linear36;
	private LinearLayout linear43;
	private LinearLayout linear44;
	private LinearLayout linear47;
	private ImageView imageview1;
	private TextView textview23;
	private TextView textview24;
	private TextView textview25;
	private TextView textview36;
	private TextView textview37;
	private TextView textview38;
	private TextView textview39;
	private TextView textview40;
	private TextView textview41;
	private TextView textview42;
	private TextView textview43;
	private TextView textview44;
	private TextView textview45;
	private TextView textview46;
	private TextView textview47;
	@NonNull
	@Override
	public View onCreateView(@NonNull LayoutInflater _inflater, @Nullable ViewGroup _container, @Nullable Bundle _savedInstanceState) {
		View _view = _inflater.inflate(R.layout.battery_fragment, _container, false);
		initialize(_savedInstanceState, _view);
		initializeLogic();
		return _view;
	}
	
	private void initialize(Bundle _savedInstanceState, View _view) {
		
		linear1 = (LinearLayout) _view.findViewById(R.id.linear1);
		cardview1 = (CardView) _view.findViewById(R.id.cardview1);
		linear2 = (LinearLayout) _view.findViewById(R.id.linear2);
		vscroll1 = (ScrollView) _view.findViewById(R.id.vscroll1);
		linear3 = (LinearLayout) _view.findViewById(R.id.linear3);
		linear5 = (LinearLayout) _view.findViewById(R.id.linear5);
		linear37 = (LinearLayout) _view.findViewById(R.id.linear37);
		linear20 = (LinearLayout) _view.findViewById(R.id.linear20);
		linear38 = (LinearLayout) _view.findViewById(R.id.linear38);
		linear32 = (LinearLayout) _view.findViewById(R.id.linear32);
		linear39 = (LinearLayout) _view.findViewById(R.id.linear39);
		linear33 = (LinearLayout) _view.findViewById(R.id.linear33);
		linear40 = (LinearLayout) _view.findViewById(R.id.linear40);
		linear34 = (LinearLayout) _view.findViewById(R.id.linear34);
		linear41 = (LinearLayout) _view.findViewById(R.id.linear41);
		linear35 = (LinearLayout) _view.findViewById(R.id.linear35);
		linear42 = (LinearLayout) _view.findViewById(R.id.linear42);
		linear36 = (LinearLayout) _view.findViewById(R.id.linear36);
		linear43 = (LinearLayout) _view.findViewById(R.id.linear43);
		linear44 = (LinearLayout) _view.findViewById(R.id.linear44);
		linear47 = (LinearLayout) _view.findViewById(R.id.linear47);
		imageview1 = (ImageView) _view.findViewById(R.id.imageview1);
		textview23 = (TextView) _view.findViewById(R.id.textview23);
		textview24 = (TextView) _view.findViewById(R.id.textview24);
		textview25 = (TextView) _view.findViewById(R.id.textview25);
		textview36 = (TextView) _view.findViewById(R.id.textview36);
		textview37 = (TextView) _view.findViewById(R.id.textview37);
		textview38 = (TextView) _view.findViewById(R.id.textview38);
		textview39 = (TextView) _view.findViewById(R.id.textview39);
		textview40 = (TextView) _view.findViewById(R.id.textview40);
		textview41 = (TextView) _view.findViewById(R.id.textview41);
		textview42 = (TextView) _view.findViewById(R.id.textview42);
		textview43 = (TextView) _view.findViewById(R.id.textview43);
		textview44 = (TextView) _view.findViewById(R.id.textview44);
		textview45 = (TextView) _view.findViewById(R.id.textview45);
		textview46 = (TextView) _view.findViewById(R.id.textview46);
		textview47 = (TextView) _view.findViewById(R.id.textview47);
	}
	
	private void initializeLogic() {
		IntentFilter ifilter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
		            Intent batteryStatus = getContext().registerReceiver(null, ifilter);
		int status = batteryStatus.getIntExtra(BatteryManager.EXTRA_STATUS, -1);
		            boolean isCharging = status == BatteryManager.BATTERY_STATUS_CHARGING || status == BatteryManager.BATTERY_STATUS_FULL;
		            int chargePlug = batteryStatus.getIntExtra(BatteryManager.EXTRA_PLUGGED, -1);
		            boolean usbCharge = chargePlug == BatteryManager.BATTERY_PLUGGED_USB;
		            boolean acCharge = chargePlug == BatteryManager.BATTERY_PLUGGED_AC;
		            boolean wirelessCharge = chargePlug == BatteryManager.BATTERY_PLUGGED_WIRELESS;
		            String chargeType = "Not plugged";
		            if(usbCharge) {
			                chargeType = "USB Power";
			            } else if(acCharge) {
			                chargeType = "AC Power";
			            } else if(wirelessCharge) {
			                chargeType = "Wireless Power";
			            }
		
		int health = batteryStatus.getIntExtra(BatteryManager.EXTRA_HEALTH, -1);
		String healthStatus = "" ;
		            if(health == BatteryManager.BATTERY_HEALTH_GOOD) {
			                healthStatus = "Good";
			            } else if(health == BatteryManager.BATTERY_HEALTH_OVERHEAT) {
			                healthStatus = "Over Heat";
			            } else if(health == BatteryManager.BATTERY_HEALTH_DEAD) {
			                healthStatus = "Dead";
			            } else if(health == BatteryManager.BATTERY_HEALTH_OVER_VOLTAGE) {
			                healthStatus = "Over Voltage";
			            } else if(health == BatteryManager.BATTERY_HEALTH_UNSPECIFIED_FAILURE) {
			                healthStatus = "Unspecified failure";
			            } else if(health == BatteryManager.BATTERY_HEALTH_COLD) {
			                healthStatus = "Cold";
			            } else {
			                healthStatus = "UNKNOWN";
			            }
		String TECH = batteryStatus.getStringExtra(BatteryManager.EXTRA_TECHNOLOGY);
		String STAT = Integer.valueOf(batteryStatus.getIntExtra(BatteryManager.EXTRA_STATUS, -1)).toString();
		float temp = ((float) batteryStatus.getIntExtra(BatteryManager.EXTRA_TEMPERATURE,0) / 10);
		String TEMP = Float.valueOf(temp).toString();
		String VOLT = Integer.valueOf(batteryStatus.getIntExtra(BatteryManager.EXTRA_VOLTAGE, -1)).toString();
		int level = batteryStatus.getIntExtra(BatteryManager.EXTRA_LEVEL, -1);
		int scale = batteryStatus.getIntExtra(BatteryManager.EXTRA_SCALE, -1);
		String PERCENT = Boolean.valueOf(batteryStatus.getBooleanExtra(BatteryManager.EXTRA_PRESENT, false)).toString();
		textview41.setText(chargeType);
		if (textview41.getText().toString().equals("Not plugged")) {
			textview43.setText("Not plugged");
		}
		textview47.setText(healthStatus);
		textview37.setText(TECH);
		textview39.setText(TEMP.concat("°C"));
		textview45.setText(String.valueOf(Double.parseDouble(VOLT) / 1000).concat(" V"));
		textview25.setText(String.valueOf((long)(level)).concat("%"));
	}
	
	@Override
	public void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	
}