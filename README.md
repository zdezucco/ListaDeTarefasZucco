-----------------------------------------Lista de Tarefas do Zucco------------------------------------------------------
Basicamente, o código é feito em HTML, CSS, JavaScript e JAVA, utilizando SpringBoot, Lombok e PostGres.
Este código tem a ideia principal de criar uma lista de tarefas, onde o usuário consegue adicionar as tarefas
pressionando o botão ADICIONAR e escrevendo no campo de texto o nome desta tarefa. Antes de adicionar, o usuário
consegue marcar a caixa "Está concluida?" que tem a função de deixar a nova tarefa já marcada como concluída.
Caso o usuário somente adicione a tarefa, após adicionada, a mesma aparece na tabela logo abaixo, onde podemos marcar
como concluída ou excluir a mesma.

-- Começamos nosso código pela estruturação, onde temos a pasta principal. 
- Após isso, vem as pastas src > main > java > com > fag.
- Dentro desta pasta, temos duas outras pastas MUITO importantes, onde dentro delas temos a nossa estrutura base.

-- Na pasta listadetarefasdozucco, temos algumas outras pastas muito importantes, como:
-A pasta controller:
    Onde está o arquivo "ControladorTarefa" que atua como o nosso controlador do SpringBoot para a nossa aplicação.
    Esse controlador manipula as requisições HTTP relacionada as operações CRUD que estão la no arquivo "TarefaService".
    Suas funções principais são:
        Salvar uma Nova tarefa;
        Atualizar uma tarefa;
        Encontrar uma tarefa por ID;
        Listar todas as tarefas; 
        E excluir uma tarefa.

-A pasta model:
    Onde está localizado o arquivo "Tarefa", arquivo este que representa um modelo de dados para a entidade "Tarefa" dentro
    do app. A classe é mapeada para uma tabela no banco de dados usando JPA.
    Basicamente, este arquivo representa a estrutura das entradas na tabela "Tarefa" do banco de dados.
    Utilizei o Lombok de plugin para simplificar a criação de métodos getter e setter, pra reduzir o tamanho do código.
    Dentro deste código é configurado uma geração automática do ID para ser gerenciada pelo Banco de Dados.
    Este arquivo serve como ponto de partida para a criação de instâncias de tarefas na aplicação e persistência das mesmas
    dentro do banco de dados.

-A pasta repository:
    Nesta pasta temos o arquivo "RepositorioTarefa" que representa um repositório de dados para entidade "Tarefa" dentro do App.
    Repositório este que se estende a interface "CrudRepository" do SpringData, fornecendo métodos básicos para realizar
    as operações CRUD no banco de dados.

-A pasta service:
  Temos o arquivo "TarefaService" que basicamente é responsável por se comunicar com o banco de dados por meio do "TaskRepository".
  E as operações CRUD básicas (tipo salvar, encontrar por ID, excluir e listar).

-E o arquivo listadetarefasApp:
    Arquivo este que é o que usamos para executar a nossa aplicação.
    É o arquivo base de tudo, arquivo este que é definido como principal através da linha "@SpringBootApplication".
    A partir disto, o mesmo acessa toda pasta do nosso código, dando inicio a aplicação.

-- Já na pasta resources, temos a pasta static:
- Onde temos o arquivo "index.html" onde temos todo FrontEnd do código, utilizando o STYLE para podermos alterar
- algumas informações visuais da tela, tipo, espaçamento entre os botões, a cor dos botões e etc.
- Dentro da tag "body" temos os botões, a tabela, os inputs (tipo a caixa de texto) e as demais informações.
- E dentro da tag "script" temos todo nosso JavaScript onde temos as nossas funções, sendo elas:
    adicionarTarefa(); **Responsável por criar uma nova tarefa**
    atualizarTabelaTarefas();  **Atualiza a tabela de tarefas chamando a API de backend para obter a lista atualizada.**
    marcarTarefaComoConcluida();  **Marca uma tarefa como concluída.**
    excluirTarefa();  **Exclui uma tarefa.**
    criarBotaoExcluir(); **Cria um botão "Excluir" para cada tarefa na tabela.**
    atualizarTabelaTarefas(). **Atualiza a tabela de tarefas ao inicializar a página.**
- 
-- E ainda dentro da Resources, temos o arquivo application.properties:
- Onde temos algumas informações referente ao acesso ao banco de dados.

