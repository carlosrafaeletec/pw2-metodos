public class LivroTeste {
    public static void main(String[] args) {

       Livro meuLivro = new Livro();
        meuLivro.nome = "Diario de um Banana";
        meuLivro.preco = 20.99;
        meuLivro.paginas = 121;
        meuLivro.resumo = "bla bla bla";
        meuLivro.autor = "Jeffey kymei";

       meuLivro.exibirDados();

        Livro livroFavorito = new Livro();
        livroFavorito.nome = "Sherlock Holmes";
        livroFavorito.resumo = "bla bla bla";
        livroFavorito.paginas = 448;
        livroFavorito.preco = 61.90;
        livroFavorito.autor = "Arthur Conan Doyle";

        livroFavorito.exibirDados();

    }
}