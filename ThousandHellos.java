public class ThousandHellos {

    public static void main(String[] args) {
        
       int H = 1000;
        
       for(int i=1; i<=H;i++){  
          if (i==1 || i%10==1 && i%100!= 11) System.out.println(i + "st Hello.");
          else if (i==2 || i%10==2 && i%100!= 12) System.out.println(i + "nd Hello.");
          else if (i==3 || i%10==3 && i%100!= 13) System.out.println(i + "rd Hello.");
          else System.out.println(i + "th Hello.");
                                      
       }
    }
}