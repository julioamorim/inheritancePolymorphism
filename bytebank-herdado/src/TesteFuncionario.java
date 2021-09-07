public class TesteFuncionario {

    public static void main(String[] args) {

        Gerente julio = new Gerente();

        julio.setNome("Júlio Amorim");
        julio.setCpf("089765867");
        julio.setSalario(2590.80);

        System.out.println(julio.getNome());
        System.out.println(julio.getBonificacao());

    }

}