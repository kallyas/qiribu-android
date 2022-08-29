package com.qiribu.app.modules.cashout.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.qiribu.app.R
import com.qiribu.app.databinding.RowRowvectorBinding
import com.qiribu.app.modules.cashout.`data`.model.VectorRowModel
import kotlin.Int
import kotlin.collections.List

class RowvectorAdapter(
  var list: List<VectorRowModel>
) : RecyclerView.Adapter<RowvectorAdapter.RowRowvectorVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowRowvectorVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_rowvector,parent,false)
    return RowRowvectorVH(view)
  }

  override fun onBindViewHolder(holder: RowRowvectorVH, position: Int) {
    val vectorRowModel = VectorRowModel()
    // TODO uncomment following line after integration with data source
    // val vectorRowModel = list[position]
    holder.binding.vectorRowModel = vectorRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<VectorRowModel>) {
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
      item: VectorRowModel
    ) {
    }
  }

  inner class RowRowvectorVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowRowvectorBinding = RowRowvectorBinding.bind(itemView)
  }
}
