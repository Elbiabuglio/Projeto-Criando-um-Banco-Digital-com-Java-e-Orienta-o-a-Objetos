
public class Main {

	public static void main(String[] args) {
		Cliente elbia = new Cliente();
		elbia.setNome("Elbia");
		
		
		Conta cc = new ContaCorrente(elbia);
		Conta poupanca = new ContaPoupanca(elbia);
		
		
		cc.depositar(100);
		cc.transferir(50, poupanca);
		
		cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}


