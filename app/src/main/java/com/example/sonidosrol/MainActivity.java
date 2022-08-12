package com.example.sonidosrol;


import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.sonidosrol.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            hideSystemUI();
        }
    }

    private void hideSystemUI() {
        // Enables regular immersive mode.
        // For "lean back" mode, remove SYSTEM_UI_FLAG_IMMERSIVE.
        // Or for "sticky immersive," replace it with SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE
                        // Set the content to appear under the system bars so that the
                        // content doesn't resize when the system bars hide and show.
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        // Hide the nav bar and status bar
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }

    // Shows the system bars by removing all the flags
    // except for the ones that make the content appear under the system bars.
    private void showSystemUI() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
    }


    MediaPlayer mp;
    private View exit;

    private int currentSong;


    //la paranoia
    private ActivityMainBinding viewBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(viewBinding.getRoot());
        mp = MediaPlayer.create(MainActivity.this, R.raw.bluebird);

        viewBinding.batalla2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickable(R.raw.batalla2);
            }
        });
        viewBinding.batallaCelta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickable(R.raw.batallacelta);
            }
        });
        viewBinding.batallaLarga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickable(R.raw.batallalarga);
            }
        });

        viewBinding.bluebird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickable(R.raw.bluebird);
            }
        });

        viewBinding.campamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickable(R.raw.campamento);
            }
        });

        viewBinding.cascada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickable(R.raw.cascada);
            }
        });

        viewBinding.mercado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickable(R.raw.ciudadmercado);
            }
        });
        viewBinding.codec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickable(R.raw.codec);
            }
        });
        viewBinding.cueva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickable(R.raw.cueva);
            }
        });
        viewBinding.flecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickable(R.raw.flecha);
            }
        });

        viewBinding.intro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickable(R.raw.introdyq);

            }
        });

        viewBinding.flechas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickable(R.raw.lluviaflechas);
            }
        });

        viewBinding.metalGear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickable(R.raw.metalgear);
            }
        });
        viewBinding.musicaCaballos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickable(R.raw.musicaballos);
            }
        });
        viewBinding.musicaGeneral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickable(R.raw.musicageneral);
            }
        });

        viewBinding.necropolis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickable(R.raw.necropolis);
            }
        });

        viewBinding.peligroso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickable(R.raw.pegriloso);
            }
        });
        viewBinding.pillada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickable(R.raw.pillada);
            }
        });

        viewBinding.sableLaser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickable(R.raw.sablelaser);
            }
        });

        viewBinding.starWars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickable(R.raw.starwars);
            }
        });
        viewBinding.taberna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickable(R.raw.taberna);
            }
        });
        viewBinding.tranquilidad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickable(R.raw.tranquilidad);
            }
        });
        viewBinding.vikingos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickable(R.raw.vikingos);
            }
        });
        viewBinding.yiraiya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickable(R.raw.yiraiya);
            }
        });

        viewBinding.castlevania.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickable(R.raw.castlevania);
            }
        });

        viewBinding.vampBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickable(R.raw.vampbar);
            }
        });

        viewBinding.ffBattle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickable(R.raw.ffbattle);
            }
        });
        viewBinding.ffBoss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickable(R.raw.ffboss);
            }
        });

        viewBinding.ffWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickable(R.raw.ffmundo);
            }
        });

        viewBinding.edadOscura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickable(R.raw.edadoscura);
            }
        });

        viewBinding.musicaOscura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickable(R.raw.musicaoscura);
            }
        });


        viewBinding.oscuridad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickable(R.raw.oscuridad);
            }
        });












    }



        private void clickable(int sound){
            if(currentSong != sound || !mp.isPlaying())
            {
                currentSong = sound;
                mp.stop();
                mp.release();
                mp = MediaPlayer.create(getApplicationContext(), sound);
                mp.start();
            }else
                mp.stop();

        }



    }





