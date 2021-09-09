public class TesteTributaveis {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(2, 3);

        cc.deposita(100);

        SeguroDeVida sv = new SeguroDeVida();


        CalculadorImposto ci = new CalculadorImposto();
        ci.registra(cc);

        System.out.println(ci.getTotalImposto());
    }

}
