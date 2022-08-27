package com.qiribu.app.modules.cashoutthree.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.qiribu.app.R
import com.qiribu.app.databinding.RowCashoutThreeBinding
import com.qiribu.app.modules.cashoutthree.`data`.model.CashoutThreeRowModel
import kotlin.Int
import kotlin.collections.List

class CashoutThreeAdapter(
  var list: List<CashoutThreeRowModel>
) : RecyclerView.Adapter<CashoutThreeAdapter.RowCashoutThreeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowCashoutThreeVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_cashout_three,parent,false)
    return RowCashoutThreeVH(view)
  }

  override fun onBindViewHolder(holder: RowCashoutThreeVH, position: Int) {
    val cashoutThreeRowModel = CashoutThreeRowModel()
    // TODO uncomment following line after integration with data source
    // val cashoutThreeRowModel = list[position]
    holder.binding.cashoutThreeRowModel = cashoutThreeRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<CashoutThreeRowModel>) {
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
      item: CashoutThreeRowModel
    ) {
    }
  }

  inner class RowCashoutThreeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowCashoutThreeBinding = RowCashoutThreeBinding.bind(itemView)
  }
}
