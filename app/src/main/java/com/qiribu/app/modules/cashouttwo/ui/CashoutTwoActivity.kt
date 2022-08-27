package com.qiribu.app.modules.cashouttwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.qiribu.app.R
import com.qiribu.app.appcomponents.base.BaseActivity
import com.qiribu.app.databinding.ActivityCashoutTwoBinding
import com.qiribu.app.modules.cashout.ui.CashoutActivity
import com.qiribu.app.modules.cashoutone.ui.CashoutOneActivity
import com.qiribu.app.modules.cashoutsuccess.ui.CashoutSuccessActivity
import com.qiribu.app.modules.cashouttwo.`data`.model.CashoutTwoRowModel
import com.qiribu.app.modules.cashouttwo.`data`.model.SpinnerGroup10777Model
import com.qiribu.app.modules.cashouttwo.`data`.viewmodel.CashoutTwoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CashoutTwoActivity : BaseActivity<ActivityCashoutTwoBinding>(R.layout.activity_cashout_two) {
  private val viewModel: CashoutTwoVM by viewModels<CashoutTwoVM>()

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
    val cashoutTwoAdapter = CashoutTwoAdapter(viewModel.cashoutTwoList.value?:mutableListOf())
    binding.recyclerCashoutTwo.adapter = cashoutTwoAdapter
    cashoutTwoAdapter.setOnItemClickListener(
    object : CashoutTwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : CashoutTwoRowModel) {
        onClickRecyclerCashoutTwo(view, position, item)
      }
    }
    )
    viewModel.cashoutTwoList.observe(this) {
      cashoutTwoAdapter.updateData(it)
    }
    binding.cashoutTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnCompleteCashoutOne.setOnClickListener {
      val destIntent = CashoutSuccessActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.etPriceThree.setOnClickListener {
      val destIntent = CashoutActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerCashoutTwo(
    view: View,
    position: Int,
    item: CashoutTwoRowModel
  ): Unit {
    when(view.id) {
      R.id.linearColumnhome ->  {
        val destIntent = CashoutOneActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "CASHOUT_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CashoutTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
