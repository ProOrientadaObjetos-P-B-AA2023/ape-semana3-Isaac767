
package problema1;
class Terreno{
     private double costo_terreno;
     private double anchoTerreno;
     private double largoTerreno;
     private double areaTerreno;
     private double ValorMetroCuadrado;
     public Terreno(){}
     public Terreno(double anchoTerreno, 
             double largoTerreno, 
             double ValorMetroCuadrado){
         this.anchoTerreno = anchoTerreno;
         this.largoTerreno = largoTerreno;
         this.ValorMetroCuadrado = ValorMetroCuadrado;
     }
     public void setAnchoTerreno(double anchoTerreno){
         this.anchoTerreno = anchoTerreno;
     
     }
     public void setLargoTerreno(double LargoTerreno){
         this.largoTerreno = LargoTerreno;
     }
     public void setValorMetroCuadrado(double ValorMetroCuadrado){
         this.ValorMetroCuadrado = ValorMetroCuadrado;
     }
     public void CalcularAreaTerreno(){
         this.areaTerreno = this.anchoTerreno * this.largoTerreno;
     }
     public void CalcularCostoTerreno(){
         this.costo_terreno = this.areaTerreno * this.ValorMetroCuadrado;
     }
     public double getCostoTerreno(){
         return this.costo_terreno;
     
     }
        public double getAnchoTerreno(){
         return this.anchoTerreno;
     }
        public double getLargoTerreno(){
         return this.largoTerreno;
     
     }
        public double getAreaTerreno(){
         return this.areaTerreno;
     
     }
        public double getValorMetroCuadrado(){
         return this.ValorMetroCuadrado;
     
     }
        public String toString(){
            String msj=String.format("DATOS DEL TERRENO"
                    + "\n Ancho del terreno: %.2f"
                    + "\n Largo del terreno: %.2f"
                    + "\n Valor del metro cuadrado: %.2f"
                    + "\n El Area del terreno: %.2f"
                    + "\n El costo del terreno: %.2f",
                    this.getAnchoTerreno(),this.getLargoTerreno(), 
                    this.getValorMetroCuadrado(), this.getAreaTerreno(),
                    this.getCostoTerreno());
            return msj;
        
        }

}
public class Problema1 {
    public static void main(String[] args) {
        Terreno terreno1 = new Terreno(10,2,2);
        terreno1.CalcularAreaTerreno();
        terreno1.CalcularCostoTerreno();
        System.out.println(terreno1);
    }
    
}
