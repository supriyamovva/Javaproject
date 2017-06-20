package Onlinetest;
import java.util.*;
import java.io.*;
public class CLS
 {
    public static void clsc() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}