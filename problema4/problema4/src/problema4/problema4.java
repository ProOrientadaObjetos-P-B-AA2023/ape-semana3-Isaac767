/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

class celulares{
    public String operativeSys;
    public double pantalla;
    public double costo;
    private String mac;
    private long IMEI;
    public double iva;
    public double costofin;
    public celulares(){}
    public celulares(String operativeSys, 
            double pantalla, 
            double costo,
            String mac,
            long IMEI) {
        this.operativeSys = operativeSys;
        this.pantalla = pantalla;
        this.costo = costo;
        this.mac = mac;
        this.IMEI = IMEI;
    }
    //SET
    public void setOperativeSys(String operativeSys){
        this.operativeSys = operativeSys;
    }
    public void setPantalla(double pantalla){
        this.pantalla = pantalla;
    }
    public void setCosto(double costo){
        this.costo = costo;
    }
    public void setMac(String mac){
        this.mac = mac;
    }
    public void setIMEI(long IMEI){
        this.IMEI = IMEI;
    }

    //Calculo IVA
    public void calcularIVA(){
        this.iva = this.costo * 12/100;
    }
   
    //Calculo precio final
      public void calcularCostoFin(){
        this.costofin = this.iva + this.costo;
    }
   
      //GET
    public double getCostoFin(){
        return this.costofin;
    }
    public String getOperativeSys(){
        return this.operativeSys;
    }
     public double getPantalla(){
        return this.pantalla;
    }
     public double getCosto(){
        return this.costo;
    }
     public String getMac(){
        return this.mac;
    }
     public long getIMEI(){
        return this.IMEI;
    }
     public double getIVA(){
        return this.iva;
    }
   
@Override
    public String toString(){
        String msj = String.format("        DATOS DEL DISPOSITIVO "
                +"\n-------------------------------------------------"
                +" \nSistema Operativo: %s"
                +" \nDimension de Pantalla: %.2f"
                +" \nPrecio(sin IVA): %.2f" 
                +" \nNumero SERIE MAC: %s"
                +" \nNumero SERIE IMEI: %d"
                +"\nIVA agregado: %.2f"
                + "\nPrecio final: %.2f", this.getOperativeSys(), this.getPantalla(),
                this.getCosto(), this.getMac(), this.getIMEI(),
                this.getIVA(), this.getCostoFin());
        return msj;
    }
}

public class problema4 {
    public static void main(String[] args) {
        
       celulares celular1 = new celulares ("Iphone11",16,950,"72-6C-FF-0E-A6-D6",352906123);
       
       celular1.calcularIVA();
       celular1.calcularCostoFin();
        System.out.println(celular1);
    }
}