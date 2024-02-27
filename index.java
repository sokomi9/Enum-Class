enum Cars
{
    Benz(30000), BMW, Toyota(15000);

    private int price; 
    
    private Cars(){
        price = 18000;
    }

    private Cars(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
/**
 * index
 */
public class index {

    public static void main(String[] args) {
        for(Cars cars : Cars.values()){
            System.out.println(cars + " : " + cars.getPrice());
        }
    }
}