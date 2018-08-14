package com.deepukv97.firebase

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

class ViewHolder(internal var mView: View) : RecyclerView.ViewHolder(mView) {

    fun setDetails(etx: Context, title: String) {

        val mTitleTv = mView.findViewById<TextView>(R.id.rTitleTV)
        mTitleTv.text = title
    }
}
