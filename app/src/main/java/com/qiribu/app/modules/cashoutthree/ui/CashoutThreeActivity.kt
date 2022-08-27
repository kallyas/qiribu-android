package com.qiribu.app.modules.cashoutthree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.qiribu.app.R
import com.qiribu.app.appcomponents.base.BaseActivity
import com.qiribu.app.databinding.ActivityCashoutThreeBinding
import com.qiribu.app.modules.cashoutthree.`data`.model.CashoutThreeRowModel
import com.qiribu.app.modules.cashoutthree.`data`.model.SpinnerGroup10777Model
import com.qiribu.app.modules.cashoutthree.`data`.viewmodel.CashoutThreeVM
import com.qiribu.app.modules.cashouttwo.ui.CashoutTwoActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CashoutThreeActivity :
    BaseActivity<ActivityCashoutThreeBinding>(R.layout.activity_cashout_three) {
  private val viewModel: CashoutThreeVM by viewModels<CashoutThreeVM>()

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
    val cashoutThreeAdapter =
    CashoutThreeAdapter(viewModel.cashoutThreeList.value?:mutableListOf())
    binding.recyclerCashoutThree.adapter = cashoutThreeAdapter
    cashoutThreeAdapter.setOnItemClickListener(
    object : CashoutThreeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : CashoutThreeRowModel) {
        onClickRecyclerCashoutThree(view, position, item)
      }
    }
    )
    viewModel.cashoutThreeList.observe(this) {
      cashoutThreeAdapter.updateData(it)
    }
    binding.cashoutThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.etPriceThree.setOnClickListener {
      val destIntent = CashoutTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerCashoutThree(
    view: View,
    position: Int,
    item: CashoutThreeRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CASHOUT_THREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CashoutThreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
