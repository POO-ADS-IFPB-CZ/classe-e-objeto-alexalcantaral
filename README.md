[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/4j22Em04)

<h3>1- Escreva um modelo para representar uma lâmpada que está à venda em
um supermercado. Que dados devem ser representados por esse modelo?</h3>
<p> 
    codigoProduto (String ou Inteiro): Código único que identifica a lâmpada no sistema do supermercado.<br>
    estoqueDisponivel (Inteiro): Quantidade disponível no estoque.<br>
    marca (String): Marca da lâmpada.<br>
    potencia (Float): Potência em watts (W).<br>
    corLuz (String): Cor da luz emitida (ex.: branca, amarela).<br>
    vidaUtil (Inteiro): Vida útil em horas.<br>
    peso (Float): Peso em gramas (g).
</p>

<h3>7- Identifique e explique o(s) erro(s) na classe abaixo:</h3>
<p>O primeiro erro que notei foi a declaração da classe com espaçamentos entre as palavras, o outro é o não encapsulamento das variáveis dentro da classe. O tipo int pode ser apropriado para tituloDeEleitor, mas dependendo do número de dígitos, pode ser necessário mudar para String, já que números com zeros à esquerda não são armazenados corretamente como int.</p>

<h3>8- Identifique e explique o(s) erro(s) na classe abaixo:</h3>
<p>Um dos primeiros erros que notei foi na instânciação do método maior, onde foi definido o tipo como int e não como boolean, também tem o erro no método menor, onde ele foi definido como void e ainda assim foi colocado para retornar algum valor. Outro ponto agora mais focado na parte de OO é que os campos num1 e num2 não foram encapsulados(public ou private ...)</p>

<h3>14- Qual a importância de usar o encapsulamento na definição de classes? Exemplifique.</h3>
<p>O encapsulamento é a propriedade de implementar dados e procedimentos correlacionados em uma mesma entidade e de proteger sua estrutura
interna, escondendo-a de observadores externos. O encapsulamento é implementado através dos modificadores de acesso. São eles: public, private, protected e default.<br>
Seus principais benefícios são:<br>
• possibilidade de alterar a implementação de um método ou a estrutura
de dados escondidos de um objeto sem afetar as aplicações que dele se
utilizam;<br>
• criação de programas mais modulares e organizados, o que possibilita
um melhor reaproveitamento do código e melhor manutenibilidade da
aplicação</p>
