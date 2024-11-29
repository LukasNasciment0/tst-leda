import java.util.*;


class EncontraPrimeiroNegativo{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] entrada = sc.nextLine().split(" ");
        String saida = encontraPrimeiroNegativo(entrada, 0);
        System.out.println(saida);

    }

    public static String encontraPrimeiroNegativo(String[] lista, int ind){
        if (ind == lista.length) return "-";
        if (Integer.parseInt(lista[ind]) < 0) return lista[ind];
        return encontraPrimeiroNegativo(lista, ++ind);
    }
}
