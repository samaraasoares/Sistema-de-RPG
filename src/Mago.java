package br.com.rpg.modelo;

public class Mago extends Personagem {

    public Mago(String nome) {
        super(nome, 80, 120, 30, 8);
    }

    @Override
    public void atacar(Personagem alvo) {
        int custoMana = 10;
        if (this.mana >= custoMana) {
            this.mana -= custoMana;
            System.out.println(this.nome + " lança uma bola de fogo!");
            int danoBase = (int) (this.ataque * 1.5);
            
            if (alvo.receberDano(danoBase)) {
                System.out.println(this.nome + " derrotou o alvo e ganhou 50 EXP!");
                this.ganharExperiencia(50);
            }
        } else {
            System.out.println("Mana insuficiente para ataque básico de Mago!");
        }
    }

    @Override
    public void usarHabilidadeEspecial(Personagem alvo) {
        int custoMana = 40;
        if (this.mana >= custoMana) {
            this.mana -= custoMana;
            System.out.println("🔥 " + this.nome + " conjura um METEORO ARCANO!");
            int danoEspecial = (int) (this.ataque * 3.0);
            alvo.receberDano(danoEspecial);
        } else {
            System.out.println("Mana insuficiente para Meteoro Arcano!");
        }
    }

    public void regenerarMana(int quantidade) {
        this.mana = Math.min(this.mana + quantidade, this.manaMaxima);
        System.out.println(this.nome + " regenerou " + quantidade + " de mana.");
    }

    @Override
    public String getTipo() {
        return "Mago";
    }
}