package ir.maktab32.java.homeworks.hw8.articles.utilities;

public class IsNumeric {
    public static boolean run(String string){
        try {
            Long.parseLong(string);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
