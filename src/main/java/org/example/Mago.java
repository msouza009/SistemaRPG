package org.example;

public class Mago extends Personagem {
    private int mana;
    private int poderMagico;

    public Mago(String nome, int nivel, int hp, int atk, int def, int mana, int poderMagico) {
        super(nome, nivel, hp, atk, def);
        this.mana = mana;
        this.poderMagico = poderMagico;
    }

    public void lancarMagia(Personagem inimigo) {
        if (this.mana >= 10) {
            int dano = this.poderMagico - inimigo.def;
            if (dano > 0) {
                inimigo.receberDano(dano);
                this.mana -= 10;
                System.out.println(this.nome + " lançou magia em " + inimigo.nome + " causando " + dano + " de dano.");
            } else {
                System.out.println(this.nome + " lançou magia em " + inimigo.nome + ", mas foi ineficaz.");
            }
        } else {
            System.out.println(this.nome + " tentou lançar magia, mas não tem mana suficiente.");
        }
    }

    // Getter para mana
    public int getMana() {
        return mana;
    }
}
