package com.kevin.building.demo.switchnetworkstate;

import android.os.Message;
import android.view.View;

import com.kevin.baselibrary.net.NetUtils;
import com.kevin.building.R;
import com.kevin.building.base.BaseActivity;

/**
 * Created by bailiangjin on 16/3/22.
 */
public class SwitchNetWorkStateActivity extends BaseActivity{
    @Override
    protected int getLayoutResId() {
        return R.layout.activity_switch_network_state;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void onViewClick(View v) {

    }

    @Override
    protected void handleMsg(Message msg) {

    }


    public void onClick_Switch_WiFi_open(View v){
        shortToast("打开 WiFi");
        NetUtils.toggleWiFi(this, true);
    }

    public void onClick_Switch_WiFi_close(View v){
        shortToast("关闭 WiFi");
        NetUtils.toggleWiFi(this, false);
    }

    public void onClick_Switch_mobile_open(View v){
        shortToast("打开 移动网络");
        NetUtils.toggleMobileData(this, true);
    }

    public void onClick_Switch_mobile_close(View v){
        shortToast("关闭 移动网络");
        NetUtils.toggleMobileData(this, false);
    }


}
