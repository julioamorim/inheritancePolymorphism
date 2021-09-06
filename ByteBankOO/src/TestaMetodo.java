public class TestaMetodo {

    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.deposita(10.00);

        System.out.println(conta.saldo);

        conta.saca(20);
    }
}
