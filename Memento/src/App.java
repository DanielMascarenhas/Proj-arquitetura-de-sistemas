public class App {
    public static void main(String[] args) {
        // Criar um editor de texto e um cuidador para gerenciar os mementos
        EditorTexto editor = new EditorTexto();
        Cuidador cuidador = new Cuidador();

        // O usuário escreve algo
        editor.escrever("Olá, ");
        cuidador.salvar(editor.criarMemento()); // Salvar o estado atual

        // Escreve mais
        editor.escrever("mundo!");
        cuidador.salvar(editor.criarMemento()); // Salvar o novo estado

        System.out.println("Conteúdo atual: " + editor.getConteudo()); // Saída: Olá, mundo!

        // O usuário quer desfazer a última ação (escrever "mundo!")
        Memento memento = cuidador.desfazerComSeguranca();
        editor.restaurarMemento(memento);
        System.out.println("Após desfazer: " + editor.getConteudo()); // Saída: Olá,

        // O usuário decide refazer a ação
        memento = cuidador.refazerComSeguranca();
        editor.restaurarMemento(memento);
        System.out.println("Após refazer: " + editor.getConteudo()); // Saída: Olá, mundo!
    }
}
