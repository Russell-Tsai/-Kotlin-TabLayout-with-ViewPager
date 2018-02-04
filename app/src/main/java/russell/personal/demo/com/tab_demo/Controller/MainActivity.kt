package russell.personal.demo.com.tab_demo.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import russell.personal.demo.com.tab_demo.Adapter.TabAdapter
import russell.personal.demo.com.tab_demo.Fragments.GIFragment
import russell.personal.demo.com.tab_demo.Fragments.GRFragment
import russell.personal.demo.com.tab_demo.R

class MainActivity : AppCompatActivity() {

    lateinit var pagerAdapter : TabAdapter
    lateinit var mTabLayout : TabLayout
    lateinit var mViewPager : ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        processView()
        processController()
    }

    fun processController(){

        pagerAdapter = TabAdapter(supportFragmentManager)
        pagerAdapter.addFragments(GRFragment(),"GR")
        pagerAdapter.addFragments(GIFragment(),"GI")

        mViewPager.adapter = pagerAdapter

        mTabLayout.setupWithViewPager(mViewPager)

    }

    fun processView() {
        mTabLayout = findViewById(R.id.tabLayout)
        mViewPager = findViewById(R.id.viewPager)
    }
}
