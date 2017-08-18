package whr.example.com.mvvmbyandroid;

import android.databinding.Bindable;

/**
 * Created by whrwhr446 on 18/08/2017.
 */

public class MVCModel {
    public String bindData = "I am from MVC";

    public String getBindData() {
        return bindData;
    }

    public void setBindData(String bindData) {
        this.bindData = bindData;
    }
}
