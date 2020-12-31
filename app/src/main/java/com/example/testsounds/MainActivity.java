package com.example.testsounds;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonPlay;
    private MediaPlayer soundDices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        //запуск метода нажатия кнопки
        clickButton();
    }

    void init(){
        buttonPlay = findViewById(R.id.btnPlaySound);
        soundDices = MediaPlayer.create(this, R.raw.dice_sound1);
    }
    //метод нажатия кнопки
    public void clickButton(){
        buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //запуск метода воспроизведения звука с переданным в него звуком
                soundPlay(soundDices);
            }
        });
    }
    //метод воспроизведения звука для удобства
    public void soundPlay(MediaPlayer sound){
        sound.start();
    }
}