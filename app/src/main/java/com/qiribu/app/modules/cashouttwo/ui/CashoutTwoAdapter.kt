package com.qiribu.app.modules.cashouttwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.qiribu.app.R
import com.qiribu.app.databinding.RowCashoutTwoBinding
import com.qiribu.app.modules.cashouttwo.`data`.model.CashoutTwoRowModel
import kotlin.Int
import kotlin.collections.List

class CashoutTwoAdapter(
  var list: List<CashoutTwoRowModel>
) : RecyclerView.Adapter<CashoutTwoAdapter.RowCashoutTwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowCashoutTwoVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_cashout_two,parent,false)
    return RowCashoutTwoVH(view)
  }

  override fun onBindViewHolder(holder: RowCashoutTwoVH, position: Int) {
    val cashoutTwoRowModel = CashoutTwoRowModel()
    // TODO uncomment following line after integration with data source
    // val cashoutTwoRowModel = list[position]
    holder.binding.cashoutTwoRowModel = cashoutTwoRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<CashoutTwoRowModel>) {
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
      item: CashoutTwoRowModel
    ) {
    }
  }

  inner class RowCashoutTwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowCashoutTwoBinding = RowCashoutTwoBinding.bind(itemView)
    init {
      binding.linearColumnhome.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, CashoutTwoRowModel())
      }
    }
  }
}
