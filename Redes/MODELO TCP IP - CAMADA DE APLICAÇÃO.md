# Integrantes do grupo:  

- Alan Henrique Ribeiro: 00233006
- Adrian Lucas Toderke: 00230994


# Sobre o Modelo

O Modelo TCP/IP possui funções divididas em camadas.

- A camada de Aplicação é o topo da arquitetura TCP/IP, nela onde é realizada a maior parte das requisições para a execução de tarefas na rede.  

- Ela é responsável pela comunicação entre os programas e os protocolos de transporte, relacionando os serviços de comunicação e a interação junto ao usuário.  
   
- Ela interage com as demais camadas do modelo TCP/IP de forma que na camada de transporte, ambos são responsáveis por Iniciar, Gerenciar e Encerrar as conexões de rede. Na camada de Internet, ambos fazem o endereçamento IP, que identifica os dispositivos finais. Porém, ela não interage diretamente com a camada de Enlace e Física, pois trabalha com dados de alto nível.


# Protocolos

Dentro da camada de aplicação são utilizados os seguintes protocolos:

- __[[TELNET]]__ (Terminal Virtual);
  - Responsável pela comunicação entre controles remotos de dispositivos em uma rede.
  - Permite que um computador se comunique com outros, mesmo não estando conectados.
  
- __[[FTP]]__ (File Transfer Protocol); 
  - Responsável pelo envio de arquivos entre computadores em uma mesma rede, permite que o usuário copie informações de um computador e cole em outro. 
  - É Bastante usado para fazer upload e download de arquivos para servidores web ou outros servidores de armazenamento.
  
- __[[SMTP]]__ (Send Mail Transfer Protocol):
  - É o protocolo responsável pelo envio de e-mails na internet.
  - Ele define as regras e os formatos para a transferência de mensagens de e-mail entre servidores. 
  - Ao enviar um e-mail, o servidor de e-mail do remetente utiliza o SMTP para encaminhar a mensagem para o servidor de e-mail do destinatário.

- __[[DNS]]__ (Domain Name System):
  - Ele é responsável por “traduzir” o nome dos domínios em endereços IP, permitindo que os computadores localizem e acessem recursos na internet.
  - Em vez de memorizar números IP 's para busca de site, ele “traduz” o nome para facilitar a busca. 

- __[[HTTP]]__ (Hypertext Transfer Protocol):
  - Responsável pela transferência de conteúdo.   
  - Ele permite que o usuário ao entrar em um endereço web tenha acesso a ver os conteúdos e dados presentes nela.


# Desafios - Desvantagens

O principal desafio que encontramos com o uso desse modelo, é no quesito de Segurança e Privacidade, onde lidamos diretamente com dados e informações transmitidos entre aplicações. Tornando-os vulneráveis a ameaças de segurança.

E no mesmo sentido, uma das principais desvantagens é que ela não oferece mecanismos integrados de segurança, o que pode deixar as comunicações vulneráveis a ameaças e ataques.

Além disso, a diversidade de protocolos na camada de aplicação pode levar a problemas de integração entre diferentes sistemas e aplicações.


# Como seria uma falha na camada de aplicação?

Uma falha nessa camada, poderia ter um efeito cascata nas demais, resultando em problemas de comunicação, atrasos, perda de dados e perda de informações. 


# Essa camada pode ser menos relevante ou substituída?

Sim, pode. Mesmo sendo a camada de mais alto nível, dependendo da situação ela pode ser menos relevante e/ou substituível, como por exemplo na parte da infraestrutura crítica da rede, onde o foco é na troca eficiente de dados e que não requerem interações complexas entre diferentes tipos de aplicações.