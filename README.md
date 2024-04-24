# Descrição do Programa

O programa funciona da seguinte maneira:

- Os dados são todos manipulados com estrutura de arquivo JSON.
- O banco de dados foi feito com JSON, escolhido pela facilidade de manipulação.

O programa inteiro roda baseado em 2 arquivos:

1. **Arquivo "Books"**: Nele se encontram todos os tipos de manipulação de livros, empréstimos, criação, deleção de livros, etc.
2. **Arquivo "User"**: Nele se encontram todos os tipos de manipulação de criação de usuário, senha criptográfica, sistema de autenticação, etc.

Existem apenas 6 janelas:

1. **UIPainelAdm**: Painel do administrador onde estão as ferramentas do administrador.
2. **UIPainelUser**: Painel do usuário onde se encontram as ferramentas acessíveis ao usuário.
3. **UiLogin**: Janela para fazer autenticação de usuário, que identifica o usuário e chama seu respectivo painel.
4. **UIAbout**: Abre janela que mostra informações sobre o programa.
5. **UiRepassword**: Abre janela para usuário refazer sua senha.
6. **UiRegister**: Abre janela para usuário se registrar, não disponível no momento, pois usuário só pode ser cadastrado por um administrador no painel dele.

Outros arquivos são o "main" e "jpanel", que são como as janelas, mas elas são colocadas dentro dos UIPainelUser e do UIPainelAdmin de acordo com suas necessidades. 

Estes arquivos têm seus códigos derivados dos arquivos Books e Users.

Os dados dos usuários são auto-regenerativos; caso sejam excluídos, eles têm a capacidade de se reconstruírem, mas perdem suas informações.

Os dados são guardados da seguinte forma:

- Livros disponíveis (são livros que são possíveis emprestar): "books_available.json".
- Livros indisponíveis (são livros que já estão emprestados): "books_unavailable.json".
- Usuários (onde são guardados todos os dados de usuário e histórico): "users.json".

Normalmente encontrados em src/biblioteca_v_1_1/data_files/.

O programa conta com extenso (anti-usuário) que evita que usuários consigam quebrar o programa em funcionamento.
