document.addEventListener('DOMContentLoaded', function() {
    const form = document.getElementById('taskForm');

    function atualizaListaTarefas() {
        // Atualizar a lista de tarefas na página
        fetch("http://localhost:8080/tarefas")
        .then(response => {
            if (!response.ok) {
                throw new Error('Erro ao obter lista de tarefas');
            }

            // Verificar se a resposta não está vazia antes de tentar analisar como JSON
            if (response.status === 204) { // Código de resposta 204 significa "No Content" (sem conteúdo)
                return [];
            }
            return response.json();
        })
        .then(data => {
            const taskList = document.getElementById('listaTarefas');
            taskList.innerHTML = '';

            data.forEach(task => {
                const listItem = document.createElement('li');
                listItem.textContent = task.tarefa;

                const completeButton = document.createElement('button');
                completeButton.textContent = 'Marcar como Concluído';
                completeButton.addEventListener('click', function() {
                    marcaCompletado(task.id);
                });

                const deleteButton = document.createElement('button');
                deleteButton.textContent = 'Excluir';
                deleteButton.addEventListener('click', function() {
                    deletaTarefa(task.id);
                });

                listItem.appendChild(completeButton);
                listItem.appendChild(deleteButton);

                taskList.appendChild(listItem);
            });
        })
        .catch(error => {
            console.error('Erro ao obter lista de tarefas:', error);
        });
    }

    function marcaCompletado(tarefaId) {
        // Marcar a tarefa como concluída no servidor usando uma requisição AJAX
        fetch('/complete/' + tarefaId, {
            method: 'GET',
        })
        .then(response => response.json())
        .then(data => {
            // Atualizar a lista de tarefas na página
            atualizaListaTarefas();
        })
        .catch(error => {
            console.error('Erro ao marcar como concluída:', error);
        });
    }

    function deletaTarefa(tarefaId) {
        // Excluir a tarefa no servidor usando uma requisição AJAX
        fetch('/delete/' + tarefaId, {
            method: 'GET',
        })
        .then(response => response.json())
        .then(data => {
            // Atualizar a lista de tarefas na página
            atualizaListaTarefas();
        })
        .catch(error => {
            console.error('Erro ao excluir tarefa:', error);
        });
    }

    // Inicializar a lista de tarefas na página
    atualizaListaTarefas();
}); // Fechamento da função passada para addEventListener('DOMContentLoaded', function() {...});
