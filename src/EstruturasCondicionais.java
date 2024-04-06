


public class EstruturasCondicionais {
    public static void main(String[] args){
    
    String plano = "M";

    
    /*
     * T : PLANO TURBO -> 100 MIN LIGAGAÇÃO, WHATSAPP E INSTAGRAM GRÁTIS E 5GB YOUTUBE;
     * M : PLANO MÉDIO -> 100 MIN LIGAGAÇÃO, WHATSAPP E INSTAGRAM;
     * P : PLANO BÁSICO -> 100 MIN LIGAÇÃO
     */

     // IF/ELSE/ELSE IF

   /*
     if(plano == "M"){
        System.out.println("PLANO MÉDIO -> 100 MIN LIGAGAÇÃO, WHATSAPP E INSTAGRAM");
     }else if(plano == "T") {
        System.out.println("PLANO TURBO -> 100 MIN LIGAGAÇÃO, WHATSAPP E INSTAGRAM GRÁTIS E 5GB YOUTUBE");
     }else{
        System.out.println("PLANO BÁSICO -> 100 MIN LIGAÇÃO");
     }
   */

      //SWITCH CASE
      // o uso do break faz o código para assim que o caso for atingido, se ele não for usado ainda executará os seguintes.

      switch (plano) {
         case "T":
            System.out.println("5GB DE YOUTUBE");     
         case "M":
            System.out.println("WHATSAPP E INSTAGRAM");
         case "P":
            System.out.println("100 MIN LIGAÇÃO");
         default:
         System.out.println("Nehum plano selecionado");  
   }

    }


}
