# Desafio: Uso de `Optional` no Java 8

Neste desafio, você aplicará conceitos do **`Optional`** do Java 8 para criar um sistema simples de gerenciamento de usuários.

---

## 🎯 Objetivo

Implementar funcionalidades para buscar, salvar e manipular dados de usuários, utilizando `Optional` para lidar com valores ausentes de maneira segura e elegante.

---

## 📋 Requisitos

### 1️⃣ **Classe `Usuario`**

Crie uma classe chamada `Usuario` com os seguintes atributos:

- `id` (Integer)
- `nome` (String)
- `email` (String)

Implemente:
- Um **construtor** para inicializar os atributos.
- Métodos **getter** para os atributos.
- O método `toString()` para exibir os detalhes do usuário.

---

### 2️⃣ **Classe `UsuarioRepository`**

Crie um repositório que simule um banco de dados em memória. Utilize um `Map<Integer, Usuario>` para armazenar os usuários.

Implemente os seguintes métodos:

- **`Optional<Usuario> findById(Integer id)`**  
  Retorna o usuário correspondente ao ID, ou um `Optional.empty()` se o ID não existir.

- **`Optional<Usuario> findByEmail(String email)`**  
  Busca usuários pelo email e retorna um `Optional<Usuario>`. Caso não encontre, retorne `Optional.empty()`.

- **`void save(Usuario usuario)`**  
  Adiciona um novo usuário ao repositório.

---

## 🛠️ Funcionalidades para Implementar

1️⃣ **Buscar Usuário por ID**  
   - Se o usuário for encontrado, exiba uma mensagem com os detalhes do usuário.  
   - Caso contrário, exiba uma mensagem indicando que o usuário não foi encontrado.

2️⃣ **Buscar Usuário por Email**  
   - Se o usuário for encontrado, exiba uma mensagem com os detalhes do usuário.  
   - Caso contrário, exiba uma mensagem indicando que nenhum usuário foi encontrado.

3️⃣ **Uso de `ifPresent`**  
   - Utilize o método `ifPresent` para executar uma ação quando o usuário existir no repositório.

4️⃣ **Uso de `orElse`**  
   - Retorne uma mensagem padrão ou um valor alternativo caso o `Optional` esteja vazio.

5️⃣ **Uso de `orElseThrow`**  
   - Lance uma exceção personalizada se o usuário não for encontrado por ID.

---

## ✅ Exemplo de Saída

### Cenários Testados:

1️⃣ **Usuário encontrado por ID:**  
Usuário encontrado: João (Email: joao@example.com)

2️⃣ **Usuário não encontrado por ID:**  
Usuário com ID 99 não encontrado.

3️⃣ **Usuário encontrado por Email:**  
Usuário encontrado: Maria (Email: maria@example.com)

4️⃣ **Usuário não encontrado por Email:**  
Nenhum usuário encontrado com o email: naoexiste@example.com

5️⃣ **Exceção lançada com `orElseThrow`:**  
Exception in thread "main" java.lang.IllegalArgumentException: Usuário não encontrado com ID 100
