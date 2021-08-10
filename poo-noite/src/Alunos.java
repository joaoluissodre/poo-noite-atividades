public class Alunos {

    int matricula;
    String nome;
    double nota1;
    double nota2;
    double notaDeTrabalho;
    double media;

    void media(){
        double media = (nota1*2.5 + nota2 *2.5 + notaDeTrabalho*2) / 7;
        this.media = media;
        seFoiAprovado();
    }

    void seFoiAprovado(){
        if (media > 6 ) {
            System.out.println("ALUNO APROVADO, sua media foi: " + media);
        }else{
                    System.out.println("Aluno NÃO APROVADO, sua media foi: " + media);

            }
        }
    }


