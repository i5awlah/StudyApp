package com.example.studyapp

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_row.view.*

class ContentAdaptor(val activity: Activity, private val topics: ArrayList<Content>): RecyclerView.Adapter<ContentAdaptor.ItemViewHolder>() {
    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_row,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val topic = topics[position]
        holder.itemView.apply {
            tvTitle.text = topic.title
            tvDescription.text = topic.description
            cvMain.setOnClickListener{ CustomAlert(activity,topic.title, topic.lesson) }
        }

    }

    override fun getItemCount() = topics.size
}