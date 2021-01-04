package com.shanfeng.libbase

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.launcher.ARouter

abstract class BaseActivity : AppCompatActivity(), BaseActivityInterface {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ARouter.getInstance().inject(this)
        setContentView(setContentViewId())
        initUi()
        initData()
        initUiListener()
    }

    /**
     * 不带参数直接跳转
     */
    fun  startNextActivity(path :String){
        ARouter.getInstance().build(RouterPath.R_PATH_MODULE_ONE_MAIN)
            .navigation();
    }


}