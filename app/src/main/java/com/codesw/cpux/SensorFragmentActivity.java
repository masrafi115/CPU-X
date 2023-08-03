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
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;

public class SensorFragmentActivity extends  Fragment  { 
	
	
	private String bt = "";
	private String wifi = "";
	private String gps = "";
	private String lw = "";
	private String microp = "";
	private String ameter = "";
	private String bmeter = "";
	private String comp = "";
	private String gyro = "";
	private String light = "";
	private String magnet = "";
	private String accel = "";
	private String ori = "";
	private String press = "";
	private String proxi = "";
	private String nfc = "";
	private String rotvect = "";
	private String temp = "";
	private String grav = "";
	private  SensorManager mSensorManager;
	private  PackageManager pm;
	
	private LinearLayout linear1;
	private CardView cardview1;
	private LinearLayout linear2;
	private ScrollView vscroll1;
	private LinearLayout linear3;
	private LinearLayout linear64;
	private LinearLayout linear65;
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
	private LinearLayout linear67;
	private LinearLayout linear68;
	private LinearLayout linear69;
	private LinearLayout linear70;
	private LinearLayout linear71;
	private LinearLayout linear72;
	private LinearLayout linear73;
	private LinearLayout linear74;
	private LinearLayout linear75;
	private LinearLayout linear76;
	private LinearLayout linear77;
	private LinearLayout linear79;
	private TextView textview69;
	private TextView textview70;
	private TextView textview71;
	private TextView textview72;
	private TextView textview73;
	private TextView textview74;
	private TextView textview75;
	private TextView textview76;
	private TextView textview77;
	private TextView textview78;
	private LinearLayout linear82;
	private LinearLayout linear83;
	private LinearLayout linear84;
	private LinearLayout linear85;
	private LinearLayout linear86;
	private LinearLayout linear87;
	private LinearLayout linear88;
	private TextView textview82;
	private TextView textview83;
	private TextView textview84;
	private TextView textview85;
	private TextView textview86;
	private TextView textview87;
	private TextView textview88;
	private TextView textview89;
	@NonNull
	@Override
	public View onCreateView(@NonNull LayoutInflater _inflater, @Nullable ViewGroup _container, @Nullable Bundle _savedInstanceState) {
		View _view = _inflater.inflate(R.layout.sensor_fragment, _container, false);
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
		linear64 = (LinearLayout) _view.findViewById(R.id.linear64);
		linear65 = (LinearLayout) _view.findViewById(R.id.linear65);
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
		linear67 = (LinearLayout) _view.findViewById(R.id.linear67);
		linear68 = (LinearLayout) _view.findViewById(R.id.linear68);
		linear69 = (LinearLayout) _view.findViewById(R.id.linear69);
		linear70 = (LinearLayout) _view.findViewById(R.id.linear70);
		linear71 = (LinearLayout) _view.findViewById(R.id.linear71);
		linear72 = (LinearLayout) _view.findViewById(R.id.linear72);
		linear73 = (LinearLayout) _view.findViewById(R.id.linear73);
		linear74 = (LinearLayout) _view.findViewById(R.id.linear74);
		linear75 = (LinearLayout) _view.findViewById(R.id.linear75);
		linear76 = (LinearLayout) _view.findViewById(R.id.linear76);
		linear77 = (LinearLayout) _view.findViewById(R.id.linear77);
		linear79 = (LinearLayout) _view.findViewById(R.id.linear79);
		textview69 = (TextView) _view.findViewById(R.id.textview69);
		textview70 = (TextView) _view.findViewById(R.id.textview70);
		textview71 = (TextView) _view.findViewById(R.id.textview71);
		textview72 = (TextView) _view.findViewById(R.id.textview72);
		textview73 = (TextView) _view.findViewById(R.id.textview73);
		textview74 = (TextView) _view.findViewById(R.id.textview74);
		textview75 = (TextView) _view.findViewById(R.id.textview75);
		textview76 = (TextView) _view.findViewById(R.id.textview76);
		textview77 = (TextView) _view.findViewById(R.id.textview77);
		textview78 = (TextView) _view.findViewById(R.id.textview78);
		linear82 = (LinearLayout) _view.findViewById(R.id.linear82);
		linear83 = (LinearLayout) _view.findViewById(R.id.linear83);
		linear84 = (LinearLayout) _view.findViewById(R.id.linear84);
		linear85 = (LinearLayout) _view.findViewById(R.id.linear85);
		linear86 = (LinearLayout) _view.findViewById(R.id.linear86);
		linear87 = (LinearLayout) _view.findViewById(R.id.linear87);
		linear88 = (LinearLayout) _view.findViewById(R.id.linear88);
		textview82 = (TextView) _view.findViewById(R.id.textview82);
		textview83 = (TextView) _view.findViewById(R.id.textview83);
		textview84 = (TextView) _view.findViewById(R.id.textview84);
		textview85 = (TextView) _view.findViewById(R.id.textview85);
		textview86 = (TextView) _view.findViewById(R.id.textview86);
		textview87 = (TextView) _view.findViewById(R.id.textview87);
		textview88 = (TextView) _view.findViewById(R.id.textview88);
		textview89 = (TextView) _view.findViewById(R.id.textview89);
	}
	
