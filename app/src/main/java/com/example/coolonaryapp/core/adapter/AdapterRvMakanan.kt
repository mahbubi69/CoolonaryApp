package com.example.coolonaryapp.core.adapter

import android.view.LayoutInflater

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.coolonaryapp.core.model.Makanan
import com.example.coolonaryapp.databinding.ItemRvHomeBinding

class AdapterRvMakanan(
    private val listMakanan: List<Makanan>,
) : RecyclerView.Adapter<AdapterRvMakanan.MakananHolder>() {

    inner class MakananHolder(val binding: ItemRvHomeBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(makananResponse: Makanan) {
            Glide.with(binding.root).load(makananResponse.image)
//                    .placeholder(R.drawable.)
                .into(binding.image)
            binding.tvName.text = makananResponse.exp
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MakananHolder {
        val binding = ItemRvHomeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MakananHolder(binding)
    }

    override fun onBindViewHolder(holder: MakananHolder, position: Int) {
        holder.bind(listMakanan[position])
    }

    override fun getItemCount(): Int {
        return listMakanan.size
    }

}


