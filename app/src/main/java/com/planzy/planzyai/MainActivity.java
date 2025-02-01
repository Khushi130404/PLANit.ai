package com.planzy.planzyai;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    FrameLayout frameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Intent intent = new Intent(MainActivity.this, PaymentDetailsActivity.class);
            startActivity(intent);

//        frameLayout = findViewById(R.id.fragment);
//
//        if(FirebaseAuth.getInstance().getUid() == null){
//            Intent intent = new Intent(MainActivity.this, ActivityLogin.class);
//            startActivity(intent);
//            MainActivity.this.finish();
//        }
//
//        loadFragment(new HomeFragment());
    }

    void loadFragment(Fragment new_fragment)
    {
        FragmentManager fragmentManage = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManage.beginTransaction();
        fragmentTransaction.replace(R.id.fragment,new_fragment);
        fragmentTransaction.commit();
    }
}