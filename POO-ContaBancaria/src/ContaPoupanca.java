public class ContaPoupanca extends Conta 
{

    public ContaPoupanca(Cliente cliente)
    {
        super(cliente);
    }
    public void ImprimirExtrato()
    {
        System.out.println(" ==== Extrato da conta poupança ====");
        infoConta();
     }
}
