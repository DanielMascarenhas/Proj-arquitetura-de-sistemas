import java.util.ArrayList;
import java.util.List;

class Cuidador {
    private final List<Memento> mementos = new ArrayList<>();
    private int estadoAtual = -1;

    public void salvar(Memento memento) {
        // Remove todos os estados "futuros" se estiver refazendo e escrever algo novo
        if (estadoAtual < mementos.size() - 1) {
            mementos.subList(estadoAtual + 1, mementos.size()).clear();
        }
        mementos.add(memento);
        estadoAtual++;
    }

    public Memento desfazer() {
        if (estadoAtual > 0) {
            estadoAtual--;
            return mementos.get(estadoAtual);
        }
        return null;
    }

    public Memento refazer() {
        if (estadoAtual < mementos.size() - 1) {
            estadoAtual++;
            return mementos.get(estadoAtual);
        }
        return null;
    }
}
