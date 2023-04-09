import java.util.Scanner;
public class moneyext {
    public static void main(String args[]){ 


        String um = "um";
        
    while (true) {
    Scanner input = new Scanner(System.in);
    System.out.println("\nInforme a quantia monetária: ");
    int money = input.nextInt();

    int milhar = money/1000;
    int unidade = money%10;
    int dezena = (money%100 - unidade);
    int centena = (money%1000 - dezena - unidade);
      
    switch (milhar){
        case 1:{
            System.out.print("Mil");
            break;
        }
        case 2:{
            System.out.print("Dois mil");
            break;
        }
        case 3:{
            System.out.print("Três mil");
            break;
        }
        case 4:{
            System.out.print("Quatro mil");
            break;
        }
        case 5:{
            System.out.print("Cinco mil");
            break;
        }
        case 6:{
            System.out.print("Seis mil");
            break;
        }
        case 7:{
            System.out.print("Sete mil");
            break;
        }
        case 8:{
            System.out.print("Oito mil");
            break;
        }
        case 9:{
             System.out.print("Nove mil");
             break;
        }
        default:{
            System.out.print(" ");
        }

    }
    switch (centena){
        case 100:{
            if(dezena == 0 && unidade == 0){
             System.out.print(" Cem");
            }
            else{
                System.out.print(" Cento e ");
            }
            break;
        }
        case 200:{
            if (dezena == 0 && unidade == 0){
            System.out.print(" Duzentos");
            }else {
                System.out.print(" Duzentos e");
            }
            break;
        }
        case 300:{
            if (dezena == 0 && unidade == 0){
            System.out.print(" Trezentos");
            }else {
                System.out.print(" Trezendos e");
            }
            break;
        }
        case 400:{
            if (dezena == 0 && unidade == 0){
            System.out.print(" Quatrocentos");
            }else {
                System.out.print(" Quatrocentos e");
            }
            break;
        }
        case 500:{
            if (dezena == 0 && unidade == 0){
            System.out.print(" Quinhentos");
            }else {
                System.out.print(" Quinhentos e");
            }
            break;
        }
        case 600:{
            if (dezena == 0 && unidade == 0){
            System.out.print(" Seiscentos ");
            }else {
                System.out.print(" Seiscentos e");
            }
            break;
        }
        case 700:{
            if (dezena == 0 && unidade == 0){
            System.out.print(" Setecentos");
            }else {
                System.out.print(" Setecentos e");
            }
            break;
        }
        case 800:{
            if (dezena == 0 && unidade == 0){
            System.out.print(" Oitocentos");
            }else {
                System.out.print(" Oitocentos e");
            }
            break;
        }
        case 900:{
            if (dezena == 0 && unidade == 0){
            System.out.print(" Novecentos");
            }else {
                System.out.print(" Novecentos e");
            }
            break;
        }
        default:{
            System.out.print(" ");
        }
    }
    switch (dezena){
        case 10:{if(unidade == 0){
            System.out.print(" dez");
                }else if(unidade == 1){
            System.out.print(" onze");
                }else if(unidade == 2){
            System.out.print(" doze");
                }else if(unidade == 3){
            System.out.print(" treze");
                }else if (unidade == 4){
            System.out.print(" quatorze");
                }else if (unidade == 5){
            System.out.print(" quinze");
                }else if(unidade == 6){
            System.out.print(" deseseis");
                }else if (unidade == 7){
            System.out.print(" dezessete");
                }else if (unidade == 8){
            System.out.print(" dezoito");
                }else if (unidade == 9){
            System.out.print(" dezenove");
        }
        break;
        }
        case 20:{
            if (unidade == 0){
                System.out.print(" vinte");
            }else{
                System.out.print(" vinte e");
            }
        break;
        }
        case 30:{
            if (unidade == 0){
                System.out.print(" trinta");
            }else{
                System.out.print(" trinta e");
            }
        break;
        }
        case 40:{
            if (unidade == 0){
                System.out.print(" quarenta");
            }else{
                System.out.print(" quarenta e");
            }
        break;
        }
        case 50:{
            if (unidade == 0){
                System.out.print(" cinquenta");
            }else{
                System.out.print(" cinquenta e");
            }
        break;
        }
        case 60:{
            if (unidade == 0){
                System.out.print(" sessenta");
            }else{
                System.out.print(" sessenta e");
            }
        break;
        }
        case 70:{
            if (unidade == 0){
                System.out.print(" setenta");
            }else{
                System.out.print(" setenta e");
            }
        break;
        }
        case 80:{
            if (unidade == 0){
                System.out.print(" oitenta");
            }else{
                System.out.print(" oitenta e");
            }
        break;
        }
        case 90:{
            if (unidade == 0){
                System.out.print(" noventa");
            }else{
                System.out.print(" noventa e");
            }
        break;
        }
        default: {
            System.out.print(" ");
        }
    }
    //adicionar if para caso de dezenas iguais a 10
    switch(unidade){
        case 1:{ if(dezena == 10){
            System.out.print(" ");
        }else{
            System.out.print(" um");
        }
        }break;
        case 2:{if(dezena == 10){
            System.out.print(" ");
        }else{
            System.out.print(" dois");
        }break;
        }
        case 3:{ if(dezena == 10){
            System.out.print(" ");
        }else{
            System.out.print(" três");
        }break;
        }
        case 4:{if(dezena == 10){
            System.out.print(" ");
        }else{
            System.out.print(" quatro");
        }break;
        }
        case 5:{if(dezena == 10){
            System.out.print(" ");
        }else{
            System.out.print(" cinco");
        }break;
        }
        case 6:{ if(dezena == 10){
            System.out.print(" ");
        }else{
            System.out.print(" seis");
        }break;
        }
        case 7:{if(dezena == 10){
            System.out.print(" ");
        }else{
            System.out.print(" sete");
        }break;
        }
        case 8:{if(dezena == 10){
            System.out.print(" ");
        }else{
            System.out.print(" oito");
        }break;
        }
        case 9:{if(dezena == 10){
            System.out.print(" ");
        }else{
            System.out.print(" nove");
        }break;}
    }
}
}
}    



    
    
    /*System.out.print(milhar + "mil\n");
    System.out.print(centena +  "centenas\n");
    System.out.print(dezena + "dezenas\n");
    System.out.print(unidade + "unidades\n");*/

