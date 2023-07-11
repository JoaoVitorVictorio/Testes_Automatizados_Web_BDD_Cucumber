#language: pt
Funcionalidade: Cadastrar contas com sucesso

  @execute
  Cenário: Apagar dados existentes
    Dado que esteja acessando a aplicação
    E que informe o usuário correto
    E a senha correta
    E clique em entrar
    E esteja na tela inicial
    Quando clicar no botão reset
    Então os dados serao resetados com sucesso

  @execute
  Cenário: Deve inserir uma conta com sucesso
    Dado que esteja acessando a aplicação
    E que informe o usuário correto
    E a senha correta
    E clique em entrar
    E esteja na tela inicial
    E clique em contas
    E clique em adicionar
    E informe a conta "Conta de teste"
    Quando clicar em Salvar
    Então a conta será salva com sucesso

  @execute
  Cenário: Deve falhar inserir conta com mesmo nome
    Dado que esteja acessando a aplicação
    E que informe o usuário correto
    E a senha correta
    E clique em entrar
    E esteja na tela inicial
    E clique em contas
    E clique em adicionar
    E informe a conta "Conta de teste"
    Quando clicar em Salvar
    Então devera ser exibido a mensagem que já existe uma conta com o mesmo nome
