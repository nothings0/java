
import DAL.DbContext;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pv
 */
public class Main {
    public static void main(String[] args) {
        DbContext connection = new DbContext();
        System.out.println("succedded");
        String randomCharacters = generateRandomCharacters(3);
        System.out.println(randomCharacters);
    }
    public static String generateRandomCharacters(int length) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            char randomChar;
            randomChar = (char) (random.nextInt(26) + 'A');
            sb.append(randomChar);
        }

        return sb.toString();
    }
}
