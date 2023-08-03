package com.codesw.cpux;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import android.widget.LinearLayout;
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
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager.OnPageChangeListener;
import androidx.viewpager.widget.ViewPager.OnAdapterChangeListener;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.ImageView;
import android.content.Intent;
import android.net.Uri;
import android.app.AlertDialog;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class MainActivity extends  AppCompatActivity  { 
	
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private DrawerLayout _drawer;
	private String fontName = "";
	private String typeace = "";
	
	private TabLayout tablayout1;
	private ViewPager viewpager1;
	private LinearLayout _drawer_linear1;
	private ScrollView _drawer_vscroll1;
	private LinearLayout _drawer_linear4;
	private LinearLayout _drawer_linear24;
	private LinearLayout _drawer_linear18;
	private LinearLayout _drawer_linear8;
	private LinearLayout _drawer_linear14;
	private LinearLayout _drawer_linear15;
	private LinearLayout _drawer_linear19;
	private TextView _drawer_textview20;
	private LinearLayout _drawer_linear48;
	private LinearLayout _drawer_linear28;
	private LinearLayout _drawer_linear29;
	private LinearLayout _drawer_linear25;
	private ImageView _drawer_i3;
	private TextView _drawer_textview6;
	private ImageView _drawer_i2;
	private TextView _drawer_textview10;
	private ImageView _drawer_i1;
	private TextView _drawer_textview11;
	private ImageView _drawer_imageview2;
	private TextView _drawer_textview18;
	private ImageView _drawer_imageview3;
	private TextView _drawer_textview19;
	
	private Intent i = new Intent();
	private AlertDialog.Builder d;
	private AlertDialog.Builder buy;
	private Intent g = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
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
		_drawer = (DrawerLayout) findViewById(R.id._drawer);
		ActionBarDrawerToggle _toggle = new ActionBarDrawerToggle(MainActivity.this, _drawer, _toolbar, R.string.app_name, R.string.app_name);
		_drawer.addDrawerListener(_toggle);
		_toggle.syncState();
		
		LinearLayout _nav_view = (LinearLayout) findViewById(R.id._nav_view);
		
		tablayout1 = (TabLayout) findViewById(R.id.tablayout1);
		viewpager1 = (ViewPager) findViewById(R.id.viewpager1);
		_drawer_linear1 = (LinearLayout) _nav_view.findViewById(R.id.linear1);
		_drawer_vscroll1 = (ScrollView) _nav_view.findViewById(R.id.vscroll1);
		_drawer_linear4 = (LinearLayout) _nav_view.findViewById(R.id.linear4);
		_drawer_linear24 = (LinearLayout) _nav_view.findViewById(R.id.linear24);
		_drawer_linear18 = (LinearLayout) _nav_view.findViewById(R.id.linear18);
		_drawer_linear8 = (LinearLayout) _nav_view.findViewById(R.id.linear8);
		_drawer_linear14 = (LinearLayout) _nav_view.findViewById(R.id.linear14);
		_drawer_linear15 = (LinearLayout) _nav_view.findViewById(R.id.linear15);
		_drawer_linear19 = (LinearLayout) _nav_view.findViewById(R.id.linear19);
		_drawer_textview20 = (TextView) _nav_view.findViewById(R.id.textview20);
		_drawer_linear48 = (LinearLayout) _nav_view.findViewById(R.id.linear48);
		_drawer_linear28 = (LinearLayout) _nav_view.findViewById(R.id.linear28);
		_drawer_linear29 = (LinearLayout) _nav_view.findViewById(R.id.linear29);
		_drawer_linear25 = (LinearLayout) _nav_view.findViewById(R.id.linear25);
		_drawer_i3 = (ImageView) _nav_view.findViewById(R.id.i3);
		_drawer_textview6 = (TextView) _nav_view.findViewById(R.id.textview6);
		_drawer_i2 = (ImageView) _nav_view.findViewById(R.id.i2);
		_drawer_textview10 = (TextView) _nav_view.findViewById(R.id.textview10);
		_drawer_i1 = (ImageView) _nav_view.findViewById(R.id.i1);
		_drawer_textview11 = (TextView) _nav_view.findViewById(R.id.textview11);
		_drawer_imageview2 = (ImageView) _nav_view.findViewById(R.id.imageview2);
		_drawer_textview18 = (TextView) _nav_view.findViewById(R.id.textview18);
		_drawer_imageview3 = (ImageView) _nav_view.findViewById(R.id.imageview3);
		_drawer_textview19 = (TextView) _nav_view.findViewById(R.id.textview19);
		d = new AlertDialog.Builder(this);
		buy = new AlertDialog.Builder(this);
		
		_drawer_linear8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), OverviewActivity.class);
				startActivity(i);
			}
		});
		
		_drawer_linear14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("CPU - X");
				d.setIcon(R.drawable.codesw_app);
				d.setMessage("This App is Made With Sketchware. \n\nCodesw is the owner of this app\n\nIf you want to buy sketchware project of this app or want to know more information about this app\n\nContact @spider_sw Telegram");
				d.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				d.create().show();
			}
		});
		
		_drawer_linear15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				buy.setTitle("CPU - X");
				buy.setMessage("Buy full app and Project of Sketchware");
				buy.setPositiveButton("Buy Now", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						g.setAction(Intent.ACTION_VIEW);
						g.setData(Uri.parse("http://t.me/spider_sw"));
						startActivity(g);
					}
				});
				buy.create().show();
			}
		});
		
		_drawer_linear28.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		_drawer_linear29.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				g.setAction(Intent.ACTION_VIEW);
				g.setData(Uri.parse("http://t.me/codesw"));
				startActivity(g);
			}
		});
	}
	
	private void initializeLogic() {
		_setDrawerWidth(250);
		com.google.android.material.appbar.AppBarLayout appBarLayout = (com.google.android.material.appbar.AppBarLayout) _toolbar.getParent();
		appBarLayout.setStateListAnimator(null);
		_changeActivityFont("en_medium");
		viewpager1.setAdapter(new MyFragmentAdapter(getApplicationContext(), getSupportFragmentManager(), 7));
		tablayout1.setupWithViewPager(viewpager1);
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	public class MyFragmentAdapter extends FragmentStatePagerAdapter {
		Context context;
		int tabCount;
		
		public MyFragmentAdapter(Context context, FragmentManager fm, int tabCount) {
			super(fm);
			this.context = context;
			this.tabCount = tabCount;
		}
		
		@Override
		public int getCount(){
			return tabCount;
		}
		
		@Override
		public CharSequence getPageTitle(int _position) {
			if (_position == 0) {
				return "DEVICE INFO";
			}
			if (_position == 1) {
				return "CPU INFO";
			}
			if (_position == 2) {
				return "RAM/GPU INFO";
			}
			if (_position == 3) {
				return "BATTERY INFO";
			}
			if (_position == 4) {
				return "STORAGE INFO";
			}
			if (_position == 5) {
				return "NETWORK INFO";
			}
			if (_position == 6) {
				return "SENSOR INFO";
			}
			return null;
		}
		
		@Override
		public Fragment getItem(int _position) {
			if (_position == 0) {
				return new DeviceFragmentActivity();
			}
			else {
				if (_position == 1) {
					return new CpuFragmentActivity();
				}
				else {
					if (_position == 2) {
						return new RamngpuFragmentActivity();
					}
					else {
						if (_position == 3) {
							return new BatteryFragmentActivity();
						}
						else {
							if (_position == 4) {
								return new StorageFragmentActivity();
							}
							else {
								if (_position == 5) {
									return new NetworkFragmentActivity();
								}
								else {
									if (_position == 6) {
										return new SensorFragmentActivity();
									}
								}
							}
						}
					}
				}
			}
			return null;
		}
		
	}
	
	@Override
	public void onBackPressed() {
		if (_drawer.isDrawerOpen(GravityCompat.START)) {
			_drawer.closeDrawer(GravityCompat.START);
		}
		else {
			super.onBackPressed();
		}
	}
	public void _changeActivityFont (final String _fontname) {
		fontName = "fonts/".concat(_fontname.concat(".ttf"));
		overrideFonts(this,getWindow().getDecorView()); 
	} 
	private void overrideFonts(final android.content.Context context, final View v) {
		
		try {
			Typeface 
			typeace = Typeface.createFromAsset(getAssets(), fontName);;
			if ((v instanceof ViewGroup)) {
				ViewGroup vg = (ViewGroup) v;
				for (int i = 0;
				i < vg.getChildCount();
				i++) {
					View child = vg.getChildAt(i);
					overrideFonts(context, child);
				}
			}
			else {
				if ((v instanceof TextView)) {
					((TextView) v).setTypeface(typeace);
				}
				else {
					if ((v instanceof EditText )) {
						((EditText) v).setTypeface(typeace);
					}
					else {
						if ((v instanceof Button)) {
							((Button) v).setTypeface(typeace);
						}
					}
				}
			}
		}
		catch(Exception e)
		
		{
			SketchwareUtil.showMessage(getApplicationContext(), "Error Loading Font");
		};
	}
	
	
	public void _setDrawerWidth (final double _num) {
		LinearLayout _nav_view = (LinearLayout) findViewById(R.id._nav_view);
		
		_nav_view.setBackgroundColor(Color.parseColor("#FFFFFF"));
		
		androidx.drawerlayout.widget.DrawerLayout.LayoutParams params = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams)_nav_view.getLayoutParams();
		
		params.width = (int)getDip((int)_num);
		
		params.height = androidx.drawerlayout.widget.DrawerLayout.LayoutParams.MATCH_PARENT;
		
		_nav_view.setLayoutParams(params);
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