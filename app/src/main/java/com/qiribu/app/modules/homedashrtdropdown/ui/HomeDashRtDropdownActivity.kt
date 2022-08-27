package com.qiribu.app.modules.homedashrtdropdown.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.qiribu.app.R
import com.qiribu.app.appcomponents.base.BaseActivity
import com.qiribu.app.databinding.ActivityHomeDashRtDropdownBinding
import com.qiribu.app.modules.homedashrtdropdown.`data`.model.ListellipsesixTwoRowModel
import com.qiribu.app.modules.homedashrtdropdown.`data`.viewmodel.HomeDashRtDropdownVM
import com.qiribu.app.modules.homedashrtnodropdown.ui.HomeDashRtNoDropdownActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomeDashRtDropdownActivity :
    BaseActivity<ActivityHomeDashRtDropdownBinding>(R.layout.activity_home_dash_rt_dropdown) {
  private val viewModel: HomeDashRtDropdownVM by viewModels<HomeDashRtDropdownVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listellipsesixTwoAdapter =
    ListellipsesixTwoAdapter(viewModel.listellipsesixTwoList.value?:mutableListOf())
    binding.recyclerListellipsesixTwo.adapter = listellipsesixTwoAdapter
    listellipsesixTwoAdapter.setOnItemClickListener(
    object : ListellipsesixTwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListellipsesixTwoRowModel) {
        onClickRecyclerListellipsesixTwo(view, position, item)
      }
    }
    )
    viewModel.listellipsesixTwoList.observe(this) {
      listellipsesixTwoAdapter.updateData(it)
    }
    binding.homeDashRtDropdownVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowrecenttransact.setOnClickListener {
      val destIntent = HomeDashRtNoDropdownActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListellipsesixTwo(
    view: View,
    position: Int,
    item: ListellipsesixTwoRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "HOME_DASH_RT_DROPDOWN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomeDashRtDropdownActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
