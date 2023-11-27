package com.example.dermoncheghianalexander_parcial2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class Adapter(private val profiles: List<Profile>) : RecyclerView.Adapter<Adapter.ProfileViewHolder>(){
    inner class ProfileViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private val profileImageView: ImageView = itemView.findViewById(R.id.profile)
        private val profileNameTextView: TextView = itemView.findViewById(R.id.textViewName)

        fun bind(profiles: Profile){
            profileNameTextView.text = "${profiles.profileName.title} ${profiles.profileName.first} ${profiles.profileName.last}"
            Picasso.get().load(profiles.profilesPictures.large).into(profileImageView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ProfileViewHolder(layoutInflater.inflate(R.layout.list_item, parent, false))
    }

    override fun getItemCount(): Int {
        return profiles.size
    }

    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {
        val profile = profiles[position]
    }
}