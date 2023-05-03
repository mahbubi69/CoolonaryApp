package com.example.coolonaryapp.core.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.coolonaryapp.core.model.AllMakanan
import com.example.coolonaryapp.databinding.ItemRvAllListHomeBinding


class AdapterAllMakanan(
    private val listAllMakanan: List<AllMakanan>,
) : RecyclerView.Adapter<AdapterAllMakanan.AllMakananHolder>() {

    inner class AllMakananHolder(val binding: ItemRvAllListHomeBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(allMakanan: AllMakanan) {
            Glide.with(binding.root).load(allMakanan.image)
//                    .placeholder(R.drawable.)
                .into(binding.imageAllHome)
            binding.tvNameAllHome.text = allMakanan.name
            binding.tvDesciptionAllHome.text = allMakanan.description
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AllMakananHolder {
        val binding =
            ItemRvAllListHomeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AllMakananHolder(binding)
    }

    override fun onBindViewHolder(holder: AllMakananHolder, position: Int) {
        holder.bind(allMakanan = listAllMakanan[position])
    }

    override fun getItemCount(): Int {
        return listAllMakanan.size
    }


}