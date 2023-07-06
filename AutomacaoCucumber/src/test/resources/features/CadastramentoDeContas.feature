#language: pt


Funcionalidade: Cadastrar contas com sucesso

@execute
Cenário: Deve inserir uma conta com sucesso
	Dado que esteja acessando a aplicação
	Quando informar o usuário correto
	E a senha correta
	E clicar em entrar
	E estiver na tela inicial
	E clicar em contas
	E clicar em adicionar
	E informar a conta "Conta de teste"
	E clicar em Salvar
	Então a conta será inserida será salva com sucesso

Cenário: Não deve permitir inserir uma conta sem nome
	Dado que está acessando a aplicação
	Quando informar o usuário correto
	E a senha correta
	E clicar em entrar
	E visualizara a tela inicial
	Quando selecionar contas
	E clicar em adicionar
	E clicar em Salvar
	Então será notificado que o preenchimento da contá é obrigatório

Cenário: Não deve inserir uma conta com nome já existente
	Dado que está acessando a aplicação
	Quando informar o usuário correto
	E a senha correta
	E clicar em entrar
	Então visualizara a tela inicial
	Quando selecionar contas
	E clicar em adicionar
	E informar a conta "Conta de Teste"
	E clicar em Salvar
	Então será notificado que já existe uma conta com este nome