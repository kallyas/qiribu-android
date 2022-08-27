package com.qiribu.app.modules.onboardingthree.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.qiribu.app.databinding.SlideritemOnboardingThree1Binding
import com.qiribu.app.modules.onboardingthree.`data`.model.ImageSliderSlidersigninModel
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class SlidersigninAdapter(
  val dataList: ArrayList<ImageSliderSlidersigninModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSlidersigninModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemOnboardingThree1Binding) {
      binding.imageSliderSlidersigninModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemOnboardingThree1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
