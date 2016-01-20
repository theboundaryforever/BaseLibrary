package com.kevin.building.ui.demo.dynamic.bean.viewbean.base;

import android.view.Gravity;

import com.kevin.building.ui.demo.dynamic.bean.ExtraParam;

/**
 * Author:  liangjin.bai
 * Email: bailiangjin@gmail.com
 * Create Time: 2016/1/6 15:54
 */
public abstract class BaseItem {

    /**
     * 类型
     */
    private int viewType;
    /**
     * ID
     */
    private String id;

    /**
     * 文字 Button的文字/Text的文字内容/输入框前的导引文字/CheckBox 对应的说明文字/RadioButton对应的说明文字
     */
    private String indexText;

    /**
     * index 文字大小 dp
     */
    private int indexTextSize;

    /**
     * index 文字颜色
     */
    private int indexTextColor;

    /**
     * 是否必须
     */
    private boolean isMust;


    /**
     * 对齐方式 居中17=Gravity.CENTER 靠左3=Gravity.LEFT 靠右5=Gravity.RIGHT
     */
    private int gravity;


    /**
     * 扩展字段
     */
    private ExtraParam paramJson;

    public BaseItem() {
        setDefaultViewType();
        setDefaultData();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getViewType() {
        return viewType;
    }

    public void setViewType(int viewType) {
        this.viewType = viewType;
    }

    public String getIndexText() {
        return indexText;
    }

    public void setIndexText(String indexText) {
        this.indexText = indexText;
    }

    public boolean isMust() {
        return isMust;
    }

    public void setIsMust(boolean isMust) {
        this.isMust = isMust;
    }


    public int getGravity() {
        return gravity;
    }

    public void setGravity(int gravity) {
        this.gravity = gravity;
    }

    public int getIndexTextSize() {
        return indexTextSize;
    }

    public void setIndexTextSize(int indexTextSize) {
        this.indexTextSize = indexTextSize;
    }

    public int getIndexTextColor() {
        return indexTextColor;
    }

    public void setIndexTextColor(int indexTextColor) {
        this.indexTextColor = indexTextColor;
    }



    public ExtraParam getParamJson() {
        return paramJson;
    }

    public void setParamJson(ExtraParam paramJson) {
        this.paramJson = paramJson;
    }


    public void setDefaultData() {
        setId(String.valueOf(System.currentTimeMillis()));
        setGravity(Gravity.CENTER);
        setIndexText("默认文本");
        setIndexTextSize(14);
        setIsMust(true);
        setIndexTextColor(888);
        ExtraParam paramJson = new ExtraParam();
        paramJson.setExtra1("扩展参数1");
        setParamJson(paramJson);

    }

    abstract public void setDefaultViewType();
}
