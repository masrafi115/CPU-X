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
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class StorageFragmentActivity extends  Fragment  { 
	
	
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
	private LinearLayout linear40;
	private LinearLayout linear36;
	private ImageView imageview1;
	private TextView textview23;
	private TextView textview24;
	private TextView textview25;
	private TextView textview36;
	private TextView textview37;
	private TextView textview44;
	private TextView textview45;
	@NonNull
	@Override
	public View onCreateView(@NonNull LayoutInflater _inflater, @Nullable ViewGroup _container, @Nullable Bundle _savedInstanceState) {
		View _view = _inflater.inflate(R.layout.storage_fragment, _container, false);
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
		linear40 = (LinearLayout) _view.findViewById(R.id.linear40);
		linear36 = (LinearLayout) _view.findViewById(R.id.linear36);
		imageview1 = (ImageView) _view.findViewById(R.id.imageview1);
		textview23 = (TextView) _view.findViewById(R.id.textview23);
		textview24 = (TextView) _view.findViewById(R.id.textview24);
		textview25 = (TextView) _view.findViewById(R.id.textview25);
		textview36 = (TextView) _view.findViewById(R.id.textview36);
		textview37 = (TextView) _view.findViewById(R.id.textview37);
		textview44 = (TextView) _view.findViewById(R.id.textview44);
		textview45 = (TextView) _view.findViewById(R.id.textview45);
	}
	
	private void initializeLogic() {
		_getDeviceSpace(FileUtil.getExternalStorageDir(), textview45, textview37, textview25);
	}
	
	@Override
	public void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	public void _getDeviceSpace (final String _path, final TextView _text1, final TextView _text2, final TextView _text3) {
		final java.io.File internal = new java.io.File(_path);
		
		long f=internal.getFreeSpace();
		long t=internal.getTotalSpace();
		long u= t-f;
		
		String f1 = size(f);
		String t1 = size(t);
		String u1 = size(u);
		_text1.setText(f1);
		_text2.setText(u1);
		_text3.setText(t1);
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
	
	
	
}