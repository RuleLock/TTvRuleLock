package com.locker.rulelock.main.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.locker.rulelock.R
import kotlinx.android.synthetic.main.item_home.view.*

/**
 * @description
 * @author fxc
 * @date 17-11-5
 */
class HomeRecyclerAdapter(private val ctx:Context, private val list:ArrayList<String>) : RecyclerView.Adapter<HomeRecyclerAdapter.HomeViewHolder>() {

	override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): HomeViewHolder {
		return HomeViewHolder(LayoutInflater.from(ctx).inflate(R.layout.item_home, parent, false))
	}

	override fun onBindViewHolder(holder: HomeViewHolder?, position: Int) {
		holder?.text?.text = list[position]
	}

	override fun getItemCount(): Int {
		return list.size
	}

	class HomeViewHolder(item: View) : RecyclerView.ViewHolder(item) {
		val text: TextView = item.text
	}
}