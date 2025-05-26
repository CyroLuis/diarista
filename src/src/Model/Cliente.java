package Model;

public class Cliente extends   Pessoa{
    public Cliente() {
    }

    public Cliente(Long id, String nome, String telefone, String cpf, String endereco) {
        super(id, nome, telefone, cpf, endereco);
    }
}
