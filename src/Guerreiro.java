package br.com.rpg.modelo;

public class Guerreiro extends Personagem {
    
    public Guerreiro(String nome) {
        super(nome, 150, 30, 25, 20);
    }

    @Override 
    public void atacar(Personagem alvo) {
        System.out.println(this.nome + " desfere um golpe poderoso!");
        int danoBase = (int) (this.ataque * 1.2);

        if (alvo.receberDano(danoBase)) {
            System.out.println(this.nome + " derrotou o alvo e ganhou 50 XP!");
            this.ganharExperiencia(50);
        }
    }

    @Override
    public void usarHabilidadeEspecial(Personagem alvo) {
        int custoMana = 20;
        if (this.mana >= custoMana) {
            this.mana -= custoMana;
            System.out.println("⚔️ " + this.nome + " usa INVESTIDA FURIOSA!");
            int danoEspecial = (int) (this.ataque * 2.5);
            
            alvo.receberDano(danoEspecial); 
            
        } else {
            System.out.println("Mana insuficiente!");
        }
    }
    
    @Override

    public String getTipo() {
        return "Guerreiro";
    }
}