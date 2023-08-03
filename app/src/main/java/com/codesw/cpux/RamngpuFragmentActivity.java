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
import android.widget.TextView;
import android.widget.ImageView;
import java.util.Timer;
import java.util.TimerTask;
import java.text.DecimalFormat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class RamngpuFragmentActivity extends  Fragment  { 
	
	private Timer _timer = new Timer();
	
	private String ava = "";
	private double i2 = 0;
	private double n = 0;
	private double ud = 0;
	
	private LinearLayout linear1;
	private CardView cardview1;
	private LinearLayout linear2;
	private ScrollView vscroll1;
	private LinearLayout linear3;
	private LinearLayout linear5;
	private TextView textview57;
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
	private TextView textview58;
	private TextView textview40;
	private TextView textview41;
	private TextView textview42;
	private TextView textview43;
	private TextView textview44;
	private TextView textview45;
	
	private TimerTask t;
	@NonNull
	@Override
	public View onCreateView(@NonNull LayoutInflater _inflater, @Nullable ViewGroup _container, @Nullable Bundle _savedInstanceState) {
		View _view = _inflater.inflate(R.layout.ramngpu_fragment, _container, false);
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
		textview57 = (TextView) _view.findViewById(R.id.textview57);
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
		textview58 = (TextView) _view.findViewById(R.id.textview58);
		textview40 = (TextView) _view.findViewById(R.id.textview40);
		textview41 = (TextView) _view.findViewById(R.id.textview41);
		textview42 = (TextView) _view.findViewById(R.id.textview42);
		textview43 = (TextView) _view.findViewById(R.id.textview43);
		textview44 = (TextView) _view.findViewById(R.id.textview44);
		textview45 = (TextView) _view.findViewById(R.id.textview45);
	}
	
	private void initializeLogic() {
		/*
int n = 0;
	    try{
	      String[] arrayOfString = new java.io.RandomAccessFile("/proc/meminfo", "r").readLine().split(" kB")[0].split(" ");
	      n = Integer.parseInt(arrayOfString[(-1 + arrayOfString.length)]);
	    }catch (java.io.IOException localIOException) {
	    }
	
i2 = n / 1024;
textview25.setText(String.valueOf(i2));
t = new TimerTask() {
@Override
public void run() {
getActivity().runOnUiThread(new Runnable() {
@Override
public void run() {
ActivityManager localActivityManager = (ActivityManager)getContext().getSystemService("activity");
	    ActivityManager.MemoryInfo localMemoryInfo = new ActivityManager.MemoryInfo();
	    localActivityManager.getMemoryInfo(localMemoryInfo);
	    long av =  localMemoryInfo.availMem / 1024L / 1024L;
String ava = Long.valueOf(av).toString();
textview39.setText(ava);
double ud = i2 - Long.valueOf(av);
textview37.setText(String.valueOf((long)(ud)));
}
});
}
};
_timer.scheduleAtFixedRate(t, (int)(100), (int)(1000));
*/
		int n = 0;
			    try{
				      String[] arrayOfString = new java.io.RandomAccessFile("/proc/meminfo", "r").readLine().split(" kB")[0].split(" ");
				      n = Integer.parseInt(arrayOfString[(-1 + arrayOfString.length)]);
				    }catch (java.io.IOException localIOException) {
				    }
			
		i2 = n / 1024;
		textview25.setText(String.valueOf(i2).concat(" MB"));
		t = new TimerTask() {
			@Override
			public void run() {
				getActivity().runOnUiThread(new Runnable() {
					@Override
					public void run() {
						ActivityManager localActivityManager = (ActivityManager)getContext().getSystemService("activity");
							    ActivityManager.MemoryInfo localMemoryInfo = new ActivityManager.MemoryInfo();
							    localActivityManager.getMemoryInfo(localMemoryInfo);
							    long av =  localMemoryInfo.availMem / 1024L / 1024L;
						String ava = Long.valueOf(av).toString();
						textview39.setText(ava.concat(" MB"));
						double ud = i2 - Long.valueOf(av);
						textview37.setText(String.valueOf((long)(ud)).concat(" MB"));
					}
				});
			}
		};
		_timer.scheduleAtFixedRate(t, (int)(100), (int)(1000));
	}
	
	@Override
	public void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		t.cancel();
	}
	
}