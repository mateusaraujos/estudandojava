package treino.menus;

import javax.swing.*;

public class Janela extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public Janela() {
        setTitle("Minha Aplicação");
        setSize(600, 300);
        setLocation(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menu = new JMenuBar();

        JMenu menuArquivo = new JMenu("Arquivo");
        menuArquivo.setMnemonic('A');

        JMenu menuEditar = new JMenu("Editar");
        menuEditar.setMnemonic('E');

        JMenuItem itemNovo = new JMenuItem("Novo");
        itemNovo.setMnemonic('N');

        JMenuItem itemSair = new JMenuItem(new AcaoSair());
        itemSair.setText("Sair");
        itemSair.setMnemonic('S');

        menuArquivo.add(itemNovo);
        menuArquivo.add(itemSair);

        JMenuItem itemCopiar = new JMenuItem("Copiar");
        itemCopiar.setMnemonic('C');

        menuEditar.add(itemCopiar);

        menu.add(menuArquivo);
        menu.add(menuEditar);

        setJMenuBar(menu);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Janela();
    }

}
