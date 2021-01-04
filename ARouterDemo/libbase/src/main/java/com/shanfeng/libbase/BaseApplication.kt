package com.shanfeng.libbase

import android.app.Activity
import android.app.Application
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import com.alibaba.android.arouter.launcher.ARouter

open class BaseApplication : Application() {
    companion object {
        lateinit var instance: BaseApplication;
    }

    override fun onCreate() {
        super.onCreate()
        instance = this;
        init();
    }

    override fun onTerminate() {
        super.onTerminate()
        ARouter.getInstance().destroy()
    }

    private fun init() {
        if (AppConfig.isDebug) {
            ARouter.openDebug()
            ARouter.openLog()
        }
        ARouter.init(this);
//        registerActivityLifecycleCallbacks(object:Application.ActivityLifecycleCallbacks{
//            override fun onActivityPaused(activity: Activity) {
//
//            }
//
//            override fun onActivityStarted(activity: Activity) {
//
//            }
//
//            override fun onActivityDestroyed(activity: Activity) {
//
//            }
//
//            override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {
//
//            }
//
//            override fun onActivityStopped(activity: Activity) {
//
//            }
//
//            override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
//                handleActivity(activity)
//            }
//
//            override fun onActivityResumed(activity: Activity) {
//
//            }
//
//        })
//    }
//     fun handleActivity(activity: Activity){
//         if(activity is BaseActivity){
//                ARouter.getInstance().inject(activity)
//         }
//         if (activity is FragmentActivity) {
//             activity.supportFragmentManager.registerFragmentLifecycleCallbacks(
//                 object : FragmentManager.FragmentLifecycleCallbacks() {
//                     override fun onFragmentCreated(
//                         fm: FragmentManager,
//                         f: Fragment,
//                         savedInstanceState: Bundle?
//                     ) {
//                         if (f is BaseFragment) {
//                             ///注入ARouter参数
//                             ARouter.getInstance().inject(f)
//                         }
//                     }
//                 }, true
//             )
//         }
//
    }
}