package com.example.messageapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.messageapp.R
import com.example.messageapp.data.MessageData

class MessageAdaper(val itemList: ArrayList<MessageData>) :
    RecyclerView.Adapter<MessageAdaper.MessageViewHolder>() {

    inner class MessageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tv_name = itemView.findViewById<TextView>(R.id.tv_name)
        val tv_title = itemView.findViewById<TextView>(R.id.tv_title)
        val tv_content = itemView.findViewById<TextView>(R.id.tv_content)
        val tv_time = itemView.findViewById<TextView>(R.id.tv_time)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_message_content, parent, false)
        return MessageViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.count()
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        holder.tv_name.text = itemList[position].name
        holder.tv_title.text = itemList[position].title
        holder.tv_content.text = itemList[position].content
        holder.tv_time.text = itemList[position].time
    }
}