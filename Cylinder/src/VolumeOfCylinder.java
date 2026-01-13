import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class VolumeOfCylinder {
    int height;
    int radius;
    double volume;

    public void setHeight(int height){
        this.height = height;
    }
    public void  setRadius(int radius){
        this.radius = radius;
    }
    public double getVolume(){
        volume = radius * height;
        return volume;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      VolumeOfCylinder myVolumeOfCylinder = new VolumeOfCylinder();

      myVolumeOfCylinder.setHeight(7);
      myVolumeOfCylinder.setRadius(3);
      myVolumeOfCylinder.getVolume();

        System.out.println(myVolumeOfCylinder.height);
        System.out.println(myVolumeOfCylinder.radius);
        System.out.println(myVolumeOfCylinder.volume);


    }
}