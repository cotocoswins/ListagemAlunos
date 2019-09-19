# ListagemAlunos

Uma certa instituição de ensino está incentivando os seus alunos a participarem de eventos acadêmicos em
troca de créditos para obter desconto nas mensalidades.
Para participar, o aluno deve comparecer em algum dos eventos cadastrados na instituição e depois escrever
um relatório sobre o conteúdo apresentado no evento. Este relatório será avaliado por um professor e receberá
uma pontuação de 0 a 100.
A instituição quer manter uma listagem dos alunos que entregaram relatórios. Cada relatório entregue por
um aluno corresponde a uma entrada na lista. Então, os alunos que entregarem mais de um relatório irão
aparecer mais de uma vez na listagem.
Por exemplo, suponha que entregaram relatórios os alunos Rafael, Paulo e Ana. Rafael entregou apenas um
relatório; Paulo entregou dois relatórios; e Ana entregou três relatórios. Uma possível listagem neste caso
seria assim:

1) Rafael
2) Paulo
3) Ana
4) Paulo
5) Ana
6) Ana

A listagem também deve manter a ordem de pontuação obtidas pelos relatórios dos alunos.
Por exemplo, suponha que o Rafael teve pontuação máxima(100) no seu relatório; O Paulo teve pontuação
70 em um relatório e 50 no outro; Ana teve pontuação 60, 40 e 40 nos seus relatórios. Então, a listagem
ficaria assim:

1) Rafael (100)
2) Paulo (70)
3) Ana (60)
4) Paulo (50)
5) Ana (40)
6) Ana (40)

Conforme os alunos forem entregando os relatórios, novas entradas serão adicionadas na listagem. Uma
nova entrada pode ser inserida em qualquer posição. A posição é denida de acordo com a pontuação do
relatório do aluno.
Por exemplo, suponha que o Rafael entregou mais um relatório com pontuação 65. A listagem deveria ser
atualizada para:

1) Rafael (100)
2) Paulo (70)
3) Rafael (65)
4) Ana (60)
5) Paulo (50)
6) Ana (40)
7) Ana (40)

Para gastar os créditos obtidos com os relatórios, o aluno deve pedir para retirar uma das suas entradas na
listagem. Os créditos são proporcionais a colocação da entrada do aluno na listagem.
Por exemplo, se o Paulo quiser gastar uma das suas duas entradas na lista ele deve escolher entre a de 70
pontos a 50 pontos. A de 70 é a segunda da lista e a de 50 é a quinta. Suponha que ele escolha a de 50 pontos
então a nova listagem caria assim:

1) Rafael (100)
2) Paulo (70)
3) Rafael (65)
4) Ana (60)
5) Ana (40)
6) Ana (40)

Quando o aluno quiser usar seus créditos ele deve vericar antes se ele tem entradas na listagem. Para isso,
ele deve ir na secretaria da instituição.
A instituição pode querer saber qual é o aluno que está na primeira posição da listagem ou o que está na
última. Na verdade, seria interessante para a instituição poder facilmente saber qual é o aluno que está em
qualquer posição que ela queira.
