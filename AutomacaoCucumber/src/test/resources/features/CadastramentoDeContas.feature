#language: pt
@execute
Funcionalidade: Cadastrar contas com sucesso

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
