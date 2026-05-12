package eldoria;

/**
 * Classe que representa um Guerreiro no reino de Eldoria.
 * Herda de Personagem e implementa habilidades específicas de combate.
 */
public class Guerreiro extends Personagem {
        private double forca;
    
    public Guerreiro(String nome, int nivel, int pontosDeVida, double poderBase, double forca) {
        super(nome, "Guerreiro", nivel, pontosDeVida, poderBase);
        this.forca = forca;
    }

    public double getForca() {
        return forca;
    }

    public void setForca(double forca) {
        this.forca = forca;
    }


    @Override
    void exibirStatus() {
        System.out.println("Nome: " + getNome());
        System.out.println("Classe: " + getClasse());
        System.out.println("Nível: " + getNivel());
        System.out.println("Pontos de Vida: " + getPontosDeVida());
        System.out.println("Poder Base: " + getPoderBase());
        System.out.println("Forca: " + getForca());
        
    } 
    @Override
    public void usarHabilidade() {
         System.out.println("Habilidade: " + getNome() + " Ataque Espada Flamejante!");
    }
}

