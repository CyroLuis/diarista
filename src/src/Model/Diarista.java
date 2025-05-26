package Model;

public class Diarista extends Pessoa {
    public Diarista(Long id, String nome, String telefone, String cpf, String endereco) {
        super(id, nome, telefone, cpf, endereco);
    }
    public Diarista(String nome, String telefone, String cpf, String endereco) {
        super(null,nome, telefone, cpf, endereco);
    }


    public Diarista() {
    }
}
