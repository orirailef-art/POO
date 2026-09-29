public class Pieza {
   //atributos 
   private String color;
   private String comportamiento;
   private String velocidad;
   private String movimiento;

   //getters y setters
   public String getColor() {
         return color;
      }

   public void setColor(String color) {
         this.color = color;
      }
   
   public String getVelocidad() {
         return velocidad;
      }  
   public void setVelocidad(String velocidad) {
         this.velocidad = velocidad;
      }
   public String getComportamiento() {
         return comportamiento;
      }
   public void setComportamiento(String comportamiento) {
         this.comportamiento = comportamiento;
      }
   public String getMovimiento() {
         return movimiento;
      }
   public void setMovimiento(String movimiento) {
         this.movimiento = movimiento;
      }


   //comportamientos: mover 
   public void mover() {
      System.out.println("La pieza se mueve de acuerdo a su movimiento: " + movimiento);
   }
    
   // Constructor vacío
    public Pieza() {
    }

    //constructor con parámetros
      public Pieza(String color, String comportamiento, String velocidad, String movimiento) {
         this.color = color;
         this.comportamiento = comportamiento;
         this.velocidad = velocidad;
         this.movimiento = movimiento;
      }
}