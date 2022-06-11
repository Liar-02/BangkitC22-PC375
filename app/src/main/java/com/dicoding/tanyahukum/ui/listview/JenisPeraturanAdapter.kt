package com.dicoding.tanyahukum.ui.listview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.tanyahukum.data.model.AllData
import com.dicoding.tanyahukum.data.model.ListData
import com.dicoding.tanyahukum.databinding.ItemListviewBinding


class JenisPeraturanAdapter : RecyclerView.Adapter<JenisPeraturanAdapter.JenisPeraturanViewHolder>() {

    private val listData = ArrayList<ListData>()
    private var onItemClickCallback: OnItemClickCallback? = null

    fun setOnItemClickCallback (onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    fun setList(users: ArrayList<ListData>){
        listData.clear()
        listData.addAll(users)
        notifyDataSetChanged()
    }

    inner class JenisPeraturanViewHolder(val binding: ItemListviewBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(data: ListData){
            binding.root.setOnClickListener{
                onItemClickCallback?.onItemClicked(data)
            }
                binding.apply {
                    jenisPeraturan.text = data.Jenis
                    nomorPeraturan.text = data.Nomor_Peraturan
                    tahunPeraturan.text = data.Tahun_peraturan
                    tentangPeraturan.text = data.Tentang
                }
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JenisPeraturanViewHolder {
        val view = ItemListviewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return JenisPeraturanViewHolder((view))
    }

    override fun onBindViewHolder(holder: JenisPeraturanViewHolder, position: Int) {
        holder.bind(listData[position])
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    interface OnItemClickCallback{
        fun onItemClicked(data: ListData)
    }
}