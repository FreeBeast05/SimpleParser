import java.util.regex.Pattern;

public class ValidEmployee {
    public static boolean validNameOrSecondName(String name){
        return Pattern.matches("^[А-Я].*$",name);
    }
    public static boolean validSalary (int salary){
        return ((salary>0) && (salary<1000000));
    }
}
