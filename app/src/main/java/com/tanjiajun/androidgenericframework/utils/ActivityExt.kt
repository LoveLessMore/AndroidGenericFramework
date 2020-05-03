package com.tanjiajun.androidgenericframework.utils

import android.app.Activity
import android.content.Intent
import com.tanjiajun.androidgenericframework.ui.BaseActivity

/**
 * Created by TanJiaJun on 2019-08-12.
 */
inline fun <reified T : BaseActivity<*, *>> Activity.startActivity() =
        startActivity(Intent(this, T::class.java))