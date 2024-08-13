public class m{    
    public static void main(String[] args){  
        String palabra ;
        palabra = "hola mundo" ;

        System.out.println(palabra) ;

        String invertido = new StringBuilder(palabra).reverse().toString();
        
        System.out.println(invertido) ;  
    }
}
