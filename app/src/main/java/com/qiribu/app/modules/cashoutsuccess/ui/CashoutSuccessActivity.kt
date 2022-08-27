package com.qiribu.app.modules.cashoutsuccess.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.qiribu.app.R
import com.qiribu.app.appcomponents.base.BaseActivity
import com.qiribu.app.databinding.ActivityCashoutSuccessBinding
import com.qiribu.app.modules.cashoutsuccess.`data`.viewmodel.CashoutSuccessVM
import com.qiribu.app.modules.cashouttwo.ui.CashoutTwoActivity
import kotlin.String
import kotlin.Unit

class CashoutSuccessActivity :
    BaseActivity<ActivityCashoutSuccessBinding>(R.layout.activity_cashout_success) {
  private val viewModel: CashoutSuccessVM by viewModels<CashoutSuccessVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.cashoutSuccessVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      val destIntent = CashoutTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CASHOUT_SUCCESS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CashoutSuccessActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
