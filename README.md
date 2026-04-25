# Legends of Java - Sistema de RPG em Java

## Descrição do Projeto

O **Legends of Java** é um sistema de RPG desenvolvido em Java com o objetivo de aplicar os principais conceitos de **Programação Orientada a Objetos (POO)**.

O sistema permite a criação de personagens com diferentes classes, batalhas entre eles e um torneio eliminatório, simulando mecânicas básicas de jogos RPG.

---

## Objetivos

Este projeto foi desenvolvido com foco em:

* Aplicar conceitos de POO na prática
* Simular um sistema de combate entre personagens
* Trabalhar em equipe com divisão de responsabilidades
* Desenvolver código limpo, organizado e reutilizável

---

## Conceitos de POO Aplicados

* Classes e Objetos
* Encapsulamento
* Herança
* Polimorfismo
* Classes Abstratas
* Métodos Abstratos
* Sobrescrita de Métodos (`@Override`)
* Construtores
* Uso de `ArrayList`

---

## 🧝 Classes do Sistema

### 🔹 Personagem (Classe Abstrata)

Classe base que define atributos e comportamentos comuns a todos os personagens.

**Principais funcionalidades:**

* Sistema de vida e mana
* Recebimento de dano
* Cura
* Sistema de experiência e level up
* Métodos abstratos para ataque e habilidades

---

### Guerreiro

* Alta vida e defesa
* Ataque físico forte
* Habilidade especial: **Investida Furiosa**

---

### Mago

* Alta mana e dano mágico
* Baixa defesa
* Habilidade especial: **Meteoro Arcano**
* Método exclusivo: regeneração de mana

---

### Arqueiro

* Ataque balanceado
* Uso de flechas como recurso
* Habilidade especial: **Chuva de Flechas**
* Método exclusivo: recarregar flechas

---

### Arena

Responsável por toda a lógica de combate:

* Batalhas entre dois personagens
* Sistema de turnos
* Determinação do vencedor
* Torneio eliminatório

---

### JogoRPG (Main)

Classe principal responsável por:

* Criar os personagens
* Demonstrar polimorfismo
* Executar batalhas
* Iniciar torneios

---

## Funcionalidades

* ✔ Sistema de combate entre personagens
* ✔ Habilidades especiais únicas por classe
* ✔ Sistema de experiência e evolução de nível
* ✔ Gerenciamento de recursos (vida, mana, flechas)
* ✔ Batalhas individuais
* ✔ Torneio eliminatório
* ✔ Exibição de status dos personagens

---

