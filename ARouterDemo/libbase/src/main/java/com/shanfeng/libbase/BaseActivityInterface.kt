package com.shanfeng.libbase

import androidx.annotation.LayoutRes

interface BaseActivityInterface {
    @LayoutRes
    fun setContentViewId(): Int;
    fun initUi();
    fun initData()
    fun initUiListener()
}