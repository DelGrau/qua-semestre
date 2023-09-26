![[Ciclo-das-Activities.jpeg]]

# Estados de uma Atividade no Android

Uma atividade possui quatro estados:

- __Executando__: A atividade no topo da pilha está em execução ou estado ativo, o que significa que está em primeiro plano na tela.

- __Pausada__: Uma atividade que está viva, mas não está em foco, está no estado pausado. Isso pode ocorrer quando uma mensagem pop-up é exibida na atividade.

- __Reiniciada__: Quando uma atividade pausada volta a ficar ativa, ela é atualizada e reiniciada.

- __Interrompida__: Uma atividade que não está mais visível na tela está no estado interrompido.

# Métodos de Retorno de Chamada de uma Atividade Android

Uma atividade Android implementa os seguintes métodos de retorno de chamada:

- __onCreate()__: Este é o primeiro método de retorno de chamada de uma atividade Android. Ele é chamado quando a atividade é criada. É aqui que você configura todos os elementos, como botões e visualizações.

- __onStart()__: Este é o segundo método de retorno de chamada. É chamado quando a atividade fica visível na tela.

- __onResume()__: Isso é chamado após o onStart() se a atividade entrar em primeiro plano. É quando o usuário começa a interagir com a atividade.

- __onPause()__: Isso é seguido pelo onResume(). É chamado quando uma atividade anterior é retomada.

- __onStop()__: É chamado quando outra atividade é retomada e, em seguida, essa atividade não está mais visível. Ela fica oculta.

- __onDestroy()__: Este é o método de retorno de chamada final quando a atividade é finalizada.

