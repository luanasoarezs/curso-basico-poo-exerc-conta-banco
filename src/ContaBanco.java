import java.util.Objects;

public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // metodos personalizados

    public void estadoAtual() {
        System.out.println("----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Cliente: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status:" + this.getStatus());
    }

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true); // this.status = true;

        if ("CC".equals(t)) {
            this.setSaldo(50);
        } else if ("CP".equals(t)) {
            this.setSaldo(150);
        }
        System.out.println("Abertura de conta realizada com sucesso!");
    }

    public void fecharConta() {

        if (this.getSaldo() > 0) {
            System.out.println("Impossivel encerrar a conta. Saldo existente");
        } else if (this.getSaldo() < 0) {
            System.out.println("Impossivel encerrar a conta.Débito em aberto.");
        } else {
            this.setStatus(false);
            System.out.println("Conta encerrada com sucesso.");
        }
    }

    public void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v); // this.saldo = this.saldo + v ;
            System.out.println("Depósito realizado com sucesso na conta de " + this.getDono());
        } else {
            System.out.println("Impossível realizar o depósito (conta encerrada).");
        }
    }

    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado com sucesso na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Funcionalidade indisponível (conta encerrada).");
        }
    }

    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC") {
            v= 12;
        } else  if (this.getTipo() == "CP" ){
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Taxa de mensalidade paga com sucesso!");
        } else {
            System.out.println("Taxa de mensalidade inexistente(conta encerrada).");
        }
    }

    //construtor
    public void ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
