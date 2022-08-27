package com.qiribu.app.modules.homedashrtdropdown.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.qiribu.app.R
import com.qiribu.app.databinding.RowListellipsesixTwoBinding
import com.qiribu.app.modules.homedashrtdropdown.`data`.model.ListellipsesixTwoRowModel
import kotlin.Int
import kotlin.collections.List

class ListellipsesixTwoAdapter(
  var list: List<ListellipsesixTwoRowModel>
) : RecyclerView.Adapter<ListellipsesixTwoAdapter.RowListellipsesixTwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListellipsesixTwoVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listellipsesix_two,parent,false)
    return RowListellipsesixTwoVH(view)
  }

  override fun onBindViewHolder(holder: RowListellipsesixTwoVH, position: Int) {
    val listellipsesixTwoRowModel = ListellipsesixTwoRowModel()
    // TODO uncomment following line after integration with data source
    // val listellipsesixTwoRowModel = list[position]
    holder.binding.listellipsesixTwoRowModel = listellipsesixTwoRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListellipsesixTwoRowModel>) {
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
      item: ListellipsesixTwoRowModel
    ) {
    }
  }

  inner class RowListellipsesixTwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListellipsesixTwoBinding = RowListellipsesixTwoBinding.bind(itemView)
  }
}
