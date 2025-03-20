public class ExemploForArray {
    public static void main(String[] args) {

        //em arrays o indice inicializa no 0
        String alunos[] = {"FELIPE","JONAS","jULIA","MARCOS"};

       /* for (int x=0; x < alunos.length; x++){
            System.out.println("O aluno no indice x="+ x + " é " + alunos[x]);
        } */ 

        //maneira mais agradavel de se travalhar com array
        // forma abreviada

        for(String aluno : alunos) {
            System.out.println("O nome do aluno é: " + aluno);
        }

    }
}
