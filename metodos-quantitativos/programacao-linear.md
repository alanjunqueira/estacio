# Programação Linear

## Exemplo 1

A Fitwear S/A é uma confecção de roupas esportivas e tem uma linha fitness feminina. Essa linha produz roupas de ginástica exclusivas para mulheres, como tops e calças de lycra.

Cada top de ginástica é vendido por R$ 80,00 e utiliza R$ 20,00 de matéria-prima, como tecido e alinhamentos, e R$ 32,00 com mão de obra. Além disso, são demandados 30 minutos de corte e 15 minutos de costura para a confecção de um top de ginástica.

Cada calça de ginástica é vendida por R$ 120,00 e utiliza R$ 35,00 de matéria-prima, como tecido e alinhamentos, e R$ 40,00 de mão de obra. São demandados 15 minutos de corte e 30 minutos de costura para a confecção de uma calça de ginástica.

A Fitwear só pode contar com 100 horas de corte por semana e 160 horas de costura. A confecção não tem problemas no fornecimento de matérias-primas, de modo que o seu suprimento pode ser considerado ilimitado assim como a demanda semanal de seus produtos.

A Fitwear deseja planejar sua produção semanal de modo a maximizar seus lucros.

### Identificação das variáveis de decisão

xi = Número de produto i confeccionado

x1 = Número de tops de ginástica confeccionados a cada semana
x2 = Número de calças de ginástica confeccionados a cada semana

### Função objetivo

Maximizar o lucro semanal
Ganho semanal da venda de tops e calças = 80x1 + 120x2
Gasto semanal com matéria-prima = 20x1 + 35x2
Gasto semanal com mão de obra = 32x1 + 40x2

Ganho semanal = (80x1 + 120x2) - (20x1 + 35x2) - (32x1 + 40x2) = 28x1 + 45x2
Maximizar Z = 28x1 + 45x2

### Restrições

A Fitwear tem 100 horas de corte por semana e 160 horas de costura. A confecção não tem problemas no fornecimento de matérias-primas, de modo que o seu suprimento pode ser considerado ilimitado assim como a demanda semanal de seus produtos.

Tempo disponível para corte.
Tempo disponível para costura.

- Restrição 1: 100 horas de corte por semana

total de horas de corte/semana = (horas de corte / top) * (tops produzidos / semana) + (horas de corte / calça) * (calças produzidas / semana)
(total de horas de corte/semana) = (0.5x1 + 0.25x2)
Restrição 1 = 0.5x1 + 0.25x2 <= 100

- Restrição 2: 160 horas de costura por semana

(total de horas de costura/semana) = (horas de costura / top) * (tops produzidos / semana) + (horas de costura / calça) * (calças produzidas / semana)
(total de horas de costura/semana) = (0.25x1 + 0.5x2)
Restrição 2 = 0.25x1 + 0.5x2 <= 160

- Restrição 3: Não-negatividade

x1 >= 0
x2 >= 0
x1, x2 >= 0

### Resumo do problema
Maximizar Z = 28x1 + 45x2
Restrição de horas/corte: 0.5x1 + 0.25x2 <= 100
Restrição de horas/costura: 0.25x1 + 0.5x2 <= 160
Restrição de não-negatividade: x1 >= 0, x2 >= 0


# problema de transporte
- Método do Canto Noroeste
- Método de Aproximação de Vogel