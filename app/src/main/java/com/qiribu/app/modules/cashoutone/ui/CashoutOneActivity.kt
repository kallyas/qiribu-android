package com.qiribu.app.modules.cashoutone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.qiribu.app.R
import com.qiribu.app.appcomponents.base.BaseActivity
import com.qiribu.app.databinding.ActivityCashoutOneBinding
import com.qiribu.app.modules.cashout.ui.CashoutActivity
import com.qiribu.app.modules.cashoutone.`data`.model.SpinnerGroup10777Model
import com.qiribu.app.modules.cashoutone.`data`.viewmodel.CashoutOneVM
import com.qiribu.app.modules.cashoutsuccess.ui.CashoutSuccessActivity
import com.qiribu.app.modules.cashouttwo.ui.CashoutTwoActivity
import kotlin.String
import kotlin.Unit

class CashoutOneActivity : BaseActivity<ActivityCashoutOneBinding>(R.layout.activity_cashout_one) {
  private val viewModel: CashoutOneVM by viewModels<CashoutOneVM>()

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
    binding.cashoutOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStackqiribucard.setOnClickListener {
      val destIntent = CashoutTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnCompleteCashoutOne.setOnClickListener {
      val destIntent = CashoutSuccessActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.etPriceThree.setOnClickListener {
      val destIntent = CashoutActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.viewGroup10778.setOnClickListener {
      val destIntent = CashoutTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CASHOUT_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CashoutOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
