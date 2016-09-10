package cn.manage.baseInterface;


import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * Created by Administrator on 2016/9/6.
 */
public class BaseAction extends ActionSupport implements ModelDriven<Object> {

    @Override
    public Object getModel() {
        return new Object();
    }
}
