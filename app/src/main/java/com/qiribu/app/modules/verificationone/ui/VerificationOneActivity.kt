package com.qiribu.app.modules.verificationone.ui

import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.view.View
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import com.google.android.gms.auth.api.phone.SmsRetriever
import com.qiribu.app.R
import com.qiribu.app.appcomponents.base.BaseActivity
import com.qiribu.app.databinding.ActivityVerificationOneBinding
import com.qiribu.app.modules.accountverified.ui.AccountVerifiedActivity
import com.qiribu.app.modules.verificationone.`data`.model.Listgroup10747RowModel
import com.qiribu.app.modules.verificationone.`data`.viewmodel.VerificationOneVM
import java.util.regex.Matcher
import java.util.regex.Pattern
import kotlin.Int
import kotlin.String
import kotlin.Unit

class VerificationOneActivity :
    BaseActivity<ActivityVerificationOneBinding>(R.layout.activity_verification_one) {
  private var otpViewOtpviewBroadcastReceiver: OtpViewOtpviewBroadcastReceiver? = null


  val getActivityResult: ActivityResultLauncher<Intent> =
      registerForActivityResult(ActivityResultContracts.StartActivityForResult(),
  ActivityResultCallback {
    val message = it.data?.getStringExtra(SmsRetriever.EXTRA_SMS_MESSAGE)
    getOtpFromMessage(message!!)
    })


    private val viewModel: VerificationOneVM by viewModels<VerificationOneVM>()

    override fun onInitialized(): Unit {
      viewModel.navArguments = intent.extras?.getBundle("bundle")
      startSmartUserConsent()
      val listgroup10747Adapter =
      Listgroup10747Adapter(viewModel.listgroup10747List.value?:mutableListOf())
      binding.recyclerListgroup10747.adapter = listgroup10747Adapter
      listgroup10747Adapter.setOnItemClickListener(
      object : Listgroup10747Adapter.OnItemClickListener {
        override fun onItemClick(view:View, position:Int, item : Listgroup10747RowModel) {
          onClickRecyclerListgroup10747(view, position, item)
        }
      }
      )
      viewModel.listgroup10747List.observe(this) {
        listgroup10747Adapter.updateData(it)
      }
      binding.verificationOneVM = viewModel
    }

    override fun onStop(): Unit {
      super.onStop()
      unregisterReceiver(otpViewOtpviewBroadcastReceiver)
    }

    override fun onStart(): Unit {
      super.onStart()
      registerBroadcastReceiver()
    }

    override fun setUpClicks(): Unit {
      binding.frameVerificationOn.setOnClickListener {
        val destIntent = AccountVerifiedActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    private fun startSmartUserConsent(): Unit {
      val client = SmsRetriever.getClient(this)
      client.startSmsUserConsent(null)
    }

    private fun registerBroadcastReceiver(): Unit {
      otpViewOtpviewBroadcastReceiver = OtpViewOtpviewBroadcastReceiver()
      otpViewOtpviewBroadcastReceiver?.otpBroadcastReceiverListener =
      object : OtpViewOtpviewBroadcastReceiver.OtpBroadcastListener {
        override fun onSuccess(intent: Intent?) {
          getActivityResult.launch(intent)
        }
        override fun onFailure() {

        }
      }
      val intentFilter = IntentFilter(SmsRetriever.SMS_RETRIEVED_ACTION)
      registerReceiver(otpViewOtpviewBroadcastReceiver, intentFilter)
    }

    private fun getOtpFromMessage(message: String): Unit {
      val otpPattern: Pattern = Pattern.compile("(|^)\\d{4}")
      val matcher: Matcher = otpPattern.matcher(message)
      if (matcher.find()) {
        binding.otpViewOtpview?.setText(matcher.group(0))
      }
    }

    fun onClickRecyclerListgroup10747(
      view: View,
      position: Int,
      item: Listgroup10747RowModel
    ): Unit {
      when(view.id) {
      }
    }

    companion object {
      const val TAG: String = "VERIFICATION_ONE_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, VerificationOneActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
