package com.bailiangjin.demo.demo;

import android.os.Bundle;
import android.widget.ImageView;

import com.bailiangjin.demo.R;
import com.bailiangjin.demo.base.BaseActivity;
import com.bailiangjin.utilslibrary.utils.ui.ImageLoadUtils;

/**
 * @author bailiangjin
 */
public class ImageLoadActivity extends BaseActivity {

    ImageView iv_org;
    ImageView iv_round;
    ImageView iv_rounded_rectangle;

    private static final String picUrl = "https://raw.githubusercontent.com/bailiangjin/bailiangjin.github.io/master/dev/download/picture/HeadPortrait.jpeg";


    @Override
    protected int getLayoutResId() {
        return R.layout.activity_image_load;
    }

    @Override
    protected void beforeViewBind(Bundle savedInstanceState) {

    }

    @Override
    protected void initView(Bundle savedInstanceState) {

        titleBarBuilder.setTitleText("图片加载示例");
        iv_org = (ImageView) findViewById(R.id.iv_org);
        iv_round = (ImageView) findViewById(R.id.iv_round);
        iv_rounded_rectangle = (ImageView) findViewById(R.id.iv_rounded_rectangle);

        //普通加载效果
        ImageLoadUtils.INSTANCE.loadImageView(iv_org, picUrl);
        //圆形图片加载效果
        ImageLoadUtils.INSTANCE.loadCircleImageView(iv_round, picUrl);
        //圆角加载效果
        ImageLoadUtils.INSTANCE.loadRoundedImageView(iv_rounded_rectangle, picUrl);

    }

    @Override
    protected void initData(Bundle savedInstanceState) {

    }
}
