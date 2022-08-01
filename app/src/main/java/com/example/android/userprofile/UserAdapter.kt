package com.example.android.userprofile

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class UserAdapter(val userList: ArrayList<Text>,val context: Context) : RecyclerView.Adapter<UserAdapter.ViewHolder>() {

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: UserAdapter.ViewHolder, position: Int) {
        val currentItem  = userList[position]
        holder.MainHeading.text = currentItem.Heading
        holder.SubHeading.text = currentItem.SubHeading
        //holder.icon.setImageDrawable(ContextCompat.getDrawable(context,currentItem.Image))
        holder.icon.setImageResource(currentItem.Image)
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return userList.size
    }

    //the class is hodling the list view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val MainHeading: TextView = itemView.findViewById(R.id.MainHeading)
        val SubHeading: TextView = itemView.findViewById(R.id.SubHeading)
        val icon : ImageView = itemView.findViewById(R.id.icon)

    }

}