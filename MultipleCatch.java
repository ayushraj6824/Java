public class MultipleCatch {
    
        public static void main(String[] args) {
            try {
                
                int[] n = {1, 2, 3};
                int result = n[2] / 0;  
            } 
            
            catch (ArithmeticException e) {
                System.out.println("Division by zero!");
            } 
            catch (Exception e) {
                System.out.println("Index out of bounds!");
            }
            
        }
  
}
