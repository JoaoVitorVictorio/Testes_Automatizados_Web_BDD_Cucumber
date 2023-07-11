#language: pt

@funcional
Funcionalidade: Cadastrar contas com sucesso

  Contexto: 
    Dado que esteja acessando a aplicação
    E que informe o usuário correto
    E a senha correta
    E clique em entrar
    E esteja na tela inicial
    E clique em contas
    E clique em adicionar

  Esquema do Cenário: Deve validar regras cadastro contas
    E informe a conta "<conta>"
    Quando clicar em Salvar
    Então sera exibido a mensagem: "<mensagem>"

    
   Exemplos:
   |      conta     |              mensagem              |
   | Conta de teste |   Conta adicionada com sucesso!    |
   |                |      Informe o nome da conta       |
   | Conta de teste | Já existe uma conta com esse nome! |