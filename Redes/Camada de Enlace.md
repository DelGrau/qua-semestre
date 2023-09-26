# Serviços da camada de enlace

## Enquadramento, acesso ao enlace

- Encapsula datagrama no quadro, incluindo cabeçalho, trailer
- acesso ao canal de meio compartilhado
- endereços "MAC" usados nos cabeçalhos de quadro para identificar origem, destino
  - __diferente de endereço IP!__

## Entrega confiável entre nós adjacentes

- raramente usado em enlace com pouco erro de bit
- enlaces sem fio: altas taxas de erro

## Controle de fluxo

- controle entre nós de emissão e recepçao adjacentes

## Detecção de Erro

- erros causados por atenuação de sinal, ruído
- receptor detecta presença de erros
  - pede ao remetente para retransmitir ou descarta quadro

## Correção de erro

- receptor identifica e corrige erro(s) de bit sem lançar mão da retransmissão

## Half-duplex e full-duplex

- com half-duplex, os nós nas duas extremidades do enlace pode transmitir ou ouvir

# Onde é implementada a camada de enlace?

Em todo e qualquer hosp.
Camada de enlace implementada no "adaptador" (ou placa de interface de rede, NIC)
 - placa Ethernet, placa PCMCI, placa 802.11
 - implementa camada de enlace, física

Conecta barramentos de sistema do hospedeiro.
Combinação de Hardware, software, firmware.

# Comunicação entre adaptadores

## Lado emissor
- encapsula datagrama no quadro
- inclui bits de verificação de erro, rdt, controle de fluxo, etc

## Lado receptor
- procura erros, rdt, controle de fluxo...

# Endereçamento MAC e ARP

## Endereço IP de 32 bits:
- Endereço da camada de rede
- usado para obter datagrama até sub-rede IP de destino

## Endereço MAC (ou LAN ou físico ou Ethernet):
- função: __levar quadro de uma interface para outra interface conectada fisicamente (na mesma rede)__
- Endereço MAC de 48 bits (para maioria das LANs)
  - queimada na ROM da NIC, às vezes também configurável por software
  - Exemplo: 00:1B:44:11:3A:B7
    - Hexadecimal

