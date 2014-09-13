package com.android.cktencryptvoip;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import com.android.cktencryptvoip.audio.*;
import com.android.cktencryptvoip.codec.*;

public class CktEncryption extends Activity {
	private static final String TAG = "CktEncryption";
	private AudioCodec codec;
	private MicrophoneReader micReader;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ckt_encryption);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ckt_encryption, menu);
		return true;
	}
	
	private void init() {
		String codecID = "SPEEX";
		codec = AudioCodec.getInstance( codecID ); //begins init
		micReader   = new MicrophoneReader(outgoingAudio, codec, packetLogger, monitor);
	}

}
