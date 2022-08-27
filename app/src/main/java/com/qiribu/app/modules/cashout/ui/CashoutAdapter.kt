package com.qiribu.app.modules.cashout.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.qiribu.app.R
import com.qiribu.app.databinding.RowCashoutBinding
import com.qiribu.app.modules.cashout.`data`.model.CashoutRowModel
import kotlin.Int
import kotlin.collections.List

class CashoutAdapter(
  var list: List<CashoutRowModel>
) : RecyclerView.Adapter<CashoutAdapter.RowCashoutVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowCashoutVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_cashout,parent,false)
    return RowCashoutVH(view)
  }

  override fun onBindViewHolder(holder: RowCashoutVH, position: Int) {
    val cashoutRowModel = CashoutRowModel()
    // TODO uncomment following line after integration with data source
    // val cashoutRowModel = list[position]
    holder.binding.cashoutRowModel = cashoutRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<CashoutRowModel>) {
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
      item: CashoutRowModel
    ) {
    }
  }

  inner class RowCashoutVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowCashoutBinding = RowCashoutBinding.bind(itemView)
  }
}
