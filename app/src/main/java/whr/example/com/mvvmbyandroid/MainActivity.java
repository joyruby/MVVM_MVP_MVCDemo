package whr.example.com.mvvmbyandroid;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

import whr.example.com.mvvmbyandroid.databinding.ActivityMainBinding;
/*
 mvvm
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        final ViewModel viewModel = new ViewModel();
        activityMainBinding.setViewModel(viewModel);
        activityMainBinding.mvc.setOnClickListener(this);
        activityMainBinding.mvp.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent=new Intent(MainActivity.this, MVCActivity.class)  ;
        switch (view.getId()) {
            case R.id.mvc:
                intent = new Intent(MainActivity.this, MVCActivity.class);
                break;
            case R.id.mvp:
                intent = new Intent(MainActivity.this,MVPActivity.class);
                break;
        }
        intent.putExtra("asdf","adsf");
        startActivity(intent);
    }
}