	private void initializeLogic() {
		pm = getContext().getPackageManager();
		mSensorManager=(SensorManager) getContext().getSystemService(Context.SENSOR_SERVICE);
		bt=SensorUtil.getBluetoothSupport(pm);
		
		wifi=SensorUtil.getWiFiSupport(pm);
		
		gps=SensorUtil.getGPSSupport(pm);
		
		lw=SensorUtil.getLiveWallpapersSupport(pm);
		
		microp=SensorUtil.getLiveMicrophoneSupport(pm);
		
		ameter=SensorUtil.getLiveAcceleratorMeterSupport(pm);
		
		bmeter=SensorUtil.getBarometerSupport(pm);
		
		comp=SensorUtil.getCompassSupport(pm);
		
		gyro=SensorUtil.getGyscopeSupport(pm);
		
		light=SensorUtil.getLightsSupport(pm);
		
		magnet=SensorUtil.getMagneticFieldSupport(mSensorManager);
		
		accel=SensorUtil.getLinearAccelerationSupport(mSensorManager);
		
		ori=SensorUtil.getOrientationSupport(mSensorManager);
		
		press=SensorUtil.getPressureSupport(mSensorManager);
		
		proxi=SensorUtil.getProximitySupport(pm);
		
		nfc=SensorUtil.getNFCSupport(pm);
		
		rotvect=SensorUtil.getRotationVectorSupport(mSensorManager);
		
		temp=SensorUtil.getTemparatureSupport(mSensorManager);
		
		grav=SensorUtil.getGravitySupport(mSensorManager);
		textview25.setText(bt);
		textview37.setText(wifi);
		textview39.setText(gps);
		textview41.setText(lw);
		textview43.setText(microp);
		textview45.setText(ameter);
		textview70.setText(bmeter);
		textview72.setText(comp);
		textview74.setText(gyro);
		textview76.setText(proxi);
		textview78.setText(temp);
		textview83.setText(grav);
		textview85.setText(ori);
		textview87.setText(press);
		textview89.setText(nfc);
	}
	
