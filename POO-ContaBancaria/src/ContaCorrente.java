public class ContaCorrente extends Conta
{

    public ContaCorrente(Cliente cliente) 
    {
        super(cliente);
    }

    public void ImprimirExtrato()
    {
        System.out.println(" ==== Extrato da conta corrente ====");
        infoConta();
     }
    
}
