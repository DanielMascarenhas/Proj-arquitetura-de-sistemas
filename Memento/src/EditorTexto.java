class EditorTexto {
    private String conteudo;

    public EditorTexto() {
        this.conteudo = "";
    }

    public void escrever(String texto) {
        conteudo += texto;
    }

    public Memento criarMemento() {
        return new Memento(conteudo);
    }

    public void restaurarMemento(Memento memento) {
        conteudo = memento.getEstado();
    }

    public String getConteudo() {
        return conteudo;
    }
}
