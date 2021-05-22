package com.example.m1n1games;

import android.os.Bundle;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import com.thekhaeng.pushdownanim.PushDownAnim;
import com.example.m1n1games.databinding.FragmentLightsOutBinding;

import java.util.Scanner;

public class LightsOut extends Fragment {
    boolean juego1 = false;
    boolean juego2 = false;
    boolean juego3 = false;
    boolean juego4 = false;
    boolean juego5 = false;
    boolean juego6 = false;
    NavController navController;
    private FragmentLightsOutBinding binding;
    int contador = 0;
    Scanner sc = new Scanner(System.in);
    int Filas = 5;
    int Columnas = 5;
    boolean matriz[][] = new boolean[Columnas][Filas];

    private class juego {
        ImageView[][] imvs ={
                {binding.botonlighout00, binding.botonlighout01 , binding.botonlighout02 , binding.botonlighout03 , binding.botonlighout04},
                {binding.botonlighout10, binding.botonlighout11 , binding.botonlighout12 , binding.botonlighout13 , binding.botonlighout14},
                {binding.botonlighout20, binding.botonlighout21 , binding.botonlighout22 , binding.botonlighout23 , binding.botonlighout24},
                {binding.botonlighout30, binding.botonlighout31 , binding.botonlighout32 , binding.botonlighout33 , binding.botonlighout34},
                {binding.botonlighout40, binding.botonlighout41 , binding.botonlighout42 , binding.botonlighout43 , binding.botonlighout44}
        };
    }
    public void mapa1(boolean matriz[][]){
        matriz[0][0]=true;
        matriz[1][0]=true;
        matriz[0][1]=true;

        matriz[0][3]=true;
        matriz[0][4]=true;
        matriz[1][4]=true;

        matriz[3][0]=true;
        matriz[4][0]=true;
        matriz[4][1]=true;

        matriz[3][4]=true;
        matriz[4][4]=true;
        matriz[4][3]=true;

        matriz[2][2]=true;
        matriz[1][2]=true;
        matriz[2][1]=true;
        matriz[2][3]=true;
        matriz[3][2]=true;

        binding.botonlighout00.setImageResource(R.drawable.blanco);
        binding.botonlighout10.setImageResource(R.drawable.blanco);
        binding.botonlighout01.setImageResource(R.drawable.blanco);

        binding.botonlighout03.setImageResource(R.drawable.blanco);
        binding.botonlighout04.setImageResource(R.drawable.blanco);
        binding.botonlighout14.setImageResource(R.drawable.blanco);

        binding.botonlighout34.setImageResource(R.drawable.blanco);
        binding.botonlighout44.setImageResource(R.drawable.blanco);
        binding.botonlighout43.setImageResource(R.drawable.blanco);

        binding.botonlighout30.setImageResource(R.drawable.blanco);
        binding.botonlighout40.setImageResource(R.drawable.blanco);
        binding.botonlighout41.setImageResource(R.drawable.blanco);

        binding.botonlighout12.setImageResource(R.drawable.blanco);
        binding.botonlighout22.setImageResource(R.drawable.blanco);
        binding.botonlighout32.setImageResource(R.drawable.blanco);
        binding.botonlighout21.setImageResource(R.drawable.blanco);
        binding.botonlighout23.setImageResource(R.drawable.blanco);
    }
    public void mapa2(boolean matriz[][]){
        matriz[0][1]=true;
        matriz[1][0]=true;
        matriz[1][1]=true;
        matriz[1][2]=true;
        matriz[2][1]=true;

        matriz[2][3]=true;
        matriz[3][2]=true;
        matriz[3][3]=true;
        matriz[3][4]=true;
        matriz[4][3]=true;

        binding.botonlighout01.setImageResource(R.drawable.blanco);
        binding.botonlighout10.setImageResource(R.drawable.blanco);
        binding.botonlighout11.setImageResource(R.drawable.blanco);
        binding.botonlighout12.setImageResource(R.drawable.blanco);
        binding.botonlighout21.setImageResource(R.drawable.blanco);

        binding.botonlighout23.setImageResource(R.drawable.blanco);
        binding.botonlighout32.setImageResource(R.drawable.blanco);
        binding.botonlighout33.setImageResource(R.drawable.blanco);
        binding.botonlighout34.setImageResource(R.drawable.blanco);
        binding.botonlighout43.setImageResource(R.drawable.blanco);
    }
    public void mapa3(boolean matriz[][]){
        matriz[0][0]=true;

        matriz[0][4]=true;

        matriz[4][0]=true;

        matriz[4][4]=true;

        matriz[1][1]=true;
        matriz[1][2]=true;
        matriz[1][3]=true;
        matriz[2][1]=true;
        matriz[2][2]=true;
        matriz[2][3]=true;
        matriz[3][1]=true;
        matriz[3][2]=true;
        matriz[3][3]=true;

        binding.botonlighout00.setImageResource(R.drawable.blanco);
        binding.botonlighout04.setImageResource(R.drawable.blanco);
        binding.botonlighout40.setImageResource(R.drawable.blanco);
        binding.botonlighout44.setImageResource(R.drawable.blanco);

        binding.botonlighout11.setImageResource(R.drawable.blanco);
        binding.botonlighout12.setImageResource(R.drawable.blanco);
        binding.botonlighout13.setImageResource(R.drawable.blanco);
        binding.botonlighout21.setImageResource(R.drawable.blanco);
        binding.botonlighout22.setImageResource(R.drawable.blanco);
        binding.botonlighout23.setImageResource(R.drawable.blanco);
        binding.botonlighout31.setImageResource(R.drawable.blanco);
        binding.botonlighout32.setImageResource(R.drawable.blanco);
        binding.botonlighout33.setImageResource(R.drawable.blanco);
    }
    public void mapa4(boolean matriz[][]){
        matriz[2][2]=true;
        binding.botonlighout22.setImageResource(R.drawable.blanco);
    }
    public void mapa5(boolean matriz[][]){
        matriz[0][0]=true;
        matriz[0][2]=true;
        matriz[0][4]=true;

        matriz[1][1]=true;
        matriz[1][3]=true;

        matriz[2][0]=true;
        matriz[2][2]=true;
        matriz[2][4]=true;

        matriz[3][1]=true;
        matriz[3][3]=true;

        matriz[4][0]=true;
        matriz[4][2]=true;
        matriz[4][4]=true;

        binding.botonlighout00.setImageResource(R.drawable.blanco);
        binding.botonlighout02.setImageResource(R.drawable.blanco);
        binding.botonlighout04.setImageResource(R.drawable.blanco);

        binding.botonlighout11.setImageResource(R.drawable.blanco);
        binding.botonlighout13.setImageResource(R.drawable.blanco);

        binding.botonlighout20.setImageResource(R.drawable.blanco);
        binding.botonlighout22.setImageResource(R.drawable.blanco);
        binding.botonlighout24.setImageResource(R.drawable.blanco);

        binding.botonlighout31.setImageResource(R.drawable.blanco);
        binding.botonlighout33.setImageResource(R.drawable.blanco);

        binding.botonlighout40.setImageResource(R.drawable.blanco);
        binding.botonlighout42.setImageResource(R.drawable.blanco);
        binding.botonlighout44.setImageResource(R.drawable.blanco);

    }
    public void mapa6(boolean matriz[][]){
        matriz[1][1]=true;
        matriz[1][2]=true;
        matriz[1][3]=true;

        matriz[2][2]=true;
        matriz[3][2]=true;

        matriz[3][1]=true;


        binding.botonlighout11.setImageResource(R.drawable.blanco);
        binding.botonlighout12.setImageResource(R.drawable.blanco);
        binding.botonlighout13.setImageResource(R.drawable.blanco);

        binding.botonlighout22.setImageResource(R.drawable.blanco);
        binding.botonlighout32.setImageResource(R.drawable.blanco);

        binding.botonlighout31.setImageResource(R.drawable.blanco);

    }
    public void comprobacion(){
        contador=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == false) {
                    contador++;
                }
            }
        }
        if (contador == 25) {
            juego1=true;
            if (juego1==true&&juego2==true&&juego3==true&&juego4&&juego5==true&&juego6==true){
                System.out.println("██╗░░░██╗██╗░█████╗░████████╗░█████╗░██████╗░██╗░█████╗░");
                System.out.println("██║░░░██║██║██╔══██╗╚══██╔══╝██╔══██╗██╔══██╗██║██╔══██╗");
                System.out.println("╚██╗░██╔╝██║██║░░╚═╝░░░██║░░░██║░░██║██████╔╝██║███████║");
                System.out.println("░╚████╔╝░██║██║░░██╗░░░██║░░░██║░░██║██╔══██╗██║██╔══██║");
                System.out.println("░░╚██╔╝░░██║╚█████╔╝░░░██║░░░╚█████╔╝██║░░██║██║██║░░██║");
                System.out.println("░░░╚═╝░░░╚═╝░╚════╝░░░░╚═╝░░░░╚════╝░╚═╝░░╚═╝╚═╝╚═╝░░╚═╝");
            }
            else if (juego1==true&&juego2==true&&juego3==true&&juego4&&juego5==true){
                mapa6(matriz);
                juego6=true;
            }
            else if (juego1==true&&juego2==true&&juego3==true&&juego4){
                mapa5(matriz);
                juego5=true;
            }
            else if (juego1==true&&juego2==true&&juego3==true){
                mapa4(matriz);
                juego4=true;
            }
            else if (juego1==true&&juego2==true){
                mapa3(matriz);
                juego3=true;
            }
            else if (juego1==true){
                mapa2(matriz);
                juego2=true;
            }

        }
        else System.out.println(contador);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return (binding =FragmentLightsOutBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);
        mapa1(matriz);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == false) {
                    contador++;
                }
            }
        }
        PushDownAnim.setPushDownAnimTo(binding.botonlighout00).setScale(PushDownAnim.MODE_SCALE,0.89f)
                .setDurationPush(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setDurationRelease(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (matriz[0][0]==true){
                            matriz[0][0]= !matriz[0][0];
                            binding.botonlighout00.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[0][0]==false){
                            matriz[0][0]= !matriz[0][0];
                            binding.botonlighout00.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 01
                        if (matriz[0][1]==true){
                            matriz[0][1]=!matriz[0][1];
                            binding.botonlighout01.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[0][1]==false){
                            matriz[0][1]=!matriz[0][1];
                            binding.botonlighout01.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 10
                        if (matriz[1][0]==true){
                            matriz[1][0]= !matriz[1][0];
                            binding.botonlighout10.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[1][0]==false){
                            matriz[1][0]= !matriz[1][0];
                            binding.botonlighout10.setImageResource(R.drawable.blanco);
                        }
                        comprobacion();
                    }
                });

        PushDownAnim.setPushDownAnimTo(binding.botonlighout01).setScale(PushDownAnim.MODE_SCALE,0.89f)
                .setDurationPush(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setDurationRelease(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (matriz[0][1]==true){
                            matriz[0][1]=!matriz[0][1];
                            binding.botonlighout01.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[0][1]==false){
                            matriz[0][1]=!matriz[0][1];
                            binding.botonlighout01.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 00
                        if (matriz[0][0]==true){
                            matriz[0][0]=!matriz[0][0];
                            binding.botonlighout00.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[0][0]==false){
                            matriz[0][0]=!matriz[0][0];
                            binding.botonlighout00.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 11
                        if (matriz[1][1]==true){
                            matriz[1][1]= !matriz[1][1];
                            binding.botonlighout11.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[1][1]==false){
                            matriz[1][1]= !matriz[1][1];
                            binding.botonlighout11.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 02
                        if (matriz[0][2]==true){
                            matriz[0][2]= !matriz[0][2];
                            binding.botonlighout02.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[0][2]==false){
                            matriz[0][2]= !matriz[0][2];
                            binding.botonlighout02.setImageResource(R.drawable.blanco);
                        }
                        comprobacion();
                    }
                });

        PushDownAnim.setPushDownAnimTo(binding.botonlighout02).setScale(PushDownAnim.MODE_SCALE,0.89f)
                .setDurationPush(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setDurationRelease(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (matriz[0][2]==true){
                            matriz[0][2]=!matriz[0][2];
                            binding.botonlighout02.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[0][2]==false){
                            matriz[0][2]=!matriz[0][2];
                            binding.botonlighout02.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 01
                        if (matriz[0][1]==true){
                            matriz[0][1]=!matriz[0][1];
                            binding.botonlighout01.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[0][1]==false){
                            matriz[0][1]=!matriz[0][1];
                            binding.botonlighout01.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 12
                        if (matriz[1][2]==true){
                            matriz[1][2]= !matriz[1][2];
                            binding.botonlighout12.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[1][2]==false){
                            matriz[1][2]= !matriz[1][2];
                            binding.botonlighout12.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 03
                        if (matriz[0][3]==true){
                            matriz[0][3]= !matriz[0][3];
                            binding.botonlighout03.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[0][3]==false){
                            matriz[0][3]= !matriz[0][3];
                                binding.botonlighout03.setImageResource(R.drawable.blanco);
                        }
                        comprobacion();
                    }
                });
        PushDownAnim.setPushDownAnimTo(binding.botonlighout03).setScale(PushDownAnim.MODE_SCALE,0.89f)
                .setDurationPush(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setDurationRelease(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (matriz[0][3]==true){
                            matriz[0][3]=!matriz[0][3];
                            binding.botonlighout03.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[0][3]==false){
                            matriz[0][3]=!matriz[0][3];
                            binding.botonlighout03.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 02
                        if (matriz[0][2]==true){
                            matriz[0][2]=!matriz[0][2];
                            binding.botonlighout02.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[0][2]==false){
                            matriz[0][2]=!matriz[0][2];
                            binding.botonlighout02.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 13
                        if (matriz[1][3]==true){
                            matriz[1][3]= !matriz[1][3];
                            binding.botonlighout13.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[1][3]==false){
                            matriz[1][3]= !matriz[1][3];
                            binding.botonlighout13.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 04
                        if (matriz[0][4]==true){
                            matriz[0][4]= !matriz[0][4];
                            binding.botonlighout04.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[0][4]==false){
                            matriz[0][4]= !matriz[0][4];
                            binding.botonlighout04.setImageResource(R.drawable.blanco);
                        }
                        comprobacion();
                    }
                });
        PushDownAnim.setPushDownAnimTo(binding.botonlighout04).setScale(PushDownAnim.MODE_SCALE,0.89f)
                .setDurationPush(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setDurationRelease(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (matriz[0][4]==true){
                            matriz[0][4]=!matriz[0][4];
                            binding.botonlighout04.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[0][4]==false){
                            matriz[0][4]=!matriz[0][4];
                            binding.botonlighout04.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 03
                        if (matriz[0][3]==true){
                            matriz[0][3]=!matriz[0][3];
                            binding.botonlighout03.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[0][3]==false){
                            matriz[0][3]=!matriz[0][3];
                            binding.botonlighout03.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 14
                        if (matriz[1][4]==true){
                            matriz[1][4]= !matriz[1][4];
                            binding.botonlighout14.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[1][4]==false){
                            matriz[1][4]= !matriz[1][4];
                            binding.botonlighout14.setImageResource(R.drawable.blanco);
                        }
                        comprobacion();
                    }
                });
        ////////////////////////////////////////////FILA 2////////////////////////////////////////////
        PushDownAnim.setPushDownAnimTo(binding.botonlighout10).setScale(PushDownAnim.MODE_SCALE,0.89f)
                .setDurationPush(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setDurationRelease(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (matriz[1][0]==true){
                            matriz[1][0]= !matriz[1][0];
                            binding.botonlighout10.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[1][0]==false){
                            matriz[1][0]= !matriz[1][0];
                            binding.botonlighout10.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 00
                        if (matriz[0][0]==true){
                            matriz[0][0]=!matriz[0][0];
                            binding.botonlighout00.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[0][0]==false){
                            matriz[0][0]=!matriz[0][0];
                            binding.botonlighout00.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 11
                        if (matriz[1][1]==true){
                            matriz[1][1]= !matriz[1][1];
                            binding.botonlighout11.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[1][1]==false){
                            matriz[1][1]= !matriz[1][1];
                            binding.botonlighout11.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 20
                        if (matriz[2][0]==true){
                            matriz[2][0]= !matriz[2][0];
                            binding.botonlighout20.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[2][0]==false){
                            matriz[2][0]= !matriz[2][0];
                            binding.botonlighout20.setImageResource(R.drawable.blanco);
                        }
                        comprobacion();
                    }
                });
        PushDownAnim.setPushDownAnimTo(binding.botonlighout11).setScale(PushDownAnim.MODE_SCALE,0.89f)
                .setDurationPush(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setDurationRelease(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (matriz[1][1]==true){
                            matriz[1][1]= !matriz[1][1];
                            binding.botonlighout11.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[1][1]==false){
                            matriz[1][1]= !matriz[1][1];
                            binding.botonlighout11.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 01
                        if (matriz[0][1]==true){
                            matriz[0][1]=!matriz[0][1];
                            binding.botonlighout01.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[0][1]==false){
                            matriz[0][1]=!matriz[0][1];
                            binding.botonlighout01.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 10
                        if (matriz[1][0]==true){
                            matriz[1][0]= !matriz[1][0];
                            binding.botonlighout10.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[1][0]==false){
                            matriz[1][0]= !matriz[1][0];
                            binding.botonlighout10.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 12
                        if (matriz[1][2]==true){
                            matriz[1][2]= !matriz[1][2];
                            binding.botonlighout12.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[1][2]==false){
                            matriz[1][2]= !matriz[1][2];
                            binding.botonlighout12.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 21
                        if (matriz[2][1]==true){
                            matriz[2][1]= !matriz[2][1];
                            binding.botonlighout21.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[2][1]==false){
                            matriz[2][1]= !matriz[2][1];
                            binding.botonlighout21.setImageResource(R.drawable.blanco);
                        }
                        comprobacion();
                    }
                });
        PushDownAnim.setPushDownAnimTo(binding.botonlighout12).setScale(PushDownAnim.MODE_SCALE,0.89f)
                .setDurationPush(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setDurationRelease(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (matriz[1][2]==true){
                            matriz[1][2]= !matriz[1][2];
                            binding.botonlighout12.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[1][2]==false){
                            matriz[1][2]= !matriz[1][2];
                            binding.botonlighout12.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 02
                        if (matriz[0][2]==true){
                            matriz[0][2]=!matriz[0][2];
                            binding.botonlighout02.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[0][2]==false){
                            matriz[0][2]=!matriz[0][2];
                            binding.botonlighout02.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 11
                        if (matriz[1][1]==true){
                            matriz[1][1]= !matriz[1][1];
                            binding.botonlighout11.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[1][1]==false){
                            matriz[1][1]= !matriz[1][1];
                            binding.botonlighout11.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 13
                        if (matriz[1][3]==true){
                            matriz[1][3]= !matriz[1][3];
                            binding.botonlighout13.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[1][3]==false){
                            matriz[1][3]= !matriz[1][3];
                            binding.botonlighout13.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 22
                        if (matriz[2][2]==true){
                            matriz[2][2]= !matriz[2][2];
                            binding.botonlighout22.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[2][2]==false){
                            matriz[2][2]= !matriz[2][2];
                            binding.botonlighout22.setImageResource(R.drawable.blanco);
                        }
                        comprobacion();
                    }
                });
        PushDownAnim.setPushDownAnimTo(binding.botonlighout13).setScale(PushDownAnim.MODE_SCALE,0.89f)
                .setDurationPush(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setDurationRelease(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (matriz[1][3]==true){
                            matriz[1][3]= !matriz[1][3];
                            binding.botonlighout13.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[1][3]==false){
                            matriz[1][3]= !matriz[1][3];
                            binding.botonlighout13.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 03
                        if (matriz[0][3]==true){
                            matriz[0][3]=!matriz[0][3];
                            binding.botonlighout03.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[0][3]==false){
                            matriz[0][3]=!matriz[0][3];
                            binding.botonlighout03.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 12
                        if (matriz[1][2]==true){
                            matriz[1][2]= !matriz[1][2];
                            binding.botonlighout12.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[1][2]==false){
                            matriz[1][2]= !matriz[1][2];
                            binding.botonlighout12.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 14
                        if (matriz[1][4]==true){
                            matriz[1][4]= !matriz[1][4];
                            binding.botonlighout14.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[1][4]==false){
                            matriz[1][4]= !matriz[1][4];
                            binding.botonlighout14.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 23
                        if (matriz[2][3]==true){
                            matriz[2][3]= !matriz[2][3];
                            binding.botonlighout23.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[2][3]==false){
                            matriz[2][3]= !matriz[2][3];
                            binding.botonlighout23.setImageResource(R.drawable.blanco);
                        }
                        comprobacion();
                    }
                });
        PushDownAnim.setPushDownAnimTo(binding.botonlighout14).setScale(PushDownAnim.MODE_SCALE,0.89f)
                .setDurationPush(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setDurationRelease(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (matriz[1][4]==true){
                            matriz[1][4]= !matriz[1][4];
                            binding.botonlighout14.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[1][4]==false){
                            matriz[1][4]= !matriz[1][4];
                            binding.botonlighout14.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 04
                        if (matriz[0][4]==true){
                            matriz[0][4]=!matriz[0][4];
                            binding.botonlighout04.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[0][4]==false){
                            matriz[0][4]=!matriz[0][4];
                            binding.botonlighout04.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 13
                        if (matriz[1][3]==true){
                            matriz[1][3]= !matriz[1][3];
                            binding.botonlighout13.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[1][3]==false){
                            matriz[1][3]= !matriz[1][3];
                            binding.botonlighout13.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 24
                        if (matriz[2][4]==true){
                            matriz[2][4]= !matriz[2][4];
                            binding.botonlighout24.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[2][4]==false){
                            matriz[2][4]= !matriz[2][4];
                            binding.botonlighout24.setImageResource(R.drawable.blanco);
                        }
                        comprobacion();
                    }
                });
        ////////////////////////////////////////////FILA 3////////////////////////////////////////////
        PushDownAnim.setPushDownAnimTo(binding.botonlighout20).setScale(PushDownAnim.MODE_SCALE,0.89f)
                .setDurationPush(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setDurationRelease(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (matriz[2][0]==true){
                            matriz[2][0]= !matriz[2][0];
                            binding.botonlighout20.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[2][0]==false){
                            matriz[2][0]= !matriz[2][0];
                            binding.botonlighout20.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 10
                        if (matriz[1][0]==true){
                            matriz[1][0]=!matriz[1][0];
                            binding.botonlighout10.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[1][0]==false){
                            matriz[1][0]=!matriz[1][0];
                            binding.botonlighout10.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 21
                        if (matriz[2][1]==true){
                            matriz[2][1]= !matriz[2][1];
                            binding.botonlighout21.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[2][1]==false){
                            matriz[2][1]= !matriz[2][1];
                            binding.botonlighout21.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 30
                        if (matriz[3][0]==true){
                            matriz[3][0]= !matriz[3][0];
                            binding.botonlighout30.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[3][0]==false){
                            matriz[3][0]= !matriz[3][0];
                            binding.botonlighout30.setImageResource(R.drawable.blanco);
                        }
                        comprobacion();
                    }
                });
        PushDownAnim.setPushDownAnimTo(binding.botonlighout21).setScale(PushDownAnim.MODE_SCALE,0.89f)
                .setDurationPush(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setDurationRelease(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (matriz[2][1]==true){
                            matriz[2][1]= !matriz[2][1];
                            binding.botonlighout21.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[2][1]==false){
                            matriz[2][1]= !matriz[2][1];
                            binding.botonlighout21.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 11
                        if (matriz[1][1]==true){
                            matriz[1][1]=!matriz[1][1];
                            binding.botonlighout11.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[1][1]==false){
                            matriz[1][1]=!matriz[1][1];
                            binding.botonlighout11.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 20
                        if (matriz[2][0]==true){
                            matriz[2][0]= !matriz[2][0];
                            binding.botonlighout20.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[2][0]==false){
                            matriz[2][0]= !matriz[2][0];
                            binding.botonlighout20.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 22
                        if (matriz[2][2]==true){
                            matriz[2][2]= !matriz[2][2];
                            binding.botonlighout22.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[2][2]==false){
                            matriz[2][2]= !matriz[2][2];
                            binding.botonlighout22.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 31
                        if (matriz[3][1]==true){
                            matriz[3][1]= !matriz[3][1];
                            binding.botonlighout31.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[3][1]==false){
                            matriz[3][1]= !matriz[3][1];
                            binding.botonlighout31.setImageResource(R.drawable.blanco);
                        }
                        comprobacion();
                    }
                });
        PushDownAnim.setPushDownAnimTo(binding.botonlighout22).setScale(PushDownAnim.MODE_SCALE,0.89f)
                .setDurationPush(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setDurationRelease(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (matriz[2][2]==true){
                            matriz[2][2]= !matriz[2][2];
                            binding.botonlighout22.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[2][2]==false){
                            matriz[2][2]= !matriz[2][2];
                            binding.botonlighout22.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 12
                        if (matriz[1][2]==true){
                            matriz[1][2]=!matriz[1][2];
                            binding.botonlighout12.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[1][2]==false){
                            matriz[1][2]=!matriz[1][2];
                            binding.botonlighout12.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 21
                        if (matriz[2][1]==true){
                            matriz[2][1]= !matriz[2][1];
                            binding.botonlighout21.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[2][1]==false){
                            matriz[2][1]= !matriz[2][1];
                            binding.botonlighout21.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 23
                        if (matriz[2][3]==true){
                            matriz[2][3]= !matriz[2][3];
                            binding.botonlighout23.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[2][3]==false){
                            matriz[2][3]= !matriz[2][3];
                            binding.botonlighout23.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 32
                        if (matriz[3][2]==true){
                            matriz[3][2]= !matriz[3][2];
                            binding.botonlighout32.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[3][2]==false){
                            matriz[3][2]= !matriz[3][2];
                            binding.botonlighout32.setImageResource(R.drawable.blanco);
                        }
                        comprobacion();
                    }
                });
        PushDownAnim.setPushDownAnimTo(binding.botonlighout23).setScale(PushDownAnim.MODE_SCALE,0.89f)
                .setDurationPush(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setDurationRelease(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (matriz[2][3]==true){
                            matriz[2][3]= !matriz[2][3];
                            binding.botonlighout23.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[2][3]==false){
                            matriz[2][3]= !matriz[2][3];
                            binding.botonlighout23.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 13
                        if (matriz[1][3]==true){
                            matriz[1][3]=!matriz[1][3];
                            binding.botonlighout13.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[1][3]==false){
                            matriz[1][3]=!matriz[1][3];
                            binding.botonlighout13.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 22
                        if (matriz[2][2]==true){
                            matriz[2][2]= !matriz[2][2];
                            binding.botonlighout22.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[2][2]==false){
                            matriz[2][2]= !matriz[2][2];
                            binding.botonlighout22.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 24
                        if (matriz[2][4]==true){
                            matriz[2][4]= !matriz[2][4];
                            binding.botonlighout24.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[2][4]==false){
                            matriz[2][4]= !matriz[2][4];
                            binding.botonlighout24.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 33
                        if (matriz[3][3]==true){
                            matriz[3][3]= !matriz[3][3];
                            binding.botonlighout33.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[3][3]==false){
                            matriz[3][3]= !matriz[3][3];
                            binding.botonlighout33.setImageResource(R.drawable.blanco);
                        }
                        comprobacion();
                    }
                });
        PushDownAnim.setPushDownAnimTo(binding.botonlighout24).setScale(PushDownAnim.MODE_SCALE,0.89f)
                .setDurationPush(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setDurationRelease(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (matriz[2][4]==true){
                            matriz[2][4]= !matriz[2][4];
                            binding.botonlighout24.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[2][4]==false){
                            matriz[2][4]= !matriz[2][4];
                            binding.botonlighout24.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 14
                        if (matriz[1][4]==true){
                            matriz[1][4]=!matriz[1][4];
                            binding.botonlighout14.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[1][4]==false){
                            matriz[1][4]=!matriz[1][4];
                            binding.botonlighout14.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 23
                        if (matriz[2][3]==true){
                            matriz[2][3]= !matriz[2][3];
                            binding.botonlighout23.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[2][3]==false){
                            matriz[2][3]= !matriz[2][3];
                            binding.botonlighout23.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 34
                        if (matriz[3][4]==true){
                            matriz[3][4]= !matriz[3][4];
                            binding.botonlighout34.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[3][4]==false){
                            matriz[3][4]= !matriz[3][4];
                            binding.botonlighout34.setImageResource(R.drawable.blanco);
                        }
                        comprobacion();
                    }
                });
        ////////////////////////////////////////////FILA 4////////////////////////////////////////////
        PushDownAnim.setPushDownAnimTo(binding.botonlighout30).setScale(PushDownAnim.MODE_SCALE,0.89f)
                .setDurationPush(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setDurationRelease(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (matriz[3][0]==true){
                            matriz[3][0]= !matriz[3][0];
                            binding.botonlighout30.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[3][0]==false){
                            matriz[3][0]= !matriz[3][0];
                            binding.botonlighout30.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 20
                        if (matriz[2][0]==true){
                            matriz[2][0]=!matriz[2][0];
                            binding.botonlighout20.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[2][0]==false){
                            matriz[2][0]=!matriz[2][0];
                            binding.botonlighout20.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 31
                        if (matriz[3][1]==true){
                            matriz[3][1]= !matriz[3][1];
                            binding.botonlighout31.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[3][1]==false){
                            matriz[3][1]= !matriz[3][1];
                            binding.botonlighout31.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 40
                        if (matriz[4][0]==true){
                            matriz[4][0]= !matriz[4][0];
                            binding.botonlighout40.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[4][0]==false){
                            matriz[4][0]= !matriz[4][0];
                            binding.botonlighout40.setImageResource(R.drawable.blanco);
                        }
                        comprobacion();
                    }
                });
        PushDownAnim.setPushDownAnimTo(binding.botonlighout31).setScale(PushDownAnim.MODE_SCALE,0.89f)
                .setDurationPush(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setDurationRelease(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (matriz[3][1]==true){
                            matriz[3][1]= !matriz[3][1];
                            binding.botonlighout31.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[3][1]==false){
                            matriz[3][1]= !matriz[3][1];
                            binding.botonlighout31.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 21
                        if (matriz[2][1]==true){
                            matriz[2][1]=!matriz[2][1];
                            binding.botonlighout21.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[2][1]==false){
                            matriz[2][1]=!matriz[2][1];
                            binding.botonlighout21.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 30
                        if (matriz[3][0]==true){
                            matriz[3][0]= !matriz[3][0];
                            binding.botonlighout30.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[3][0]==false){
                            matriz[3][0]= !matriz[3][0];
                            binding.botonlighout30.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 32
                        if (matriz[3][2]==true){
                            matriz[3][2]= !matriz[3][2];
                            binding.botonlighout32.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[3][2]==false){
                            matriz[3][2]= !matriz[3][2];
                            binding.botonlighout32.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 41
                        if (matriz[4][1]==true){
                            matriz[4][1]= !matriz[4][1];
                            binding.botonlighout41.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[4][1]==false){
                            matriz[4][1]= !matriz[4][1];
                            binding.botonlighout41.setImageResource(R.drawable.blanco);
                        }
                        comprobacion();
                    }
                });
        PushDownAnim.setPushDownAnimTo(binding.botonlighout32).setScale(PushDownAnim.MODE_SCALE,0.89f)
                .setDurationPush(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setDurationRelease(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (matriz[3][2]==true){
                            matriz[3][2]= !matriz[3][2];
                            binding.botonlighout32.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[3][2]==false){
                            matriz[3][2]= !matriz[3][2];
                            binding.botonlighout32.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 22
                        if (matriz[2][2]==true){
                            matriz[2][2]=!matriz[2][2];
                            binding.botonlighout22.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[2][2]==false){
                            matriz[2][2]=!matriz[2][2];
                            binding.botonlighout22.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 31
                        if (matriz[3][1]==true){
                            matriz[3][1]= !matriz[3][1];
                            binding.botonlighout31.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[3][1]==false){
                            matriz[3][1]= !matriz[3][1];
                            binding.botonlighout31.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 33
                        if (matriz[3][3]==true){
                            matriz[3][3]= !matriz[3][3];
                            binding.botonlighout33.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[3][3]==false){
                            matriz[3][3]= !matriz[3][3];
                            binding.botonlighout33.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 42
                        if (matriz[4][2]==true){
                            matriz[4][2]= !matriz[4][2];
                            binding.botonlighout42.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[4][2]==false){
                            matriz[4][2]= !matriz[4][2];
                            binding.botonlighout42.setImageResource(R.drawable.blanco);
                        }
                        comprobacion();
                    }
                });
        PushDownAnim.setPushDownAnimTo(binding.botonlighout33).setScale(PushDownAnim.MODE_SCALE,0.89f)
                .setDurationPush(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setDurationRelease(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (matriz[3][3]==true){
                            matriz[3][3]= !matriz[3][3];
                            binding.botonlighout33.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[3][3]==false){
                            matriz[3][3]= !matriz[3][3];
                            binding.botonlighout33.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 23
                        if (matriz[2][3]==true){
                            matriz[2][3]=!matriz[2][3];
                            binding.botonlighout23.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[2][3]==false){
                            matriz[2][3]=!matriz[2][3];
                            binding.botonlighout23.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 32
                        if (matriz[3][2]==true){
                            matriz[3][2]= !matriz[3][2];
                            binding.botonlighout32.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[3][2]==false){
                            matriz[3][2]= !matriz[3][2];
                            binding.botonlighout32.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 34
                        if (matriz[3][4]==true){
                            matriz[3][4]= !matriz[3][4];
                            binding.botonlighout34.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[3][4]==false){
                            matriz[3][4]= !matriz[3][4];
                            binding.botonlighout34.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 43
                        if (matriz[4][3]==true){
                            matriz[4][3]= !matriz[4][3];
                            binding.botonlighout43.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[4][3]==false){
                            matriz[4][3]= !matriz[4][3];
                            binding.botonlighout43.setImageResource(R.drawable.blanco);
                        }
                        comprobacion();
                    }
                });
        PushDownAnim.setPushDownAnimTo(binding.botonlighout34).setScale(PushDownAnim.MODE_SCALE,0.89f)
                .setDurationPush(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setDurationRelease(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (matriz[3][4]==true){
                            matriz[3][4]= !matriz[3][4];
                            binding.botonlighout34.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[3][4]==false){
                            matriz[3][4]= !matriz[3][4];
                            binding.botonlighout34.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 24
                        if (matriz[2][4]==true){
                            matriz[2][4]=!matriz[2][4];
                            binding.botonlighout24.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[2][4]==false){
                            matriz[2][4]=!matriz[2][4];
                            binding.botonlighout24.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 33
                        if (matriz[3][3]==true){
                            matriz[3][3]= !matriz[3][3];
                            binding.botonlighout33.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[3][3]==false){
                            matriz[3][3]= !matriz[3][3];
                            binding.botonlighout33.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 44
                        if (matriz[4][4]==true){
                            matriz[4][4]= !matriz[4][4];
                            binding.botonlighout44.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[4][4]==false){
                            matriz[4][4]= !matriz[4][4];
                            binding.botonlighout44.setImageResource(R.drawable.blanco);
                        }
                        comprobacion();
                    }
                });
        ////////////////////////////////////////////FILA 5////////////////////////////////////////////
        PushDownAnim.setPushDownAnimTo(binding.botonlighout40).setScale(PushDownAnim.MODE_SCALE,0.89f)
                .setDurationPush(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setDurationRelease(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (matriz[4][0]==true){
                            matriz[4][0]= !matriz[4][0];
                            binding.botonlighout40.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[4][0]==false){
                            matriz[4][0]= !matriz[4][0];
                            binding.botonlighout40.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 30
                        if (matriz[3][0]==true){
                            matriz[3][0]=!matriz[3][0];
                            binding.botonlighout30.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[3][0]==false){
                            matriz[3][0]=!matriz[3][0];
                            binding.botonlighout30.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 41
                        if (matriz[4][1]==true){
                            matriz[4][1]= !matriz[4][1];
                            binding.botonlighout41.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[4][1]==false){
                            matriz[4][1]= !matriz[4][1];
                            binding.botonlighout41.setImageResource(R.drawable.blanco);
                        }
                        comprobacion();
                    }
                });
        PushDownAnim.setPushDownAnimTo(binding.botonlighout41).setScale(PushDownAnim.MODE_SCALE,0.89f)
                .setDurationPush(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setDurationRelease(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (matriz[4][1]==true){
                            matriz[4][1]= !matriz[4][1];
                            binding.botonlighout41.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[4][1]==false){
                            matriz[4][1]= !matriz[4][1];
                            binding.botonlighout41.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 31
                        if (matriz[3][1]==true){
                            matriz[3][1]=!matriz[3][1];
                            binding.botonlighout31.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[3][1]==false){
                            matriz[3][1]=!matriz[3][1];
                            binding.botonlighout31.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 40
                        if (matriz[4][0]==true){
                            matriz[4][0]= !matriz[4][0];
                            binding.botonlighout40.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[4][0]==false){
                            matriz[4][0]= !matriz[4][0];
                            binding.botonlighout40.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 42
                        if (matriz[4][2]==true){
                            matriz[4][2]= !matriz[4][2];
                            binding.botonlighout42.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[4][2]==false){
                            matriz[4][2]= !matriz[4][2];
                            binding.botonlighout42.setImageResource(R.drawable.blanco);
                        }
                        comprobacion();
                    }
                });
        PushDownAnim.setPushDownAnimTo(binding.botonlighout42).setScale(PushDownAnim.MODE_SCALE,0.89f)
                .setDurationPush(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setDurationRelease(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (matriz[4][2]==true){
                            matriz[4][2]= !matriz[4][2];
                            binding.botonlighout42.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[4][2]==false){
                            matriz[4][2]= !matriz[4][2];
                            binding.botonlighout42.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 32
                        if (matriz[3][2]==true){
                            matriz[3][2]=!matriz[3][2];
                            binding.botonlighout32.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[3][2]==false){
                            matriz[3][2]=!matriz[3][2];
                            binding.botonlighout32.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 41
                        if (matriz[4][1]==true){
                            matriz[4][1]= !matriz[4][1];
                            binding.botonlighout41.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[4][1]==false){
                            matriz[4][1]= !matriz[4][1];
                            binding.botonlighout41.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 43
                        if (matriz[4][3]==true){
                            matriz[4][3]= !matriz[4][3];
                            binding.botonlighout43.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[4][3]==false){
                            matriz[4][3]= !matriz[4][3];
                            binding.botonlighout43.setImageResource(R.drawable.blanco);
                        }
                        comprobacion();
                    }
                });
        PushDownAnim.setPushDownAnimTo(binding.botonlighout43).setScale(PushDownAnim.MODE_SCALE,0.89f)
                .setDurationPush(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setDurationRelease(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (matriz[4][3]==true){
                            matriz[4][3]= !matriz[4][3];
                            binding.botonlighout43.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[4][3]==false){
                            matriz[4][3]= !matriz[4][3];
                            binding.botonlighout43.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 33
                        if (matriz[3][3]==true){
                            matriz[3][3]=!matriz[3][3];
                            binding.botonlighout33.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[3][3]==false){
                            matriz[3][3]=!matriz[3][3];
                            binding.botonlighout33.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 42
                        if (matriz[4][2]==true){
                            matriz[4][2]= !matriz[4][2];
                            binding.botonlighout42.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[4][2]==false){
                            matriz[4][2]= !matriz[4][2];
                            binding.botonlighout42.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 44
                        if (matriz[4][4]==true){
                            matriz[4][4]= !matriz[4][4];
                            binding.botonlighout44.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[4][4]==false){
                            matriz[4][4]= !matriz[4][4];
                            binding.botonlighout44.setImageResource(R.drawable.blanco);
                        }
                        comprobacion();
                    }
                });
        PushDownAnim.setPushDownAnimTo(binding.botonlighout44).setScale(PushDownAnim.MODE_SCALE,0.89f)
                .setDurationPush(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setDurationRelease(PushDownAnim.DEFAULT_PUSH_DURATION)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (matriz[4][4]==true){
                            matriz[4][4]= !matriz[4][4];
                            binding.botonlighout44.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[4][4]==false){
                            matriz[4][4]= !matriz[4][4];
                            binding.botonlighout44.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 34
                        if (matriz[3][4]==true){
                            matriz[3][4]=!matriz[3][4];
                            binding.botonlighout34.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[3][4]==false){
                            matriz[3][4]=!matriz[3][4];
                            binding.botonlighout34.setImageResource(R.drawable.blanco);
                        }
                        // CAMBIO A 43
                        if (matriz[4][3]==true){
                            matriz[4][3]= !matriz[4][3];
                            binding.botonlighout43.setImageResource(R.drawable.negro);
                        }
                        else if (matriz[4][3]==false){
                            matriz[4][3]= !matriz[4][3];
                            binding.botonlighout43.setImageResource(R.drawable.blanco);
                        }
                        comprobacion();

                    }
                });

    }

}