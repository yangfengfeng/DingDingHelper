package com.shanfeng.moduletow.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.shanfeng.libbase.BaseActivity
import com.shanfeng.libbase.RouterPath
import com.shanfeng.moduletow.R

@Route(path = RouterPath.R_PATH_MODULE_TOW_MAIN)
class MainTowActivity : BaseActivity() {


    fun clickeToMain(view: View) {
        ARouter.getInstance().build(RouterPath.R_PATH_MODULE_ONE_MAIN).navigation();
    }

    override fun setContentViewId(): Int {
        return R.layout.activity_main_tow;
    }

    override fun initUi() {

    }

    override fun initData() {

    }

    override fun initUiListener() {

    }
}