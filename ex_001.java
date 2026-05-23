package Execicio1_Sistema_de_Controle_de_biblioteca_escolar_refactor;

class Biblioteca {

    boolean matriculaExiste;
    boolean possuiMulta;
    int livrosEmprestados;
    boolean livroDisponivel;
    String codigoLivro;

    Biblioteca() {

        matriculaExiste = false;
        possuiMulta = false;
        livrosEmprestados = 0;
        livroDisponivel = false;
        codigoLivro = "";
    }

    Biblioteca(boolean matriculaExiste) {

        this.matriculaExiste = matriculaExiste;
    }

    Biblioteca(boolean matriculaExiste, boolean possuiMulta) {

        this.matriculaExiste = matriculaExiste;
        this.possuiMulta = possuiMulta;
    }

    Biblioteca(boolean matriculaExiste,
               boolean possuiMulta,
               int livrosEmprestados) {

        this.matriculaExiste = matriculaExiste;
        this.possuiMulta = possuiMulta;
        this.livrosEmprestados = livrosEmprestados;
    }

    Biblioteca(boolean matriculaExiste,
               boolean possuiMulta,
               int livrosEmprestados,
               boolean livroDisponivel,
               String codigoLivro) {

        this.matriculaExiste = matriculaExiste;
        this.possuiMulta = possuiMulta;
        this.livrosEmprestados = livrosEmprestados;
        this.livroDisponivel = livroDisponivel;
        this.codigoLivro = codigoLivro;
    }

    void realizarEmprestimo() {

        if (!matriculaExiste) {

            System.out.println("Aluno não encontrado.");
            return;
        }

        if (possuiMulta) {

            System.out.println("Empréstimo bloqueado por multa.");
            return;
        }

        if (livrosEmprestados >= 3) {

            System.out.println("Limite de empréstimos atingido.");
            return;
        }

        System.out.println("Código do livro: " + codigoLivro);

        if (!livroDisponivel) {

            System.out.println("Livro indisponível.");
            return;
        }

        System.out.println("Registrando empréstimo...");
        System.out.println("Atualizando estoque...");
        System.out.println("Empréstimo realizado com sucesso.");
    }
}

class CompraOnline {

    String nome;
    String cpf;
    String endereco;
    String formaPagamento;

    double valorCompra;
    double frete;
    double total;

    boolean cartaoAprovado;

    CompraOnline() {

        nome = "";
        cpf = "";
        endereco = "";
        formaPagamento = "";
        valorCompra = 0;
    }

    CompraOnline(String nome,
                 String cpf,
                 String endereco,
                 String formaPagamento,
                 double valorCompra) {

        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.formaPagamento = formaPagamento;
        this.valorCompra = valorCompra;
    }

    void calcularFrete() {

        if (valorCompra > 500) {

            frete = 0;

            System.out.println("Frete grátis!");

        } else {

            frete = 25;

            System.out.println("Frete de R$25 adicionado.");
        }

        total = valorCompra + frete;
    }

    void finalizarCompra() {

        if (!cartaoAprovado) {

            System.out.println("Pagamento não autorizado.");
            System.out.println("Pedido encerrado.");

        } else {

            int numeroPedido = (int)(Math.random() * 10000);

            System.out.println("Número do pedido: " + numeroPedido);
            System.out.println("Compra registrada.");
            System.out.println("Confirmação enviada.");
            System.out.println("Compra realizada com sucesso.");
        }
    }
}
