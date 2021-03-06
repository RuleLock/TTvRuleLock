package com.locker.rulelock.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

/**
 * @description
 * @author fxc
 * @date 17-11-5
 */
abstract class BaseActivity : AppCompatActivity(), IBaseView {
	private val tag: String = "" + BaseActivity::class.java.name

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		Log.i(tag, "onCreate -----  " + this::class.java.name)

	}


}