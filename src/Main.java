
public class Main {

	public static void main(String[] args) {
		Cliente suelen = new Cliente();
		suelen.setNome("Suelen");
		
		Conta cc = new ContaCorrente(suelen);
		Conta poupanca = new ContaPoupanca(suelen);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
