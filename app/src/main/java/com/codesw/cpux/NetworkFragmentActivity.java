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
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class NetworkFragmentActivity extends  Fragment  { 
	
	
	private String net = "";
	private String ip = "";
	
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
	
	private RequestNetwork req;
	private RequestNetwork.RequestListener _req_request_listener;
	@NonNull
	@Override
	public View onCreateView(@NonNull LayoutInflater _inflater, @Nullable ViewGroup _container, @Nullable Bundle _savedInstanceState) {
		View _view = _inflater.inflate(R.layout.network_fragment, _container, false);
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
		req = new RequestNetwork((Activity)getContext());
		
		textview37.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (textview37.getText().toString().equals("Touch to view")) {
					textview37.setText(ip);
				}
				else {
					
				}
			}
		});
		
		_req_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				net = getNetworkType(getContext());
				textview25.setText("Connected");
				textview37.setText("Touch to view");
				textview39.setText(net);
				textview41.setText("");
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				textview25.setText("Disconnected");
				textview37.setText("-");
				textview39.setText("-");
				textview41.setText("-");
			}
		};
	}
	
	private void initializeLogic() {
		req.startRequestNetwork(RequestNetworkController.GET, "http://checkip.amazonaws.com", "a", _req_request_listener);
	}
	
	@Override
	public void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	public void _network () {
	} public static String getNetworkType(Context context) {
		
				android.telephony.TelephonyManager teleMan = (android.telephony.TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
				int networkType = teleMan.getNetworkType();
				switch ( networkType ) {
						case android.telephony.TelephonyManager.NETWORK_TYPE_1xRTT:
							return "1xRTT";
						case android.telephony.TelephonyManager.NETWORK_TYPE_CDMA:
							return "CDMA";
						case android.telephony.TelephonyManager.NETWORK_TYPE_EDGE:
							return "EDGE";
						case android.telephony.TelephonyManager.NETWORK_TYPE_EHRPD:
							return "eHRPD";
						case android.telephony.TelephonyManager.NETWORK_TYPE_EVDO_0:
							return "EVDO rev. 0";
						case android.telephony.TelephonyManager.NETWORK_TYPE_EVDO_A:
							return "EVDO rev. A";
						case android.telephony.TelephonyManager.NETWORK_TYPE_EVDO_B:
							return "EVDO rev. B";
						case android.telephony.TelephonyManager.NETWORK_TYPE_GPRS:
							return "GPRS";
						case android.telephony.TelephonyManager.NETWORK_TYPE_HSDPA:
							return "HSDPA";
						case android.telephony.TelephonyManager.NETWORK_TYPE_HSPA:
							return "HSPA";
						case android.telephony.TelephonyManager.NETWORK_TYPE_HSPAP:
							return "HSPA+";
						case android.telephony.TelephonyManager.NETWORK_TYPE_HSUPA:
							return "HSUPA";
						case android.telephony.TelephonyManager.NETWORK_TYPE_IDEN:
							return "iDen";
						case android.telephony.TelephonyManager.NETWORK_TYPE_LTE:
							return "LTE";
						case android.telephony.TelephonyManager.NETWORK_TYPE_UMTS:
							return "UMTS";
						case android.telephony.TelephonyManager.NETWORK_TYPE_UNKNOWN:
							return "Unknown";
				}
				return "New type of network";
	}
	
	
	
}