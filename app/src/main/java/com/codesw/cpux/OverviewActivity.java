package com.codesw.cpux;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
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
import android.widget.ProgressBar;
import java.util.Timer;
import java.util.TimerTask;
import java.text.DecimalFormat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class OverviewActivity extends  AppCompatActivity  { 
	
	private Timer _timer = new Timer();
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private double cores = 0;
	private double av = 0;
	private double ud = 0;
	private double n = 0;
	private double tl = 0;
	private double tl_sp = 0;
	private double ud_sp = 0;
	private double av_sp = 0;
	private double num = 0;
	private double num1 = 0;
	private double cpu_min = 0;
	private double cpu_max = 0;
	private String osName = "";
	private String code_name = "";
	private String device = "";
	
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
	private LinearLayout linear40;
	private LinearLayout linear52;
	private TextView textview23;
	private TextView textview47;
	private TextView textview46;
	private TextView textview48;
	private LinearLayout linear43;
	private LinearLayout linear46;
	private LinearLayout linear48;
	private LinearLayout linear47;
	private TextView textview49;
	private TextView textview50;
	private TextView textview53;
	private TextView textview54;
	private TextView textview51;
	private TextView textview52;
	private TextView textview36;
	private LinearLayout linear49;
	private RelativeLayout linear50;
	private LinearLayout linear51;
	private ProgressBar progressbar2;
	private TextView textview65;
	private TextView textview58;
	private TextView textview60;
	private TextView textview37;
	private TextView textview55;
	private LinearLayout linear53;
	private RelativeLayout linear54;
	private LinearLayout linear55;
	private ProgressBar progressbar1;
	private TextView textview64;
	private TextView textview56;
	private TextView textview62;
	private TextView textview63;
	
	private TimerTask t;
	private TimerTask m;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.overview);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		_app_bar = (AppBarLayout) findViewById(R.id._app_bar);
		_coordinator = (CoordinatorLayout) findViewById(R.id._coordinator);
		_toolbar = (Toolbar) findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		cardview1 = (CardView) findViewById(R.id.cardview1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear37 = (LinearLayout) findViewById(R.id.linear37);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		linear38 = (LinearLayout) findViewById(R.id.linear38);
		linear32 = (LinearLayout) findViewById(R.id.linear32);
		linear40 = (LinearLayout) findViewById(R.id.linear40);
		linear52 = (LinearLayout) findViewById(R.id.linear52);
		textview23 = (TextView) findViewById(R.id.textview23);
		textview47 = (TextView) findViewById(R.id.textview47);
		textview46 = (TextView) findViewById(R.id.textview46);
		textview48 = (TextView) findViewById(R.id.textview48);
		linear43 = (LinearLayout) findViewById(R.id.linear43);
		linear46 = (LinearLayout) findViewById(R.id.linear46);
		linear48 = (LinearLayout) findViewById(R.id.linear48);
		linear47 = (LinearLayout) findViewById(R.id.linear47);
		textview49 = (TextView) findViewById(R.id.textview49);
		textview50 = (TextView) findViewById(R.id.textview50);
		textview53 = (TextView) findViewById(R.id.textview53);
		textview54 = (TextView) findViewById(R.id.textview54);
		textview51 = (TextView) findViewById(R.id.textview51);
		textview52 = (TextView) findViewById(R.id.textview52);
		textview36 = (TextView) findViewById(R.id.textview36);
		linear49 = (LinearLayout) findViewById(R.id.linear49);
		linear50 = (RelativeLayout) findViewById(R.id.linear50);
		linear51 = (LinearLayout) findViewById(R.id.linear51);
		progressbar2 = (ProgressBar) findViewById(R.id.progressbar2);
		textview65 = (TextView) findViewById(R.id.textview65);
		textview58 = (TextView) findViewById(R.id.textview58);
		textview60 = (TextView) findViewById(R.id.textview60);
		textview37 = (TextView) findViewById(R.id.textview37);
		textview55 = (TextView) findViewById(R.id.textview55);
		linear53 = (LinearLayout) findViewById(R.id.linear53);
		linear54 = (RelativeLayout) findViewById(R.id.linear54);
		linear55 = (LinearLayout) findViewById(R.id.linear55);
		progressbar1 = (ProgressBar) findViewById(R.id.progressbar1);
		textview64 = (TextView) findViewById(R.id.textview64);
		textview56 = (TextView) findViewById(R.id.textview56);
		textview62 = (TextView) findViewById(R.id.textview62);
		textview63 = (TextView) findViewById(R.id.textview63);
	}
	
	private void initializeLogic() {
		com.google.android.material.appbar.AppBarLayout appBarLayout = (com.google.android.material.appbar.AppBarLayout) _toolbar.getParent();
		appBarLayout.setStateListAnimator(null);
		int i = GetNumberOfCores();
		cores = i;
		
		cpu_min = getCpuMinFreq();
		cpu_max = getCpuMaxFreq();
		osName = AndroidOSName();
		code_name = Build.VERSION.RELEASE;
		device = Build.MODEL;
		textview46.setText(osName.concat(" v").concat(code_name));
		textview47.setText(device);
		textview49.setText(String.valueOf((long)(cores)));
		textview53.setText(String.valueOf(cpu_min / 1000).concat("MHz"));
		textview51.setText(String.valueOf(cpu_max / 1000000).concat(" GHz"));
		t = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						int n = 0;
							    try{
								      String[] arrayOfString = new java.io.RandomAccessFile("/proc/meminfo", "r").readLine().split(" kB")[0].split(" ");
								      n = Integer.parseInt(arrayOfString[(-1 + arrayOfString.length)]);
								    }catch (java.io.IOException localIOException) {
								    }
							
						tl = n / 1024;
						textview58.setText("Total Ram        ".concat(String.valueOf((long)(tl)).concat("MB")));
						ActivityManager localActivityManager = (ActivityManager)getApplicationContext().getSystemService("activity");
							    ActivityManager.MemoryInfo localMemoryInfo = new ActivityManager.MemoryInfo();
							    localActivityManager.getMemoryInfo(localMemoryInfo);
							    long ava =  localMemoryInfo.availMem / 1024L / 1024L;
						double av = Long.valueOf(ava);
						double ud = tl - av;
						textview60.setText("Used Ram        ".concat(String.valueOf((long)(ud)).concat(" MB")));
						textview37.setText("Free Ram        ".concat(String.valueOf((long)(av)).concat("MB")));
						num = (ud * 100) / tl;
						progressbar2.setProgress((int)num);
						textview65.setText(String.valueOf((long)((ud * 100) / tl)).concat("%"));
					}
				});
			}
		};
		_timer.scheduleAtFixedRate(t, (int)(100), (int)(1000));
		m = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						_getDeviceSpace(FileUtil.getExternalStorageDir(), textview56, textview62, textview63);
						num1 = (ud_sp * 100) / tl_sp;
						progressbar1.setProgress((int)num1);
						textview64.setText(String.valueOf((long)((ud_sp * 100) / tl_sp)).concat("%"));
					}
				});
			}
		};
		_timer.scheduleAtFixedRate(m, (int)(100), (int)(1000));
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
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
	
	
	public void _getDeviceSpace (final String _path, final TextView _text1, final TextView _text2, final TextView _text3) {
		final java.io.File internal = new java.io.File(_path);
		
		long f=internal.getFreeSpace();
		long t=internal.getTotalSpace();
		long u= t-f;
		
		String f1 = size(f);
		String t1 = size(t);
		String u1 = size(u);
		_text1.setText("Free Space    ".concat(f1));
		_text2.setText("Used Space   ".concat(u1));
		_text3.setText("Total Space   ".concat(t1));
		tl_sp = Long.valueOf(t);
		ud_sp = Long.valueOf(u);
		av_sp = Long.valueOf(f);
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
	
	
	public void _Size (final double _Size) {
	}
	
	public String size(double size){
		    String hrSize = "";
		double k = size/1024.0;
		    double m = size/(1024.0*1024.0);
		double g = size/(1024.0*1024*1024);
		
		    DecimalFormat dec = new DecimalFormat("0.00");
		
		if (g > 1) {
			        hrSize = dec.format(g).concat(" GB");
		}
		    else if (m > 1) {
			        hrSize = dec.format(m).concat(" MB");
			    } else if (k > 1) {
			        hrSize = dec.format(k).concat(" KB");
			    }
		else {
			hrSize = dec.format(size/1024).concat(" KB");
		}
		
		    return hrSize;
		
	}
	
	
	public void _getAndroidVersionName () {
	} public String AndroidOSName() {
		    String os = Build.VERSION.SDK;
		    System.out.println("here is my os" + " " + os);
		    if (os.equals("23")) {
			        return "Marshmallow";
			    } else if (os.equals("21")) {
			        return "Lollipop";
			    } else if (os.equals("22")) {
			        return "LOLLIPOP_MR1";
			    } else if (os.equals("20")) {
			        return "KitKat";
			    } else if (os.equals("19")) {
			        return "KitKat";
			    } else if (os.equals("18")) {
			        return "Jelly Bean";
			    } else if (os.equals("17")) {
			
			        return "Jelly Bean";
			    } else if (os.equals("16")) {
			        return "Jelly Bean";
			    } else if (os.equals("15")) {
			        return "Ice Cream Sandwich";
			    } else if (os.equals("14")) {
			        return "Ice Cream Sandwich";
			    } else if (os.equals("13")) {
			        return "Honeycomb";
			    } else if (os.equals("12")) {
			        return "Honeycomb";
			    } else if (os.equals("11")) {
			        return "Honeycomb";
			    } else if (os.equals("10")) {
			        return "Gingerbread";
			    } else if (os.equals("9")) {
			        return "Froyo";
			    } else if (os.equals("8")) {
			        return "Froyo";
			    } else {
			        return "Not Found";
			    }
		
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}