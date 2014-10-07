package CTEC.firstandroidjava.controller;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class DrabActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);		
		setContentView(R.layout.activity_drab);
		// 2 lines above need to be the first 2 lines in "onCreate"
		// your activity calls "onCreate" not the constructor
	}
}
