package com.shanfeng.arouterdemo.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.app.ActivityOptionsCompat
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.google.gson.Gson
import com.shanfeng.arouterdemo.R
import com.shanfeng.arouterdemo.model.TestBean
import com.shanfeng.libbase.BaseActivity
import com.shanfeng.libbase.RouterPath
import kotlinx.android.synthetic.main.activity_main.*

@Route(path = RouterPath.R_PATH_MODULE_APP_MAIN)
class MainActivity : BaseActivity() {
    override fun setContentViewId(): Int {
        return R.layout.activity_main;
    }

    override fun initUi() {

    }

    override fun initData() {

    }

    override fun initUiListener() {

    }

    fun clickToModult(view: View) {
        Log.i("mainactivity", "--onclick")
//            ARouter.getInstance().build(RouterPath.R_PATH_MODULE_ONE_MAIN).navigation();
        val compat = ActivityOptionsCompat.makeClipRevealAnimation(
            floatingActionButton,
            floatingActionButton.width / 2,
            floatingActionButton.height / 2,
            0,
            0
        )
        var obj=TestBean("I'm id","I'm name")
        ARouter.getInstance().build(RouterPath.R_PATH_MODULE_ONE_MAIN)
//            .withBoolean("isBool", true)
//            .withString("name", "我司参数")
                .withString("testbean", Gson().toJson(obj))
//            .withOptionsCompat(compat)
            .navigation();
//        startNextActivity(RouterPath.R_PATH_MODULE_ONE_MAIN)


    }


}