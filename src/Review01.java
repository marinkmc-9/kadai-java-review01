
public class Review01 {

    public static void main(String[] args) {
        
        int price = 1500;
        double tax_rate = 0.1;
        int tax_value = tax(price,tax_rate);
        int total_price = price + tax_value;


        System.out.print(price + "円の商品の税込価格は");
        System.out.print(total_price + "円");
        System.out.println("（ 消費税は" + tax_value + "円 ）です。");
   }

   public static int tax(int price, double tax_rate) {
        int result = (int)(price * tax_rate);
        return result;
    }
    
}
