public class Main {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(34578);
        p1.setDono("Neuza Carvalho");
        p1.abrirConta("CC");

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(66932);
        p2.setDono("Antonio Alves");
        p2.abrirConta("CP");

        p1.depositar(100);
        p1.sacar(25);

        p2.depositar(200);
        p2.sacar(130);

        p1.estadoAtual();
        p2.estadoAtual();

    }
}
