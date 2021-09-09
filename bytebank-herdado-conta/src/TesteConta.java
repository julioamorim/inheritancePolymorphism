public class TesteConta {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(123, 123);
        cc.deposita(100.00);

        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.deposita(100.0);

        cc.transfere(10., cp);
        System.out.println("CC" + cc.getSaldo());
        System.out.println("CP" + cp.getSaldo());
    }
}
