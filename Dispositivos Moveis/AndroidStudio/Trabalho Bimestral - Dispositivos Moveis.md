# Trabalho

Uma loja de departamentos necessita de uma aplicativo para seus vendedores
utilizarem para cadastrar suas vendas, onde possam já fazer pedido da venda e repassar
para o cliente. Para isso é necessário possuir as seguintes funcionalidades:

1.   Possuir uma tela para cadastrar Cliente contendo os campos para informar o nome e         CPF do cliente.
2.   Possuir uma tela para cadastrar itens de venda, contendo o código, a descrição e valor       unitário.
3.   Criar uma tela para lançamento do pedido.
4.   Na tela de pedido, deverá ser capaz de selecionar o cliente.
5.   Deverá selecionar o item de venda e campos para informar a quantidade e valor unitário   (essa informação deverá ser retornado junto com o item selecionado), e um botão para     adicionar o item no pedido.
6.   Uma lista utilizando para exibir os itens adicionados ao pedido.
7.   Um campo informando o valor total e total de itens adicionados.
8.   Abaixo da lista um campo para informar a condição de pagamento (á vista ou á prazo).
9.   Caso selecionado a prazo, deverá exibir um campo para informar a quantidade de              parcelas, e abaixo uma lista informando o valor de cada parcela.
10. Um campo para exibir o valor total do pedido, onde para vendas a vista deverá ter um desconto de 5% no valor total, e a prazo adicionar o acréscimo de 5% no valor total.
11. Um botão para concluir o pedido, exibindo uma mensagem informando que o pedido de venda foi cadastrado com sucesso.

# Características Técnicas

1. Para cada processo deverá validar se o campos digitados não estão nulos;
2. Validar campo de valores para não deixar adicionar valores < = 0 (zero);
3. Deverá ter um campo para gerar o código do pedido, ao digitar o código do
pedido deverá ser capaz de retornar as informações do pedido em questão;
4. Código do pedido deve ser gerado automaticamente;
5. Ao concluir o pedido deverá ser exibido uma mensagem informando que o
pedido foi cadastrado com sucesso exibindo o número do pedido (Toast);
6. Ao concluir o pedido todos os campos deverão ser "limpos", e gerado um novo
código de pedido.
7. As listas devem ser utilizados TextView (concatenar string com \n para quebrar
linhas);
8. Por fim, o aplicativo deve ser projetado utilizando os componentes vistos em
sala com uma interface de usuário atraente e intuitiva, seguindo as diretrizes
de design de material do Android, e ser responsivo em diferentes tamanhos de
tela.

# Lista de Itens a Fazer

- [x] Tela para cadastrar cliente.
	- [x] Informar nome
	- [x] Informar CPF

- [ ] Tela para cadastrar itens a venda
	- [ ] Código
	- [ ] Descrição
	- [ ] Valor unitário

- [ ] Tela para Lançamento do Pedido
	- [ ] Selecionar cliente
	- [ ] Selecionar item de venda
		- [ ] Campo quantidade
		- [ ] Campo valor
		- [ ] Botão adicionar ao pedido
	- [ ] Lista de itens adicionados ao Pedido
	- [ ] Campo de valor total
	- [ ] Campo de Total de Itens
	- [ ] Campo para Informar condição de pagamento
		- [ ] À prazo - Campo para informar quantidade de parcelas
		- [ ] À prazo - Lista com a quantidade de parcelas