package com.locker.rulelock.main.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup

/**
 * @description
 * @author fxc
 * @date 17-11-5
 */
class HomeRecyclerAdapter : RecyclerView.Adapter<HomeRecyclerAdapter.HomeViewHolder>() {
	private lateinit var mContext:Context

	override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): HomeViewHolder {
		return HomeViewHolder(View(mContext))
	}

	override fun onBindViewHolder(holder: HomeViewHolder?, position: Int) {
	}

	override fun getItemCount(): Int {
		return 0
	}

	class HomeViewHolder(item: View) : RecyclerView.ViewHolder(item) {
		init {

		}
	}
}