public class Goods {
        double code = 1001;
        String itemName = "Bicycle";
        double price = 6500;
        int quantity = 10;
        String Category;
        double cost=price * quantity;

        public void dispalyInfo(){
            System.out.println("code:"+code +"itemName:"+itemName+"price:"+price+"Quantity:"+quantity+"Category:"
            +Category+"cost:"+cost);

            }
            double getCost(){
            return cost;
            }


        }


