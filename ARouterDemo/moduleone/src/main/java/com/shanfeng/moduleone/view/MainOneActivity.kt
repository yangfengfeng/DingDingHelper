package com.shanfeng.moduleone.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.google.gson.Gson
import com.shanfeng.libbase.BaseActivity
import com.shanfeng.libbase.RouterPath
import com.shanfeng.moduleone.R
import com.shanfeng.moduleone.model.TestBean

@Route(path = RouterPath.R_PATH_MODULE_ONE_MAIN)
class MainOneActivity : BaseActivity() {
    @Autowired
    @JvmField
     var name=""

    @Autowired
    @JvmField
     var isBool=""
    @JvmField
    @Autowired(name="testbean")
     var testBean: String?=null
    override fun setContentViewId(): Int {
        return R.layout.activity_main_one;
    }

    override fun initUi() {
        Log.i("mainOneActivity", "--actvityOne==name=+$name+isBool=$isBool+==${testBean}")
      var testBeanObj=  Gson().fromJson(testBean,TestBean::class.java)
        Log.i("mainOneActivity", "--actvityOne==id=${testBeanObj.id}=name=${testBeanObj.name}")
    }

    override fun initData() {

    }

    override fun initUiListener() {

    }

    override fun onResume() {
        super.onResume()
        Log.i("mainOneActivity", "--actvityOne1==name=+$name+isBool=$isBool")
    }

    override fun onStart() {
        super.onStart()
        Log.i("mainOneActivity", "--actvityOne2==name=+$name+isBool=$isBool")
    }
    fun clickToTowActivity(view: View) {
//        Log.i("mainOneActivity","--actvityOne==name=+$name+id=$id")
        ARouter.getInstance().build(RouterPath.R_PATH_MODULE_TOW_MAIN).navigation()
    }

    fun clickToAppActivity(view: View) {
        ARouter.getInstance().build(RouterPath.R_PATH_MODULE_APP_MAIN).navigation()
    }

}