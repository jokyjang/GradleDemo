package zzx.application;

import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;

public class GreeterApp {
    public static void main(String[] args) throws IOException {
        String asciiArt = FigletFont.convertOneLine("Hello, " + args[0]);
        System.out.println(asciiArt);
    }
}
