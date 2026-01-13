//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Cynthia");
        person.setStatus("Single");
        person.setYear(2004);

        System.out.println("Name:  " +  person.getName());
        System.out.println("Status: " + person.getStatus());
        System.out.println("Year: " + person.getYear());

    }
}