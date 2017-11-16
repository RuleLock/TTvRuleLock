package com.locker.rulelock.main

import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import com.locker.rulelock.R
import com.locker.rulelock.base.BaseActivity
import com.locker.rulelock.main.adapter.GridSpacingItemDecoration
import com.locker.rulelock.main.adapter.HomeRecyclerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

	private lateinit var mAdapter:HomeRecyclerAdapter
	private val mData = ArrayList<String>()

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		initData()
		initRecyclerView()
	}

	private fun initData() {
		for (i in 0 until 10) {
			mData.add("test")
		}
	}

	private fun initRecyclerView() {
		val layoutManager = GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false)
		mAdapter = HomeRecyclerAdapter(this, mData)
		recycler_view.layoutManager = layoutManager
		recycler_view.addItemDecoration(GridSpacingItemDecoration(2, 30, true))
		recycler_view.adapter = mAdapter
	}

}
