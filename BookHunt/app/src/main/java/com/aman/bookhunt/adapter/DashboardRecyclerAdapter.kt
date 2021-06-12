package com.aman.bookhunt.adapter

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aman.bookhunt.R
import kotlinx.android.synthetic.main.fragment_dashboard.view.*
import kotlinx.android.synthetic.main.recycler_dashboard_single_row.view.*

class DashboardRecyclerAdapter:RecyclerView.Adapter<DashboardRecyclerAdapter.DashboardViewHolder>(){
    class DashboardViewHolder(view: View):RecyclerView.ViewHolder(view){
        val textView: TextView = view.findViewById(R.id.txtRecyclerRowItem)
    }

    override fun getItemCount(): Int {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DashboardViewHolder {

    }

    override fun onBindViewHolder(holder: DashboardViewHolder, position: Int) {
       
    }
}