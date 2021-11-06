# exerciciospoo
Resolução de questões da turma de Programação Orientada a Objetos/UERN 2021
Livro Introdução a Programação Orientada a Objetos por Rafael Santos

7. Uma das operações que podemos efetuar com datas é a comparação para ver se uma data ocorre
antes de outra. O algoritmo para comparação é muito simples, e seus passos estão abaixo. Nesse
algoritmo, consideramos que dia1, mês1 e ano1 são os dados da primeira data, e que dia2, mês2 e
ano2 são os dados da segunda data.
1. Se ano1 < ano2 a primeira data vem antes da segunda.
2. Se ano1 > ano2 a primeira data vem depois da segunda.
3. Se ano1 == ano2 e mês1 < mês2 a primeira data vem antes da segunda.
4. Se ano1 == ano2 e mês1 > mês2 a primeira data vem depois da segunda.
5. Se ano1 == ano2 e mês1 == mês2 e dia1 < dia2 a primeira data vem antes da segunda.
6. Se ano1 == ano2 e mês1 == mês2 e dia1 > dia2 a primeira data vem depois da segunda.
7. Se nenhum desses casos ocorrer, as datas são exatamente iguais.
Escreva uma classe Data que tenha um método vemAntes que receba como argumento outra
instância da classe Data e implemente o algoritmo acima, retornando true se a data encapsulada vier
antes da passada como argumento e false caso contrário. Se as datas forem exatamente iguais, o
método deve retornar true.

8. Escreva a classe ConversaoDeUnidadesDeTempo com métodos para conversão aproximada das
unidades de velocidade segundo a lista abaixo.
• 1 minuto = 60 segundos
• 1 hora = 60 minutos
• 1 dia = 24 horas
• 1 semana = 7 dias
• 1 mês = 30 dias
• 1 ano = 365.25 dias
O tempo de gestação de um elefante indiano é de aproximadamente 624 dias. Usando a classe
ConversaoDeUnidadesDeTempo (exercício 5.14), escreva um programa em Java que mostre qual é
o tempo de gestação de um elefante indiano em dias, horas, minutos e segundos. Escreva métodos
adicionais para a classe ConversaoDeUnidadesDeTempo, se necessário.

9. Escreva uma classe que encapsule uma carta de baralho, com um valor que represente o valor da
carta, de um (ás) a treze (rei), e outro valor correspondente ao naipe (1 = ouros, 2 = paus, 3 = copas
e 4 = espadas). Escreva nessa classe um método toString que retorne o nome da carta por extenso,
usando a instrução switch.

11. Escreva uma aplicação em Java que simule uma calculadora bem simples. Esse programa deve
ler dois valores de ponto flutuante do teclado e um caracter, correspondente a uma das operações
básicas (+, -, * ou /), calcular a operação e imprimir o resultado. A aplicação deve considerar
divisões por zero como sendo erros, e imprimir uma mensagem adequada. A aplicação também deve
considerar a possibilidade de o usuário entrar um valor diferente de +, -, * ou / como operador, e
imprimir uma mensagem de erro.

12. Considere duas variáveis X e Y que possam assumir valores entre -100 e 100. Escreva um
programa em Java que imprima todos os valores de X e Y para os quais a soma X + Y seja igual a
100 ou igual a -100.

13. Escreva um programa em Java que imprima a série de Fibonacci até o N-ésimo elemento, sem
usar recursão. O número de elementos N pode ser lido do teclado.

14. Escreva uma aplicação em Java que calcule o máximo divisor comum de dois números. O
algoritmo de Euclides para o cálculo do máximo divisor comum entre dois números positivos M e
N calcula MDC(M, N) como:
• Se N > M, retorne MDC(N, M).
• Se N = 0, retorne M.
• Senão, retorne MDC(N, M%N) (onde % é o operador módulo, que retorna o resto da
divisão). 

15. Escreva um aplicativo Java que utiliza um loop (N vezes, onde N é uma entrada) para imprimir
a seguinte tabela de valores: 
![WhatsApp Image 2021-11-06 at 17 56 27](https://user-images.githubusercontent.com/63133899/140623561-b061b50a-c7e0-4e6a-889c-96fd8edf284d.jpeg)
