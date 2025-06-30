# CacheInMemory - Singleton Pattern em Java

Este projeto apresenta uma implementação do padrão de projeto **Singleton** com cache em memória, utilizando `synchronized` para garantir segurança em ambientes multithread.

## 📌 O que é o padrão Singleton?

O padrão Singleton garante que uma classe tenha **apenas uma instância** e fornece um **ponto global de acesso** a ela.

### Benefícios:
- Evita múltiplas instâncias desnecessárias.
- Útil para gerenciar recursos compartilhados (ex: cache, conexões, configuração).

---

## 💡 Objetivo

Implementar um cache simples em memória usando `Map<String, Object>`, garantindo que apenas uma instância do cache exista em toda a aplicação.

---