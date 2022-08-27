package com.qiribu.app.modules.transactionhistory.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.qiribu.app.R
import com.qiribu.app.appcomponents.base.BaseActivity
import com.qiribu.app.databinding.ActivityTransactionHistoryBinding
import com.qiribu.app.modules.transactionhistory.`data`.model.ListellipsesixRowModel
import com.qiribu.app.modules.transactionhistory.`data`.model.SpinnerGroup10777Model
import com.qiribu.app.modules.transactionhistory.`data`.viewmodel.TransactionHistoryVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class TransactionHistoryActivity :
    BaseActivity<ActivityTransactionHistoryBinding>(R.layout.activity_transaction_history) {
  private val viewModel: TransactionHistoryVM by viewModels<TransactionHistoryVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerGroup10777List.value = mutableListOf(
    SpinnerGroup10777Model("Item1"),
    SpinnerGroup10777Model("Item2"),
    SpinnerGroup10777Model("Item3"),
    SpinnerGroup10777Model("Item4"),
    SpinnerGroup10777Model("Item5")
    )
    val spinnerGroup10777Adapter =
    SpinnerGroup10777Adapter(this,R.layout.spinner_item,viewModel.spinnerGroup10777List.value?:
    mutableListOf())
    binding.spinnerGroup10777.adapter = spinnerGroup10777Adapter
    val listellipsesixAdapter =
    ListellipsesixAdapter(viewModel.listellipsesixList.value?:mutableListOf())
    binding.recyclerListellipsesix.adapter = listellipsesixAdapter
    listellipsesixAdapter.setOnItemClickListener(
    object : ListellipsesixAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListellipsesixRowModel) {
        onClickRecyclerListellipsesix(view, position, item)
      }
    }
    )
    viewModel.listellipsesixList.observe(this) {
      listellipsesixAdapter.updateData(it)
    }
    binding.transactionHistoryVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListellipsesix(
    view: View,
    position: Int,
    item: ListellipsesixRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "TRANSACTION_HISTORY_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TransactionHistoryActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
