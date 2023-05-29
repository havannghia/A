package com.example.articles

import android.view.LayoutInflater
import android.view.OnReceiveContentListener
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(val moveList: ArrayList<Data>,val listener: MyClickListener) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView = itemView.findViewById(R.id.item_image)
        var itemTitle: TextView = itemView.findViewById(R.id.item_title)
        var itemName: TextView = itemView.findViewById(R.id.item_name)
        var itemDay: TextView = itemView.findViewById(R.id.item_day)
        var itemAvatar: ImageView = itemView.findViewById(R.id.item_avatar)

        init {

            itemView.setOnClickListener {
                val position = adapterPosition
                listener.onClick(position)

            }

        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = moveList[position]
        holder.itemTitle.text = data.title
        holder.itemName.text = data.name
        holder.itemDay.text = data.day
        holder.itemImage.setImageResource(data.image)
        holder.itemAvatar.setImageResource(data.avatar)

    }

    override fun getItemCount(): Int {
        return moveList.size
    }
    interface MyClickListener{
        fun onClick(position: Int)

    }

}