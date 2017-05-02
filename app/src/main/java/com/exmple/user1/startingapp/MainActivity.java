package com.exmple.user1.startingapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private final static int RESULT_CAMERA = 1001;
    private ImageView imageView;
    private Uri cameraUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView)findViewById(R.id.ivCamera);

        Button cameraButton = (Button)findViewById(R.id.camera_button);
        cameraButton.setOnClickListener(btnListener);

        //if(savedInstanceState != null){
        //    cameraUri = savedInstanceState.getParcelable("CaptureURI");
        //}
    }

    View.OnClickListener btnListener = new View.OnClickListener(){
        public void onClick(View v){
            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(intent,RESULT_CAMERA);
        }
    };

    protected void onActivityResult(int requestcode, int resultuCode, Intent data){
        if(requestcode == RESULT_CAMERA){
            Bitmap bitmap = (Bitmap)data.getExtras().get("data");
            imageView.setImageBitmap(bitmap);
        }
    }

    //protected onSaveInstate(Bundle bundle){
    //    bundle.putParcelable("CaptureURI",cameraUri);
    //}

}