	@Override
	public void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	public void _sensor () {
	} public static class SensorUtil {
			
			public static String getBluetoothSupport(android.content.pm.PackageManager pm) {
					if (pm.hasSystemFeature(android.content.pm.PackageManager.FEATURE_BLUETOOTH)) {
							return "Supported";
					} else {
							return "Not Supported";
					}
			}
		
			public static String getWiFiSupport(android.content.pm.PackageManager pm) {
					if (pm.hasSystemFeature(android.content.pm.PackageManager.FEATURE_WIFI)) {
							return "Supported";
					} else {
							return "Not Supported";
					}
			}
		
			public static String getGPSSupport(android.content.pm.PackageManager pm) {
					if (pm.hasSystemFeature(android.content.pm.PackageManager.FEATURE_LOCATION_GPS)) {
							return "Supported";
					} else {
							return "Not Supported";
					}
			}
		
			public static String getLiveWallpapersSupport(android.content.pm.PackageManager pm) {
					if (pm.hasSystemFeature(android.content.pm.PackageManager.FEATURE_LIVE_WALLPAPER)) {
							return "Supported";
					} else {
							return "Not Supported";
					}
			}
		
			public static String getLiveMicrophoneSupport(android.content.pm.PackageManager pm) {
					if (pm.hasSystemFeature(android.content.pm.PackageManager.FEATURE_MICROPHONE)) {
							return "Supported";
					} else {
							return "Not Supported";
					}
			}
		
			public static String getLiveAcceleratorMeterSupport(android.content.pm.PackageManager pm) {
					if (pm.hasSystemFeature(android.content.pm.PackageManager.FEATURE_SENSOR_ACCELEROMETER)) {
							return "Supported";
					} else {
							return "Not Supported";
					}
			}
		
			public static String getBarometerSupport(android.content.pm.PackageManager pm) {
					if (pm.hasSystemFeature(android.content.pm.PackageManager.FEATURE_SENSOR_BAROMETER)) {
							return "Supported";
					} else {
							return "Not Supported";
					}
			}
		
			public static String getCompassSupport(android.content.pm.PackageManager pm) {
					if (pm.hasSystemFeature(android.content.pm.PackageManager.FEATURE_SENSOR_COMPASS)) {
							return "Supported";
					} else {
							return "Not Supported";
					}
			}
		
			public static String getGyscopeSupport(android.content.pm.PackageManager pm) {
					if (pm.hasSystemFeature(android.content.pm.PackageManager.FEATURE_SENSOR_GYROSCOPE)) {
							return "Supported";
					} else {
							return "Not Supported";
					}
			}
		
			public static String getLightsSupport(android.content.pm.PackageManager pm) {
					if (pm.hasSystemFeature(android.content.pm.PackageManager.FEATURE_SENSOR_LIGHT)) {
							return "Supported";
					} else {
							return "Not Supported";
					}
			}
		
			public static String getProximitySupport(android.content.pm.PackageManager pm) {
					if (pm.hasSystemFeature(android.content.pm.PackageManager.FEATURE_SENSOR_PROXIMITY)) {
							return "Supported";
					} else {
							return "Not Supported";
					}
			}
		
		
			public static String getNFCSupport(android.content.pm.PackageManager pm) {
					if (pm.hasSystemFeature(android.content.pm.PackageManager.FEATURE_NFC)) {
							return "Supported";
					} else {
							return "Not Supported";
					}
			}
		
			public static String getMagneticFieldSupport(android.hardware.SensorManager sm) {
					if (sm.getDefaultSensor(android.hardware.Sensor.TYPE_MAGNETIC_FIELD) != null) {
							return "Supported";
					} else {
							return "Not Supported";
					}
			}
		
			public static String getLinearAccelerationSupport(android.hardware.SensorManager sm) {
					if (sm.getDefaultSensor(android.hardware.Sensor.TYPE_LINEAR_ACCELERATION) != null) {
							return "Supported";
					} else {
							return "Not Supported";
					}
			}
		
			public static String getOrientationSupport(android.hardware.SensorManager sm) {
					if (sm.getDefaultSensor(android.hardware.Sensor.TYPE_ORIENTATION) != null) {
							return "Supported";
					} else {
							return "Not Supported";
					}
			}
		
			public static String getPressureSupport(android.hardware.SensorManager sm) {
					if (sm.getDefaultSensor(android.hardware.Sensor.TYPE_PRESSURE) != null) {
							return "Supported";
					} else {
							return "Not Supported";
					}
			}
		
			public static String getRotationVectorSupport(android.hardware.SensorManager sm) {
					if (sm.getDefaultSensor(android.hardware.Sensor.TYPE_ROTATION_VECTOR) != null) {
							return "Supported";
					} else {
							return "Not Supported";
					}
			}
		
			public static String getTemparatureSupport(android.hardware.SensorManager sm) {
					if (sm.getDefaultSensor(android.hardware.Sensor.TYPE_TEMPERATURE) != null) {
							return "Supported";
					} else {
							return "Not Supported";
					}
			}
		
			public static String getGravitySupport(android.hardware.SensorManager sm) {
					if (sm.getDefaultSensor(android.hardware.Sensor.TYPE_GRAVITY) != null) {
							return "Supported";
					} else {
							return "Not Supported";
					}
			}
	}
	
	
	
}