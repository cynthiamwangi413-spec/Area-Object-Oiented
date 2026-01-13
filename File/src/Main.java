import java.io.File;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Admin\\Desktop");

        if(file.exists()){
            System.out.println("This file exist!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getAbsoluteFile());
        }
        else{
            System.out.println("This file does not exist:");
        }

    }
}