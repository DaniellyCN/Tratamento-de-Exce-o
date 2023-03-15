package exercicio2;


public class Main
{
	public static void main(String[] args) {
        System.out.println("Inicio da main");
        try {
            metodo1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("fim da main");

	}
	
	public static void metodo1() throws Exception{
        System.out.println("Inicio do método 1");
        metodo2();
        System.out.println("fim do método 1");
    
	}
	
	public static void metodo2() throws ArrayIndexOutOfBoundsException {
		System.out.println("Inicio do método 2");
		int [] array = new int[10];
        //try{
            for(int i=0; i<=15; i++){
                array[i] = i;
                System.out.println(i);
                }
       // }catch(IndexOutOfBoundsException e){
         //   System.out.println(e.getMessage());
        //}
		System.out.println("fim do método 2");
	}
}


