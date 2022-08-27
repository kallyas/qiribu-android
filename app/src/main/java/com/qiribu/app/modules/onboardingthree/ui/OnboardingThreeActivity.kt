package com.qiribu.app.modules.onboardingthree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.qiribu.app.R
import com.qiribu.app.appcomponents.base.BaseActivity
import com.qiribu.app.databinding.ActivityOnboardingThreeBinding
import com.qiribu.app.modules.onboardingfour.ui.OnboardingFourActivity
import com.qiribu.app.modules.onboardingthree.`data`.model.ImageSliderSlidersigninModel
import com.qiribu.app.modules.onboardingthree.`data`.viewmodel.OnboardingThreeVM
import com.qiribu.app.modules.onboardingtwo.ui.OnboardingTwoActivity
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class OnboardingThreeActivity :
    BaseActivity<ActivityOnboardingThreeBinding>(R.layout.activity_onboarding_three) {
  private val imageSliderSlidersigninItems: ArrayList<ImageSliderSlidersigninModel> = arrayListOf()


  private val viewModel: OnboardingThreeVM by viewModels<OnboardingThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val slidersigninAdapter = SlidersigninAdapter(imageSliderSlidersigninItems,true)
    binding.imageSliderSlidersignin.adapter = slidersigninAdapter
    binding.onboardingThreeVM = viewModel
  }

  override fun onPause(): Unit {
    binding.imageSliderSlidersignin.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderSlidersignin.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
    binding.frameStackarrowone.setOnClickListener {
      val destIntent = OnboardingFourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.viewRectangleEight.setOnClickListener {
      val destIntent = OnboardingTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ONBOARDING_THREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OnboardingThreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
