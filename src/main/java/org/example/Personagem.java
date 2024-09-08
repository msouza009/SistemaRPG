package org.example;

public abstract class Personagem {
    protected String nome;
    protected int nivel;
    protected int hp; // Pontos de vida
    protected int atk; // Pontos de ataque
    protected int def; // Pontos de defesa

    public Personagem(String nome, int nivel, int hp, int atk, int def) {
        this.nome = nome;
        this.nivel = nivel;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
    }

    public void atacar(Personagem inimigo) {
        int dano = this.atk - inimigo.def;
        if (dano > 0) {
            inimigo.receberDano(dano);
            System.out.println(this.nome + " atacou " + inimigo.nome + " causando " + dano + " de dano.");
        } else {
            System.out.println(this.nome + " atacou " + inimigo.nome + ", mas o ataque foi ineficaz.");
        }
    }

    public void receberDano(int dano) {
        this.hp -= dano;
        if (this.hp < 0) this.hp = 0;
        System.out.println(this.nome + " recebeu " + dano + " de dano. HP restante: " + this.hp);
    }

    public boolean estaVivo() {
        return this.hp > 0;
    }

    public void exibirStatus() {
        System.out.println("Nome: " + this.nome + " | Nível: " + this.nivel + " | HP: " + this.hp + " | ATK: " + this.atk + " | DEF: " + this.def);
    }
}
