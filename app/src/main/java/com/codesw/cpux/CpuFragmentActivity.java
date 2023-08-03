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
import java.util.ArrayList;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import android.widget.ScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import java.text.DecimalFormat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class CpuFragmentActivity extends  Fragment  { 
	
	
	private double cpu_min = 0;
	private double cpu_max = 0;
	
	private ArrayList<String> list = new ArrayList<>();
	
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
	private LinearLayout linear48;
	private LinearLayout linear43;
	private LinearLayout linear49;
	private LinearLayout linear44;
	private LinearLayout linear50;
	private LinearLayout linear45;
	private LinearLayout linear53;
	private LinearLayout linear46;
	private LinearLayout linear54;
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
	private TextView textview48;
	private TextView textview49;
	private TextView textview50;
	private TextView textview51;
	private TextView textview52;
	private TextView textview53;
	private TextView textview54;
	private TextView textview55;
	@NonNull
	@Override
	public View onCreateView(@NonNull LayoutInflater _inflater, @Nullable ViewGroup _container, @Nullable Bundle _savedInstanceState) {
		View _view = _inflater.inflate(R.layout.cpu_fragment, _container, false);
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
		linear48 = (LinearLayout) _view.findViewById(R.id.linear48);
		linear43 = (LinearLayout) _view.findViewById(R.id.linear43);
		linear49 = (LinearLayout) _view.findViewById(R.id.linear49);
		linear44 = (LinearLayout) _view.findViewById(R.id.linear44);
		linear50 = (LinearLayout) _view.findViewById(R.id.linear50);
		linear45 = (LinearLayout) _view.findViewById(R.id.linear45);
		linear53 = (LinearLayout) _view.findViewById(R.id.linear53);
		linear46 = (LinearLayout) _view.findViewById(R.id.linear46);
		linear54 = (LinearLayout) _view.findViewById(R.id.linear54);
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
		textview48 = (TextView) _view.findViewById(R.id.textview48);
		textview49 = (TextView) _view.findViewById(R.id.textview49);
		textview50 = (TextView) _view.findViewById(R.id.textview50);
		textview51 = (TextView) _view.findViewById(R.id.textview51);
		textview52 = (TextView) _view.findViewById(R.id.textview52);
		textview53 = (TextView) _view.findViewById(R.id.textview53);
		textview54 = (TextView) _view.findViewById(R.id.textview54);
		textview55 = (TextView) _view.findViewById(R.id.textview55);
	}
	
	private void initializeLogic() {
		if (new java.io.File("/proc/cpuinfo").exists()) {
				        try {
					            java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader(new java.io.File("/proc/cpuinfo")));
					            String aLine;
					            while ((aLine = br.readLine()) != null) {
										//aLine = aLine.replaceAll("\t","");
										aLine = aLine.replaceAll(":","");
						                String[] data = aLine.split ("\t");
										list.addAll(Arrays.asList(data));
					list.removeAll(Arrays.asList("", null));
						            }
					            if (br != null) {
						                br.close();
						            }
					        } catch (java.io.IOException e) {
					            e.printStackTrace();
					        } 
				    }
		int i = GetNumberOfCores();
		textview39.setText(Integer.valueOf(i).toString());
		cpu_min = getCpuMinFreq();
		cpu_max = getCpuMaxFreq();
		textview25.setText(list.get((int)(list.indexOf("Hardware") + 1)));
		textview37.setText(list.get((int)(list.indexOf("model name") + 1)));
		textview43.setText(list.get((int)(list.indexOf("Features") + 1)));
		textview49.setText(list.get((int)(list.indexOf("CPU implementer") + 1)));
		textview51.setText(list.get((int)(list.indexOf("CPU part") + 1)));
		textview53.setText(list.get((int)(list.indexOf("CPU revision") + 1)));
		textview55.setText(list.get((int)(list.indexOf("CPU variant") + 1)));
		textview41.setText(String.valueOf(cpu_min / 1000).concat("MHz -  ").concat(String.valueOf(cpu_max / 1000000).concat(" GHz")));
	}
	
	@Override
	public void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	public void _getCpuMaxFreq () {
	} public static long getCpuMaxFreq() {
		        long result = 0L;
		        try {
			            String line;
			            java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"));
			            if ((line = br.readLine()) != null) {
				                result = Long.parseLong(line);
				            }
			            br.close();
			        } catch (java.io.IOException e) {
			            e.printStackTrace();
			        }
		        return result;
	}
	
	
	public void _getCpuMinFreq () {
	} public static long getCpuMinFreq() {
		        long result = 0L;
		        try {
			            String line;
			            java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq"));
			            if ((line = br.readLine()) != null) {
				                result = Long.parseLong(line);
				            }
			            br.close();
			        } catch (java.io.IOException e) {
			            e.printStackTrace();
			        }
		        return result;
	}
	
	
	public void _getNumberOfCore () {
	} public static int GetNumberOfCores() {
				return (new java.io.File("/sys/devices/system/cpu/"))
						.listFiles(new java.io.FileFilter() {
								@Override
								public boolean accept(java.io.File f) {
										return Pattern.matches("cpu[0-9]+", f.getName());
								}
						}).length;
	}
	
	
	
}