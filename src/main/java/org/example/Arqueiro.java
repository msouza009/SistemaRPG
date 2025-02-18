package org.example;

public class Arqueiro extends Personagem {
    private int precisao;
    private int alcance;

    public Arqueiro(String nome, int nivel, int hp, int atk, int def, int precisao, int alcance) {
        super(nome, nivel, hp, atk, def);
        this.precisao = precisao;
        this.alcance = alcance;
    }

    public void atirarFlecha(Personagem inimigo) {
        int dano = (this.atk + this.precisao) - inimigo.def;
        if (dano > 0) {
            inimigo.receberDano(dano);
            System.out.println(this.nome + " atirou uma flecha em " + inimigo.nome + " causando " + dano + " de dano.");
        } else {
            System.out.println(this.nome + " atirou uma flecha em " + inimigo.nome + ", mas o ataque foi ineficaz.");
        }
    }
}
