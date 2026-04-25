import java.util.ArrayList;
import java.util.Random;

public class JogoRPG {
    public static void main(String[] args) {
        Personagem g1 = new Guerreiro("Aragorn");
        Personagem m1 = new Mago("Gandalf");
        Personagem a1 = new Arqueiro("Legolas");

        ArrayList<Personagem> grupo = new ArrayList<>();
        grupo.add(g1);
        grupo.add(m1);
        grupo.add(a1);

        exibirTitulo("STATUS DO GRUPO");
        for (Personagem p : grupo) {
            p.exibirStatus();
        }

        exibirTitulo("HABILIDADES ESPECIAIS");
        g1.usarHabilidade(m1);
        m1.usarHabilidade(a1);
        a1.usarHabilidade(g1);

        if (m1 instanceof Mago) ((Mago) m1).regenerarMana();
        if (a1 instanceof Arqueiro) ((Arqueiro) a1).recarregarFlechas(10);

        exibirTitulo("EVOLUÇÃO");
        for (Personagem p : grupo) {
            p.ganharExperiencia(150); // Deve demonstrar o Level Up
        }

        exibirTitulo("DUELO: GUERREIRO VS MAGO");
        realizarBatalha(g1, m1);

        exibirTitulo("GRANDE TORNEIO");
        ArrayList<Personagem> competidores = new ArrayList<>();
        competidores.add(new Guerreiro("Thorin"));
        competidores.add(new Mago("Saruman"));
        competidores.add(new Arqueiro("Robin Hood"));
        competidores.add(new Guerreiro("Lancelot"));

        Personagem campeao = realizarTorneio(competidores);
        System.out.println("\n🏆 O CAMPEÃO DO TORNEIO É: " + campeao.getNome() + "!");
    }

    static void exibirTitulo(String titulo) {
        System.out.println("\n╔" + "═".repeat(30) + "╗");
        System.out.printf("║ %-28s ║%n", titulo);
        System.out.println("╚" + "═".repeat(30) + "╝");
    }

    static void realizarBatalha(Personagem p1, Personagem p2) {
        while (p1.isVivo() && p2.isVivo()) {
            p1.atacar(p2);
            if (p2.isVivo()) p2.atacar(p1);
        }
        Personagem vencedor = p1.isVivo() ? p1 : p2;
        System.out.println("⚔️ Fim de combate! Vencedor: " + vencedor.getNome());
    }

    static Personagem realizarTorneio(ArrayList<Personagem> competidores) {

        System.out.println("--- Semifinal 1 ---");
        realizarBatalha(competidores.get(0), competidores.get(1));
        Personagem v1 = competidores.get(0).isVivo() ? competidores.get(0) : competidores.get(1);

        System.out.println("\n--- Semifinal 2 ---");
        realizarBatalha(competidores.get(2), competidores.get(3));
        Personagem v2 = competidores.get(2).isVivo() ? competidores.get(2) : competidores.get(3);

        System.out.println("\n--- FINAL DO TORNEIO ---");
        realizarBatalha(v1, v2);
        return v1.isVivo() ? v1 : v2;
    }
}