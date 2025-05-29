public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.saudacao();

        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.dobrarNumero(5);
        System.out.println(resultado);

        Musica minhaMusica = new Musica();

        minhaMusica.titulo = "It's Beautiful Day";
        minhaMusica.artista = "Jermaine Edwards";
        minhaMusica.anoLancamento = 2021;
        minhaMusica.exibeFichaTecnica();

        minhaMusica.avaliar(4.0);
        minhaMusica.avaliar(3.5);
        minhaMusica.avaliar(5.0);

        double mediaAvaliacoes = minhaMusica.calcularMedia();
        System.out.println("Média das avaliacoes: " + mediaAvaliacoes);


        Carro meuCarro = new Carro();
        meuCarro.modelo = "Gol";
        meuCarro.ano = 2020;
        meuCarro.cor = "Chumbo";

        meuCarro.exibirFichaTecnica();
        System.out.println("Idade do carro: "+ meuCarro.calcularIdade() + " anos");


        Aluno meuAluno = new Aluno();
        meuAluno.nome = "Itachi";
        meuAluno.idade = 3;

        meuAluno.exibeInformacoes();
}
}
