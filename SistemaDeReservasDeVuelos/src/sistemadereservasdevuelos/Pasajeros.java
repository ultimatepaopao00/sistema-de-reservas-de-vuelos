public class Pasajeros {

    // atributos de la clase pasajero
    private String nombres;
    private String apellidos;
    private String fechaNacimiento;
    private String sexo;
    private String numeroTelefono;
    private String correo;
    private String nacionalidad;
    private String Id;
    private int edad;
    private boolean permisoPadre;
    
    // constructor uno vacio y uno lleno

    public Pasajeros() {
       
    }

    public Pasajeros(String nombres, String apellidos, String fechaNacimiento, String sexo, String numeroTelefono, String correo, String nacionalidad, String Id, int edad, boolean permisoPadre) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.numeroTelefono = numeroTelefono;
        this.correo = correo;
        this.nacionalidad = nacionalidad;
        this.Id = Id;
        this.edad = edad;
        this.permisoPadre = permisoPadre;
    }
    
    // setter y getter

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isPermisoPadre() {
        return permisoPadre;
    }

    public void setPermisoPadre(boolean permisoPadre) {
        this.permisoPadre = permisoPadre;
    }
    
    // validacion de menor de edad para viajar
    
    public String puedeViajar(){
        
        if (edad >= 18) {
            return "Puede viajar y reservar un vuelo ";
            
        }
        else if (permisoPadre) {
            return "Es menor de edad , pero tiene los permisos necesarios ...puede reservar el vuelo..";
            
        }
        else{
            return "Es menor y no tiene los permisos ... no puede resevar el vuelo...";
            
        }
    }
    

    @Override
    public String toString(){
        return nombres + " " + apellidos + " (ID : " + Id + ")";
        
    }
    
    
    
    }
    
