class Bicicleta {
    class Rueda {
        private String Marca;
        private float Diametro;
        private int Presion;

        public void setMarca(String marca) {
            this.Marca = marca;
        }

        public void setDiametro(float diametro) {
            this.Diametro = diametro;
        }

        public void setPresion(int presion) {
            this.Presion = presion;
        }

        public String getMarca() {
            return Marca;
        }

        public float getDiametro() {
            return Diametro;
        }

        public int getPresion() {
            return Presion;
        }
    }

    class Cuadro {
        private String Tipo;
        private String Material;
        private String Marca;

        public void setTipo(String tipo) {
            this.Tipo = tipo;
        }

        public void setMaterial(String material) {
            this.Material = material;
        }

        public void setMarca(String marca) {
            this.Marca = marca;
        }

        public String getTipo() {
            return Tipo;
        }

        public String getMaterial() {
            return Material;
        }

        public String getMarca() {
            return Marca;
        }
    }

    class Cadena {
        private String Marca;
        private int NumVelocidades;
        private String Material;

        public void setMarca(String marca) {
            this.Marca = marca;
        }

        public void setNumVelocidades(int numVelocidades) {
            this.NumVelocidades = numVelocidades;
        }

        public void setMaterial(String material) {
            this.Material = material;
        }

        public String getMarca() {
            return Marca;
        }

        public int getNumVelocidades() {
            return NumVelocidades;
        }

        public String getMaterial() {
            return Material;
        }
    }

    class Cassette {
        private String Marca;
        private String Material;
        private int NumPinones;

        public void setMarca(String marca) {
            this.Marca = marca;
        }

        public void setMaterial(String material) {
            this.Material = material;
        }

        public void setNumPinones(int numPinones) {
            this.NumPinones = numPinones;
        }

        public String getMarca() {
            return Marca;
        }

        public String getMaterial() {
            return Material;
        }

        public int getNumPinones() {
            return NumPinones;
        }
    }
}

public class Lab2_4_2 {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta();

        Bicicleta.Rueda ruedaDelantera = bicicleta.new Rueda();
        Bicicleta.Rueda ruedaTrasera = bicicleta.new Rueda();
        Bicicleta.Cuadro cuadro = bicicleta.new Cuadro();
        Bicicleta.Cadena cadena = bicicleta.new Cadena();
        Bicicleta.Cassette cassette = bicicleta.new Cassette();

        ruedaDelantera.setMarca("Michelin");
        ruedaDelantera.setDiametro(26.0f);
        ruedaDelantera.setPresion(40);

        ruedaTrasera.setMarca("Michelin");
        ruedaTrasera.setDiametro(26.0f);
        ruedaTrasera.setPresion(40);

        cuadro.setTipo("Mountain Bike");
        cuadro.setMaterial("Aluminio");
        cuadro.setMarca("Trek");

        cadena.setMarca("Shimano");
        cadena.setNumVelocidades(10);
        cadena.setMaterial("Acero");

        cassette.setMarca("Shimano");
        cassette.setMaterial("Aluminio");
        cassette.setNumPinones(11);

        System.out.println("Bicicleta:");
        System.out.println("Marca del cuadro: " + cuadro.getMarca());
        System.out.println("Tipo de cuadro: " + cuadro.getTipo());
        System.out.println("Material del cuadro: " + cuadro.getMaterial());
        System.out.println("");
        System.out.println("Rueda delantera:");
        System.out.println("Marca de la rueda delantera: " + ruedaDelantera.getMarca());
        System.out.println("Diametro de la rueda delantera: " + ruedaDelantera.getDiametro() + "In");
        System.out.println("Presión de la rueda delantera: " + ruedaDelantera.getPresion() + "PSI");
        System.out.println("");
        System.out.println("Rueda trasera:");
        System.out.println("Marca de la rueda trasera: " + ruedaTrasera.getMarca());
        System.out.println("Diametro de la rueda trasera: " + ruedaTrasera.getDiametro() + "In");
        System.out.println("Presión de la rueda trasera: " + ruedaTrasera.getPresion() + "PSI");
        System.out.println("");
        System.out.println("Cadena:");
        System.out.println("Marca de la cadena: " + cadena.getMarca());
        System.out.println("Número de velocidades de la cadena: " + cadena.getNumVelocidades());
        System.out.println("Material de la cadena: " + cadena.getMaterial());
        System.out.println("");
        System.out.println("Cassette:");
        System.out.println("Marca del cassette: " + cassette.getMarca());
        System.out.println("Material del cassette: " + cassette.getMaterial());
        System.out.println("Número de piñones del cassette: " + cassette.getNumPinones());
    }
}
    