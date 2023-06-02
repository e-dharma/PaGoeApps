package com.example.pagoeapps.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.pagoeapps.DetailActivity
import com.example.pagoeapps.R
import com.example.pagoeapps.tarian.TarianNusantara

class Adapter (private val listTarian: ArrayList<TarianNusantara>) : RecyclerView.Adapter<Adapter.CardViewViewHolder>() {
    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.imgItem_Photo)
        var tvName: TextView = itemView.findViewById(R.id.tvItem_Name)
        var tvAsal: TextView = itemView.findViewById(R.id.tvItem_Asal)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_card_tarian, parent, false)
        return CardViewViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listTarian.size
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val tari = listTarian[position]

        Glide.with(holder.itemView.context)
            .load(tari.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)

        holder.tvName.text = tari.name
        holder.tvAsal.text = tari.asal

        holder.itemView.setOnClickListener {
            Toast.makeText(
                holder.itemView.context,
                "Kamu memilih" + listTarian[holder.adapterPosition].name,
                Toast.LENGTH_SHORT
            ).show()
        }

        val moveContext = holder.itemView.context
        holder.itemView.setOnClickListener{
            val moveDetailActivity = Intent(moveContext, DetailActivity::class.java)
            moveDetailActivity.putExtra(DetailActivity.EXTRA_NAME, tari.name)
            moveDetailActivity.putExtra(DetailActivity.EXTRA_ASAL, tari.asal)
            moveDetailActivity.putExtra(DetailActivity.EXTRA_PHOTO, tari.photo)
            moveDetailActivity.putExtra(DetailActivity.EXTRA_DETAIL, tari.detail)
            moveContext.startActivity(moveDetailActivity)

        }
    }
}