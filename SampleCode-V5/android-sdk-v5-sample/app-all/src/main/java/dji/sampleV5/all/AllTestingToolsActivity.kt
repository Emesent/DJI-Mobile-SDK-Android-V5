package dji.sampleV5.all

import androidx.fragment.app.commit
import dji.sampleV5.moduleaircraft.AircraftMSDKInfoFragment
import dji.sampleV5.modulecommon.TestingToolsActivity
import dji.sampleV5.modulecommon.data.CommonFragmentPageInfoFactory
import dji.sampleV5.modulecommon.data.FragmentPageItemList
import dji.sampleV5.moduleaircraft.data.AircraftFragmentPageInfoFactory
import dji.sampleV5.modulecommon.R
import dji.sampleV5.modulehandheld.data.HandheldFragmentPageInfoFactory
import java.util.*

/**
 * Class Description
 *
 * @author Hoker
 * @date 2021/3/9
 *
 * Copyright (c) 2021, DJI All Rights Reserved.
 */
class AllTestingToolsActivity : TestingToolsActivity() {
    override fun loadPages() {
        msdkCommonOperateVm.apply {
            val itemList = LinkedHashSet<FragmentPageItemList>().also {
                it.add(CommonFragmentPageInfoFactory().createPageInfo())
                it.add(AircraftFragmentPageInfoFactory().createPageInfo())
                it.add(HandheldFragmentPageInfoFactory().createPageInfo())
            }
            loaderItem(itemList)
        }
    }

    //先用飞机的
    override fun loadTitleView() {
        supportFragmentManager.commit {
            replace(R.id.main_info_fragment_container, AircraftMSDKInfoFragment())
        }
    }
}