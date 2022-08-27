package com.qiribu.app.modules.transactionhistory.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.qiribu.app.R
import com.qiribu.app.databinding.RowListellipsesixBinding
import com.qiribu.app.modules.transactionhistory.`data`.model.ListellipsesixRowModel
import kotlin.Int
import kotlin.collections.List

class ListellipsesixAdapter(
  var list: List<ListellipsesixRowModel>
) : RecyclerView.Adapter<ListellipsesixAdapter.RowListellipsesixVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListellipsesixVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listellipsesix,parent,false)
    return RowListellipsesixVH(view)
  }

  override fun onBindViewHolder(holder: RowListellipsesixVH, position: Int) {
    val listellipsesixRowModel = ListellipsesixRowModel()
    // TODO uncomment following line after integration with data source
    // val listellipsesixRowModel = list[position]
    holder.binding.listellipsesixRowModel = listellipsesixRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListellipsesixRowModel>) {
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
      item: ListellipsesixRowModel
    ) {
    }
  }

  inner class RowListellipsesixVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListellipsesixBinding = RowListellipsesixBinding.bind(itemView)
  }
}
