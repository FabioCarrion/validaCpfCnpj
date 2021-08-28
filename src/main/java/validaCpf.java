import javafx.beans.binding.Bindings;

public class validaCpf {

   public static void main(String[] args) {
      String valorcpf  = "89364660030";
      int digito1 = 0  ;
      int digito2 = 0 ;
      int multiplicadordigito1 = 10 ;
      int numeroConvertido = 0;
      int multiplicadordigito2 = 11 ;

      char[] cpfSemdigito = valorcpf.toCharArray();
      for (int x = 0; x < 9; x++) {
          numeroConvertido = Integer.parseInt(String.valueOf(cpfSemdigito[x]) );
          numeroConvertido = numeroConvertido * multiplicadordigito1;
          multiplicadordigito1 --;
          digito1 = digito1 + numeroConvertido ;
        }
        digito1 = 11 - (digito1 % 11);
        if (digito1 > 9) {
            digito1 = 0;
        }

      String primeiroDigito = valorcpf.substring(0,9) + (digito1 + "");

      char[] cpfSemdigito2 = primeiroDigito.toCharArray() ;
      for (int x = 0; x < 10; x++) {
          numeroConvertido = Integer.parseInt(String.valueOf(cpfSemdigito2[x]) );
          numeroConvertido = numeroConvertido * multiplicadordigito2;
          multiplicadordigito2 --;
          digito2 = digito2 + numeroConvertido ;
      }
      digito2 = 11 - (digito2 % 11);
      if (digito2 > 9) {
          digito2 = 0;
      }else {
          digito2 = 11- digito2 ;
      }
      String cpfValido = valorcpf.substring(0,9) + (digito1 + "") + (digito2 + "");
      if(cpfValido.equals(valorcpf)){
          System.out.println( " O CPF : " + cpfValido + " é válido ");
      }

  }
}
