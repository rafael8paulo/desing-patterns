# 💡 Design Patterns em Java - Exemplos Práticos

Este repositório contém implementações reais de **Padrões de Projeto (Design Patterns)** utilizando Java, focadas em aplicações comuns em sistemas de marketplace e e-commerce.

---

## 📦 Projeto 1: CacheInMemory - Singleton Pattern
📁 Diretório: `src/main/java/br/com/rpx/designpatterns/singleton/`

### 🧩 Sobre o Singleton

O padrão **Singleton** garante que uma classe tenha **apenas uma única instância** durante toda a execução da aplicação, oferecendo um ponto global de acesso a ela.

### ✅ Vantagens

- Previne múltiplas instâncias desnecessárias.
- Ideal para recursos compartilhados (ex: cache, configurações, conexões).
- Fácil de implementar e utilizar.

### 🛠️ Objetivo

Implementar um cache simples em memória com `Map<String, Object>`, garantindo que somente **uma instância global e thread-safe** seja utilizada pela aplicação.

### 🔒 Segurança em Ambientes Concorrentes

A versão implementada utiliza `synchronized` no método `getInstance()` para garantir segurança em ambientes multithread, evitando problemas de race conditions.

---

## 🏭 Projeto 2: Serviço de Frete - Factory Method Pattern
📁 Diretório: `src/main/java/br/com/rpx/designpatterns/factorymethod/`

### 🧩 Sobre o Factory Method

O padrão **Factory Method** permite a criação de objetos sem acoplamento direto às classes concretas. Em vez disso, delega a lógica de instanciamento para uma classe fábrica.

### 🛠️ Objetivo

Selecionar dinamicamente a implementação do serviço de frete desejado (`CorreiosService`, `JadlogService`, `MelhorEnvioService`) com base na transportadora informada, utilizando `enum` como chave de seleção.

### 🚚 Transportadoras Suportadas

As transportadoras são representadas pelo `enum FreightCarrier`, que associa um `label` legível para cada opção:

```java
public enum FreightCarrier {
    CORREIOS("Correios"),
    JADLOG("JADLOG"),
    MELHORENVIO("Melhor Envio");

    // ...
}
