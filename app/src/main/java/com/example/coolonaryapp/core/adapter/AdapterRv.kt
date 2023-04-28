//package com.example.coolonaryapp.core.adapter
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import com.example.coolonaryapp.R
//import com.example.coolonaryapp.core.model.Makanan
//
//class HeroAdapter(private val heroes: List<Makanan>) : RecyclerView.Adapter<HeroHolder>() {
//    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): HeroHolder {
//        return HeroHolder(LayoutInflater.from(viewGroup.context).inflate(R.layout.item_rv_home, viewGroup, false))
//    }
//
//    override fun getItemCount(): Int = heroes.size
//
//    override fun onBindViewHolder(holder: HeroHolder, position: Int) {
//        holder.bindHero(heroes[position])
//    }
//}
//
//class HeroHolder(view: View) : RecyclerView.ViewHolder(view) {
//    private val tvExp = view.tv
//
//    fun bindHero(makanan: Makanan) {
//        tvExp.text = makanan.exp
//    }
//}
