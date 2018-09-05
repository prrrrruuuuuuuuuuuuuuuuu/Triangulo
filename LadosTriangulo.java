import java.util.Scanner; 
public class LadosTriangulo
{
    
 public static void main(String[] args)
 {
     
     Scanner input = new Scanner(System.in);
    
     int a, 
         b, 
         c; 

     System.out.print("Qual valor do lado a? "); 
     a = input.nextInt(); 

     System.out.print("Qual valor do lado b "); 
     b = input.nextInt(); 

     System.out.print("Qual valor do lado c? "); 
     c = input.nextInt();

        if(a < (b + c) && b < (a + c) && c < (a + b)){
            if(a != b && a != c){
                System.out.print("\n\tTri\u00e2ngulo escaleno ");
            }
            if(a == b && a == c){
                System.out.print("\n\tTri\u00e2ngulo equil\u00e1tero");
            }
            if((a == b && a != c) || (a != b && a == c) || (b != c && b == a)) {
                System.out.print("\n\tTri\u00e2ngulo is\u00f3sceles");
            }
        } else {
            System.out.print( "Valores inv\u00e1lidos para formar um tri\u00e2ngulo"); 
        } 
    }
}