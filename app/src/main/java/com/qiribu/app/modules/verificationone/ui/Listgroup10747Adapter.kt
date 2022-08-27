package com.qiribu.app.modules.verificationone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.qiribu.app.R
import com.qiribu.app.databinding.RowListgroup10747Binding
import com.qiribu.app.modules.verificationone.`data`.model.Listgroup10747RowModel
import kotlin.Int
import kotlin.collections.List

class Listgroup10747Adapter(
  var list: List<Listgroup10747RowModel>
) : RecyclerView.Adapter<Listgroup10747Adapter.RowListgroup10747VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListgroup10747VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listgroup10747,parent,false)
    return RowListgroup10747VH(view)
  }

  override fun onBindViewHolder(holder: RowListgroup10747VH, position: Int) {
    val listgroup10747RowModel = Listgroup10747RowModel()
    // TODO uncomment following line after integration with data source
    // val listgroup10747RowModel = list[position]
    holder.binding.listgroup10747RowModel = listgroup10747RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listgroup10747RowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: Listgroup10747RowModel
    ) {
    }
  }

  inner class RowListgroup10747VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListgroup10747Binding = RowListgroup10747Binding.bind(itemView)
  }
}
