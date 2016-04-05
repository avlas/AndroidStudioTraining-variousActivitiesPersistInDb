package com.formation.helloworldtest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class FormActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_form);

		ImageView logo = (ImageView) findViewById(R.id.imageView_logo);
		logo.setImageResource(R.drawable.nature);

		Button backButton = (Button) findViewById(R.id.button_back);
		backButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent mainActivity = new Intent(FormActivity.this, MainActivity.class);
				startActivity(mainActivity);
			}
		});
	}

	protected void onPause() {
		super.onPause();
		setContentView(R.layout.activity_form);
	}

	public void onRadioButtonClicked(View view) {
		RadioGroup sexRadioGroup = (RadioGroup) findViewById(R.id.radioGroup_sex);
		int selectedIdRadioBtn = sexRadioGroup.getCheckedRadioButtonId();
		RadioButton sexRadioBtn = (RadioButton) findViewById(selectedIdRadioBtn);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.form, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}


}
