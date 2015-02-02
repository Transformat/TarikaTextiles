package karantarika.com.tarikatextiles.activities;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import karantarika.com.tarikatextiles.R;


public class FullscreenActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fullscreen);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(FullscreenActivity.this, DisplayWeb.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        thread.start();


    }
}
