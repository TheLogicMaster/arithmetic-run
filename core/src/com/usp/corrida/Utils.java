package com.usp.corrida;

public class Utils {

    // Convert x.xxxxx to x.x
    public static float fixFloat(float f){
        return (int)(f*10)/10f;
    }
}
