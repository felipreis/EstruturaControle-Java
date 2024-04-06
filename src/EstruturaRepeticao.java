

public class EstruturaRepeticao{

    public static void main (String[] args){

        //Estrutura de repetição FOR
        
        //String alunos[] = {"Pedro","José","Maria","Mariana","Francielly"};
        /*
        for(int i = 0; i < alunos.length; i++ ){
            System.out.println("O nome do aluno de índice " + i + " é " + alunos[i]);
        }
        */

        //Estrutura FOR EACH

        //"aluno" é uma variável de escopo que vai sendo atualizada;
        /*
        for(String aluno : alunos){
            System.out.println("O nome do aluno é : " + aluno);
        }
        */

        //CONTINUE E BREAK
        /*
        for(int i = 0; i <= 10; i++ ){
            
            if(i == 7){
               // break;   Com o BREAK a repetição irá cessar no número 7 e dele em diante não será impresso.
               // continue;    Com CONTINUE a repetição irá apenas "pular" o número 7 e continuar.
            }
            System.out.println(i);
        }
        */
        
        //WHILE

        int numero,contador;
        numero = 32;
        contador = 0;
        //quantas vezes o numero 3 cabe dentro de "numero"
        while(numero > 3){
            numero = numero - 3;
            contador++;
        }

        System.out.println("O numero 3 cabe " + contador + " dentro de  32 ");
    



    }
}