package whr.example.com.mvvmbyandroid;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by whrwhr446 on 18/08/2017.
 */

public class ViewModel extends BaseObservable {
    public String bindData = "I am from MVVM";
    public String editText = "I am from MVVM";

    public String getEditText() {
        return editText;
    }

    public void setEditText(String editText) {
        this.editText = editText;
    }

    @Bindable
    public String getBindData() {
        return bindData;
    }

    public void setBindData(String bindData) {
        this.bindData = bindData;
        notifyPropertyChanged(BR.bindData);
    }
}
