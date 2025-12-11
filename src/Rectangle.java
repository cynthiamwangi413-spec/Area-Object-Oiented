

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Rectangle {
        int Width;
        int Length;



        void setWidth(int Width){
           this.Width = Width;

        }
        public int getWidth(){
            return Width;
        }
        void setLength(int Length){
            this.Length=Length;
        }
        public int getLength(){
            return Length;
        }
        public double Area(){
            return Length * Width;
        }



        public static void main(String[] args) {
            Rectangle myRectangle = new Rectangle();


            myRectangle.setLength(7);
            myRectangle.setWidth(3);


            System.out.println("Length:" + myRectangle.getLength());
            System.out.println("Width:" + myRectangle.getWidth());
            System.out.println("Area of rectangle:" + myRectangle.Area());

            







        }
    }
