package starter.utils;

import java.util.Random;

public class GenerateString {
    public String randomEmail(){
        Random random = new Random();
        String email = "test"+ random.nextInt()+"@gmail.com";
        return email;
    }
    public String randomName(){
        Random random = new Random();
        String name = "tester"+random.nextInt();
        return name;
    }
    public String randomPassword(){
        Random random = new Random();
        String password = "Maulana"+random.nextInt();
        return password;
    }
    public String randomEmail1(){
        Random random = new Random();
        String email = "test"+ random.nextInt();
        return email;
    }
}
