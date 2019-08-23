package csc.minhanh.module1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class FragmentAndFrame extends AppCompatActivity {
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_and_frame);

        tabLayout = findViewById(R.id.tablayout);
        tabLayout.addTab(tabLayout.newTab().setText("Home").setIcon(R.drawable.icon_home));
        tabLayout.addTab(tabLayout.newTab().setText("Order").setIcon(R.drawable.icon_order));
        tabLayout.addTab(tabLayout.newTab().setText("Profile").setIcon(R.drawable.icon_profile));
        // dang dung mac dinh hinh se o tren
        //quy dinh tu trai sang phan tu tang tu 0
        // getSelected tra ve so chi vi tri
        hienFragment(0);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                hienFragment(tabLayout.getSelectedTabPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void hienFragment(int selectedTabPosition) {
        Fragment fragment = null;
        switch (selectedTabPosition){
            case 0:
                fragment = new HomeFragment();
                break;
            case 1:
                fragment = new OrderFragment();
                break;
            case 2:
                fragment = new ProfileFragment();
                break;
        }
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.layout_content,fragment);
        fragmentTransaction.commit();
    }
}
