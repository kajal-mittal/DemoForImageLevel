package com.kmdev.demoforimagelevel;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
    private SeekBar mSeekBar;
    private ImageView mImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSeekBar=(SeekBar)findViewById(R.id.seekBar);
        mImage=(ImageView) findViewById(R.id.image);
        mSeekBar.setOnSeekBarChangeListener(this);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        Toast.makeText(this, ""+seekBar.getProgress(), Toast.LENGTH_SHORT).show();
        mImage.setImageLevel(seekBar.getProgress()*100);

    }
}
