# language: pt

@unitarios
Funcionalidade: Relizar contagem corretamente


Cenário: Deve realizar contagem corretamente
		Dado que o valor do contador é 15
		Quando eu adicionar + 3
		Então o valor do contador deve ser 18
		

Cenário: Deve realizar contagem corretamente
		Dado que o valor do contador é 10
		Quando eu adicionar + 2
		Então o valor do contador deve ser 12