# Multiplicidade (Mínimo e Máximo)

0..1 - No mínimo zero e no máximo um (sem obrigatoriedade).
1..1 - Um e somente um (obrigatoriedade). 
0..* - Mínimo nenhum e máximo muitos (muitos).
1..* - Mínimo um e máximo muitos (um ou muitos).
2..7 - Mínimo duas e máximo sete instâncias se relacionam.

Cardinalidade possui conceito diferente de multiplicidade.

__Obs__: Não é obrigatório colocar no diagrama de classes.

# Associação Unária (ou Reflexiva)

Ocorre quando há um relacionamento de um objeto de uma classe com objetos da mesma classe.

![[Associação Unaria.jpeg]]

# Associação Binaria

Quando há duas classes envolvidas na associação de forma direta de uma para outra.

![[Associação Binaria.jpeg]]

``` java
public class Funcionario {
	private int matricula;
	private Dependente [] dependentes;
	// metodos
}
```

``` java
public class Dependente {
	private String nome;
	private String parentesco;
	private Funcionario funcionario;
}
```

# Agregação

Associação que tenta demonstrar as informações de um objeto-todo.
Precisam ser complementadas por informações contidas em um objeto-parte.

__Existência do objeto parte faz sentido mesmo não existindo objeto todo.__

![[Agregação.jpeg]]

# Composição 

A composição é uma variação da agregação e é considerada mais forte, ou seja, o objeto-parte não pode existir sem o objeto todo.

![[Composição.jpeg]]

# Generalização/Especialização

Basicamente, é a definição de Herança.

![[Generalização-Especialização.jpeg]]

# Dependência

Dependência entre uma classe e outra.
É diferente de uma associação porquê a conexão entre as classes é temporária.

![[Dependência.jpeg]]

__Obs__: Funcionário não instancia um automóvel, apenas usa-o como parâmetro de um método.

# Atividade

Pesquisar sobre classe intermediária, classe associativa, restrição, e interface.

## Classe Intermediaria

Substitui a Classe associativa, mas tem seus próprios atributos.

![[Classe Intermediaria.jpg]]
## Classe Associativa

É a associação entre duas classes, que é complexa o suficiente para ter propriedades de uma classe.

![[Classe Associativa.jpg]]

Fonte: [UFMG](https://homepages.dcc.ufmg.br/~amendes/GlossarioUML/glossario/conteudo/classe/classes_associativas.htm)
## Restrição

Informações extras que definem condições a serem validadas durante a implementação dos métodos.

![[Restrição.jpg]]
## Interface

