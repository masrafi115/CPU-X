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


public class DeviceFragmentActivity extends  Fragment  { 
	
	
	private String model = "";
	private String manufacturer = "";
	private String name = "";
	private String patch = "";
	private String code_name = "";
	private String ver_code = "";
	private String platform = "";
	private String mainboard = "";
	private String bootldr = "";
	private String disp = "";
	private String osName = "";
	
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
	private LinearLayout linear49;
	private LinearLayout linear50;
	private LinearLayout linear44;
	private LinearLayout linear45;
	private LinearLayout linear46;
	private LinearLayout linear47;
	private LinearLayout linear48;
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
	private TextView textview52;
	private TextView textview53;
	private TextView textview46;
	private TextView textview47;
	private TextView textview48;
	private TextView textview49;
	private TextView textview50;
	private TextView textview51;
	@NonNull
	@Override
	public View onCreateView(@NonNull LayoutInflater _inflater, @Nullable ViewGroup _container, @Nullable Bundle _savedInstanceState) {
		View _view = _inflater.inflate(R.layout.device_fragment, _container, false);
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
		linear49 = (LinearLayout) _view.findViewById(R.id.linear49);
		linear50 = (LinearLayout) _view.findViewById(R.id.linear50);
		linear44 = (LinearLayout) _view.findViewById(R.id.linear44);
		linear45 = (LinearLayout) _view.findViewById(R.id.linear45);
		linear46 = (LinearLayout) _view.findViewById(R.id.linear46);
		linear47 = (LinearLayout) _view.findViewById(R.id.linear47);
		linear48 = (LinearLayout) _view.findViewById(R.id.linear48);
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
		textview52 = (TextView) _view.findViewById(R.id.textview52);
		textview53 = (TextView) _view.findViewById(R.id.textview53);
		textview46 = (TextView) _view.findViewById(R.id.textview46);
		textview47 = (TextView) _view.findViewById(R.id.textview47);
		textview48 = (TextView) _view.findViewById(R.id.textview48);
		textview49 = (TextView) _view.findViewById(R.id.textview49);
		textview50 = (TextView) _view.findViewById(R.id.textview50);
		textview51 = (TextView) _view.findViewById(R.id.textview51);
	}
	
	private void initializeLogic() {
		String patch = Build.VERSION.SECURITY_PATCH;
		String code_name = Build.VERSION.RELEASE;
		String ver_code = Build.VERSION.SDK;
		String manufacturer = Build.MANUFACTURER;
		String model = Build.MODEL;
		String bootldr = Build.BOOTLOADER;
		String name = Build.DEVICE;
		String platform = Build.HARDWARE;
		String mainboard = Build.BOARD;
		osName = AndroidOSName();
		WindowManager windowManager = (WindowManager)getContext().getSystemService(Context.WINDOW_SERVICE);
		            Display display = windowManager.getDefaultDisplay();
		textview25.setText(model);
		textview37.setText(manufacturer);
		textview39.setText(name);
		textview41.setText(bootldr);
		textview49.setText(patch);
		textview47.setText(osName.concat(" v").concat(code_name));
		textview51.setText(ver_code);
		textview43.setText(platform.concat(" / ".concat(mainboard)));
		textview45.setText(String.valueOf((long)(SketchwareUtil.getDisplayWidthPixels(getContext()))).concat("X".concat(String.valueOf((long)(SketchwareUtil.getDisplayHeightPixels(getContext()))))));
		String disp = Float.valueOf(display.getRefreshRate()).toString();
		textview53.setText(disp);
	}
	
	@Override
	public void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
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
	
	
	
}