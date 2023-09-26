# Introdução

## Modelo Híbrido

- Esse modelo tem cinco camadas, partindo da camada física e subindo pelas camadas de enlace, rede e transporte, até chegar à camada de aplicação.

   5. Aplicação
   4. Transporte
   3. Rede
   2. Enlace
   1. Física

## Responsabilidades da camada física

Assegurar que os dados sejam transmitidos corretamente e de maneira confiável.

Verificar a integridade dos dados, identifica e corrige erros que possam ter ocorrido durante a transmissão e, se necessário, solicita a retransmissão dos dados.

# ...

## Unidades de medida e valores


# Teoria da Comunicação de Dados

Transmissão das informações por fios através da variação de alguma propriedade física.
- Tensão, corrente.
- Se essa variação for representada por uma função do tempo f(t) → modelo matemático do comportamento do sinal.

Análise de Fourier
- Qualquer função periódica T pode ser representada por uma soma de senos e cossenos.

Sinais limitados pela largura de banda
- Toda transmissão tem perdas.
- Em geral a perda não ocorre da mesma forma para as amplitudes de todos os harmônicos do sinal,  o que gera distorção no sinal.
- O sinal não tem atenuação dos harmônicos de 0 até uma frequência máxima FC (Frequência de Corte).
- ...

# Meios de Transmissão

O objetivo da camada física é transmitir um fluxo bruto de bits de uma máquina para outra.
- Vários meios físicos podem ser usados para realizar a transmissão real.

Quase sempre, o meio de transmissão que ocorre por um fio ou cabo físico é chamado de __Meio de Transmissão__.

Dependendo do meio várias características podem varias
- Largura de banda, retardo, custo, facilidade de instalação e manutenção

Tipos de maios de transmissão
- Guiado:
  - Fio de cobre, fibra ótica
  
- Sem Fio:
  - Radio terrestre

- Satélite
## Transmissão Guiada
### Par trançado:
  - Meio de transmissão mais antigo e comum
  - Consiste em dois fios de cobre encapados enrolados
    - O trançado reduz a interferência eletromagnética 
  - Sua aplicação mais comum é o sistema telefônico
  - Podem se estender por diversos quilômetros sem amplificação
    - Se necessário usa-se um repetidor

### Cabo Coaxial
  - Possui blindagem melhor que a do Par trançado
  - Distancias mais longas e velocidades maiores.
  - É um fio de cobre envolto por um material isolante, protegido por uma malha condutora; sendo tudo colocado dentro de uma capa plástica.

### Fibra Óptica
 - Sistema de transmissão ótica.
 - Um pulso de luz indica um bit 1, a ausência indica um bit 0.
 - Para não haver perda, a luz deve ser inserida na fibra respeitando um ângulo mínimo de incidência de modo a não haver refração e toda a luz ser refletida para dentro da fibra.

## Transmissão sem Fio

Funciona através da propagação de ondas eletromagnéticas na atmosfera.
Cada onda possui uma determinada frequência - Numero de oscilações por segundo medidas em Hertz (Hz)
O espectro eletromagnético representa toda faixa de frequências usadas para transmissão

### 