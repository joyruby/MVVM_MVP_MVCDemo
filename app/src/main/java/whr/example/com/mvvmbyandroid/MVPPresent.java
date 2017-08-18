package whr.example.com.mvvmbyandroid;

/**
 * Created by whrwhr446 on 18/08/2017.
 */

public class MVPPresent {
    private IBindingView bindView;
    private MVPModel mvpModel = new MVPModel();
    public MVPPresent(IBindingView view){
        bindView = view;
        initView();
    }

    private void initView() {
        bindView.updateAll(mvpModel);
    }

    public void updateView(String text){
        bindView.updateText(text);
    }
}
