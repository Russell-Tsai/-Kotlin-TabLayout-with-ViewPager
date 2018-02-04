package russell.personal.demo.com.tab_demo.Adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v7.widget.DialogTitle

/**
 * Created by Vanilla on 04/02/2018.
 */
class TabAdapter(val fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager){

    var mFragmentItems : ArrayList<Fragment> = ArrayList()
    var mFragmentTitle : ArrayList<String> = ArrayList()

    // need a create function to add fragments
    fun addFragments(fragmentItem : Fragment,fragmentTitle: String){
        mFragmentItems.add(fragmentItem)
        mFragmentTitle.add(fragmentTitle)
    }

    override fun getItem(position: Int): Fragment {
        return mFragmentItems[position]
    }

    override fun getCount(): Int {
        return mFragmentItems.size
    }

    //Option
    override fun getPageTitle(position: Int):CharSequence{
        when(position){
            0 -> return "GR"
            1 -> return "GI"
            else -> return "GR"
        }
    }
}