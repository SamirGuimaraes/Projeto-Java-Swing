# Cadastro de Informações

Este é um projeto simples em Java que cria uma interface gráfica para cadastro de informações pessoais, como nome, sobrenome, profissão e idade. A interface é composta por campos de texto para inserção dos dados e botões para ações como "OK" (para confirmar o cadastro) e "Limpar" (para limpar os campos).

## Funcionalidades

1. **Campos de Entrada**: O formulário possui campos para:
   - Nome
   - Sobrenome
   - Profissão
   - Idade
2. **Botões**:
   - **OK**: Exibe uma mensagem com os dados inseridos e confirma a inscrição.
   - **Limpar**: Limpa todos os campos de entrada e a mensagem final.
3. **Exibição de Mensagem**: Após clicar em "OK", uma mensagem com os dados inseridos é exibida na interface.

## Estrutura do Código

O código é dividido em partes distintas que organizam a interface gráfica e as funcionalidades. Vamos ver os principais componentes:

### 1. **Fontes e Configurações de Layout**

O código usa a fonte `Arial` com tamanho 18 e estilo `negrito` para todos os textos visíveis na interface. O layout é feito com `JPanel` e o layout principal é `BorderLayout`, com um `GridLayout` para os campos de entrada e botões.

### 2. **Campos de Texto e Rótulos**

A interface tem quatro campos de texto (`JTextField`) para a entrada de dados, com rótulos (`JLabel`) indicativos. Cada campo tem um painel (`JPanel`) para agrupar o rótulo e o campo de entrada. Estes campos são configurados da seguinte forma:
- **Nome** (`tfNome`)
- **Sobrenome** (`tfSobrenome`)
- **Profissão** (`tfProfissao`)
- **Idade** (`tfIdade`)

- O campo de texto "Idade" possui uma conversão especial. Ao capturar o valor inserido neste campo, a String recebida precisa ser convertida para um valor inteiro, pois a idade é um número. Isso é feito utilizando o método `Integer.valueOf(idade)`, que converte a String recebida em um valor inteiro. Esse valor convertido é então utilizado na mensagem final exibida ao usuário.


### 3. **Botões**

Dois botões são adicionados à interface:
- **OK**: Ao clicar neste botão, os dados inseridos nos campos de texto são recuperados, formatados em uma string HTML e exibidos na tela.
- **Limpar**: Este botão limpa todos os campos de entrada e a mensagem exibida.

### 4. **Mensagem Final**

Após o preenchimento dos campos e a confirmação com o botão "OK", uma mensagem é gerada mostrando os dados inseridos. Caso o botão "Limpar" seja pressionado, a mensagem é apagada.

### 5. **Comportamento e Ações**

- Quando o botão "OK" é pressionado, o texto dos campos de entrada é recuperado usando o método `getText()` e a idade é convertida para um valor inteiro com `Integer.valueOf()`. A mensagem com os dados inseridos é gerada em HTML e exibida no centro da interface.
- Quando o botão "Limpar" é pressionado, os campos de texto são limpos com `setText("")` e a mensagem final é apagada.

### 6. **Janela Principal**

A janela principal (`JFrame`) é configurada com título, tamanho, limites e comportamento de fechamento. Ela contém:
- O formulário de cadastro no painel superior
- A mensagem final no painel central
- Os botões no painel inferior
