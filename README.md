# Abcontrol | Spring Boot | Aplicação Web

Projeto para desenvolvimento de uma aplicação web com a utilização de Spring Boot, Spring MVC e Materialize para a disciplina de Desenvolvimento de Software II Unisinos-2018.

_ABControl é um software que irá auxiliar no controle de tarefa, recursos humanos, prazos, materiais, orçamento, estoque e qualidade para uma empresa chamada Construtora ABC que é uma companhia que presta serviços no ramo da construção civil. O software visa melhorar a comunicação com clientes e fornecedores, e melhorar o acesso à informação dos projetos._

Em um primeiro momento realizamos a construção de uma documentação para o projeto, com a utilização de vários ferramentas de documentação para construção de sistemas, como documento de requisitos funcionais e não funcionais, diagrama de modelo de casos de uso, casos de usos completos do sistema, diagrama de domínio, diagrama de classes, diagrama de atividades, diagrama de sequência, diagrama de componentes, etc. 

Os casos de uso que foram desenvolvidos no trabalho foram:
- UC_011 - Caso de uso Manter Projetos
- UC_007 - Caso de uso Manter Ferramentas e Materiais

### Recursos utilizados

- Spring Boot
- Spring MVC 
- Materialize Frontend

### Prints da aplicação

- UC_011 - Caso de uso Manter Projetos  

![UC_011 - Caso de uso Manter Projetos](readme_images/Caso-de-uso-Manter-projetos.png)

- UC_007 - Caso de uso Manter Ferramentas e Materiais 

![UC_011 - Caso de uso Manter Materiais](readme_images/Caso-de-uso-Manter-materiais.png)


------------------------------------------------------------------------------------------------------------------

### Como configurar o ambiente:

- Faça clone do projeto;
- Importe o projeto para sua IDE de preferência, via pom (Maven).  

### Para fazer os testes dos casos de uso em funcionamento:

- Testes CRUD Manter Projetos:  
Acessar o link `http://localhost:8080/projeto/todosProjetos`, que é o menu Projetos, e o CRUD está disponível na página;
      
- Testes CRUD Manter Ferramentas e Materiais:  
Acessar o link`http://localhost:3000/material/todosMateriais`, que é o menu Ferramentas e Materiais, e o CRUD está disponível na página.
