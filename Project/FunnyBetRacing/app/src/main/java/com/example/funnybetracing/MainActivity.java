package com.example.funnybetracing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    TextView FirstWinner, SecondWinner, ThirdWinner, ResultPlaying, Error, LoseMessage, LoseMoney;
    EditText Balance;
    CheckBox Cb1, Cb2, Cb3, Cb4, Cb5, Cb6, Cb7;
    SeekBar Sb1, Sb2, Sb3, Sb4, Sb5, Sb6, Sb7;
    Button Start, Exit;
    RelativeLayout PopUpContainer;

    // AUDIO
    MediaPlayer backgroundMusic ;
    MediaPlayer horseBg ;
    MediaPlayer button1 ;
    MediaPlayer button2 ;
    MediaPlayer win     ;
    MediaPlayer lose    ;



    public class Type{
         public int winEarn;
         public int loseLost;

        public Type(int winEarn, int loseLost) {
            this.winEarn = winEarn;
            this.loseLost = loseLost;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        backgroundMusic = MediaPlayer.create(this, R.raw.background);
        horseBg = MediaPlayer.create(this, R.raw.horse);
        button1 = MediaPlayer.create(this, R.raw.button1);
        button2 = MediaPlayer.create(this, R.raw.button2);
        win     = MediaPlayer.create(this, R.raw.win);
        lose    = MediaPlayer.create(this, R.raw.lose);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Mapping();
        CheckValidBet();

        CountDownTimer countDownTimer = new CountDownTimer(60000, 300) {
            @Override
            public void onTick(long millisUntilFinished) {
                int speed = 5;
                String horseWinnerFirstPlace = "", horseSecondFirstPlace = "", horseThirdFirstPlace = "";
                ArrayList<Integer> horseWinners = new ArrayList<>();

                Random random = new Random();
                int distance1 = random.nextInt(speed);
                int distance2 = random.nextInt(speed);
                int distance3 = random.nextInt(speed);
                int distance4 = random.nextInt(speed);
                int distance5 = random.nextInt(speed);
                int distance6 = random.nextInt(speed);
                int distance7 = random.nextInt(speed);

               if(Sb1.getProgress() >= Sb1.getMax()){
                   if(horseWinnerFirstPlace.equals("")){
                       horseWinnerFirstPlace = "Horse 1 is winner first place";
                       horseWinners.add(1);
                   }else if(horseSecondFirstPlace.equals("")){
                       horseSecondFirstPlace = "Horse 1 is winner second place";
                       horseWinners.add(1);
                   }else if(horseThirdFirstPlace.equals("")){
                       horseThirdFirstPlace = "Horse 1 is winner third place";
                       horseWinners.add(1);
                   }
               }

               if(Sb2.getProgress() >= Sb2.getMax()){
                   if(horseWinnerFirstPlace.equals("")){
                       horseWinnerFirstPlace = "Horse 2 is winner first place";
                       horseWinners.add(2);
                   }else if(horseSecondFirstPlace.equals("")){
                       horseSecondFirstPlace = "Horse 2 is winner second place";
                       horseWinners.add(2);
                   }else if(horseThirdFirstPlace.equals("")){
                       horseThirdFirstPlace = "Horse 2 is winner third place";
                       horseWinners.add(2);
                   }
               }

               if(Sb3.getProgress() >= Sb3.getMax()) {
                   if(horseWinnerFirstPlace.equals("")){
                       horseWinnerFirstPlace = "Horse 3 is winner first place";
                       horseWinners.add(3);
                   }else if(horseSecondFirstPlace.equals("")){
                       horseSecondFirstPlace = "Horse 3 is winner second place";
                       horseWinners.add(3);
                   }else if(horseThirdFirstPlace.equals("")){
                       horseThirdFirstPlace = "Horse 3 is winner third place";
                       horseWinners.add(3);
                   }
               }

                if(Sb4.getProgress() >= Sb4.getMax()) {
                    if(horseWinnerFirstPlace.equals("")){
                        horseWinnerFirstPlace = "Horse 4 is winner first place";
                        horseWinners.add(4);
                    }else if(horseSecondFirstPlace.equals("")){
                        horseSecondFirstPlace = "Horse 4 is winner second place";
                        horseWinners.add(4);
                    }else if(horseThirdFirstPlace.equals("")){
                        horseThirdFirstPlace = "Horse 4 is winner third place";
                        horseWinners.add(4);
                    }
                }

                if(Sb5.getProgress() >= Sb5.getMax()) {
                    if(horseWinnerFirstPlace.equals("")){
                        horseWinnerFirstPlace = "Horse 5 is winner first place";
                        horseWinners.add(5);
                    }else if(horseSecondFirstPlace.equals("")){
                        horseSecondFirstPlace = "Horse 5 is winner second place";
                        horseWinners.add(5);
                    }else if(horseThirdFirstPlace.equals("")){
                        horseThirdFirstPlace = "Horse 5 is winner third place";
                        horseWinners.add(5);
                    }
                }
                if(Sb6.getProgress() >= Sb6.getMax()) {
                    if(horseWinnerFirstPlace.equals("")){
                        horseWinnerFirstPlace = "Horse 6 is winner first place";
                        horseWinners.add(6);
                    }else if(horseSecondFirstPlace.equals("")){
                        horseSecondFirstPlace = "Horse 6 is winner second place";
                        horseWinners.add(6);
                    }else if(horseThirdFirstPlace.equals("")){
                        horseThirdFirstPlace = "Horse 6 is winner third place";
                        horseWinners.add(6);
                    }
                }
                if(Sb7.getProgress() >= Sb7.getMax()) {
                    if(horseWinnerFirstPlace.equals("")){
                        horseWinnerFirstPlace = "Horse 7 is winner first place";
                        horseWinners.add(7);
                    }else if(horseSecondFirstPlace.equals("")){
                        horseSecondFirstPlace = "Horse 7 is winner second place";
                        horseWinners.add(7);
                    }else if(horseThirdFirstPlace.equals("")){
                        horseThirdFirstPlace = "Horse 7 is winner third place";
                        horseWinners.add(7);
                    }
                }

                if(horseWinners.size() == 3){
                   Type type = CalculateBalanceAfterPlay(horseWinners);
                   stopAudio(AudioType.horse);
                   if(type.winEarn == 0 ){
                       showPopupLoser(type.loseLost);
                   }else{
                       showPopupWinner(horseWinnerFirstPlace, horseSecondFirstPlace,  horseThirdFirstPlace, type.winEarn, type.loseLost);
                   }
                   this.cancel();
                }
                Sb7.setProgress(Sb7.getProgress() + distance7);
                Sb6.setProgress(Sb6.getProgress() + distance6);
                Sb5.setProgress(Sb5.getProgress() + distance5);
                Sb4.setProgress(Sb4.getProgress() + distance4);
                Sb3.setProgress(Sb3.getProgress() + distance3);
                Sb2.setProgress(Sb2.getProgress() + distance2);
                Sb1.setProgress(Sb1.getProgress() + distance1);
            }

            @Override
            public void onFinish() {

            }
        };

        playAudio(AudioType.background);
        Start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(AudioType.button1);
                if(CheckMaxBetHorses() == 0){
                    ShowPopupError("Please bet at least one horse to play!");
                    return;
                }else if(CheckMaxBetHorses() > 3){
                    ShowPopupError("Can not play!");
                    return;
                }
                playAudio(AudioType.horse);
                countDownTimer.start();
                Start.setEnabled(false);
                Exit.setEnabled(false);
            }
        });
     }
    private void showPopupWinner(String horseWinnerFirstPlace, String horseWinnerSecondPlace, String horseWinnerThirdPlace, int earn, int lost) {

        //Declare Pop Up
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View popupView = inflater.inflate(R.layout.pop_up_winne, null);

        //Modify Size
        int width = LinearLayout.LayoutParams.WRAP_CONTENT;
        int height = LinearLayout.LayoutParams.WRAP_CONTENT;
        boolean focusable = false; // Set true if you want to interact with views outside the popup

        //Setting Items In Pop Up
        FirstWinner = popupView.findViewById(R.id.txt_first_place);
        SecondWinner = popupView.findViewById(R.id.txt_second_place);
        ThirdWinner = popupView.findViewById(R.id.txt_third_place);

        ResultPlaying = popupView.findViewById(R.id.txt_result_playing);

        FirstWinner.setText(horseWinnerFirstPlace);
        SecondWinner.setText(horseWinnerSecondPlace);
        ThirdWinner.setText(horseWinnerThirdPlace);

        if(earn != 0){
            ResultPlaying.setText("You are win: " + String.valueOf(earn) + " ");
        }
        if(lost !=0){
            ResultPlaying.setText( ResultPlaying.getText() +   "|| You are lost: " + String.valueOf(lost));
        }

        // AUDIO MANAGER
        if (earn != 0 && lost != 0){
            if (earn > lost){
                playAudio(AudioType.win);
            }else{
                playAudio(AudioType.lose);
            }
        }else if (earn != 0){
            playAudio(AudioType.win);
        }else{
            playAudio(AudioType.lose);
        }

        //Show Pop Up
        PopupWindow popupWindow = new PopupWindow(popupView, width, height, focusable);
        popupWindow.showAtLocation(PopUpContainer, Gravity.CENTER, 0, 0);

        // Dismiss the popup window when the close button is clicked
        Button closeButton = popupView.findViewById(R.id.popupButton);
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(AudioType.button2);
                SetItemsToDefaultAndUpdateBalance(earn, lost);
                popupWindow.dismiss();
            }
        });
    }

    private void showPopupLoser(int lost) {
        playAudio(AudioType.lose);

        //Declare Pop Up
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View popupView = inflater.inflate(R.layout.pop_up_lose, null);

        //Modify Size
        int width = LinearLayout.LayoutParams.WRAP_CONTENT;
        int height = LinearLayout.LayoutParams.WRAP_CONTENT;
        boolean focusable = false; // Set true if you want to interact with views outside the popup

        //Setting Items In Pop Up
        LoseMessage = popupView.findViewById(R.id.popupTitle);
        LoseMessage.setText("Sorry you are lose");

        LoseMoney = popupView.findViewById(R.id.txt_lose_lost);
        LoseMoney.setText("- " + String.valueOf(lost));

        //Show Pop Up
        PopupWindow popupWindow = new PopupWindow(popupView, width, height, focusable);
        popupWindow.showAtLocation(PopUpContainer, Gravity.CENTER, 0, 0);

        // Dismiss the popup window when the close button is clicked
        Button closeButton = popupView.findViewById(R.id.popupButton);
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(AudioType.button2);
                SetItemsToDefaultAndUpdateBalance(0, lost);
                popupWindow.dismiss();
            }
        });
    }
    private void ShowPopupError(String error) {
        playAudio(AudioType.button1);

        //Declare Pop Up
        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View popupView = inflater.inflate(R.layout.pop_up_error, null);

        //Modify Size
        int width = LinearLayout.LayoutParams.WRAP_CONTENT;
        int height = LinearLayout.LayoutParams.WRAP_CONTENT;
        boolean focusable = false; // Set true if you want to interact with views outside the popup

        //Setting Items In Pop Up
        Error = popupView.findViewById(R.id.popupTitle);

        Error.setText(error);

        //Show Pop Up
        PopupWindow popupWindow = new PopupWindow(popupView, width, height, focusable);
        popupWindow.showAtLocation(PopUpContainer, Gravity.CENTER, 0, 0);

        // Dismiss the popup window when the close button is clicked
        Button closeButton = popupView.findViewById(R.id.popupButton);
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAudio(AudioType.button2);
                popupWindow.dismiss();
            }
        });
    }
    private void SetItemsToDefaultAndUpdateBalance(int earn, int lose){

        Start.setEnabled(true);
        Exit.setEnabled(true);

        Sb1.setProgress(0);
        Sb2.setProgress(0);
        Sb3.setProgress(0);
        Sb4.setProgress(0);
        Sb5.setProgress(0);
        Sb6.setProgress(0);
        Sb7.setProgress(0);

        Cb1.setChecked(false);
        Cb2.setChecked(false);
        Cb3.setChecked(false);
        Cb4.setChecked(false);
        Cb5.setChecked(false);
        Cb6.setChecked(false);
        Cb7.setChecked(false);

        int balance = Integer.parseInt(Balance.getText().toString());

        if(earn !=0 ){
            balance += earn;
        }
        if(lose != 0){
           balance -= lose;
        }
        Balance.setText(String.valueOf(balance));
    }

     private void Mapping(){
         Balance = (EditText) findViewById(R.id.ed_money);

         Cb1 = (CheckBox)  findViewById(R.id.cb_horse1);
         Cb2 = (CheckBox)  findViewById(R.id.cb_horse2);
         Cb3 = (CheckBox) findViewById(R.id.cb_horse3);
         Cb4 = (CheckBox)  findViewById(R.id.cb_horse4);
         Cb5 = (CheckBox)  findViewById(R.id.cb_horse5);
         Cb6 = (CheckBox) findViewById(R.id.cb_horse6);
         Cb7 = (CheckBox) findViewById(R.id.cb_horse7);

         Sb1 = (SeekBar) findViewById(R.id.sb_race_horse1);
         Sb2 = (SeekBar) findViewById(R.id.sb_race_horse2);
         Sb3 = (SeekBar) findViewById(R.id.sb_race_horse3);
         Sb4 = (SeekBar) findViewById(R.id.sb_race_horse4);
         Sb5 = (SeekBar) findViewById(R.id.sb_race_horse5);
         Sb6 = (SeekBar) findViewById(R.id.sb_race_horse6);
         Sb7 = (SeekBar) findViewById(R.id.sb_race_horse7);

         Start = (Button) findViewById(R.id.btn_start);
         Exit = (Button) findViewById(R.id.btn_exit);

         PopUpContainer = (RelativeLayout) findViewById(R.id.popupContainer);
     }

    private int CheckMaxBetHorses(){
        int maxCount = 0;

        if(Cb1.isChecked()){
            maxCount ++;
        }
        if(Cb2.isChecked()){
            maxCount ++;
        }
        if(Cb3.isChecked()){
            maxCount ++;
        }
        if(Cb4.isChecked()){
            maxCount ++;
        }
        if(Cb5.isChecked()){
            maxCount ++;
        }
        if(Cb6.isChecked()){
            maxCount ++;
        }
        if(Cb7.isChecked()){
            maxCount ++;
        }

        return maxCount;
    }

    private Type CalculateBalanceAfterPlay(List<Integer> horseWinners){
        int WinBet = 0, Earn = 0, Lost = 0, MaxBet = CheckMaxBetHorses(), ActualWinBet = 0;
        for(int i = 0; i < horseWinners.size(); i++){
            switch (horseWinners.get(i)){
                case 1:
                    if(Cb1.isChecked()){
                        Earn += 450;
                        WinBet ++;
                    }
                    break;
                case 2:
                    if(Cb2.isChecked()){
                        Earn += 450;
                        WinBet ++;
                    }
                    break;
                case 3:
                    if(Cb3.isChecked()){
                        Earn += 450;
                        WinBet ++;
                    }
                    break;
                case 4:
                    if(Cb4.isChecked()){
                        Earn += 450;
                        WinBet ++;
                    }
                    break;
                case 5:
                    if(Cb5.isChecked()){
                        Earn += 450;
                        WinBet ++;
                    }
                    break;
                case 6:
                    if(Cb6.isChecked()){
                        Earn += 450;
                        WinBet ++;
                    }
                    break;
                case 7:
                    if(Cb7.isChecked()){
                        Earn += 450;
                        WinBet ++;
                    }
                    break;
            }
        }
//        for (int i : horseWinners) {
//            switch (i){
//                case 1:
//                    if(Cb1.isChecked()){
//                         winEarn += 450;
//                         count ++;
//                    }
//                    break;
//                case 2:
//                    if(Cb2.isChecked()){
//                        winEarn += 450;
//                        count ++;
//                    }
//                    break;
//                case 3:
//                    if(Cb3.isChecked()){
//                        winEarn += 450;
//                        count ++;
//                    }
//                    break;
//                case 4:
//                    if(Cb4.isChecked()){
//                        winEarn += 450;
//                        count ++;
//                    }
//                    break;
//                case 5:
//                    if(Cb5.isChecked()){
//                        winEarn += 450;
//                        count ++;
//                    }
//                    break;
//                case 6:
//                    if(Cb6.isChecked()){
//                        winEarn += 450;
//                        count ++;
//                    }
//                    break;
//                case 7:
//                    if(Cb7.isChecked()){
//                        winEarn += 450;
//                        count ++;
//                    }
//                    break;
//            }

            ActualWinBet = MaxBet - WinBet;
            switch (ActualWinBet){
                case 1:
                    Lost = 500;
                    break;
                case 2:
                    Lost = 1000;
                    break;
                case 3:
                    Lost = 1500;
                    break;
            }
        return new Type(Earn, Lost);
    }
    private void CheckValidBet(){
         Cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                 if(isChecked){
                      UpdateBalanceWhileBet(true, Cb1);
                 }else{
                     UpdateBalanceWhileBet(false, Cb1);
                 }
             }
         });

        Cb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    UpdateBalanceWhileBet(true, Cb2);
                }else{
                    UpdateBalanceWhileBet(false, Cb2);
                }
            }
        });

        Cb3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    UpdateBalanceWhileBet(true, Cb3);
                }else{
                    UpdateBalanceWhileBet(false, Cb3);
                }
            }
        });

        Cb4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    UpdateBalanceWhileBet(true, Cb4);
                }else{
                    UpdateBalanceWhileBet(false, Cb4);
                }
            }
        });

        Cb5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    UpdateBalanceWhileBet(true, Cb5);
                }else{
                    UpdateBalanceWhileBet(false, Cb5);
                }
            }
        });

        Cb6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    UpdateBalanceWhileBet(true, Cb6);
                }else{
                    UpdateBalanceWhileBet(false, Cb6);
                }
            }
        });

        Cb7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    UpdateBalanceWhileBet(true, Cb7);
                }else{
                    UpdateBalanceWhileBet(false, Cb7);
                }
            }
        });
    }

    private void UpdateBalanceWhileBet(Boolean typeChecked, CheckBox cb){
        //true = checked , False = unchecked
        int balance = 0;
        if(typeChecked){
            if(Integer.parseInt(Balance.getText().toString()) < 500){
                ShowPopupError("Opps Look like you run out of money :))");
                cb.setChecked(false);
                return;
            }
            int maxBetHorse = CheckMaxBetHorses();
            if(maxBetHorse > 3){
                ShowPopupError("Sorry you can't bet more than 3 horses");
            }
            balance = Integer.parseInt(Balance.getText().toString()) - 500;
        }else{
            balance = Integer.parseInt(Balance.getText().toString()) + 500;
        }

        Balance.setText(String.valueOf(balance));
    }

    private void stopAudio(AudioType typeToPlay){
        switch (typeToPlay){
            case button1:
                button1.stop();
                break;
            case button2:
                button2.stop();
                break;
            case win:
                win.stop();
                break;
            case lose:
                lose.stop();
                break;
            case background:
                backgroundMusic.stop();
                break;
            case horse:
                horseBg.stop();
                break;
        }
    }
    private void playAudio(AudioType typeToPlay){
        switch (typeToPlay){
            case button1:
                button1.start();
                break;
            case button2:
                button2.start();
                break;
            case win:
                win.start();
                break;
            case lose:
                lose.start();
                break;
            case background:
                float volume = (float) (1 - (Math.log(50 - 25) / Math.log(50)));
                backgroundMusic.setVolume(volume,volume);
                backgroundMusic.start();
                break;
            case horse:
                horseBg= MediaPlayer.create(this, R.raw.horse);
                horseBg.start();
                break;
        }
    }
    private enum AudioType{
        button1,
        button2,
        win,
        lose,
        background,
        horse
    }
}