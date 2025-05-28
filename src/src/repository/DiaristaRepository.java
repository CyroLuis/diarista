package repository;

import Model.Diarista;

import java.util.ArrayList;
import java.util.List;

public class DiaristaRepository implements IRepository<Diarista, Long> {

    private List<Diarista> diaristas;

    private Long idAtual;

    public DiaristaRepository() {
        diaristas = new ArrayList<>();
       // diaristas.add(new Diarista(1L,"Cyro","3424355","2313","rua d"));
        idAtual = 1L;
    }

    @Override
    public List<Diarista> buscarTodos() {
        return diaristas;
    }

    @Override
    public Diarista cadastrar(Diarista model) {
        model.setId(idAtual);
        diaristas.add(model);
        idAtual++;
        return model;
    }

    @Override
    public Diarista buscarPorId(Long id) {
        for (Diarista diarista : diaristas) {
            if (diarista.getId().equals(id)) {
                return diarista;
            }
        }
        return null;
    }

    @Override
    public boolean excluirPorId(Long id) {
        var diaristaEncontrada = buscarPorId(id);
        if(diaristaEncontrada != null){
            diaristas.remove(diaristaEncontrada);
            return true;
        }
        return false;
    }
}
