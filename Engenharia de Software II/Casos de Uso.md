
# Caso de uso: Comprar bilhete

## Ator Principal
- Passageiro

## Descrição
- O passageiro seleciona o tipo de bilhete desejado e realiza o pagamento para comprar o bilhete.

## Fluxo Principal
1.1 - O passageiro seleciona a opção "Comprar Bilhete".
1.2 - O sistema exibe opções de tipos de bilhetes e seus preços.
1.3 - O passageiro seleciona um tipo de bilhete.
1.4 - O sistema solicita informações de pagamento.
1.5 - O passageiro insere os detalhes do pagamento.
1.6 - O sistema processa o pagamento e emite o bilhete.

## Fluxo Alternativo
1.2.1 - Caso o sistema não identifique uma entrada de dados em 60 segundos, o sistema volta para a tela inicial.
1.5.1 - Caso o passageiro não insira informações obrigatórias, o sistema exibe uma mensagem solicitando as informações faltantes.
1.6.1 - Caso o sistema não consiga processar as informações de pagamento, o bilhete não é emitido.

