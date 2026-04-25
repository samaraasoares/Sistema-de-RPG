package br.com.rpg.modelo;

public class Arqueiro extends Personagem {
    private int flechas;

    public Arqueiro(String nome) {
        super(nome, 100, 50, 28, 12);
        this.flechas = 30;
    }

    @Override
    public void atacar(Personagem alvo) {
        if (this.flechas > 0) {
            this.flechas--;
            System.out.println(this.nome + " dispara uma flecha certeira!");
            int danoBase = (int) (this.ataque * 1.3);
            
            if (alvo.receberDano(danoBase)) {
                System.out.println(this.nome + " derrotou o alvo e ganhou 50 EXP!");
                this.ganharExperiencia(50);
            }
        } else {
            System.out.println(this.nome + " está sem flechas!");
        }
    }

    @Override
    public void usarHabilidadeEspecial(Personagem alvo) {
        int custoMana = 15;
        int custoFlechas = 5;
        
        if (this.mana >= custoMana && this.flechas >= custoFlechas) {
            this.mana -= custoMana;
            this.flechas -= custoFlechas;
            System.out.println("🏹 " + this.nome + " usa CHUVA DE FLECHAS!");
            int danoEspecial = (int) (this.ataque * 2.0);
            alvo.receberDano(danoEspecial);
        } else {
            System.out.println("Recursos insuficientes (mana ou flechas) para Chuva de Flechas!");
        }
    }

    public void recarregarFlechas(int quantidade) {
        this.flechas += quantidade;
        System.out.println(this.nome + " recarregou " + quantidade + " flechas.");
    }

    @Override
    public String getTipo() {
        return "Arqueiro";
    }
}