package exercicio4;
public class Main
{
	public static void main(String[] args) {
		Conta c1 = new Conta("ALine");
		Conta c2 = new Conta("Maria");
		Conta c3 = new Conta("Joao");
		
		c1.setLimite(1000);
		c1.setTitular("Ana");
		c1.deposita(1000);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		
	    System.out.println("Saldo = " + c1.getSaldo());

		try {
			c1.saca(2000);
			System.out.println("Saque realizado com sucesso!");
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}finally{
			System.out.println("Saldo = " + c1.getSaldo());
		}
		


		try {
			c1.saca(100);
			System.out.println("Saque realizado com sucesso!");
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
			System.out.println("Saldo indisponivel!");
		}finally{
			System.out.println("Saldo = " + c1.getSaldo());
		}

	}
}
