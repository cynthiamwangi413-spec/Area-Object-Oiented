import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] AdmNo = {001,002, 003, 004, 005};
        String[] Name = {"Grace George", "Phlis Peter", "Evans Naushad", "Philip Phil", "Duncan Dan", "Prisca Sheila"};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter AdmNo");
        String admNo =scanner.nextLine();
        System.out.println("Enter name");
        String name = scanner.nextLine();

        char gender = 'M'; // 'F'
        if(gender == 'M'){
        System.out.println("gender is Male");}
        else if(gender == 'F'){
            System.out.println("gender is Female");}


        //user interface
        interface StudentRecord {
            void addRecord();
            void deleteRecord(String AdmNo);
            void updateRecord(String name);
            void viewRecord();

            class Register{
                private String AdmNo;
                private String name;
                private String gender;

                Register(String AdmNo , String name ,String gender) {
                    this.AdmNo = AdmNo;
                    this.name = name;
                    this.gender = gender;
                }
                    void setAdmNo(String  AdmNo){

                    this.AdmNo=AdmNo;
                    }
                    void setName(String name){
                    this.name = name;
                    }
                    void setGender(String gender){
                    this.gender = gender;
                    }
                   public String getAdmNo(){
                    return AdmNo;
                    }
                    public String getName(){
                    return name;
                    }
                    public String getGender(){
                    return gender;
                    }




            }

        }



    }
}