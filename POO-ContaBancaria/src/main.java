public class main 
{
    public static void main(String[] args) 
    {
        Cliente Rafael = new Cliente();

        Rafael.setNome("Rafael");

        ContaCorrente cc = new ContaCorrente(Rafael);
        ContaPoupanca cp = new ContaPoupanca(Rafael);

        cc.depositar(100);
        cc.ImprimirExtrato();
        cc.transferencia(50, cp);
        cp.ImprimirExtrato();
        cc.ImprimirExtrato();
    }    
}
