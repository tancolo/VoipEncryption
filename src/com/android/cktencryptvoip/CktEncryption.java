package com.android.cktencryptvoip;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

import com.android.cktencryptvoip.audio.*;
import com.android.cktencryptvoip.codec.*;

public class CktEncryption extends Activity implements View.OnClickListener {
	private static final String TAG = "CktEncryption";
//	private AudioCodec codec;
//	private MicrophoneReader micReader;
	private Button mButtonRecord;
	private Button mButtonPlay;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ckt_encryption);
		//init layout and buttons
		mButtonRecord = (Button)findViewById(R.id.voice_record);
		mButtonPlay = (Button)findViewById(R.id.voice_play);
		
		mButtonRecord.setOnClickListener(this);
		mButtonPlay.setOnClickListener(this);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ckt_encryption, menu);
		return true;
	}
/*	
	private void init() {
		String codecID = "SPEEX";
		codec = AudioCodec.getInstance( codecID ); //begins init
		micReader   = new MicrophoneReader(outgoingAudio, codec, packetLogger, monitor);
	}*/
	
    @Override
    public void onClick(View view) {
    	int id = view.getId();
    	switch(id) {
    		case R.id.voice_record:
    			break;
    		case R.id.voice_play:
    			break;
    	}
    }
	

}
