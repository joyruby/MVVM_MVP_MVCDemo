package whr.example.com.mvvmbyandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MVPActivity extends AppCompatActivity implements IBindingView {

    private EditText editText;
    private TextView textView;
    private MVPPresent mvpPresent ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvc);
        editText = (EditText) findViewById(R.id.editText3);
        textView = (TextView) findViewById(R.id.text);
        mvpPresent = new MVPPresent(this);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                mvpPresent.updateView(editable.toString());
            }
        });
    }

    @Override
    public void updateText(String text) {
        textView.setText(text);
    }

    @Override
    public void updateAll(MVPModel mvpModel) {
        editText.setText(mvpModel.getBindData());
        textView.setText(mvpModel.getBindData());
    }
}
