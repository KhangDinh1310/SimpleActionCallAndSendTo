package com.example.simpleactioncallsendto;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.simpleactioncallsendto.databinding.ActivitySendBinding;

public class SendActivity extends AppCompatActivity {
    ActivitySendBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySendBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttonBack.setOnClickListener(v -> {
            Intent intent = new Intent(SendActivity.this, MainActivity.class);
            startActivity(intent);
        });
        binding.buttonSend.setOnClickListener(v -> {
            Intent sendIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:" + binding.phone.getText().toString()));
            startActivity(sendIntent);
        });
    }
}