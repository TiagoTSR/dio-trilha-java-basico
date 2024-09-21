import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Banco {
    private String nome;
    private String codigo;
    private Endereco endereco;
    private List<Conta> contas = new ArrayList<>();

    public Banco(String nome, String codigo, Endereco endereco) {
        this.nome = nome;
        this.codigo = codigo;
        this.endereco = endereco;
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }
}
