
Desafio: Uso de Optional no Java 8
Neste desafio, você aplicará conceitos do Optional do Java 8 para criar um sistema simples de gerenciamento de usuários, simulando um repositório de banco de dados em memória.

Objetivo
Implementar funcionalidades para buscar, salvar e manipular dados de usuários, utilizando Optional para lidar com valores ausentes de maneira segura e elegante.

Requisitos
1. Classe Usuario
   Crie uma classe chamada Usuario com os seguintes atributos:

id (Integer)
nome (String)
email (String)
Implemente:

Um construtor para inicializar os atributos.
Métodos getter para os atributos.
O método toString() para exibir os detalhes do usuário.
2. Classe UsuarioRepository
   Crie um repositório que simule um banco de dados em memória. Utilize um Map<Integer, Usuario> para armazenar os usuários.

Implemente os seguintes métodos:

Optional<Usuario> findById(Integer id)
Retorna o usuário correspondente ao ID, ou um Optional.empty() se o ID não existir.

Optional<Usuario> findByEmail(String email)
Busca usuários pelo email e retorna um Optional<Usuario>. Caso não encontre, retorne Optional.empty().

void save(Usuario usuario)
Adiciona um novo usuário ao repositório.

3. Regras de Negócio
   Implemente as seguintes funcionalidades no método principal (main):

Buscar Usuário por ID

Se o usuário for encontrado, exiba uma mensagem com os detalhes do usuário.
Caso contrário, exiba uma mensagem indicando que o usuário não foi encontrado.
Buscar Usuário por Email

Se o usuário for encontrado, exiba uma mensagem com os detalhes do usuário.
Caso contrário, exiba uma mensagem indicando que nenhum usuário foi encontrado.
Uso de ifPresent

Utilize o método ifPresent para executar uma ação quando o usuário existir no repositório.
Uso de orElse

Retorne uma mensagem padrão ou um valor alternativo caso o Optional esteja vazio.
Uso de orElseThrow

Lance uma exceção personalizada se o usuário não for encontrado por ID.
Exemplo de Saída
Cenários Testados
Usuário encontrado por ID:

less
Copy
Edit
Usuário encontrado: João (Email: joao@example.com)
Usuário não encontrado por ID:

Copy
Edit
Usuário com ID 99 não encontrado.
Usuário encontrado por Email:

less
Copy
Edit
Usuário encontrado: Maria (Email: maria@example.com)
Usuário não encontrado por Email:

graphql
Copy
Edit
Nenhum usuário encontrado com o email: naoexiste@example.com
Exceção lançada com orElseThrow:

arduino
Copy
Edit
Exception in thread "main" java.lang.IllegalArgumentException: Usuário não encontrado com ID 100
Desafios Adicionais (Opcional)
Adicionar Novos Métodos

Adicione métodos para buscar usuários com base em outros critérios, como nome ou um intervalo de IDs.
Testes Automatizados

Escreva testes unitários para validar os métodos utilizando JUnit.
Estender o Repositório

Implemente um método para atualizar usuários existentes no repositório.
