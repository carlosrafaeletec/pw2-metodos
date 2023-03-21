public class LivroTeste {
    public static void main(String[] args) {

       Livro meuLivro = new Livro();
        meuLivro.nome = "Diario de um Banana";
        meuLivro.preco = 20.99;
        meuLivro.paginas = 121;
        meuLivro.resumo = "bla bla bla";
        meuLivro.autor = "Jeffey kymei";

        meuLivro.aplicarDesconto(0.1);

       meuLivro.exibirDados();

        Livro livroFavorito = new Livro();
        livroFavorito.nome = "Sherlock Holmes";
        livroFavorito.resumo = "bla bla bla";
        livroFavorito.paginas = 448;
        livroFavorito.preco = 61.90;
        livroFavorito.autor = "Arthur Conan Doyle";

        livroFavorito.aplicarDesconto(0.25);

        livroFavorito.exibirDados();

        // Exercicio

        Livro livroExer = new Livro();

        livroExer.nome = "Pinoquio";
        livroExer.resumo = "bla bla bla";
        livroExer.paginas = 346;
        livroExer.preco = 230.00;
        livroExer.autor = "Carlo Collodi";

        livroExer.aplicarDesconto(0.2);

        livroExer.aplicarTaxa(0.8);

        livroExer.exibirDados();

    }
}
