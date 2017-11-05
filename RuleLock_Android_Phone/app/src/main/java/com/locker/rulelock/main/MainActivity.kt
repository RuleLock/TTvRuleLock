package com.locker.rulelock.main

import android.os.Bundle
import com.locker.rulelock.R
import com.locker.rulelock.base.BaseActivity

class MainActivity : BaseActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

	}

	external fun stringFromJNI(): String

	companion object {

		init {
			System.loadLibrary("native-lib")
		}
	}
}
