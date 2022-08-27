package com.qiribu.app.modules.cashout.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.qiribu.app.R
import com.qiribu.app.appcomponents.base.BaseActivity
import com.qiribu.app.databinding.ActivityCashoutBinding
import com.qiribu.app.modules.cashout.`data`.model.CashoutRowModel
import com.qiribu.app.modules.cashout.`data`.model.SpinnerGroup10777Model
import com.qiribu.app.modules.cashout.`data`.viewmodel.CashoutVM
import com.qiribu.app.modules.cashoutthree.ui.CashoutThreeActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CashoutActivity : BaseActivity<ActivityCashoutBinding>(R.layout.activity_cashout) {
  private val viewModel: CashoutVM by viewModels<CashoutVM>()

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
    val cashoutAdapter = CashoutAdapter(viewModel.cashoutList.value?:mutableListOf())
    binding.recyclerCashout.adapter = cashoutAdapter
    cashoutAdapter.setOnItemClickListener(
    object : CashoutAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : CashoutRowModel) {
        onClickRecyclerCashout(view, position, item)
      }
    }
    )
    viewModel.cashoutList.observe(this) {
      cashoutAdapter.updateData(it)
    }
    binding.cashoutVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.etPriceThree.setOnClickListener {
      val destIntent = CashoutThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerCashout(
    view: View,
    position: Int,
    item: CashoutRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CASHOUT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CashoutActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
