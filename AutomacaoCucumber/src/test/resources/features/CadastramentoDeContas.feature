#language: pt


Funcionalidade: Cadastrar contas com sucesso

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
	E clique em Salvar
	Então a conta será salva com sucesso

Cenário: Não deve permitir inserir uma conta sem nome
	Dado que esteja acessando a aplicação
	E que informe o usuário correto
	E a senha correta
	E clique em entrar
	E esteja na tela inicial
	E clique em contas
	E clique em adicionar
	E clique em Salvar
	Então será notificado que o preenchimento da conta é obrigatório

Cenário: Não deve inserir uma conta com nome já existente
	Dado que esteja acessando a aplicação
	E que informe o usuário correto
	E a senha correta
	E clique em entrar
	E esteja na tela inicial
	E clique em contas
	E clique em adicionar
	E informe a conta "Conta de teste"
	E clique em Salvar
	Então será notificado que já existe uma conta com o mesmo nome