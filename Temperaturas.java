import java.util.Scanner;
 
public class Temperaturas {
 
    public static void main(String[] args){
 
        Scanner scanner = new Scanner(System.in);
        String[] dias = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "sexta", "Sabado"};
        double[] temperatura = new double[7];
 
        double soma = 0, media = 0, maior = 0, menor = 0;
 
        for (int i = 0; i < 7; i++){
            System.out.println("Informe a media da temperatura de "+dias[i]+": ");
            temperatura[i] = scanner.nextDouble();
 
            soma += temperatura[i];
 
            if (i == 0){
                maior = temperatura[i];
                menor = temperatura[i];
            } else {
                if (maior < temperatura[i]){
                    maior = temperatura[i];
                }
                if (menor > temperatura[i]){
                    menor = temperatura[i];
                }
               
            }
        }
        media = soma / 7;
 
        System.out.println("A temperatura média da semana é: "+media);
        System.out.println("A maior temperatura é: "+maior);
        System.out.println("A menor temperatura é: "+menor);
     
        }
    }