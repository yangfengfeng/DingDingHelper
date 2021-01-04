package com.shanfeng.libbase

import android.os.Bundle
import android.os.PersistableBundle
import androidx.fragment.app.FragmentActivity
import com.alibaba.android.arouter.launcher.ARouter

abstract class BaseFragment : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        ARouter.getInstance().inject(this)
    }
}