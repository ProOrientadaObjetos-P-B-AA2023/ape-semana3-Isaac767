
package problema.pkg3;



class AdministrarInstitucionesEducativas{
    //atributos
    private String nombre;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    private double gastosEstudiante;
    private double presupuesto;
    public AdministrarInstitucionesEducativas(){}
    //constructor
    public AdministrarInstitucionesEducativas(String nombre, String tipoInstitucion, int numeroAlumnos, int numeroDocentes, int numeroSedes, double gastosEstudiante) {
        this.nombre = nombre;
        this.tipoInstitucion = tipoInstitucion;
        this.numeroAlumnos = numeroAlumnos;
        this.numeroDocentes = numeroDocentes;
        this.numeroSedes = numeroSedes;
        this.gastosEstudiante = gastosEstudiante;
       
    }
    //set - establecer
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTipoInstitucion(String tipoInstitucion) {
        this.tipoInstitucion = tipoInstitucion;
    }
    public void setNumeroAlumnos(int numeroAlumnos){
        this.numeroAlumnos = numeroAlumnos;
    }
    public void setNumeroDocentes(int numeroDocentes) {
        this.numeroDocentes = numeroDocentes;
    }
    public void setNumeroSedes(int numeroSedes) {
        this.numeroSedes = numeroSedes;
    }
    public void setEstudiante(double gastosEstudiante) {
        this.gastosEstudiante = gastosEstudiante;
    }
    //calcular presupuesto
    public void calcularPresupuesto(){
        this.presupuesto = this.numeroAlumnos * this.gastosEstudiante;
    }
    //get - obtener
    public String getNombre(){
        return this.nombre;
    }
    public String getTipoInstitucion() {
        return this.tipoInstitucion;
    }
    public int getNumeroAlumnos() {
        return this.numeroAlumnos;
    }
    public int getNumeroDocentes() {
        return this.numeroDocentes;
    }
    public int getNumeroSedes() {
        return this.numeroSedes;
    }
    public double getGastosEstudiante() {
        return this.gastosEstudiante;
    }
    public double getPresupuesto() {
        return this.presupuesto;
    }
    public String toString(){
        String msj = String.format("         Administrar Institucion Educativa "
                +"\n-------------------------------------------------"
                +" \nNombre de la Institucion Educativa: %s"
                +" \nTipo de Institucion Educativa: %s"
                +" \nNúmero de Alumnos: %d" 
                +" \nNúmero de Docentes: %d"
                +" \nNúmero de Sedes: %d"
                +"\nGastos  por Estudiante: %.2f"
                + "\nPresupuesto: %.2f ", this.getNombre(), this.getTipoInstitucion(),
                this.getNumeroAlumnos(), this.getNumeroDocentes(), this.getNumeroSedes(),
                this.getGastosEstudiante(),this.getPresupuesto());
        return msj;
    }
}
    public class Problema3 {
    public static void main(String[] args) {
         //String nombre, String tipoInstitucion, int numeroAlumnos, int numeroDocentes, int numeroSedes, double gastosProyectadoEstudiante
        AdministrarInstitucionesEducativas institucionEducativa1 = new AdministrarInstitucionesEducativas("UTPL",
        "Privada",3000,40,6,250);
        institucionEducativa1.calcularPresupuesto();
        System.out.println(institucionEducativa1);

    }
    }   
